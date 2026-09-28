package defpackage;

import com.sportybet.android.widget.OneUpTwoUpItemControl;
import com.sportybet.android.widget.OneUpTwoUpSwitch;

/* JADX INFO: loaded from: classes7.dex */
public final class yv2 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ pgd0 a;
    public final /* synthetic */ cw2 b;

    public yv2(cw2 cw2Var, pgd0 pgd0Var) {
        this.a = pgd0Var;
        this.b = cw2Var;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        huy huyVar;
        OneUpTwoUpItemControl oneUpTwoUpItemControl = this.a.P;
        OneUpTwoUpSwitch.c a = oneUpTwoUpItemControl.getSwitchView().getA();
        OneUpTwoUpSwitch.f c = oneUpTwoUpItemControl.getSwitchView().getC();
        zuy zuyVarE = hih0.e(a);
        c.getClass();
        int iOrdinal = a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                huyVar = huy.a;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                huyVar = huy.b;
            }
        } else if (fVar instanceof OneUpTwoUpSwitch.f.a) {
            huyVar = huy.a;
        } else if (fVar instanceof OneUpTwoUpSwitch.f.c) {
            huyVar = huy.b;
        } else if (fVar instanceof OneUpTwoUpSwitch.f.b.C0357b) {
            huyVar = huy.a;
        } else if (fVar instanceof OneUpTwoUpSwitch.f.b.c) {
            huyVar = huy.b;
        } else if (!(fVar instanceof OneUpTwoUpSwitch.f.b.a)) {
            uhc.a();
            return;
        } else if (c instanceof OneUpTwoUpSwitch.f.b.C0357b) {
            huyVar = huy.a;
        } else {
            huyVar = c instanceof OneUpTwoUpSwitch.f.b.c ? huy.b : huy.b;
        }
        huy huyVar2 = huyVar;
        avy avyVarG = hih0.g(c);
        avy avyVarG2 = hih0.g(fVar);
        cw2 cw2Var = this.b;
        cw2Var.b.invoke(new y43.a.j(cw2Var.getBindingAdapterPosition(), zuyVarE, huyVar2, avyVarG2, avyVarG));
    }
}
