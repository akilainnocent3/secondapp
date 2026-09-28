package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lj4 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lj4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                uj4 uj4Var = (uj4) obj5;
                fk4 fk4Var = (fk4) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    jke.c((dmj) uj4Var, fk4Var, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                r75 r75Var = (r75) obj5;
                ne90.a aVar2 = (ne90.a) obj4;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    g75.a(j.i(j.g(d.a.b, 1.0f), (r75Var.e() - aVar2.a) + 1.0f), aVar3, 0);
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
