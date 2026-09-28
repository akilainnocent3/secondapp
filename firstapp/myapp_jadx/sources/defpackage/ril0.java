package defpackage;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes4.dex */
public final class ril0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzbg c;
    public final /* synthetic */ ikl0 d;

    public ril0(ikl0 ikl0Var, zzr zzrVar, boolean z, zzbg zzbgVar) {
        this.a = zzrVar;
        this.b = z;
        this.c = zzbgVar;
        this.d = ikl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ikl0 ikl0Var = this.d;
        o3l0 o3l0Var = ikl0Var.d;
        if (o3l0Var != null) {
            ikl0Var.y(o3l0Var, this.b ? null : this.c, this.a);
            ikl0Var.t();
        } else {
            y4l0 y4l0Var = ikl0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Discarding data. Failed to send event to service");
        }
    }
}
