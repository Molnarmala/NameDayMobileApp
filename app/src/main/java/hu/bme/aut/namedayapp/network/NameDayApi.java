package hu.bme.aut.namedayapp.network;

import hu.bme.aut.namedayapp.model.Namedays;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NameDayApi {
  
  /**
   * 
   * Search nameday by name
   * @param name Search name for the query
   * @param country Default hu
   * @return Call<Void>
   */
  
  @GET("getdate")
  Call<Namedays> getdateGet(
    @Query("name") String name, @Query("country") String country
  );

  
  /**
   * 
   * Get a nameday for a specific day
   * @param country Default hu
   * @param month Month part of the search date
   * @param day Day of the Month part of the seach date
   * @return Call<Void>
   */
  
  @GET("namedays")
  Call<Namedays> namedaysGet(
    @Query("country") String country, @Query("month") String month, @Query("day") String day
  );

  
  /**
   * 
   * Fetch namedays for today
   * @param country Supported country code to filter specific country
   * @return Call<Void>
   */
  
  @GET("today")
  Call<Namedays> todayGet(
    @Query("country") String country
  );

  
  /**
   * 
   * Fetch namedays for tomorrow
   * @param country Supported country code to filter specific country
   * @return Call<Void>
   */
  
  @GET("tomorrow")
  Call<Namedays> tomorrowGet(
    @Query("country") String country
  );

  
  /**
   * 
   * Fetch namedays for yesterday
   * @return Call<Void>
   */
  
  @GET("yesterday")
  Call<Namedays> yesterdayGet();
    

  
}