package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nyk0 extends h0l0 {
    public final /* synthetic */ wkl0 e;
    public final /* synthetic */ p1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyk0(p1l0 p1l0Var, wkl0 wkl0Var) {
        super(p1l0Var, true);
        this.e = wkl0Var;
        this.f = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.f;
        hm20.h(vvk0Var);
        vvk0Var.retrieveAndUploadBatches(new lyk0(this, this.e));
    }
}
