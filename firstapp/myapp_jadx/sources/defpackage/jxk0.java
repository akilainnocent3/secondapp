package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class jxk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ p1l0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxk0(p1l0 p1l0Var, String str, String str2, Object obj, boolean z) {
        super(p1l0Var, true);
        this.e = str;
        this.f = str2;
        this.i = obj;
        this.v = z;
        Objects.requireNonNull(p1l0Var);
        this.w = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.w.f;
        hm20.h(vvk0Var);
        vvk0Var.setUserProperty(this.e, this.f, new rcy(this.i), this.v, this.a);
    }
}
