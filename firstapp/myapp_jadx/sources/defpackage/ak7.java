package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ak7 extends j9p implements zj7 {
    public final ck7 e;

    public ak7(ck7 ck7Var) {
        this.e = ck7Var;
    }

    @Override // defpackage.zj7
    public final boolean b(Throwable th) {
        return j().w(th);
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return true;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        this.e.Z(j());
    }
}
