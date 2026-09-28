package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qer implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qer(jj40 jj40Var, lj40 lj40Var) {
        this.a = 2;
        this.b = jj40Var;
        this.c = lj40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rer.a((d) obj4, (mer) obj3, (a) obj, qj40.a(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pzv.c((List) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
            default:
                jj40 jj40Var = (jj40) obj4;
                lj40 lj40Var = (lj40) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(lj40Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new ter(lj40Var, 2);
                        aVar.r(objY);
                    }
                    hj40.a(jj40Var, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qer(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
