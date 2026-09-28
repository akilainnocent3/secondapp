package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes4.dex */
public final class jil0 implements Runnable {
    public final /* synthetic */ zzbg a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zvk0 c;
    public final /* synthetic */ ikl0 d;

    public jil0(ikl0 ikl0Var, zzbg zzbgVar, String str, zvk0 zvk0Var) {
        this.a = zzbgVar;
        this.b = str;
        this.c = zvk0Var;
        this.d = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yol0 yol0Var;
        zvk0 zvk0Var = this.c;
        ikl0 ikl0Var = this.d;
        k8l0 k8l0Var = ikl0Var.a;
        byte[] bArrT = null;
        try {
            try {
                o3l0 o3l0Var = ikl0Var.d;
                if (o3l0Var == null) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.f.a("Discarding data. Failed to send event to service to bundle");
                    yol0Var = k8l0Var.i;
                } else {
                    bArrT = o3l0Var.t(this.a, this.b);
                    ikl0Var.t();
                    yol0Var = k8l0Var.i;
                }
            } catch (RemoteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Failed to send event to the service to bundle");
            }
            k8l0.k(yol0Var);
            yol0Var.S(zvk0Var, bArrT);
        } catch (Throwable th) {
            yol0 yol0Var2 = k8l0Var.i;
            k8l0.k(yol0Var2);
            yol0Var2.S(zvk0Var, null);
            throw th;
        }
    }
}
