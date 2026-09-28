package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xzk0 extends h0l0 {
    public final /* synthetic */ qvk0 e;
    public final /* synthetic */ p1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzk0(p1l0 p1l0Var, qvk0 qvk0Var) {
        super(p1l0Var, true);
        this.e = qvk0Var;
        Objects.requireNonNull(p1l0Var);
        this.f = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.f;
        hm20.h(vvk0Var);
        vvk0Var.getAppInstanceId(this.e);
    }

    @Override // defpackage.h0l0
    public final void b() {
        this.e.O(null);
    }
}
