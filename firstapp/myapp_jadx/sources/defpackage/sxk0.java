package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class sxk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ qvk0 i;
    public final /* synthetic */ p1l0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxk0(p1l0 p1l0Var, String str, String str2, qvk0 qvk0Var) {
        super(p1l0Var, true);
        this.e = str;
        this.f = str2;
        this.i = qvk0Var;
        Objects.requireNonNull(p1l0Var);
        this.v = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.v.f;
        hm20.h(vvk0Var);
        vvk0Var.getConditionalUserProperties(this.e, this.f, this.i);
    }

    @Override // defpackage.h0l0
    public final void b() {
        this.i.O(null);
    }
}
