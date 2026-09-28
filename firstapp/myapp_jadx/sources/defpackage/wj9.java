package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wj9 implements iaj {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        a aVar = (a) obj3;
        ((Integer) obj4).getClass();
        ((pf0) obj).getClass();
        ((ifx) obj2).getClass();
        w8i0 w8i0VarA = zdt.a(aVar);
        if (w8i0VarA == null) {
            ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        yn10 yn10Var = (yn10) p8i0.a(jq40.a(yn10.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
        gr10 gr10Var = (gr10) wyh.c(yn10Var.b, aVar, 0, 7).getValue();
        boolean zA = aVar.A(yn10Var);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zA || objY == c0042a) {
            objY = new xj9(yn10Var, 0);
            aVar.r(objY);
        }
        wn10.a(gr10Var, (Function0) objY, aVar, 0);
        Unit unit = Unit.a;
        boolean zA2 = aVar.A(yn10Var);
        Object objY2 = aVar.y();
        if (zA2 || objY2 == c0042a) {
            objY2 = new yj9.a(yn10Var, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, unit, (Function2) objY2);
        return unit;
    }
}
