package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jc2 implements tse {
    public final /* synthetic */ b1g0 a;

    public jc2(b1g0 b1g0Var) {
        this.a = b1g0Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        bc6 bc6Var = this.a.d;
        if (bc6Var != null) {
            bc6Var.cancel(null);
        }
    }
}
