package defpackage;

import androidx.compose.runtime.a;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n59 implements iaj {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        pair.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.M(pair) ? 32 : 16;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            d1n.d((String) pair.a, (String) pair.b, aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
