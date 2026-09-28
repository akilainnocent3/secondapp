package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class avu implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ avu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                h0s h0sVar = (h0s) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (!aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    aVar.G();
                } else if (Intrinsics.g(h0sVar.d().c, hxs.b.b)) {
                    aVar.N(-421686884);
                    pvu.d(6, false, aVar, 6, 2);
                    aVar.H();
                } else {
                    aVar.N(-421682620);
                    ty0.a(aVar, j.i(d.a.b, 16.0f));
                    aVar.H();
                }
                break;
            default:
                bh30 bh30Var = (bh30) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ck5.a(0.0f, pp8.b(-1637061646, new rg30(bh30Var, 0), aVar2), null, null, aVar2, 48, 13);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
