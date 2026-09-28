package defpackage;

import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class k9l0 implements Callable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ual0 b;

    public k9l0(ual0 ual0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ual0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        return new zzao(iol0Var.p0(this.a.a));
    }
}
