package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qhk implements a5d {
    public final nbn a;
    public final u2z b;

    public static final class a implements a5d.a {
        @Override // a5d.a
        public final a5d a(aqa0 aqa0Var, u2z u2zVar, a840 a840Var) {
            cc5 cc5VarSource = aqa0Var.a.source();
            if (cc5VarSource.y(0L, z4d.b) || cc5VarSource.y(0L, z4d.a)) {
                return new qhk(aqa0Var.a, u2zVar);
            }
            return null;
        }
    }

    public qhk(nbn nbnVar, u2z u2zVar) {
        this.a = nbnVar;
        this.b = u2zVar;
    }

    @Override // defpackage.a5d
    public final Object a(v1b<? super w4d> v1bVar) {
        return cft.f(new v9b(this, 2), (x1b) v1bVar);
    }
}
