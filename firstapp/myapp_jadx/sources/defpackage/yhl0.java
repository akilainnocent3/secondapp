package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class yhl0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ zvk0 b;
    public final /* synthetic */ ikl0 c;

    public yhl0(ikl0 ikl0Var, zzr zzrVar, zvk0 zvk0Var) {
        this.a = zzrVar;
        this.b = zvk0Var;
        this.c = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yol0 yol0Var;
        zvk0 zvk0Var = this.b;
        ikl0 ikl0Var = this.c;
        k8l0 k8l0Var = ikl0Var.a;
        String strA = null;
        try {
            try {
                j6l0 j6l0Var = k8l0Var.e;
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.k(j6l0Var);
                if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
                    o3l0 o3l0Var = ikl0Var.d;
                    if (o3l0Var != null) {
                        strA = o3l0Var.A(this.a);
                        if (strA != null) {
                            nfl0 nfl0Var = k8l0Var.m;
                            k8l0.l(nfl0Var);
                            nfl0Var.g.set(strA);
                            k8l0.k(j6l0Var);
                            j6l0Var.g.b(strA);
                        }
                        ikl0Var.t();
                        yol0Var = k8l0Var.i;
                        k8l0.k(yol0Var);
                        yol0Var.P(strA, zvk0Var);
                    }
                    k8l0.m(y4l0Var);
                    y4l0Var.f.a("Failed to get app instance id");
                } else {
                    k8l0.m(y4l0Var);
                    y4l0Var.k.a("Analytics storage consent denied; will not get app instance id");
                    nfl0 nfl0Var2 = k8l0Var.m;
                    k8l0.l(nfl0Var2);
                    nfl0Var2.g.set(null);
                    k8l0.k(j6l0Var);
                    j6l0Var.g.b(null);
                }
                yol0Var = k8l0Var.i;
            } catch (RemoteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Failed to get app instance id");
            }
            k8l0.k(yol0Var);
            yol0Var.P(strA, zvk0Var);
        } catch (Throwable th) {
            yol0 yol0Var2 = k8l0Var.i;
            k8l0.k(yol0Var2);
            yol0Var2.P(null, zvk0Var);
            throw th;
        }
    }
}
