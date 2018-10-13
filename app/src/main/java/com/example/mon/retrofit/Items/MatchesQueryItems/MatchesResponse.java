
package com.example.mon.retrofit.Items.MatchesQueryItems;

import com.example.mon.retrofit.Items.Competition;
import com.example.mon.retrofit.Items.Filters;

import java.util.ArrayList;
import java.util.List;

public class MatchesResponse {

    private Integer count;
    private Filters filters;
    private Competition competition;
    private ArrayList<Match> matches = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

}
