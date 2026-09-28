package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class le2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ le2(int i, d dVar, String str) {
        this.b = dVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hf2.g(qj40.a(1), (a) obj, (d) obj4, (String) obj3);
                break;
            default:
                ob30 ob30Var = (ob30) obj4;
                fgb fgbVar = (fgb) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<Boolean> ytwVar = fgbVar.i0;
                    boolean zA = aVar.A(fgbVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new nfb(fgbVar, 0);
                        aVar.r(objY);
                    }
                    dfz.d(ob30Var, ytwVar, (Function0) objY, null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ le2(ob30 ob30Var, fgb fgbVar) {
        this.b = ob30Var;
        this.c = fgbVar;
    }
}
