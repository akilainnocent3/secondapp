package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes4.dex */
public final class r7l0 implements Runnable {
    public final /* synthetic */ zvk0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public r7l0(AppMeasurementDynamiteService appMeasurementDynamiteService, zvk0 zvk0Var) {
        this.a = zvk0Var;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0VarO = this.b.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new yhl0(ikl0VarO, ikl0VarO.w(false), this.a));
    }
}
