package com.sportygames.sportysoccer.model;

import defpackage.ruw;

/* JADX INFO: loaded from: classes8.dex */
public class BodyCashOut {
    private final boolean auto;

    public BodyCashOut(boolean z) {
        this.auto = z;
    }

    public boolean isAuto() {
        return this.auto;
    }

    public String toString() {
        return ruw.a(new StringBuilder("BodyCashOut{auto="), this.auto, '}');
    }
}
