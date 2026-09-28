package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class fil0 implements Runnable {
    public final /* synthetic */ igl0 a;
    public final /* synthetic */ ikl0 b;

    public fil0(ikl0 ikl0Var, igl0 igl0Var) {
        this.a = igl0Var;
        Objects.requireNonNull(ikl0Var);
        this.b = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0Var = this.b;
        o3l0 o3l0Var = ikl0Var.d;
        k8l0 k8l0Var = ikl0Var.a;
        if (o3l0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to send current screen to service");
            return;
        }
        try {
            igl0 igl0Var = this.a;
            if (igl0Var == null) {
                o3l0Var.C(0L, null, null, k8l0Var.a.getPackageName());
            } else {
                o3l0Var.C(igl0Var.c, igl0Var.a, igl0Var.b, k8l0Var.a.getPackageName());
            }
            ikl0Var.t();
        } catch (RemoteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to send current screen to the service");
        }
    }
}
