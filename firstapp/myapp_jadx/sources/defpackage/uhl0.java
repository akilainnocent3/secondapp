package defpackage;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public final class uhl0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzpl c;
    public final /* synthetic */ ikl0 d;

    public uhl0(ikl0 ikl0Var, zzr zzrVar, boolean z, zzpl zzplVar) {
        this.a = zzrVar;
        this.b = z;
        this.c = zzplVar;
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
            y4l0Var.f.a(Chyeyik.KaRQFmpXxHfCjvx);
        }
    }
}
