package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class spt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final crz crzVar, final String str, final Function0 function0, a aVar, final int i) {
        int i2;
        crzVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1327613967);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(crzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            pzo pzoVar = pzo.b;
            d dVarA = f.a(f.c(dVar, pzoVar), pzoVar);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(dVarA, (psw) objY2, ut50.b(0.0f, 7, 0L, false), false, null, function0, 28);
            Unit unit = Unit.a;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new qpt(ytwVar);
                bVarI.r(objY3);
            }
            d dVarA2 = wje0.a(dVarB, unit, (PointerInputEventHandler) objY3);
            op8 op8Var = new op8(30337880, new ppt(0.0f, ((Boolean) ytwVar.getValue()).booleanValue(), crzVar, str, new imf0(c68.a(R.color.text_type2_primary, bVarI), 0L, t9i.E, null, f8i.b, 0L, null, null, 0, 0L, null, null, 16777178)), true);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            op8Var.invoke(androidx.compose.foundation.layout.d.a, bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mpt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    spt.a(dVar, crzVar, str, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final crz crzVar, final String str, final imf0 imf0Var, final Function0 function0, a aVar, final int i) {
        int i2;
        imf0 imf0Var2;
        Function0 function1;
        crzVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1789063809);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(crzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(118.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(40.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(5.0f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            imf0Var2 = imf0Var;
            i2 |= bVarI.M(imf0Var2) ? 1048576 : 524288;
        } else {
            imf0Var2 = imf0Var;
        }
        if ((12582912 & i) == 0) {
            function1 = function0;
            i2 |= bVarI.A(function1) ? 8388608 : 4194304;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d dVarV = j.v(aVar2, 123.0f, 40.0f, 0.0f, 12);
            pzo pzoVar = pzo.b;
            d dVarA = f.a(f.c(dVarV, pzoVar), pzoVar);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(dVarA, (psw) objY2, ut50.b(0.0f, 7, 0L, false), false, null, function1, 28);
            Unit unit = Unit.a;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new rpt(ytwVar);
                bVarI = bVarI;
                bVarI.r(objY3);
            } else {
                bVarI = bVarI;
            }
            zpt.a(wje0.a(dVarB, unit, (PointerInputEventHandler) objY3), ht.a.e, 0.125f, new op8(30337880, new ppt(5.0f, ((Boolean) ytwVar.getValue()).booleanValue(), crzVar, str, imf0Var2), true), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: opt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    spt.b(crzVar, str, imf0Var, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(crz crzVar, String str, Function0 function0, a aVar, int i) {
        crzVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(275534007);
        int i2 = (bVarI.A(crzVar) ? 32 : 16) | i | (bVarI.M(str) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            b(crzVar, str, new imf0(c68.a(R.color.text_type2_primary, bVarI), 0L, t9i.E, null, f8i.b, 0L, null, null, 0, 0L, null, null, 16777178), function0, bVarI, (524286 & i2) | ((i2 << 3) & 29360128));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new npt(crzVar, str, function0, i);
        }
    }
}
