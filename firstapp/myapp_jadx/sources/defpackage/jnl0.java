package defpackage;

import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class jnl0 implements Callable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ iol0 b;

    public jnl0(iol0 iol0Var, zzr zzrVar) {
        this.a = zzrVar;
        Objects.requireNonNull(iol0Var);
        this.b = iol0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzr zzrVar = this.a;
        String str = zzrVar.a;
        hm20.h(str);
        iol0 iol0Var = this.b;
        jbl0 jbl0VarF = iol0Var.f(str);
        hbl0 hbl0Var = hbl0.ANALYTICS_STORAGE;
        if (jbl0VarF.i(hbl0Var) && jbl0.c(100, zzrVar.H).i(hbl0Var)) {
            return iol0Var.c0(zzrVar).E();
        }
        iol0Var.a().n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
