package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class xcl0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ nfl0 v;

    public xcl0(nfl0 nfl0Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.i = z3;
        this.v = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.v.p(this.a, this.b, this.c, this.d, this.e, this.f, this.i);
    }
}
