package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes4.dex */
public final class djl0 {
    public static final l5l0 a;
    public static final w7l0 b;
    public static volatile bok0 c;
    public static final Object d;
    public static Context e;

    static {
        new e1l0(eal0.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new c3l0(eal0.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new l5l0(eal0.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new w7l0(eal0.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static htl0 a(String str, jcl0 jcl0Var, boolean z, boolean z2) {
        try {
            b();
            hm20.h(e);
            try {
                return c.M(new zzs(str, jcl0Var, z, z2), new rcy(e.getPackageManager())) ? htl0.d : new psl0(new dzk0(z, str, jcl0Var));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new htl0(false, "module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new htl0(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    public static void b() {
        bok0 nnk0Var;
        if (c != null) {
            return;
        }
        hm20.h(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = DynamiteModule.c(e, DynamiteModule.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = xnk0.a;
                    if (iBinderB == null) {
                        nnk0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        nnk0Var = iInterfaceQueryLocalInterface instanceof bok0 ? (bok0) iInterfaceQueryLocalInterface : new nnk0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    c = nnk0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
