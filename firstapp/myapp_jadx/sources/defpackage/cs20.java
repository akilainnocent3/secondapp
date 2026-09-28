package defpackage;

import androidx.compose.runtime.a;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cs20 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cs20(mjj0 mjj0Var, yfx yfxVar, Function0 function0, int i) {
        this.b = mjj0Var;
        this.c = yfxVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                String str2 = (String) obj4;
                ds20 ds20Var = (ds20) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yfx yfxVarA = NavHostFragment.a.a(ds20Var);
                    boolean zA = aVar.A(yfxVarA);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        ds20.a aVar2 = new ds20.a(0, yfxVarA, yfx.class, "popBackStack", "popBackStack()Z", 8);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(ds20Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new ds20.b(0, ds20Var, ds20.class, "navigateToUpdatedSuccessfullyScreen", "navigateToUpdatedSuccessfullyScreen()V", 0);
                        aVar.r(objY2);
                    }
                    os20.a(str, str2, function0, (Function0) ((chp) objY2), null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wlj0.f((mjj0) obj5, (yfx) obj4, (Function0) obj3, (a) obj, qj40.a(9));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cs20(String str, String str2, ds20 ds20Var) {
        this.b = str;
        this.c = str2;
        this.d = ds20Var;
    }
}
