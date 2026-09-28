package com.sportybet.android.instantwin.newtork.model.response;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Event {
    public String awayTeamLogo;
    public String awayTeamName;
    public String eventId;
    public String homeTeamLogo;
    public String homeTeamName;
    public String leagueId;
    public int marketCount;
    public List<Market> markets;
    public float[] teamStrengthPercentage;

    public Event(String str, String str2, String str3, String str4, String str5, String str6, int i, List<Market> list, float[] fArr) {
        this.eventId = str;
        this.leagueId = str2;
        this.homeTeamName = str3;
        this.homeTeamLogo = str4;
        this.awayTeamName = str5;
        this.awayTeamLogo = str6;
        this.marketCount = i;
        this.markets = list;
        this.teamStrengthPercentage = fArr;
    }

    public Event cloneWithMarketChange(int i, List<Market> list) {
        return new Event(this.eventId, this.leagueId, this.homeTeamName, this.homeTeamLogo, this.awayTeamName, this.awayTeamLogo, i, list, this.teamStrengthPercentage);
    }

    public Event(String str, String str2, String str3, String str4, String str5) {
        this.eventId = str;
        this.homeTeamName = str2;
        this.homeTeamLogo = str3;
        this.awayTeamName = str4;
        this.awayTeamLogo = str5;
    }
}
