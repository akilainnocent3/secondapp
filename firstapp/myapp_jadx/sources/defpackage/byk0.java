package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class byk0 extends h0l0 {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ p1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byk0(p1l0 p1l0Var, Bundle bundle) {
        super(p1l0Var, true);
        this.e = bundle;
        Objects.requireNonNull(p1l0Var);
        this.f = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.f;
        hm20.h(vvk0Var);
        vvk0Var.setConsentThirdParty(this.e, this.a);
    }
}
