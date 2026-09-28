package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class k0l0 extends ewk0 {
    public final rbl0 a;

    public k0l0(rbl0 rbl0Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.a = rbl0Var;
    }

    @Override // defpackage.zwk0
    public final void D(long j, Bundle bundle, String str, String str2) {
        this.a.a(j, bundle, str, str2);
    }

    @Override // defpackage.zwk0
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
