package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y12 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y12(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                op8 op8Var = (op8) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    op8Var.invoke(aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                tmz tmzVar = (tmz) obj4;
                d dVar = (d) obj;
                a aVar2 = (a) obj2;
                ((Integer) obj3).getClass();
                dVar.getClass();
                aVar2.N(-156971876);
                tmzVar.getClass();
                d dVarE = h.e(dVar, tmzVar);
                aVar2.H();
                return dVarE;
        }
    }
}
