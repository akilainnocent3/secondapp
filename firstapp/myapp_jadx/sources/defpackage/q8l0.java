package defpackage;

import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class q8l0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ual0 b;

    public q8l0(ual0 ual0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        iol0Var.b().g();
        iol0Var.l0();
        zzr zzrVar = this.a;
        hm20.h(zzrVar);
        String str = zzrVar.a;
        hm20.e(str);
        int i = 0;
        if (iol0Var.e0().q(null, v2l0.z0)) {
            iol0Var.e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iO = iol0Var.e0().o(null, v2l0.i0);
            iol0Var.e0();
            long jLongValue = jCurrentTimeMillis - ((Long) v2l0.e.a(null)).longValue();
            while (i < iO && iol0Var.I(jLongValue, null)) {
                i++;
            }
        } else {
            iol0Var.e0();
            long jIntValue = ((Integer) v2l0.l.a(null)).intValue();
            while (i < jIntValue && iol0Var.I(0L, str)) {
                i++;
            }
        }
        if (iol0Var.e0().q(null, v2l0.A0)) {
            iol0Var.b().g();
            iol0Var.H();
        }
        zml0 zml0Var = iol0Var.j;
        int iA = fl40.a(zzrVar.T);
        zml0Var.g();
        if (iA != 2 || zml0.j(str)) {
            return;
        }
        e7l0 e7l0Var = zml0Var.b.a;
        iol0.U(e7l0Var);
        i4l0 i4l0VarS = e7l0Var.s(str);
        if (i4l0VarS == null || !i4l0VarS.E() || i4l0VarS.F().r().isEmpty()) {
            return;
        }
        iol0Var.a().n.b(str, "[sgtm] Going background, trigger client side upload. appId");
        iol0Var.e().getClass();
        iol0Var.r(System.currentTimeMillis(), str);
    }
}
