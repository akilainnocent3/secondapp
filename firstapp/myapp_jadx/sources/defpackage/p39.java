package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p39 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            j7a0.a(j.e(d.a.b, 1.0f), 60, 0, 0, 0, 3.0f, 7.0f, 5.0f, 10.0f, 1.2f, aVar, 920125494);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
