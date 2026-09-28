package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yw8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ax8(0);
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new bx8();
                aVar.r(objY2);
            }
            ytc.a(false, null, null, function0, (Function2) objY2, aVar, 28086);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
