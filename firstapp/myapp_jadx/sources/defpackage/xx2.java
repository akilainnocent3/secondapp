package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xx2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx2(yax.a aVar, int i) {
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dy2.b((yax.a) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                SearchActivity searchActivity = (SearchActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = SearchActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8i0 w8i0VarA = zdt.a(aVar);
                    if (w8i0VarA == null) {
                        ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    l280 l280Var = (l280) p8i0.a(jq40.a(l280.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
                    boolean zA = aVar.A(searchActivity);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new pt70(searchActivity);
                        aVar.r(objY);
                    }
                    yy70.b(l280Var, (Function0) ((chp) objY), aVar, 8);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ xx2(SearchActivity searchActivity) {
        this.b = searchActivity;
    }
}
