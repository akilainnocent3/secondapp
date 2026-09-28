package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class l9z {
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    public static final void a(d dVar, final String str, final String str2, final uxs uxsVar, alb0 alb0Var, alb0 alb0Var2, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        String str3;
        Function0<Unit> function2;
        b bVar;
        final alb0 alb0Var3;
        final d dVar3;
        final alb0 alb0Var4;
        int i4;
        int i5;
        alb0 alb0Var5 = alb0Var;
        alb0 alb0Var6 = alb0Var2;
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1044338543);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i3 |= bVarI.M(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.d(uxsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i5 = 8192;
            } else {
                if ((32768 & i) == 0 ? bVarI.M(alb0Var5) : bVarI.A(alb0Var5)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i4 = 65536;
            } else {
                if ((262144 & i) == 0 ? bVarI.M(alb0Var6) : bVarI.A(alb0Var6)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
            }
            i3 |= i4;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function2 = function1;
            i3 |= bVarI.A(function2) ? 8388608 : 4194304;
        } else {
            function2 = function1;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if (i6 != 0) {
                    dVar2 = d.a.b;
                }
                if ((i2 & 16) != 0) {
                    alb0Var5 = g9z.a;
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    alb0Var6 = sya.b;
                    i3 &= -458753;
                }
            } else {
                bVarI.G();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            alb0 alb0Var7 = alb0Var5;
            bVarI.Y();
            d dVarG = j.g(dVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            bVar = bVarI;
            vuc0.a(g3w.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "negative_button"), false, null, null, function0, null, alb0Var7, null, null, pp8.b(-823641516, new gaj() { // from class: j9z
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 0, 0, 262142);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i3 >> 6) & 57344) | 805306368 | (3670016 & (i3 << 6)), 430);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            alb0 alb0Var8 = alb0Var6;
            aza.a(g3w.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "positive_button"), str3, uxsVar, null, alb0Var8, null, null, null, function2, null, bVar, ((i3 >> 3) & 58352) | ((i3 << 3) & 234881024), 744);
            bVar.X(true);
            dVar3 = dVar2;
            alb0Var3 = alb0Var8;
            alb0Var4 = alb0Var7;
        } else {
            bVarI.G();
            bVar = bVarI;
            alb0Var3 = alb0Var6;
            dVar3 = dVar2;
            alb0Var4 = alb0Var5;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k9z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l9z.a(dVar3, str, str2, uxsVar, alb0Var4, alb0Var3, function0, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
