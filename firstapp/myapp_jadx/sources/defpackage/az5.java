package defpackage;

import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class az5 implements wz0, pya {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((tka0) obj2).invoke(obj);
                break;
            default:
                ((StompClient) obj2).lambda$connect$4((f1e0) obj);
                break;
        }
    }

    @Override // defpackage.wz0
    public qis apply(Object obj) {
        fy5.h hVar = (fy5.h) this.b;
        adl adlVar = hVar.e;
        ow5 ow5Var = hVar.a;
        fy5.f fVar = new fy5.f(new bz5(0));
        ow5Var.j(fVar);
        by5 by5Var = new by5(ow5Var, fVar);
        od80 od80Var = ow5Var.c;
        nv5.d dVar = fVar.b;
        dVar.b.k(by5Var, od80Var);
        return nv5.a(new kbj(dVar, adlVar, 2000L));
    }
}
