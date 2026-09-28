package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xil0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ zvk0 d;
    public final /* synthetic */ ikl0 e;

    public xil0(ikl0 ikl0Var, String str, String str2, zzr zzrVar, zvk0 zvk0Var) {
        this.a = str;
        this.b = str2;
        this.c = zzrVar;
        this.d = zvk0Var;
        this.e = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yol0 yol0Var;
        zvk0 zvk0Var = this.d;
        String str = this.b;
        String str2 = this.a;
        ikl0 ikl0Var = this.e;
        k8l0 k8l0Var = ikl0Var.a;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                o3l0 o3l0Var = ikl0Var.d;
                if (o3l0Var == null) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.f.c(str2, "Failed to get conditional properties; not connected to service", str);
                    yol0Var = k8l0Var.i;
                } else {
                    arrayList = yol0.W(o3l0Var.W(str2, str, this.c));
                    ikl0Var.t();
                    yol0Var = k8l0Var.i;
                }
            } catch (RemoteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.d(str2, "Failed to get conditional properties; remote exception", str, e);
            }
            k8l0.k(yol0Var);
            yol0Var.V(zvk0Var, arrayList);
        } catch (Throwable th) {
            yol0 yol0Var2 = k8l0Var.i;
            k8l0.k(yol0Var2);
            yol0Var2.V(zvk0Var, arrayList);
            throw th;
        }
    }
}
