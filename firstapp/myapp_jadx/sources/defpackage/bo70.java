package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo70 implements t6l {
    public etw<v6l> a;
    public t6l b;

    @Override // defpackage.t6l
    public final void a(v6l v6lVar) {
        t6l t6lVar = this.b;
        if (t6lVar != null) {
            t6lVar.a(v6lVar);
        }
    }

    @Override // defpackage.t6l
    public final jx80 b() {
        t6l t6lVar = this.b;
        if (t6lVar == null) {
            wkn.c("GraphicsContext not provided");
        }
        return t6lVar.b();
    }

    @Override // defpackage.t6l
    public final v6l c() {
        t6l t6lVar = this.b;
        if (t6lVar == null) {
            wkn.c("GraphicsContext not provided");
        }
        v6l v6lVarC = t6lVar.c();
        etw<v6l> etwVar = this.a;
        if (etwVar != null) {
            etwVar.g(v6lVarC);
            return v6lVarC;
        }
        Object[] objArr = dcy.a;
        etw<v6l> etwVar2 = new etw<>(1);
        etwVar2.g(v6lVarC);
        this.a = etwVar2;
        return v6lVarC;
    }

    public final void d() {
        etw<v6l> etwVar = this.a;
        if (etwVar != null) {
            Object[] objArr = etwVar.a;
            int i = etwVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                a((v6l) objArr[i2]);
            }
            etwVar.i();
        }
    }
}
