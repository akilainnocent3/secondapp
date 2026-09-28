package com.google.android.play.core.integrity;

import android.content.Context;
import defpackage.afk0;
import defpackage.bek0;
import defpackage.dek0;

/* JADX INFO: loaded from: classes4.dex */
public final class bu implements bek0 {
    private final dek0 a;
    private final dek0 b;
    private final dek0 c;

    private bu(dek0 dek0Var, dek0 dek0Var2, dek0 dek0Var3, dek0 dek0Var4) {
        this.a = dek0Var;
        this.b = dek0Var2;
        this.c = dek0Var3;
    }

    public static bu b(dek0 dek0Var, dek0 dek0Var2, dek0 dek0Var3, dek0 dek0Var4) {
        return new bu(dek0Var, dek0Var2, dek0Var3, dek0Var4);
    }

    @Override // defpackage.iek0
    public final /* bridge */ /* synthetic */ Object a() {
        return new bs((Context) this.a.a(), (afk0) this.b.a(), ((az) this.c).a(), new s());
    }
}
