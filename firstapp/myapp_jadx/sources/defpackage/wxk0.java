package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class wxk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ p1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxk0(p1l0 p1l0Var, String str) {
        super(p1l0Var, true);
        this.e = str;
        Objects.requireNonNull(p1l0Var);
        this.f = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.f;
        hm20.h(vvk0Var);
        vvk0Var.setUserId(this.e, this.a);
    }
}
