package com.sportygames.sportysoccer.model;

import defpackage.ruw;

/* JADX INFO: loaded from: classes8.dex */
public class TutorialStatus {
    private final boolean pass;

    public TutorialStatus(boolean z) {
        this.pass = z;
    }

    public boolean isPass() {
        return this.pass;
    }

    public String toString() {
        return ruw.a(new StringBuilder("TutorialStatus{pass="), this.pass, '}');
    }
}
