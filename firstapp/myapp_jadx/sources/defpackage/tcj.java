package defpackage;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltcj;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tcj extends j8i0 {
    public static final /* synthetic */ ohp<Object>[] y = {new otw(0, tcj.class, "state", "getState()Lcom/sportybet/android/account/ghaccount/register/GHRegisterState;")};
    public final ou40 a;
    public final psm b;
    public final nsm c;
    public final rdd0 d;
    public final bnh0 e;
    public final v340 f;
    public final vwd0 i;
    public final ku90<fdj> v;
    public final ku90 w;

    public tcj(ou40 ou40Var, idj idjVar, psm psmVar, nsm nsmVar, rdd0 rdd0Var, bnh0 bnh0Var, yi5 yi5Var) {
        ou40Var.getClass();
        psmVar.getClass();
        nsmVar.getClass();
        rdd0Var.getClass();
        bnh0Var.getClass();
        yi5Var.getClass();
        this.a = ou40Var;
        this.b = psmVar;
        this.c = nsmVar;
        this.d = rdd0Var;
        this.e = bnh0Var;
        String name = a8b.a.a().getName();
        name.getClass();
        int iJ = a8b.c().j();
        String strB = a8b.b();
        strB.getClass();
        vwd0 vwd0Var = new vwd0(new jdj(iJ, name, strB, idjVar.a(), yi5Var.b().j() ? new iej.b(false, false) : iej.a.a, 432));
        this.f = vwd0Var.b;
        this.i = vwd0Var;
        ku90<fdj> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = ku90Var;
    }

    public final void A1() {
        if (x1().h != uxs.LOADING) {
            z1();
        }
    }

    public final jdj x1() {
        return (jdj) this.i.a(this, y[0]);
    }

    public final void y1(jdj jdjVar) {
        this.i.b(this, y[0], jdjVar);
    }

    public final void z1() {
        iej iejVar = x1().g;
        if (!(iejVar instanceof iej.b)) {
            iejVar = null;
        }
        iej.b bVar = (iej.b) iejVar;
        boolean z = true;
        if (bVar != null && (!bVar.a || !bVar.b)) {
            z = false;
        }
        y1(jdj.a(x1(), null, null, (StringsKt.U(x1().f.a.b) || !z || (x1().i instanceof zs00.a)) ? uxs.DISABLE : uxs.ENABLE, null, 383));
    }
}
