package com.example.mon.retrofit.Items;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by mon on 23/8/18.
 */

public class TeamList {
    @SerializedName("teams")
    private ArrayList<Team> teamList;

    public ArrayList<Team> getTeamArrayList(){
        return teamList;
    }
    public void setEquipArrayList(ArrayList<Team> teamArrayList){
        this.teamList = teamArrayList;
    }
}
