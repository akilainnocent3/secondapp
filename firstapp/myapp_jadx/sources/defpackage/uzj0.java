package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uzj0 extends saj implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        l5k0 l5k0Var;
        l0k0 l0k0VarA;
        ArrayList arrayList;
        int iIntValue = num.intValue();
        t0k0 t0k0Var = (t0k0) this.receiver;
        v6k0 v6k0Var = t0k0Var.z;
        uf00<l5k0> uf00VarB = ((n0k0) t0k0Var.N.getValue()).b();
        if (uf00VarB != null && (l5k0Var = (l5k0) CollectionsKt.V(iIntValue, uf00VarB)) != null && (l0k0VarA = l5k0Var.a()) != null) {
            t0k0Var.F = l0k0VarA;
            int i = t0k0.a.a[l0k0VarA.ordinal()];
            if (ay0.V(new l0k0[]{l0k0.LIVE, l0k0.PRE_MATCH}).contains(l0k0VarA) && ((arrayList = t0k0Var.G) == null || arrayList.isEmpty())) {
                t0k0Var.J1();
                t0k0Var.D1(false);
            } else if (i == 2 && t0k0Var.I == null) {
                t0k0Var.J1();
                t0k0Var.E1();
            } else if (i == 1 && t0k0Var.H == null) {
                t0k0Var.J1();
                t0k0Var.F1();
            } else {
                t0k0Var.I1();
                Unit unit = Unit.a;
            }
            l0k0 l0k0Var = t0k0Var.F;
            if (l0k0Var == l0k0.GAMES) {
                v6k0Var.a.a(new dyj(0), k00.d);
            } else if (l0k0Var == l0k0.SPECIALS) {
                v6k0Var.a.a(new lsa0(0), k00.d);
            }
        }
        return Unit.a;
    }
}
