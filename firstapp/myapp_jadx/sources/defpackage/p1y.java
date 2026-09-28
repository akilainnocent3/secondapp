package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p1y implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d(str, d.a.b, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(g9z.d.a, aVar), aVar, 48, 24960, 110588);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                Function1 function1 = (Function1) obj4;
                se60 se60Var = (se60) obj;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                se60Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= aVar2.M(se60Var) ? 4 : 2;
                }
                if (!aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    aVar2.G();
                } else if (se60Var instanceof se60.a) {
                    aVar2.N(854931627);
                    zys.d(((se60.a) se60Var).a, aVar2, 0);
                    aVar2.H();
                } else {
                    if (!(se60Var instanceof se60.b)) {
                        throw rg.a(854929743, aVar2);
                    }
                    aVar2.N(733159092);
                    hf60.e(null, (se60.b) se60Var, function1, aVar2, (iIntValue2 << 3) & 112);
                    aVar2.H();
                }
                return Unit.a;
        }
    }
}
