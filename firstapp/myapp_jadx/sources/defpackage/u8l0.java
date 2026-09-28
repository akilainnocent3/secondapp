package defpackage;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class u8l0 implements Runnable {
    public final /* synthetic */ zzah a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ual0 c;

    public u8l0(ual0 ual0Var, zzah zzahVar, zzr zzrVar) {
        this.a = zzahVar;
        this.b = zzrVar;
        this.c = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.c.a;
        iol0Var.B();
        zzah zzahVar = this.a;
        Object objG0 = zzahVar.c.G0();
        zzr zzrVar = this.b;
        if (objG0 == null) {
            iol0Var.a0(zzahVar, zzrVar);
        } else {
            iol0Var.Z(zzahVar, zzrVar);
        }
    }
}
