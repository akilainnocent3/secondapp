package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oz1<T> implements fwa {
    public final xwa<T> a;

    public oz1(xwa<T> xwaVar) {
        xwaVar.getClass();
        this.a = xwaVar;
    }

    @Override // defpackage.fwa
    public final boolean a(owj0 owj0Var) {
        return c(owj0Var) && e(this.a.a());
    }

    @Override // defpackage.fwa
    public final jv5 b(lxa lxaVar) {
        lxaVar.getClass();
        return hzh.a(new nz1(this, null));
    }

    public abstract int d();

    public abstract boolean e(T t);
}
