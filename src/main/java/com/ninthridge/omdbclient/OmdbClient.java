package com.ninthridge.omdbclient;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninthridge.omdbclient.exception.OmdbException;
import com.ninthridge.omdbclient.model.OmdbVideo;
import com.ninthridge.omdbclient.model.Type;

public class OmdbClient {

  private final static String HOST = "www.omdbapi.com";
  private final static String USER_AGENT = "com.ninthridge.omdbclient";
  
  private final static ObjectMapper objectMapper;
  
  static {
    objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }
  
  public OmdbVideo search(String apiKey, String imdbId, String title, Integer year, Integer season, Integer episode, Type type, boolean fullPlot, boolean tomates) throws OmdbException, IOException {
    if(apiKey == null) {
      throw new OmdbException("Invalid apiKey");
    }
    
    if(imdbId == null && title == null) {
      throw new OmdbException("imdbId or title must not be null");
    }
    
    String url = "http://" + HOST + "/?apiKey=" + apiKey;
    
    if(imdbId != null) {
      url += "&i=" + imdbId;
    }
    
    if(title != null) {
      url += "&t=" + URLEncoder.encode(title, "UTF-8");
    }
    
    if(year != null) {
      url += "&y=" + year;
    }
    
    if(season != null) {
      url += "&Season=" + season;
    }
    
    if(episode != null) {
      url += "&Episode=" + episode;
    }
    
    if(type != null) {
      url += "&type=" + type;
    }
    
    url += "&plot=" + (fullPlot ? "full" : "short");
    url += "&tomatoes=" + (tomates ? "true" : "false");
    url += "&r=json";
    
    HttpResponse response =  Request.Get(url).userAgent(USER_AGENT).execute().returnResponse();
    
    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      throw new OmdbException(body);
    }
    else {
      OmdbVideo omdbVideo = objectMapper.readValue(body, OmdbVideo.class);
      if(omdbVideo.getError() == null) {
        return omdbVideo;
      }
      else {
        throw new OmdbException(omdbVideo.getError());
      }
    }
  }
}
