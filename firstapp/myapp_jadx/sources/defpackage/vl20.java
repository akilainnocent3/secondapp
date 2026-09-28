package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchFilterType;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class vl20 implements lnh {
    public final /* synthetic */ hjd0 a;
    public final /* synthetic */ PreMatchSportActivity b;

    public vl20(hjd0 hjd0Var, PreMatchSportActivity preMatchSportActivity) {
        this.a = hjd0Var;
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.lnh
    public final void a() {
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        yec yecVar = this.b.C1().c;
        if (yecVar != null) {
            yecVar.dismiss();
        }
    }

    @Override // defpackage.lnh
    public final void b(PreMatchFilterType preMatchFilterType) {
        preMatchFilterType.getClass();
        hjd0 hjd0Var = this.a;
        if (hjd0Var.B.a.e.isChecked()) {
            hjd0Var.J.scrollTo(0, 0);
            hjd0Var.B.setLiveBettingChecked(false);
        }
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        PreMatchSportActivity preMatchSportActivity = this.b;
        preMatchSportActivity.C1().a(preMatchFilterType, hjd0Var.L.a);
        Object obj = null;
        if (preMatchFilterType == PreMatchFilterType.ODDS) {
            preMatchSportActivity.I1().z1(null, null);
            return;
        }
        if (preMatchFilterType == PreMatchFilterType.TIME) {
            jk20 jk20VarI1 = preMatchSportActivity.I1();
            ArrayList arrayList = preMatchSportActivity.C1().k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                xvf0 xvf0Var = (xvf0) obj2;
                if ((xvf0Var.c() && xvf0Var.d > 0) || (xvf0Var.d() && xvf0Var.c)) {
                    obj = obj2;
                    break;
                }
            }
            xvf0 xvf0VarA = (xvf0) obj;
            if (xvf0VarA == null) {
                xvf0VarA = xvf0.a();
            }
            jk20VarI1.A1(xvf0VarA, false);
        }
    }
}
