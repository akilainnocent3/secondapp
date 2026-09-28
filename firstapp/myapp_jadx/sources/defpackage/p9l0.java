package defpackage;

import com.google.android.gms.measurement.internal.zzbg;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class p9l0 implements Callable {
    public final /* synthetic */ ual0 a;

    public p9l0(ual0 ual0Var, zzbg zzbgVar, String str) {
        this.a = ual0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        iol0 iol0Var = this.a.a;
        iol0Var.B();
        zfl0 zfl0Var = iol0Var.h;
        iol0.U(zfl0Var);
        zfl0Var.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
