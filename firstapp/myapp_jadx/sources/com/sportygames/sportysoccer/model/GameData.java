package com.sportygames.sportysoccer.model;

import defpackage.rr1;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class GameData {
    private final boolean gameSessionEnded;
    private final List<Float> payouts;
    private final int streak;
    private final int winningStreak;

    public GameData(List<Float> list, boolean z, int i, int i2) {
        this.payouts = list;
        this.gameSessionEnded = z;
        this.winningStreak = i;
        this.streak = i2;
    }

    public List<Float> getPayouts() {
        return this.payouts;
    }

    public int getStreak() {
        return this.streak;
    }

    public int getWinningStreak() {
        return this.winningStreak;
    }

    public boolean isGameSessionEnded() {
        return this.gameSessionEnded;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GameData{payouts=");
        sb.append(this.payouts);
        sb.append(", gameSessionEnded=");
        sb.append(this.gameSessionEnded);
        sb.append(", winningStreak=");
        sb.append(this.winningStreak);
        sb.append(", streak=");
        return rr1.b(sb, this.streak, '}');
    }
}
