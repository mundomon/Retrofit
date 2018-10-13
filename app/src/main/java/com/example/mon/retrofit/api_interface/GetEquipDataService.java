package com.example.mon.retrofit.api_interface;

import com.example.mon.retrofit.Items.EquipResponse;
import com.example.mon.retrofit.Items.MatchesQueryItems.MatchesResponse;
import com.example.mon.retrofit.Items.TeamList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by mon on 23/8/18.
 */

public interface GetEquipDataService {

    @Headers("X-Auth-Token: aaaeb230631446289d9367bcd21677ea")
    @GET("competitions/{id}/teams")
    Call<EquipResponse> getEquiposCompeticionId(@Path("id") String id);

    @Headers("X-Auth-Token: aaaeb230631446289d9367bcd21677ea")
    @GET("competitions/{id}/matches")
    Call<MatchesResponse> getMatchesCompeticionX(@Path("id") String id, @Query("dateFrom") String dateFrom, @Query("dateTo") String dateTo);

}
