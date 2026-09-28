package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy20 implements cbj<Void> {
    public final /* synthetic */ hy20 a;

    public gy20(hy20 hy20Var) {
        this.a = hy20Var;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        pgt.d("ProcessingCaptureSession", "open session failed ", th);
        hy20 hy20Var = this.a;
        hy20Var.close();
        hy20Var.release();
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
    }
}
