package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ad9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            c55.a.a(0.0f, ((cjb0) aVar.O(ejb0.a)).b, 196608, 3, ((lib0) aVar.O(oib0.a)).H, j060.c(((zib0) aVar.O(ajb0.a)).d), aVar, null);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
