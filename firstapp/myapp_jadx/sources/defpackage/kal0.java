package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes4.dex */
public final class kal0 implements Runnable {
    public final /* synthetic */ zvk0 a;
    public final /* synthetic */ zzbg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public kal0(AppMeasurementDynamiteService appMeasurementDynamiteService, zvk0 zvk0Var, zzbg zzbgVar, String str) {
        this.a = zvk0Var;
        this.b = zzbgVar;
        this.c = str;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0VarO = this.d.a.o();
        ikl0VarO.g();
        ikl0VarO.h();
        k8l0 k8l0Var = ikl0VarO.a;
        yol0 yol0Var = k8l0Var.i;
        k8l0.k(yol0Var);
        int iC = w4l.b.c(yol0Var.a.a, 12451000);
        zvk0 zvk0Var = this.a;
        if (iC == 0) {
            ikl0VarO.u(new jil0(ikl0VarO, this.b, this.c, zvk0Var));
            return;
        }
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.i.a("Not bundling data. Service unavailable or out of date");
        yol0 yol0Var2 = k8l0Var.i;
        k8l0.k(yol0Var2);
        yol0Var2.S(zvk0Var, new byte[0]);
    }
}
