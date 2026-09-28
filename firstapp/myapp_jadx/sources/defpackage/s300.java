package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class s300 {
    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, final int i, boolean z, Function0<Unit> function0, int i2, a aVar, final int i3, final int i4) {
        final boolean z2;
        int i5;
        Function0<Unit> function1;
        int i6;
        boolean z3;
        final d dVar2;
        final Function0<Unit> function2;
        final int i7;
        e eVarZ;
        Function0<Unit> function3;
        int i8;
        d dVar3;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(214454090);
        int i9 = i3 | 6;
        if ((i3 & 48) == 0) {
            i9 |= bVarI.d(i) ? 32 : 16;
        }
        int i10 = i4 & 4;
        if (i10 == 0) {
            if ((i3 & 384) == 0) {
                z2 = z;
                i9 |= bVarI.b(z2) ? 256 : 128;
            }
            i5 = i4 & 8;
            if (i5 != 0) {
                if ((i3 & 3072) == 0) {
                    function1 = function0;
                    if (bVarI.A(function1)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i9 |= i6;
                }
                if ((i3 & 24576) == 0) {
                    i9 |= 8192;
                }
                if ((i9 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0 || bVarI.h0()) {
                        if (i10 != 0) {
                            z2 = false;
                        }
                        if (i5 != 0) {
                            objY = bVarI.y();
                            if (objY == a.C0041a.a) {
                                objY = new p300();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        i8 = i9 & (-57345);
                        dVar3 = d.a.b;
                        i7 = R.color.text_type1_secondary;
                    } else {
                        bVarI.G();
                        i8 = i9 & (-57345);
                        dVar3 = dVar;
                        function3 = function1;
                        i7 = i2;
                    }
                    bVarI.Y();
                    d dVarF = g3w.f(g3w.k(j.r(dVar3, 45.0f), z2), true, function3);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarF);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    h6n.b(erz.a(i, (i8 >> 3) & 14, bVarI), null, null, c68.a(i7, bVarI), bVarI, 48, 4);
                    bVarI.X(true);
                    d dVar4 = dVar3;
                    function2 = function3;
                    dVar2 = dVar4;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function2 = function1;
                    i7 = i2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: q300
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            s300.a(dVar2, i, z2, function2, i7, (a) obj, qj40.a(i3 | 1), i4);
                            return Unit.a;
                        }
                    };
                }
            }
            i9 |= 3072;
            function1 = function0;
            if ((i3 & 24576) == 0) {
                i9 |= 8192;
            }
            if ((i9 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if (i5 != 0) {
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new p300();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    i8 = i9 & (-57345);
                    dVar3 = d.a.b;
                    i7 = R.color.text_type1_secondary;
                } else {
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if (i5 != 0) {
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new p300();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    i8 = i9 & (-57345);
                    dVar3 = d.a.b;
                    i7 = R.color.text_type1_secondary;
                }
                bVarI.Y();
                d dVarF2 = g3w.f(g3w.k(j.r(dVar3, 45.0f), z2), true, function3);
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarF2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                h6n.b(erz.a(i, (i8 >> 3) & 14, bVarI), null, null, c68.a(i7, bVarI), bVarI, 48, 4);
                bVarI.X(true);
                d dVar5 = dVar3;
                function2 = function3;
                dVar2 = dVar5;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function2 = function1;
                i7 = i2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: q300
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s300.a(dVar2, i, z2, function2, i7, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i9 |= 384;
        z2 = z;
        i5 = i4 & 8;
        if (i5 != 0) {
            if ((i3 & 3072) == 0) {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i9 |= i6;
            }
            if ((i3 & 24576) == 0) {
                i9 |= 8192;
            }
            if ((i9 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if (i5 != 0) {
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new p300();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    i8 = i9 & (-57345);
                    dVar3 = d.a.b;
                    i7 = R.color.text_type1_secondary;
                } else {
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if (i5 != 0) {
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new p300();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    i8 = i9 & (-57345);
                    dVar3 = d.a.b;
                    i7 = R.color.text_type1_secondary;
                }
                bVarI.Y();
                d dVarF3 = g3w.f(g3w.k(j.r(dVar3, 45.0f), z2), true, function3);
                aiv aivVarC3 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarF3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                h6n.b(erz.a(i, (i8 >> 3) & 14, bVarI), null, null, c68.a(i7, bVarI), bVarI, 48, 4);
                bVarI.X(true);
                d dVar6 = dVar3;
                function2 = function3;
                dVar2 = dVar6;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function2 = function1;
                i7 = i2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: q300
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s300.a(dVar2, i, z2, function2, i7, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i9 |= 3072;
        function1 = function0;
        if ((i3 & 24576) == 0) {
            i9 |= 8192;
        }
        if ((i9 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i9 & 1, z3)) {
            bVarI.A0();
            if ((i3 & 1) != 0) {
                if (i10 != 0) {
                    z2 = false;
                }
                if (i5 != 0) {
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new p300();
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                } else {
                    function3 = function1;
                }
                i8 = i9 & (-57345);
                dVar3 = d.a.b;
                i7 = R.color.text_type1_secondary;
            } else {
                if (i10 != 0) {
                    z2 = false;
                }
                if (i5 != 0) {
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new p300();
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                } else {
                    function3 = function1;
                }
                i8 = i9 & (-57345);
                dVar3 = d.a.b;
                i7 = R.color.text_type1_secondary;
            }
            bVarI.Y();
            d dVarF4 = g3w.f(g3w.k(j.r(dVar3, 45.0f), z2), true, function3);
            aiv aivVarC4 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarF4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            h6n.b(erz.a(i, (i8 >> 3) & 14, bVarI), null, null, c68.a(i7, bVarI), bVarI, 48, 4);
            bVarI.X(true);
            d dVar7 = dVar3;
            function2 = function3;
            dVar2 = dVar7;
        } else {
            bVarI.G();
            dVar2 = dVar;
            function2 = function1;
            i7 = i2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: q300
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s300.a(dVar2, i, z2, function2, i7, (a) obj, qj40.a(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final List list, final int i, final int i2, final int i3, final Function0 function0, a aVar, final int i4) {
        int i5;
        b bVar;
        list.getClass();
        function0.getClass();
        b bVarI = aVar.i(-779534919);
        if ((i4 & 6) == 0) {
            i5 = (bVarI.M(dVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= bVarI.d(i2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= bVarI.d(i3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= bVarI.d(2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= bVarI.A(null) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if (bVarI.q(i5 & 1, (4793491 & i5) != 4793490)) {
            int i6 = 2 * i3;
            boolean z = list.size() > i6;
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            a(null, R.drawable.ic_footer_arrow_left, false, null, 0, bVarI, 0, 29);
            int i7 = i5;
            c(h.h(new LayoutWeightElement(1.0f, true), 16.0f, 0.0f, 2), list, i, i2, i3, z, bVarI, (i5 & 8176) | ((i5 >> 6) & 57344) | (458752 & i5) | (3670016 & (i5 << 6)));
            a(null, R.drawable.ic_footer_arrow_right, list.size() > i6, function0, 0, bVarI, (i7 >> 12) & 7168, 17);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: r300
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s300.b(dVar, list, i, i2, i3, function0, (a) obj, qj40.a(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final List list, final int i, final int i2, final int i3, final boolean z, a aVar, final int i4) {
        int i5;
        b bVar;
        d dVar2;
        List list2;
        int i6;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        boolean z2;
        b bVarI = aVar.i(-834844739);
        if ((i4 & 6) == 0) {
            i5 = (bVarI.M(dVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i4 & 24576) == 0) {
            i5 |= bVarI.A(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= bVarI.d(2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= bVarI.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= bVarI.b(z) ? 8388608 : 4194304;
        }
        int i7 = i5;
        if (bVarI.q(i7 & 1, (4792467 & i7) != 4792466)) {
            if (list.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: n300
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            s300.c(dVar, list, i, i2, i3, z, (a) obj, qj40.a(i4 | 1));
                            return Unit.a;
                        }
                    };
                }
            } else {
                dVar2 = dVar;
                list2 = list;
                i6 = i3;
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVar2);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar2);
                yka.a.d dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar3);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.n, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d.a aVar3 = d.a.b;
                d dVarC2 = c.c(bVarI, aVar3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                int iF0 = bVarI.f0();
                bVarI.N(-1715963574);
                bVarI.N(775930329);
                int i8 = 0;
                loop0: while (true) {
                    if (i8 >= 2) {
                        bVar = bVarI;
                        z2 = true;
                        bVar.X(false);
                        bVar.X(false);
                        break;
                    }
                    d160 d160VarA = b160.a(new kw0.i(20.0f, true, new hw0()), ht.a.k, bVarI, 54);
                    int iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, aVar3);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS3, yka.a.e);
                    yka.a.C1350a c1350a2 = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC3, yka.a.d);
                    bVarI.N(109101570);
                    bVarI.N(-412122591);
                    int i9 = 0;
                    while (true) {
                        if (i9 < i6) {
                            int i10 = (i8 * i6) + i + i9;
                            if (i10 < 0) {
                                bVarI.c0(iF0);
                            } else if (z || i10 < list2.size()) {
                                b bVar3 = bVarI;
                                f300.a(((i7 >> 6) & 896) | 6, 8, bVar3, j.i(aVar3, 24.0f), (String) list2.get(i10 % list2.size()), null);
                                i9++;
                                bVarI = bVar3;
                            } else {
                                bVarI.c0(iF0);
                            }
                            bVar = bVarI;
                            z2 = true;
                            break loop0;
                        }
                        b bVar4 = bVarI;
                        bVar4.X(false);
                        bVar4.X(false);
                        bVar4.X(true);
                        i8++;
                        bVarI = bVar4;
                    }
                }
                bVar.X(z2);
                bVar.X(z2);
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        dVar2 = dVar;
        list2 = list;
        i6 = i3;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final d dVar4 = dVar2;
            final List list3 = list2;
            final int i11 = i6;
            function2 = new Function2() { // from class: o300
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s300.c(dVar4, list3, i, i2, i11, z, (a) obj, qj40.a(i4 | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
