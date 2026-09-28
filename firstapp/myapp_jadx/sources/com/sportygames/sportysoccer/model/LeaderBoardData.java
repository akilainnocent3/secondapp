package com.sportygames.sportysoccer.model;

import defpackage.uf80;

/* JADX INFO: loaded from: classes8.dex */
public class LeaderBoardData {
    private final String country;
    private final int rank;
    private final int score;
    private final String userId;
    private final String userName;

    public LeaderBoardData(String str, int i, int i2, String str2, String str3) {
        this.country = str;
        this.rank = i;
        this.score = i2;
        this.userId = str2;
        this.userName = str3;
    }

    public String getCountry() {
        return this.country;
    }

    public int getRank() {
        return this.rank;
    }

    public int getScore() {
        return this.score;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LeaderBoardData{country='");
        sb.append(this.country);
        sb.append("', rank=");
        sb.append(this.rank);
        sb.append(", score=");
        sb.append(this.score);
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append("', userName='");
        return uf80.a(sb, this.userName, "'}");
    }
}
