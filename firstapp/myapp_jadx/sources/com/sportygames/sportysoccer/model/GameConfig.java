package com.sportygames.sportysoccer.model;

import defpackage.rr1;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class GameConfig {
    private final String currency;
    private final List<StakeData> stakes;
    private final int streak;

    public GameConfig(String str, List<StakeData> list, int i) {
        this.currency = str;
        this.stakes = list;
        this.streak = i;
    }

    public String getCurrency() {
        return this.currency;
    }

    public List<StakeData> getStakePayouts() {
        return this.stakes;
    }

    public int getStreak() {
        return this.streak;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GameConfig{currency='");
        sb.append(this.currency);
        sb.append("', stakes=");
        sb.append(this.stakes);
        sb.append(", streak=");
        return rr1.b(sb, this.streak, '}');
    }
}
