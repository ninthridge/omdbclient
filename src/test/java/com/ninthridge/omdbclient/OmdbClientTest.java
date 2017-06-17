package com.ninthridge.omdbclient;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.ninthridge.omdbclient.OmdbClient;
import com.ninthridge.omdbclient.exception.OmdbException;
import com.ninthridge.omdbclient.model.OmdbVideo;
import com.ninthridge.omdbclient.model.Type;

@Ignore
public class OmdbClientTest {
  
  @Test
  public void testSearchForMovieByBadImdbId() throws Exception {
    String imdbId = "tt1480055000";
    try {
      new OmdbClient().search(imdbId, null, null, null, null, null, true, true);
      Assert.fail("Should have thrown an exception");
    }
    catch(OmdbException e) {
      Assert.assertEquals("Incorrect IMDb ID.", e.getMessage());
    }
  }
  
  @Test
  public void testSearchForMovieByImdbId() throws Exception {
    String imdbId = "tt0468569";
    OmdbVideo omdbVideo = new OmdbClient().search(imdbId, null, null, null, null, null, true, true);
    Assert.assertEquals(imdbId, omdbVideo.getImdbId());
    Assert.assertEquals("The Dark Knight", omdbVideo.getTitle());
    Assert.assertEquals("2008", omdbVideo.getYear());
    Assert.assertNotNull(omdbVideo.getPlot());
  }
  
  @Test
  public void testSearchForSeriesByImdbId() throws Exception {
    String imdbId = "tt0944947";
    OmdbVideo omdbVideo = new OmdbClient().search(imdbId, null, null, null, null, null, true, true);
    Assert.assertEquals(imdbId, omdbVideo.getImdbId());
    Assert.assertEquals("Game of Thrones", omdbVideo.getTitle());
    Assert.assertTrue(omdbVideo.getYear().startsWith("2011"));
    Assert.assertNotNull(omdbVideo.getPlot());
  }
  
  @Test
  public void testSearchForEpisodeByImdbId() throws Exception {
    String imdbId = "tt1480055";
    OmdbVideo omdbVideo = new OmdbClient().search(imdbId, null, null, null, null, null, true, true);
    Assert.assertEquals(imdbId, omdbVideo.getImdbId());
    Assert.assertEquals("Winter Is Coming", omdbVideo.getTitle());
    Assert.assertTrue(omdbVideo.getYear().startsWith("2011"));
    Assert.assertNotNull(omdbVideo.getPlot());
    Assert.assertEquals("1", omdbVideo.getSeason());
    Assert.assertEquals("1", omdbVideo.getSeason());
  }
  
  @Test
  public void testSearchForEpisodeBySeriesImdbId() throws Exception {
    OmdbVideo omdbVideo = new OmdbClient().search("tt0944947", null, null, 1, 1, null, true, true);
    Assert.assertEquals("tt1480055", omdbVideo.getImdbId());
    Assert.assertEquals("Winter Is Coming", omdbVideo.getTitle());
    Assert.assertTrue(omdbVideo.getYear().startsWith("2011"));
    Assert.assertNotNull(omdbVideo.getPlot());
    Assert.assertEquals("1", omdbVideo.getSeason());
    Assert.assertEquals("1", omdbVideo.getSeason());
  }
  
  @Test
  public void testSearchForMovie() throws Exception {
    String title = "The Dark Knight";
    Integer year = 2008;
    OmdbVideo omdbVideo = new OmdbClient().search(null, title, year, null, null, Type.movie, true, true);
    Assert.assertEquals("tt0468569", omdbVideo.getImdbId());
    Assert.assertEquals(title, omdbVideo.getTitle());
    Assert.assertEquals(year.toString(), omdbVideo.getYear());
    Assert.assertNotNull(omdbVideo.getPlot());
  }
  
  @Test
  public void testSearchForSeries() throws Exception {
    String title = "Game of Thrones";
    OmdbVideo omdbVideo = new OmdbClient().search(null, title, null, null, null, Type.series, true, true);
    Assert.assertEquals("tt0944947", omdbVideo.getImdbId());
    Assert.assertEquals("Game of Thrones", omdbVideo.getTitle());
    Assert.assertTrue(omdbVideo.getYear().startsWith("2011"));
    Assert.assertNotNull(omdbVideo.getPlot());
  }
  
  @Test
  public void testSearchForEpisode() throws Exception {
    String title = "Game of Thrones";
    Integer season = 1;
    Integer episode = 1;
    OmdbVideo omdbVideo = new OmdbClient().search(null, title, null, season, episode, Type.episode, true, true);
    Assert.assertEquals("tt1480055", omdbVideo.getImdbId());
    Assert.assertEquals("Winter Is Coming", omdbVideo.getTitle());
    Assert.assertTrue(omdbVideo.getYear().startsWith("2011"));
    Assert.assertNotNull(omdbVideo.getPlot());
    Assert.assertEquals(season.toString(), omdbVideo.getSeason());
    Assert.assertEquals(episode.toString(), omdbVideo.getSeason());
  }
}
