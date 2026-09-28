package defpackage;

import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class o8l0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ual0 b;

    public o8l0(ual0 ual0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        iol0Var.Y(this.a);
    }
}
