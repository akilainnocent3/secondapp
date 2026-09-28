package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px5 implements cbj<Void> {
    public final /* synthetic */ rf6 a;
    public final /* synthetic */ qx5 b;

    public px5(qx5 qx5Var, rf6 rf6Var) {
        this.b = qx5Var;
        this.a = rf6Var;
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r3) {
        this.b.F.remove(this.a);
        int iOrdinal = this.b.e.ordinal();
        if (iOrdinal != 1 && iOrdinal != 5) {
            if (iOrdinal != 6 && (iOrdinal != 7 || this.b.A == 0)) {
                return;
            } else {
                this.b.v("Camera reopen required. Checking if the current camera can be closed safely.", null);
            }
        }
        if (this.b.F.isEmpty()) {
            qx5 qx5Var = this.b;
            if (qx5Var.z != null) {
                qx5Var.v("closing camera", null);
                this.b.z.close();
                this.b.z = null;
            }
        }
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
    }
}
