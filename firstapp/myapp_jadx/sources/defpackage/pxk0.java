package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class pxk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ p1l0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxk0(p1l0 p1l0Var, String str, String str2, Bundle bundle) {
        super(p1l0Var, true);
        this.e = str;
        this.f = str2;
        this.i = bundle;
        Objects.requireNonNull(p1l0Var);
        this.v = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.v.f;
        hm20.h(vvk0Var);
        vvk0Var.clearConditionalUserProperty(this.e, this.f, this.i);
    }
}
