package com.sportygames.sportysoccer.model;

import defpackage.ruw;

/* JADX INFO: loaded from: classes8.dex */
public class GameProbability {
    private final boolean result;

    public GameProbability(boolean z) {
        this.result = z;
    }

    public boolean getResult() {
        return this.result;
    }

    public String toString() {
        return ruw.a(new StringBuilder("GameProbability{result="), this.result, '}');
    }
}
