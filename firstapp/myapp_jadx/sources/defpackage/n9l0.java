package defpackage;

import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes4.dex */
public final class n9l0 implements Runnable {
    public final /* synthetic */ zzbg a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ual0 c;

    public n9l0(ual0 ual0Var, zzbg zzbgVar, String str) {
        this.a = zzbgVar;
        this.b = str;
        this.c = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        iol0 iol0Var = this.c.a;
        iol0Var.B();
        iol0Var.h(this.a, this.b);
    }
}
