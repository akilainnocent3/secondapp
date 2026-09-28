package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes4.dex */
public final class ijl0 implements Runnable {
    public final /* synthetic */ zvk0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public ijl0(AppMeasurementDynamiteService appMeasurementDynamiteService, zvk0 zvk0Var) {
        this.a = zvk0Var;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.b;
        yol0 yol0Var = appMeasurementDynamiteService.a.i;
        k8l0.k(yol0Var);
        k8l0 k8l0Var = appMeasurementDynamiteService.a;
        yol0Var.T(this.a, k8l0Var.y != null && k8l0Var.y.booleanValue());
    }
}
