package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l89 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            c55.a.a(31.0f, 2.0f, 197040, 1, ((lib0) aVar.O(oib0.a)).B, j060.c(100.0f), aVar, null);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
