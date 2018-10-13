
package com.example.mon.retrofit.Items.MatchesQueryItems;


public class Score {

    private Object winner;
    private String duration;
    private FullTime fullTime;
    private HalfTime halfTime;
    private ExtraTime extraTime;
    private Penalties penalties;

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public FullTime getFullTime() {
        return fullTime;
    }

    public void setFullTime(FullTime fullTime) {
        this.fullTime = fullTime;
    }

    public HalfTime getHalfTime() {
        return halfTime;
    }

    public void setHalfTime(HalfTime halfTime) {
        this.halfTime = halfTime;
    }

    public ExtraTime getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(ExtraTime extraTime) {
        this.extraTime = extraTime;
    }

    public Penalties getPenalties() {
        return penalties;
    }

    public void setPenalties(Penalties penalties) {
        this.penalties = penalties;
    }

}
