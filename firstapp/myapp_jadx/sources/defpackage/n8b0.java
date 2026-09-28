package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class n8b0 {
    public static final void a(final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-1553016041);
        int i2 = i | 6;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new l8b0();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            androidx.compose.ui.viewinterop.b.a((Function1) objY, aVar2, null, bVarI, 54, 4);
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: m8b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n8b0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
