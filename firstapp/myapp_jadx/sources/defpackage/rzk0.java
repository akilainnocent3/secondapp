package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class rzk0 extends h0l0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ p1l0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzk0(p1l0 p1l0Var, String str, Object obj) {
        super(p1l0Var, false);
        this.e = str;
        this.f = obj;
        this.i = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.i.f;
        hm20.h(vvk0Var);
        vvk0Var.logHealthData(5, this.e, new rcy(this.f), new rcy(null), new rcy(null));
    }
}
