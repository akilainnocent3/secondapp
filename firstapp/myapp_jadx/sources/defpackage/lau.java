package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lau implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ lau(int i, uf00 uf00Var) {
        this.b = uf00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xau.b((uf00) obj3, (a) obj, qj40.a(7));
                break;
            default:
                ju20 ju20Var = (ju20) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(ju20Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        ju20.a aVar2 = new ju20.a(0, ju20Var, ju20.class, "navigateToProfile", "navigateToProfile()V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    xu20.b((Function0) ((chp) objY), null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
