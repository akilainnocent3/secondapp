package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zge0 implements wz0 {
    public final /* synthetic */ ehe0 a;
    public final /* synthetic */ ehe0.a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cl1 d;
    public final /* synthetic */ lhe0.a e;

    public /* synthetic */ zge0(ehe0 ehe0Var, ehe0.a aVar, int i, cl1 cl1Var, lhe0.a aVar2) {
        this.a = ehe0Var;
        this.b = aVar;
        this.c = i;
        this.d = cl1Var;
        this.e = aVar2;
    }

    @Override // defpackage.wz0
    public final qis apply(Object obj) {
        ehe0.a aVar = this.b;
        Surface surface = (Surface) obj;
        ehe0 ehe0Var = this.a;
        ehe0Var.getClass();
        surface.getClass();
        try {
            aVar.d();
            nhe0 nhe0Var = new nhe0(surface, this.c, ehe0Var.g.f(), this.d, this.e);
            nhe0Var.z.b.k(new kh6(aVar, 1 == true ? 1 : 0), nqe.a());
            km20.g("Consumer can only be linked once.", aVar.r == null);
            aVar.r = nhe0Var;
            return obj.c(nhe0Var);
        } catch (ijd.a e) {
            return new fcn.a(e);
        }
    }
}
