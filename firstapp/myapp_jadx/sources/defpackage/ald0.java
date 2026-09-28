package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class ald0 {
    public static final void a(final long j, final and0 and0Var, Function0<Unit> function0, final Function0<Unit> function1, final long j2, a aVar, final int i) {
        int i2;
        Function0<Unit> function2;
        Function0<Unit> function3;
        final Function0<Unit> function4;
        and0Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1423826110);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(and0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function2 = function0;
            i2 |= bVarI.A(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= bVarI.A(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            int iOrdinal = and0Var.ordinal();
            if (iOrdinal == 1) {
                bVarI.N(-1797667286);
                bVarI.X(false);
                function4 = function3;
            } else if (iOrdinal != 2) {
                bVarI.N(106977706);
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new xkd0();
                    bVarI.r(objY);
                }
                function4 = (Function0) objY;
                bVarI.X(false);
            } else {
                bVarI.N(-1797665366);
                bVarI.X(false);
                function4 = function2;
            }
            int iOrdinal2 = and0Var.ordinal();
            final boolean z = iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 8;
            mez.a(new kod0(126.0f, 570.0f, 54.0f, 109.0f, (int) (j >> 32), (int) (j & 4294967295L), (int) (j2 >> 32), (int) (j2 & 4294967295L), 768), pp8.b(-99739367, new iaj() { // from class: ykd0
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    g7f g7fVar = (g7f) obj;
                    g7f g7fVar2 = (g7f) obj2;
                    a aVar2 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if ((iIntValue & 6) == 0) {
                        i3 = (aVar2.c(g7fVar.a) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i3 |= aVar2.c(g7fVar2.a) ? 32 : 16;
                    }
                    if (aVar2.q(i3 & 1, (i3 & 147) != 146)) {
                        d dVarT = j.t(d.a.b, g7fVar.a, g7fVar2.a);
                        Object objY2 = aVar2.y();
                        if (objY2 == a.C0041a.a) {
                            objY2 = pr7.a(aVar2);
                        }
                        g75.a(androidx.compose.foundation.d.b(dVarT, (psw) objY2, null, z, null, function4, 24), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function5 = function2;
            eVarZ.d = new Function2() { // from class: zkd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ald0.a(j, and0Var, function5, function1, j2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
