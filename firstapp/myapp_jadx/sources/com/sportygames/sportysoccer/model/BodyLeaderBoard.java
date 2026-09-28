package com.sportygames.sportysoccer.model;

import defpackage.rr1;

/* JADX INFO: loaded from: classes8.dex */
public class BodyLeaderBoard {
    private final int streak;

    public BodyLeaderBoard(int i) {
        this.streak = i;
    }

    public int getStreak() {
        return this.streak;
    }

    public String toString() {
        return rr1.b(new StringBuilder("BodyLeaderBoard{streak="), this.streak, '}');
    }
}
