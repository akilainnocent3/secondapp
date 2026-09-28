package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar10 extends kui {
    public final qxf0.c c;

    public ar10(qxf0 qxf0Var) {
        super(qxf0Var);
        this.c = new qxf0.c();
    }

    @Override // defpackage.kui, defpackage.qxf0
    public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
        qxf0 qxf0Var = this.b;
        qxf0.b bVarF = qxf0Var.f(i, bVar, z);
        if (qxf0Var.m(bVarF.c, this.c, 0L).a()) {
            bVarF.h(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, kf.c, true);
            return bVarF;
        }
        bVarF.f = true;
        return bVarF;
    }
}
