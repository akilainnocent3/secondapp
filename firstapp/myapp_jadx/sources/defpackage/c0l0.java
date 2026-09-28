package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class c0l0 extends h0l0 {
    public final /* synthetic */ k0l0 e;
    public final /* synthetic */ p1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0l0(p1l0 p1l0Var, k0l0 k0l0Var) {
        super(p1l0Var, true);
        this.e = k0l0Var;
        this.f = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.f;
        hm20.h(vvk0Var);
        vvk0Var.registerOnMeasurementEventListener(this.e);
    }
}
