package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ic9 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Integer) obj2).intValue();
        a aVar = (a) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((gwr) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= aVar.d(iIntValue) ? 32 : 16;
        }
        if (aVar.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            if (iIntValue == 0) {
                aVar.N(1124694011);
                i5t.b(0, aVar);
            } else {
                aVar.N(1123006619);
            }
            aVar.H();
            if (iIntValue == 1) {
                aVar.N(1124786639);
                i5t.c(0, aVar);
            } else {
                aVar.N(1123006619);
            }
            aVar.H();
            if (iIntValue == 2) {
                aVar.N(1124890489);
                i5t.a(0, aVar);
            } else {
                aVar.N(1123006619);
            }
            aVar.H();
            if (iIntValue == 3) {
                aVar.N(1124984667);
                i5t.b(0, aVar);
            } else {
                aVar.N(1123006619);
            }
            aVar.H();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
