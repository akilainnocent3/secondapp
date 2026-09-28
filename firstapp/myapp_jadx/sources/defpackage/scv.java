package defpackage;

import androidx.compose.foundation.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class scv {
    public static final qyd0 a;

    static {
        hwr.b(new ocv());
        a = new qyd0(new pcv(0));
    }

    public static final void a(final d68 d68Var, final y5w y5wVar, final uy80 uy80Var, final eah0 eah0Var, final Function2 function2, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(904511636);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(d68Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(y5wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uy80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(eah0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            xt50 xt50VarB = ut50.b(0.0f, 7, 0L, false);
            long j = d68Var.a;
            boolean zE = bVarI.e(j);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                objY = new bmf0(j, j58.c(0.4f, j));
                bVarI.r(objY);
            }
            hna.b(new j730[]{g68.a.a(d68Var), a.a(y5wVar), g.a.a(xt50VarB), xy80.a.a(uy80Var), cmf0.a.a((bmf0) objY), gah0.a.a(eah0Var)}, pp8.b(-1750539308, new rcv(eah0Var, function2), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qcv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    scv.a(d68Var, y5wVar, uy80Var, eah0Var, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d68 d68Var, uy80 uy80Var, eah0 eah0Var, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i, final int i2) {
        int i3;
        final Function2<? super a, ? super Integer, Unit> function3;
        final eah0 eah0Var2;
        final uy80 uy80Var2;
        final d68 d68Var2;
        b bVarI = aVar.i(-449719819);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && bVarI.M(d68Var)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && bVarI.M(uy80Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && bVarI.M(eah0Var)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i2 & 1) != 0) {
                    d68Var = (d68) bVarI.O(g68.a);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    uy80Var = (uy80) bVarI.O(xy80.a);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    eah0Var = (eah0) bVarI.O(gah0.a);
                    i3 &= -897;
                }
            } else {
                bVarI.G();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            d68 d68Var3 = d68Var;
            uy80 uy80Var3 = uy80Var;
            eah0 eah0Var3 = eah0Var;
            bVarI.Y();
            int i4 = i3 << 3;
            a(d68Var3, (y5w) bVarI.O(a), uy80Var3, eah0Var3, function2, bVarI, (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            function3 = function2;
            d68Var2 = d68Var3;
            uy80Var2 = uy80Var3;
            eah0Var2 = eah0Var3;
        } else {
            function3 = function2;
            bVarI.G();
            eah0Var2 = eah0Var;
            uy80Var2 = uy80Var;
            d68Var2 = d68Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ncv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    scv.b(d68Var2, uy80Var2, eah0Var2, function3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
