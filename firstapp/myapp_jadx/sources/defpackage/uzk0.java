package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class uzk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ qvk0 f;
    public final /* synthetic */ p1l0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzk0(p1l0 p1l0Var, String str, qvk0 qvk0Var) {
        super(p1l0Var, true);
        this.e = str;
        this.f = qvk0Var;
        Objects.requireNonNull(p1l0Var);
        this.i = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.i.f;
        hm20.h(vvk0Var);
        vvk0Var.getMaxUserProperties(this.e, this.f);
    }

    @Override // defpackage.h0l0
    public final void b() {
        this.f.O(null);
    }
}
