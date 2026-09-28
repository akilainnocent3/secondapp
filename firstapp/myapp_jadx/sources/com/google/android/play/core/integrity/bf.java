package com.google.android.play.core.integrity;

import defpackage.bek0;
import defpackage.dek0;

/* JADX INFO: loaded from: classes4.dex */
public final class bf implements bek0 {
    private final dek0 a;
    private final dek0 b;

    private bf(dek0 dek0Var, dek0 dek0Var2) {
        this.a = dek0Var;
        this.b = dek0Var2;
    }

    public static bf b(dek0 dek0Var, dek0 dek0Var2) {
        return new bf(dek0Var, dek0Var2);
    }

    @Override // defpackage.iek0
    public final /* bridge */ /* synthetic */ Object a() {
        dek0 dek0Var = this.b;
        return new be((bs) this.a.a(), (by) dek0Var.a());
    }
}
