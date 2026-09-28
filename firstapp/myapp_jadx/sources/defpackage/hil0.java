package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class hil0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzbe c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ ikl0 e;

    public hil0(ikl0 ikl0Var, zzr zzrVar, boolean z, zzbe zzbeVar, Bundle bundle) {
        this.a = zzrVar;
        this.b = z;
        this.c = zzbeVar;
        this.d = bundle;
        Objects.requireNonNull(ikl0Var);
        this.e = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ikl0 ikl0Var = this.e;
        o3l0 o3l0Var = ikl0Var.d;
        k8l0 k8l0Var = ikl0Var.a;
        if (o3l0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Failed to send default event parameters to service");
            return;
        }
        boolean zQ = k8l0Var.d.q(null, v2l0.b1);
        zzr zzrVar = this.a;
        if (zQ) {
            ikl0Var.y(o3l0Var, this.b ? null : this.c, zzrVar);
            return;
        }
        try {
            o3l0Var.N(this.d, zzrVar);
            ikl0Var.t();
        } catch (RemoteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to send default event parameters to service");
        }
    }
}
