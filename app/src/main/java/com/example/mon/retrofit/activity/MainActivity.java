package com.example.mon.retrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.example.mon.retrofit.Items.EquipResponse;
import com.example.mon.retrofit.Items.MatchesQueryItems.Match;
import com.example.mon.retrofit.Items.Team;
import com.example.mon.retrofit.R;
import com.example.mon.retrofit.adapter.MatchAdapter;
import com.example.mon.retrofit.adapter.TeamAdapter;
import com.example.mon.retrofit.api_interface.GetEquipDataService;
import com.example.mon.retrofit.extras_mon.UtilsFecha;
import com.example.mon.retrofit.network.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TeamAdapter adapter;
    private MatchAdapter matchAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(UtilsFecha.ahoraCalendar() + " / " + String.valueOf(UtilsFecha.ahoraUTC()));


        /** Create handle for the RetrofitInstance interface*/
        GetEquipDataService service = RetrofitInstance.getRetrofitInstance().create(GetEquipDataService.class);


        /** Call the method with parameter in the interface to get the notice data*/
        Call<EquipResponse> call = service.getEquiposCompeticionId("2014");

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<EquipResponse>() {
            @Override
            public void onResponse(Call<EquipResponse> call, Response<EquipResponse> response) {
                generateTeamList(response.body().getTeams());
            }

            @Override
            public void onFailure(Call<EquipResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }


        });


    }

    /**
     * Method to generate List of notice using RecyclerView with custom adapter
     */
    private void generateTeamList(ArrayList<Team> teamArrayListArrayList) {
        recyclerView = findViewById(R.id.recycler_view_notice_list);
        adapter = new TeamAdapter(teamArrayListArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void generateMatchList(ArrayList<Match> matchArrayList) {
        recyclerView = findViewById(R.id.recycler_view_notice_list);
        matchAdapter = new MatchAdapter(matchArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matchAdapter);
    }

}




