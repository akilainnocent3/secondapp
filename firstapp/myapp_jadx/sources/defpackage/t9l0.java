package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class t9l0 implements Callable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ ual0 c;

    public t9l0(ual0 ual0Var, zzr zzrVar, Bundle bundle) {
        this.a = zzrVar;
        this.b = bundle;
        this.c = ual0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        iol0 iol0Var = this.c.a;
        iol0Var.B();
        return iol0Var.d0(this.b, this.a);
    }
}
