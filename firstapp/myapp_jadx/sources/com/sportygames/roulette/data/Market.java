package com.sportygames.roulette.data;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Market {
    public String description;
    public int gameType;
    public int id;
    public long maxBetStake;
    public long minBetStake;
    public String name;
    public String outcome;

    public static int getMinBetStake(List<Market> list) {
        Iterator<Market> it = list.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            long j2 = it.next().minBetStake;
            if (j2 < j) {
                j = j2;
            }
        }
        return ((int) j) / 10000;
    }

    public String getOdds() {
        int i = this.id;
        if (i == 1 || i == 2 || i == 3) {
            return "2";
        }
        if (i != 4) {
            return i != 5 ? "1" : "12";
        }
        return "3";
    }
}
