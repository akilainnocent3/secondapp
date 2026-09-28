package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import coil3.compose.internal.ContentPainterElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class yz0 {
    public static final void a(final g01 g01Var, final String str, final d dVar, final Function1<? super b01.b, ? extends b01.b> function1, final Function1<? super b01.b, Unit> function2, final ht htVar, final d0b d0bVar, final float f, final l58 l58Var, final int i, final boolean z, a aVar, final int i2, final int i3) {
        int i4;
        String str2;
        Function1<? super b01.b, ? extends b01.b> function3;
        Function1<? super b01.b, Unit> function4;
        ht htVar2;
        int i5;
        boolean z2;
        int i6;
        b bVarI = aVar.i(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(g01Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function3 = function1;
            i4 |= bVarI.A(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i2 & 24576) == 0) {
            function4 = function2;
            i4 |= bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i2) == 0) {
            htVar2 = htVar;
            i4 |= bVarI.M(htVar2) ? 131072 : 65536;
        } else {
            htVar2 = htVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.M(d0bVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= bVarI.c(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= bVarI.M(l58Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= bVarI.d(i5) ? 536870912 : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (bVarI.b(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            nan nanVarD = qsh0.d(g01Var.a, d0bVar, bVarI, (i4 >> 15) & 112);
            qsh0.g(nanVarD);
            d dVarN = dVar.n(new ContentPainterElement(nanVarD, g01Var.c, g01Var.b, function3, function4, i5, htVar2, d0bVar, f, l58Var, z2, qsh0.a(bVarI), str2));
            int I = bVarI.I();
            d dVarC = c.c(bVarI, dVarN);
            ne00 ne00VarS = bVarI.S();
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, qsh0.a.a, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            hlh0.a(bVarI, dVarC, yka.a.d);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xz0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    yz0.a(g01Var, str, dVar, function1, function2, htVar, d0bVar, f, l58Var, i, z, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Object obj, String str, m9n m9nVar, d dVar, final crz crzVar, final crz crzVar2, crz crzVar3, Function1 function1, Function1 function2, ht htVar, d0b d0bVar, float f, l58 l58Var, a aVar, int i, int i2, int i3) {
        final crz crzVar4 = (i3 & 64) != 0 ? crzVar2 : crzVar3;
        Function1 function3 = (i3 & 256) != 0 ? null : function1;
        Function1 function4 = (i3 & 512) != 0 ? null : function2;
        int i4 = i >> 3;
        g01 g01Var = new g01(obj, (zz0) aVar.O(cdt.a), m9nVar);
        int i5 = qsh0.b;
        int i6 = i2 << 15;
        a(g01Var, str, dVar, (crzVar == null && crzVar2 == null && crzVar4 == null) ? b01.L : new Function1() { // from class: hsh0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b01.b bVar = (b01.b) obj2;
                if (bVar instanceof b01.b.c) {
                    crz crzVar5 = crzVar;
                    return crzVar5 != null ? new b01.b.c(crzVar5) : (b01.b.c) bVar;
                }
                if (!(bVar instanceof b01.b.C0106b)) {
                    return bVar;
                }
                b01.b.C0106b c0106b = (b01.b.C0106b) bVar;
                tcg tcgVar = c0106b.b;
                if (tcgVar.c instanceof i5y) {
                    crz crzVar6 = crzVar4;
                    return crzVar6 != null ? new b01.b.C0106b(crzVar6, tcgVar) : c0106b;
                }
                crz crzVar7 = crzVar2;
                return crzVar7 != null ? new b01.b.C0106b(crzVar7, tcgVar) : c0106b;
            }
        }, (function3 == null && function4 == null) ? null : new ish0(null, function3, function4), htVar, d0bVar, f, l58Var, 1, true, aVar, (i & 112) | (i4 & 896) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i2 >> 15) & 14);
    }
}
