package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes4.dex */
public final class ugl0 implements Runnable {
    public final /* synthetic */ zvk0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public ugl0(AppMeasurementDynamiteService appMeasurementDynamiteService, zvk0 zvk0Var, String str, String str2) {
        this.a = zvk0Var;
        this.b = str;
        this.c = str2;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0VarO = this.d.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new xil0(ikl0VarO, this.b, this.c, ikl0VarO.w(false), this.a));
    }
}
