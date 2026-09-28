package defpackage;

import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class j9l0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ual0 b;

    public j9l0(ual0 ual0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        iol0Var.b().g();
        iol0Var.l0();
        zzr zzrVar = this.a;
        hm20.e(zzrVar.a);
        iol0Var.m0(zzrVar);
        iol0Var.n0(zzrVar);
    }
}
