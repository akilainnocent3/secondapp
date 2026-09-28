package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class xhl0 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ikl0 c;

    public xhl0(ikl0 ikl0Var, AtomicReference atomicReference, zzr zzrVar) {
        this.a = atomicReference;
        this.b = zzrVar;
        Objects.requireNonNull(ikl0Var);
        this.c = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.a;
        synchronized (atomicReference2) {
            try {
                try {
                    ikl0 ikl0Var = this.c;
                    k8l0 k8l0Var = ikl0Var.a;
                    j6l0 j6l0Var = k8l0Var.e;
                    k8l0.k(j6l0Var);
                    if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
                        o3l0 o3l0Var = ikl0Var.d;
                        if (o3l0Var != null) {
                            atomicReference2.set(o3l0Var.A(this.b));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                nfl0 nfl0Var = ikl0Var.a.m;
                                k8l0.l(nfl0Var);
                                nfl0Var.g.set(str);
                                j6l0 j6l0Var2 = k8l0Var.e;
                                k8l0.k(j6l0Var2);
                                j6l0Var2.g.b(str);
                            }
                            ikl0Var.t();
                            atomicReference = this.a;
                            atomicReference.notify();
                            return;
                        }
                        y4l0 y4l0Var = k8l0Var.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.f.a("Failed to get app instance id");
                    } else {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.k.a("Analytics storage consent denied; will not get app instance id");
                        nfl0 nfl0Var2 = ikl0Var.a.m;
                        k8l0.l(nfl0Var2);
                        nfl0Var2.g.set(null);
                        j6l0 j6l0Var3 = k8l0Var.e;
                        k8l0.k(j6l0Var3);
                        j6l0Var3.g.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e) {
                    y4l0 y4l0Var3 = this.c.a.f;
                    k8l0.m(y4l0Var3);
                    y4l0Var3.f.b(e, "Failed to get app instance id");
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
