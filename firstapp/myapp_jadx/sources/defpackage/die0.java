package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class die0 implements cbj<Void> {
    public final /* synthetic */ wge0 a;

    public die0(wge0 wge0Var) {
        this.a = wge0Var;
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
        this.a.run();
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
    }
}
