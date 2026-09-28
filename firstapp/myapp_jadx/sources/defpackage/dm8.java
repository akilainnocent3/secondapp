package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class dm8<T> extends m9p implements cm8<T> {
    @Override // defpackage.cm8
    public final boolean F(Throwable th) {
        return R(new dn8(th, false));
    }

    @Override // defpackage.ojd
    public final Object await(v1b<? super T> v1bVar) throws Throwable {
        Object objQ = q(v1bVar);
        y5b y5bVar = y5b.a;
        return objQ;
    }

    @Override // defpackage.ojd
    public final u680<T> getOnAwait() {
        n9p n9pVar = n9p.a;
        n9pVar.getClass();
        y8h0.d(3, n9pVar);
        o9p o9pVar = o9p.a;
        o9pVar.getClass();
        y8h0.d(3, o9pVar);
        return new v680(this, n9pVar, o9pVar, null);
    }
}
