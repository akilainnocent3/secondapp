package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class ail0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ikl0 b;

    public ail0(ikl0 ikl0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ikl0 ikl0Var = this.b;
        o3l0 o3l0Var = ikl0Var.d;
        k8l0 k8l0Var = ikl0Var.a;
        if (o3l0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.a;
            wok0 wok0Var = k8l0Var.d;
            t2l0 t2l0Var = v2l0.b1;
            if (wok0Var.q(null, t2l0Var)) {
                ikl0Var.y(o3l0Var, null, zzrVar);
            }
            o3l0Var.Q(zzrVar);
            k8l0Var.n().l();
            k8l0Var.d.q(null, t2l0Var);
            ikl0Var.y(o3l0Var, null, zzrVar);
            ikl0Var.t();
        } catch (RemoteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to send app launch to the service");
        }
    }
}
