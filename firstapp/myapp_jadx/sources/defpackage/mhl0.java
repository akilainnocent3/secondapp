package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mhl0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zvk0 e;
    public final /* synthetic */ ikl0 f;

    public mhl0(ikl0 ikl0Var, String str, String str2, zzr zzrVar, boolean z, zvk0 zvk0Var) {
        this.a = str;
        this.b = str2;
        this.c = zzrVar;
        this.d = z;
        this.e = zvk0Var;
        this.f = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.a;
        zvk0 zvk0Var = this.e;
        ikl0 ikl0Var = this.f;
        k8l0 k8l0Var = ikl0Var.a;
        Bundle bundle = new Bundle();
        try {
            try {
                o3l0 o3l0Var = ikl0Var.d;
                String str2 = this.b;
                if (o3l0Var == null) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.f.c(str, "Failed to get user properties; not connected to service", str2);
                    yol0 yol0Var = k8l0Var.i;
                    k8l0.k(yol0Var);
                    yol0Var.U(zvk0Var, bundle);
                    return;
                }
                List<zzpl> listV = o3l0Var.V(str, str2, this.d, this.c);
                Bundle bundle2 = new Bundle();
                if (listV != null) {
                    for (zzpl zzplVar : listV) {
                        String str3 = zzplVar.e;
                        String str4 = zzplVar.b;
                        if (str3 != null) {
                            bundle2.putString(str4, str3);
                        } else {
                            Long l = zzplVar.d;
                            if (l != null) {
                                bundle2.putLong(str4, l.longValue());
                            } else {
                                Double d = zzplVar.i;
                                if (d != null) {
                                    bundle2.putDouble(str4, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    ikl0Var.t();
                    yol0 yol0Var2 = k8l0Var.i;
                    k8l0.k(yol0Var2);
                    yol0Var2.U(zvk0Var, bundle2);
                } catch (RemoteException e) {
                    e = e;
                    bundle = bundle2;
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(str, "Failed to get user properties; remote exception", e);
                    yol0 yol0Var3 = k8l0Var.i;
                    k8l0.k(yol0Var3);
                    yol0Var3.U(zvk0Var, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle = bundle2;
                    yol0 yol0Var4 = k8l0Var.i;
                    k8l0.k(yol0Var4);
                    yol0Var4.U(zvk0Var, bundle);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }
}
