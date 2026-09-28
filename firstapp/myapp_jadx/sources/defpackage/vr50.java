package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class vr50 {
    public static final void a(final wr50 wr50Var, final boolean z, final int i, final boolean z2, final Function1 function1, final Function1 function2, final Function0 function0, final Function1 function3, final Function0 function4, final Function0 function5, final Function1 function6, a aVar, final int i2) {
        int i3;
        Function1 function7;
        boolean z3;
        wr50Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        b bVarI = aVar.i(368365554);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(wr50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            function7 = function3;
            i3 |= bVarI.A(function7) ? 8388608 : 4194304;
        } else {
            function7 = function3;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= bVarI.A(function4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= bVarI.A(function5) ? 536870912 : 268435456;
        }
        int i4 = bVarI.A(function6) ? 4 : 2;
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            boolean z4 = wr50Var instanceof wr50.d;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (!z4) {
                int i5 = i3;
                if (wr50Var instanceof wr50.b) {
                    if (z) {
                        bVarI.N(337607682);
                        wr50.b bVar = (wr50.b) wr50Var;
                        int i6 = i5 & 14;
                        boolean z5 = ((i5 & 458752) == 131072) | (i6 == 4);
                        Object objY = bVarI.y();
                        if (z5 || objY == c0042a) {
                            objY = new Function0() { // from class: sr50
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(wr50Var);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY);
                        }
                        kne.a(bVar, i, (Function0) objY, function0, bVarI, i6 | ((i5 >> 3) & 112) | ((i5 >> 9) & 7168));
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else {
                        bVarI.N(337722320);
                        wr50.b bVar2 = (wr50.b) wr50Var;
                        int i7 = i5 & 14;
                        boolean z6 = ((i5 & 458752) == 131072) | (i7 == 4);
                        Object objY2 = bVarI.y();
                        if (z6 || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: tr50
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(wr50Var);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY2);
                        }
                        gbi.a(bVar2, (Function0) objY2, function0, bVarI, ((i5 >> 12) & 896) | i7);
                        bVarI.X(false);
                    }
                } else if (wr50Var instanceof wr50.c) {
                    if (z) {
                        bVarI.N(337888449);
                        int i8 = i5 >> 15;
                        rne.a((wr50.c) wr50Var, i, function7, function4, function5, bVarI, (i5 & 14) | ((i5 >> 3) & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344));
                        bVarI.X(false);
                    } else {
                        bVarI.N(338004079);
                        int i9 = i5 >> 18;
                        ejj.a((wr50.c) wr50Var, function3, function4, function5, bVarI, (i5 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168));
                        bVarI.X(false);
                    }
                } else if (wr50Var.equals(wr50.e.a)) {
                    if (z) {
                        bVarI.N(338183321);
                        gpe.a(z2, function6, bVarI, ((i5 >> 9) & 14) | ((i4 << 3) & 112));
                        bVarI.X(false);
                    } else {
                        bVarI.N(338307104);
                        zr50.a(z2, function6, bVarI, ((i5 >> 9) & 14) | ((i4 << 3) & 112));
                        bVarI.X(false);
                    }
                } else if (!(wr50Var instanceof wr50.a)) {
                    uhc.a();
                    return;
                } else if (z) {
                    bVarI.N(338483773);
                    fne.a(cb40.a(0, new Object[0], bVarI), bVarI, 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(338572309);
                    b3g.a(cb40.a(0, new Object[0], bVarI), null, bVarI, 0);
                    bVarI.X(false);
                }
            } else if (z) {
                bVarI.N(337295760);
                wr50.d dVar = (wr50.d) wr50Var;
                int i10 = i3;
                boolean z7 = (i3 & 57344) == 16384;
                int i11 = i10 & 14;
                boolean z8 = z7 | (i11 == 4);
                Object objY3 = bVarI.y();
                if (z8 || objY3 == c0042a) {
                    z3 = false;
                    objY3 = new rr50(0, wr50Var, function1);
                    bVarI.r(objY3);
                } else {
                    z3 = false;
                }
                xne.b(dVar, i, (Function0) objY3, bVarI, i11 | ((i10 >> 3) & 112));
                bVarI.X(z3);
            } else {
                int i12 = i3;
                bVarI.N(337428006);
                wr50.d dVar2 = (wr50.d) wr50Var;
                int i13 = i12 & 14;
                boolean z9 = ((i12 & 57344) == 16384) | (i13 == 4);
                Object objY4 = bVarI.y();
                if (z9 || objY4 == c0042a) {
                    objY4 = new jax(1, function1, wr50Var);
                    bVarI.r(objY4);
                }
                fgs.b(dVar2, (Function0) objY4, bVarI, i13);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ur50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vr50.a(wr50Var, z, i, z2, function1, function2, function0, function3, function4, function5, function6, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
