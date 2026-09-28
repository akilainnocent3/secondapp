package com.sportygames.sportysoccer.model;

import defpackage.ruw;

/* JADX INFO: loaded from: classes8.dex */
public class BodyGameResult {
    private final boolean hit;

    public BodyGameResult(boolean z) {
        this.hit = z;
    }

    public boolean isHit() {
        return this.hit;
    }

    public String toString() {
        return ruw.a(new StringBuilder("BodyGameResult{hit="), this.hit, '}');
    }
}
