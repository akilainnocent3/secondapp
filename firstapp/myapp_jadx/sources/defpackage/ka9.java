package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ka9 implements jaj {
    @Override // defpackage.jaj
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function0 function0 = (Function0) obj3;
        a aVar = (a) obj4;
        int iIntValue = ((Integer) obj5).intValue();
        ((l4q) obj).getClass();
        ((Unit) obj2).getClass();
        function0.getClass();
        if ((iIntValue & 384) == 0) {
            iIntValue |= aVar.A(function0) ? 256 : 128;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 1153) != 1152)) {
            p4r.f(function0, aVar, (iIntValue >> 6) & 14);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
