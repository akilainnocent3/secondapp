package com.sportygames.sportysoccer.model;

import defpackage.ng1;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class LeaderBoard {
    private final LeaderBoardData currentUser;
    private final List<LeaderBoardData> topRecords;

    public LeaderBoard(LeaderBoardData leaderBoardData, List<LeaderBoardData> list) {
        this.currentUser = leaderBoardData;
        this.topRecords = list;
    }

    public List<LeaderBoardData> geTopRecords() {
        return this.topRecords;
    }

    public LeaderBoardData getCurrentUser() {
        return this.currentUser;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LeaderBoard{currentUser='");
        sb.append(this.currentUser);
        sb.append("'topRecords='");
        return ng1.a(sb, this.topRecords, "'}");
    }
}
