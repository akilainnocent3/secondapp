package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class vil0 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzr d;
    public final /* synthetic */ ikl0 e;

    public vil0(ikl0 ikl0Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = zzrVar;
        this.e = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.a;
        synchronized (atomicReference2) {
            try {
                try {
                    ikl0 ikl0Var = this.e;
                    o3l0 o3l0Var = ikl0Var.d;
                    if (o3l0Var == null) {
                        y4l0 y4l0Var = ikl0Var.a.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.f.d(null, "(legacy) Failed to get conditional properties; not connected to service", this.b, this.c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(o3l0Var.W(this.b, this.c, this.d));
                    } else {
                        atomicReference2.set(o3l0Var.l(null, this.b, this.c));
                    }
                    ikl0Var.t();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    y4l0 y4l0Var2 = this.e.a.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.d(null, "(legacy) Failed to get conditional properties; remote exception", this.b, e);
                    this.a.set(Collections.EMPTY_LIST);
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
