package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ky5 implements wz0, pya {
    public final /* synthetic */ Object a;

    public /* synthetic */ ky5(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((hka0) this.a).invoke(obj);
    }

    @Override // defpackage.wz0
    public qis apply(Object obj) {
        fy5.d dVar = (fy5.d) this.a;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return fcn.c.b;
        }
        long j = dVar.g;
        adl adlVar = dVar.c;
        ow5 ow5Var = dVar.d;
        fy5.f fVar = new fy5.f(new ly5());
        ow5Var.j(fVar);
        by5 by5Var = new by5(ow5Var, fVar);
        od80 od80Var = ow5Var.c;
        nv5.d dVar2 = fVar.b;
        dVar2.b.k(by5Var, od80Var);
        return nv5.a(new kbj(dVar2, adlVar, j / 1000000));
    }
}
