package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class ctc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void a(d dVar, final Long l, final String str, final long j, final Function1<? super Long, Unit> function1, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        b bVar;
        ?? r15;
        b bVarI = aVar.i(1491272845);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i3 | (bVarI.M(l) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.e(j) ? 2048 : 1024) | (bVarI.A(function1) ? 16384 : 8192);
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar2;
            Object objY = bVarI.y();
            Object obj = a.C0041a.a;
            if (objY == obj) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object obj2 = (k4i) bVarI.O(kna.i);
            boolean zA = bVarI.A(obj2);
            Object objY2 = bVarI.y();
            if (zA || objY2 == obj) {
                objY2 = new ysc(0, obj2, ytwVar);
                bVarI.r(objY2);
            }
            d dVar4 = dVar3;
            tyx.c(androidx.compose.ui.focus.a.a(dVar3, (Function1) objY2), new ijf0(str, 0L, 6), null, null, false, null, false, true, null, cb40.a(R.string.common_functions__date_of_birth, new Object[0], bVarI), null, null, null, 0, null, null, null, bVarI, 12582912, 0, 130428);
            b bVar2 = bVarI;
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVar2.N(-631704101);
                Long lValueOf = Long.valueOf(l != null ? l.longValue() : j);
                n11 n11Var = n11.a;
                IntRange intRange = new IntRange(1900, n11.c(), 1);
                boolean z = (i5 & 57344) == 16384;
                Object objY3 = bVar2.y();
                if (z || objY3 == obj) {
                    r15 = 0;
                    objY3 = new zsc(0, function1, ytwVar);
                    bVar2.r(objY3);
                } else {
                    r15 = 0;
                }
                Function1 function2 = (Function1) objY3;
                Object objY4 = bVar2.y();
                if (objY4 == obj) {
                    objY4 = new atc(ytwVar, r15);
                    bVar2.r(objY4);
                }
                cxc.a(lValueOf, n11Var, intRange, function2, (Function0) objY4, bVar2, 24624, 0);
                bVar2.X(r15);
            } else {
                bVar2.N(-631310091);
                bVar2.X(false);
            }
            dVar2 = dVar4;
            bVar = bVar2;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: btc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    ctc.a(dVar2, l, str, j, function1, (a) obj3, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
