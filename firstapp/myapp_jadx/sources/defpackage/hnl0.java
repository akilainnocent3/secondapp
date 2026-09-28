package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class hnl0 extends yqk0 {
    public final /* synthetic */ iol0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnl0(iol0 iol0Var, zal0 zal0Var) {
        super(zal0Var);
        this.e = iol0Var;
    }

    @Override // defpackage.yqk0
    public final void a() {
        iol0 iol0Var = this.e;
        iol0Var.b().g();
        String str = (String) iol0Var.q.pollFirst();
        if (str != null) {
            iol0Var.e().getClass();
            iol0Var.I = SystemClock.elapsedRealtime();
            iol0Var.a().n.b(str, "Sending trigger URI notification to app");
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            iol0.S(iol0Var.l.a, intent);
        }
        iol0Var.H();
    }
}
