package defpackage;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class w8l0 implements Runnable {
    public final /* synthetic */ zzah a;
    public final /* synthetic */ ual0 b;

    public w8l0(ual0 ual0Var, zzah zzahVar) {
        this.a = zzahVar;
        this.b = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        zzah zzahVar = this.a;
        if (zzahVar.c.G0() == null) {
            iol0Var.getClass();
            String str = zzahVar.a;
            hm20.h(str);
            zzr zzrVarQ = iol0Var.Q(str);
            if (zzrVarQ != null) {
                iol0Var.a0(zzahVar, zzrVarQ);
                return;
            }
            return;
        }
        iol0Var.getClass();
        String str2 = zzahVar.a;
        hm20.h(str2);
        zzr zzrVarQ2 = iol0Var.Q(str2);
        if (zzrVarQ2 != null) {
            iol0Var.Z(zzahVar, zzrVarQ2);
        }
    }
}
