package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes4.dex */
public final class opl0 implements rbl0 {
    public final zwk0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public opl0(AppMeasurementDynamiteService appMeasurementDynamiteService, zwk0 zwk0Var) {
        this.b = appMeasurementDynamiteService;
        this.a = zwk0Var;
    }

    @Override // defpackage.rbl0
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.D(j, bundle, str, str2);
        } catch (RemoteException e) {
            k8l0 k8l0Var = this.b.a;
            if (k8l0Var != null) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.b(e, "Event listener threw exception");
            }
        }
    }
}
