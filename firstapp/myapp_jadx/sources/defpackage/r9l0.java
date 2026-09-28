package defpackage;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class r9l0 implements Runnable {
    public final /* synthetic */ zzpl a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ual0 c;

    public r9l0(ual0 ual0Var, zzpl zzplVar, zzr zzrVar) {
        this.a = zzplVar;
        this.b = zzrVar;
        this.c = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.c.a;
        iol0Var.B();
        zzpl zzplVar = this.a;
        Object objG0 = zzplVar.G0();
        zzr zzrVar = this.b;
        if (objG0 == null) {
            iol0Var.X(zzplVar.b, zzrVar);
        } else {
            iol0Var.W(zzplVar, zzrVar);
        }
    }
}
