package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class e390 extends a5<b390<?>> {
    public long a = -1;
    public bc6 b;

    @Override // defpackage.a5
    public final boolean a(y4 y4Var) {
        b390 b390Var = (b390) y4Var;
        if (this.a >= 0) {
            return false;
        }
        long j = b390Var.w;
        if (j < b390Var.y) {
            b390Var.y = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.a5
    public final v1b[] b(y4 y4Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((b390) y4Var).w(j);
    }
}
