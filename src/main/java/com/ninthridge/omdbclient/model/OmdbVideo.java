package com.ninthridge.omdbclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OmdbVideo {
  
  @JsonProperty("Title")
  private String title;
  
  @JsonProperty("Year")
  private String year;
  
  @JsonProperty("Rated")
  private String rated;
  
  @JsonProperty("Released")
  private String released;
  
  @JsonProperty("Season")
  private String season;
  
  @JsonProperty("Episode")
  private String episode;
  
  @JsonProperty("Runtime")
  private String runtime;
  
  @JsonProperty("Genre")
  private String genre;
  
  @JsonProperty("Director")
  private String director;
  
  @JsonProperty("Writer")
  private String writer;
  
  @JsonProperty("Actors")
  private String actors;
  
  @JsonProperty("Plot")
  private String plot;
  
  @JsonProperty("Language")
  private String language;
  
  @JsonProperty("Country")
  private String country;
  
  @JsonProperty("Awards")
  private String awards;
  
  @JsonProperty("Poster")
  private String poster;
  
  @JsonProperty("Metascore")
  private String metascore;
  
  @JsonProperty("imdbRating")
  private String imdbRating;
  
  @JsonProperty("imdbVotes")
  private String imdbVotes;
  
  @JsonProperty("imdbID")
  private String imdbId;
  
  @JsonProperty("Type")
  private Type type;
  
  @JsonProperty("Response")
  private String response;
  
  @JsonProperty("tomatoMeter")
  private String tomatoMeter;
  
  @JsonProperty("tomatoImage")
  private String tomatoImage;
  
  @JsonProperty("tomatoRating")
  private String tomatoRating;
  
  @JsonProperty("tomatoReviews")
  private String tomatoReviews;
  
  @JsonProperty("tomatoFresh")
  private String tomatoFresh;
  
  @JsonProperty("tomatoRotten")
  private String tomatoRotten;
  
  @JsonProperty("tomatoConsensus")
  private String tomatoConsensus;
  
  @JsonProperty("tomatoUserMeter")
  private String tomatoUserMeter;
  
  @JsonProperty("tomatoUserRating")
  private String tomatoUserRating;
  
  @JsonProperty("tomatoUserReviews")
  private String tomatoUserReviews;
  
  @JsonProperty("tomatoURL")
  private String tomatoUrl;
  
  @JsonProperty("DVD")
  private String dvd;
  
  @JsonProperty("BoxOffice")
  private String boxOffice;
  
  @JsonProperty("Production")
  private String production;
  
  @JsonProperty("Website")
  private String website;
  
  @JsonProperty("Result")
  private String result;
  
  @JsonProperty("Error")
  private String error;

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getRated() {
    return rated;
  }

  public void setRated(String rated) {
    this.rated = rated;
  }

  public String getReleased() {
    return released;
  }

  public void setReleased(String released) {
    this.released = released;
  }

  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getActors() {
    return actors;
  }

  public void setActors(String actors) {
    this.actors = actors;
  }

  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAwards() {
    return awards;
  }

  public void setAwards(String awards) {
    this.awards = awards;
  }

  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

  public String getMetascore() {
    return metascore;
  }

  public void setMetascore(String metascore) {
    this.metascore = metascore;
  }

  public String getImdbRating() {
    return imdbRating;
  }

  public void setImdbRating(String imdbRating) {
    this.imdbRating = imdbRating;
  }

  public String getImdbVotes() {
    return imdbVotes;
  }

  public void setImdbVotes(String imdbVotes) {
    this.imdbVotes = imdbVotes;
  }

  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public String getTomatoMeter() {
    return tomatoMeter;
  }

  public void setTomatoMeter(String tomatoMeter) {
    this.tomatoMeter = tomatoMeter;
  }

  public String getTomatoImage() {
    return tomatoImage;
  }

  public void setTomatoImage(String tomatoImage) {
    this.tomatoImage = tomatoImage;
  }

  public String getTomatoRating() {
    return tomatoRating;
  }

  public void setTomatoRating(String tomatoRating) {
    this.tomatoRating = tomatoRating;
  }

  public String getTomatoReviews() {
    return tomatoReviews;
  }

  public void setTomatoReviews(String tomatoReviews) {
    this.tomatoReviews = tomatoReviews;
  }

  public String getTomatoFresh() {
    return tomatoFresh;
  }

  public void setTomatoFresh(String tomatoFresh) {
    this.tomatoFresh = tomatoFresh;
  }

  public String getTomatoRotten() {
    return tomatoRotten;
  }

  public void setTomatoRotten(String tomatoRotten) {
    this.tomatoRotten = tomatoRotten;
  }

  public String getTomatoConsensus() {
    return tomatoConsensus;
  }

  public void setTomatoConsensus(String tomatoConsensus) {
    this.tomatoConsensus = tomatoConsensus;
  }

  public String getTomatoUserMeter() {
    return tomatoUserMeter;
  }

  public void setTomatoUserMeter(String tomatoUserMeter) {
    this.tomatoUserMeter = tomatoUserMeter;
  }

  public String getTomatoUserRating() {
    return tomatoUserRating;
  }

  public void setTomatoUserRating(String tomatoUserRating) {
    this.tomatoUserRating = tomatoUserRating;
  }

  public String getTomatoUserReviews() {
    return tomatoUserReviews;
  }

  public void setTomatoUserReviews(String tomatoUserReviews) {
    this.tomatoUserReviews = tomatoUserReviews;
  }

  public String getTomatoUrl() {
    return tomatoUrl;
  }

  public void setTomatoUrl(String tomatoUrl) {
    this.tomatoUrl = tomatoUrl;
  }

  public String getDvd() {
    return dvd;
  }

  public void setDvd(String dvd) {
    this.dvd = dvd;
  }

  public String getBoxOffice() {
    return boxOffice;
  }

  public void setBoxOffice(String boxOffice) {
    this.boxOffice = boxOffice;
  }

  public String getProduction() {
    return production;
  }

  public void setProduction(String production) {
    this.production = production;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getSeason() {
    return season;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public String getEpisode() {
    return episode;
  }

  public void setEpisode(String episode) {
    this.episode = episode;
  }
  
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
