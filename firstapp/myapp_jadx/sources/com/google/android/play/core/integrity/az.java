package com.google.android.play.core.integrity;

import defpackage.bek0;
import defpackage.dek0;

/* JADX INFO: loaded from: classes4.dex */
public final class az implements bek0 {
    private final dek0 a;
    private final dek0 b;

    private az(dek0 dek0Var, dek0 dek0Var2) {
        this.a = dek0Var;
        this.b = dek0Var2;
    }

    public static az c(dek0 dek0Var, dek0 dek0Var2) {
        return new az(dek0Var, dek0Var2);
    }

    @Override // defpackage.iek0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ay a() {
        return new ay(this.a, this.b);
    }
}
