package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xov implements m730 {
    public final znn a;
    public final byb b;

    public xov(znn znnVar, byb bybVar) {
        this.a = znnVar;
        this.b = bybVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        return new wov((Context) this.a.a, (ayb) this.b.get());
    }
}
