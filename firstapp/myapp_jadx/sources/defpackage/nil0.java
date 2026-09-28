package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class nil0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ikl0 b;

    public nil0(ikl0 ikl0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0Var = this.b;
        k8l0 k8l0Var = ikl0Var.a;
        o3l0 o3l0Var = ikl0Var.d;
        if (o3l0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            o3l0Var.r(this.a);
            ikl0Var.t();
        } catch (RemoteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to send measurementEnabled to the service");
        }
    }
}
