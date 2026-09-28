package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f06 implements c9n {
    public final e06 a;

    public f06(e06 e06Var) {
        this.a = e06Var;
    }

    @Override // defpackage.c9n
    public final void a(wug.a aVar) {
        this.a.a(aVar);
    }

    @Override // defpackage.c9n
    public final int b() {
        int iOrdinal = this.a.b().ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.c9n
    public final c4f0 c() {
        return this.a.c();
    }

    @Override // defpackage.c9n
    public final long d() {
        return this.a.d();
    }
}
