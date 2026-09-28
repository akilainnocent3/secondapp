package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class pzk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ qvk0 v;
    public final /* synthetic */ p1l0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzk0(p1l0 p1l0Var, String str, String str2, boolean z, qvk0 qvk0Var) {
        super(p1l0Var, true);
        this.e = str;
        this.f = str2;
        this.i = z;
        this.v = qvk0Var;
        Objects.requireNonNull(p1l0Var);
        this.w = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.w.f;
        hm20.h(vvk0Var);
        vvk0Var.getUserProperties(this.e, this.f, this.i, this.v);
    }

    @Override // defpackage.h0l0
    public final void b() {
        this.v.O(null);
    }
}
