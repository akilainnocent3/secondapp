package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class twi0 {
    public static final void a(final yle yleVar, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        int i3;
        b bVarI = aVar.i(160188523);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(yleVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                yleVar = new yle(false, false, 7);
            }
            yle yleVar2 = yleVar;
            if (i5 != 0) {
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new rh60(1);
                    bVarI.r(objY);
                }
                function0 = (Function0) objY;
            }
            Function0<Unit> function1 = function0;
            u60.a(function1, yleVar2, p0a.a, bVarI, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112), 0);
            function0 = function1;
            yleVar = yleVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: swi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    twi0.a(yleVar, function0, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }
}
