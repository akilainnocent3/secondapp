package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y89 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((t2q.d) obj).getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.b(zBooleanValue) ? 32 : 16;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            v7q.b(zBooleanValue, aVar, (iIntValue >> 3) & 14);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
