package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class g0l0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ p1l0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0l0(p1l0 p1l0Var, String str, String str2, Bundle bundle, boolean z) {
        super(p1l0Var, true);
        this.e = str;
        this.f = str2;
        this.i = bundle;
        this.v = z;
        this.w = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        long j = this.a;
        vvk0 vvk0Var = this.w.f;
        hm20.h(vvk0Var);
        vvk0Var.logEvent(this.e, this.f, this.i, this.v, true, j);
    }
}
