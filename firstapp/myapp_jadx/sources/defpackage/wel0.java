package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes4.dex */
public final class wel0 implements Runnable {
    public final /* synthetic */ tnl0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public wel0(AppMeasurementDynamiteService appMeasurementDynamiteService, tnl0 tnl0Var) {
        this.a = tnl0Var;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nfl0 nfl0Var = this.b.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.g();
        nfl0Var.h();
        tnl0 tnl0Var = nfl0Var.d;
        tnl0 tnl0Var2 = this.a;
        if (tnl0Var2 != tnl0Var) {
            hm20.j("EventInterceptor already set.", tnl0Var == null);
        }
        nfl0Var.d = tnl0Var2;
    }
}
