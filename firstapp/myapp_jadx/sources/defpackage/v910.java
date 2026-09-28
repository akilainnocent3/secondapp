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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class v910 {
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final String str2, final String str3, String str4, final Function0<Unit> function0, Function0<Unit> function1, final Function0<Unit> function2, boolean z, a aVar, final int i, final int i2) {
        int i3;
        String str5;
        String str6;
        String str7;
        int i4;
        Function0<Unit> function3;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        b bVar;
        final Function0<Unit> function4;
        final String str8;
        final boolean z4;
        e eVarZ;
        final String str9;
        final boolean z5;
        Object objY;
        int i9;
        int i10;
        b bVarA = v2g.a(function0, function2, aVar, 2133620517);
        if ((i & 6) == 0) {
            i3 = (bVarA.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i3 |= bVarA.M(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            str6 = str3;
            i3 |= bVarA.M(str6) ? 256 : 128;
        } else {
            str6 = str3;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                str7 = str4;
                i3 |= bVarA.M(str7) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (bVarA.A(function0)) {
                    i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function3 = function1;
                    if (bVarA.A(function3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if (bVarA.A(function2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (bVarA.b(z2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i8 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarA.q(i8 & 1, z3)) {
                        if (i11 != 0) {
                            str9 = null;
                        } else {
                            str9 = str7;
                        }
                        if (i4 != 0) {
                            objY = bVarA.y();
                            if (objY == a.C0041a.a) {
                                objY = new s910();
                                bVarA.r(objY);
                            }
                            function4 = (Function0) objY;
                        } else {
                            function4 = function3;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        yle yleVar = new yle(z5, z5, 4);
                        final String str10 = str6;
                        final String str11 = str5;
                        Function2 function5 = new Function2() { // from class: t910
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                float f;
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                                    zk40.a aVar3 = zk40.a;
                                    d.a aVar4 = d.a.b;
                                    d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC = c.c(aVar2, dVarB);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar5);
                                    } else {
                                        aVar2.p();
                                    }
                                    yka.a.b bVar2 = yka.a.f;
                                    hlh0.a(aVar2, aivVarC, bVar2);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC, cVar);
                                    d dVarG = h.g(aVar4, 20.0f, 32.0f);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                                    int iHashCode2 = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO2 = aVar2.o();
                                    d dVarC2 = c.c(aVar2, dVarG);
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar5);
                                    } else {
                                        aVar2.p();
                                    }
                                    hlh0.a(aVar2, i78VarA, bVar2);
                                    hlh0.a(aVar2, ne00VarO2, dVar);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                                    lkf0.d(str11, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                                    a aVar6 = aVar2;
                                    d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                                    d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                                    int iHashCode3 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO3 = aVar6.o();
                                    d dVarC3 = c.c(aVar6, dVarJ);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar5);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, d160VarA, bVar2);
                                    hlh0.a(aVar6, ne00VarO3, dVar);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                                    }
                                    hlh0.a(aVar6, dVarC3, cVar);
                                    String str12 = str9;
                                    if (str12 != null) {
                                        aVar6.N(-1234521260);
                                        if (1.0f <= 0.0d) {
                                            ukn.a("invalid weight; must be greater than zero");
                                        }
                                        f = 1.0f;
                                        vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str12, null, null, null, null, function4, aVar6, 0, 0, 990);
                                        aVar6 = aVar6;
                                        aVar6.H();
                                    } else {
                                        f = 1.0f;
                                        aVar6.N(-1234284172);
                                        aVar6.H();
                                    }
                                    if (f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    if (f > Float.MAX_VALUE) {
                                        f = Float.MAX_VALUE;
                                    }
                                    a aVar7 = aVar6;
                                    xya.a(new LayoutWeightElement(f, true), false, str10, null, null, null, null, null, null, function0, aVar7, 0, 506);
                                    aVar7.s();
                                    aVar7.s();
                                    if (z5) {
                                        aVar7.N(1425197142);
                                        c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                        aVar7.H();
                                    } else {
                                        aVar7.N(1425737658);
                                        aVar7.H();
                                    }
                                    aVar7.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        };
                        z2 = z5;
                        str7 = str9;
                        bVar = bVarA;
                        u60.a(function2, yleVar, pp8.b(351008366, function5, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
                    } else {
                        bVar = bVarA;
                        bVar.G();
                        function4 = function3;
                    }
                    str8 = str7;
                    z4 = z2;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: u910
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                z2 = z;
                i8 = i3;
                if ((i8 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarA.q(i8 & 1, z3)) {
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str7;
                    }
                    if (i4 != 0) {
                        objY = bVarA.y();
                        if (objY == a.C0041a.a) {
                            objY = new s910();
                            bVarA.r(objY);
                        }
                        function4 = (Function0) objY;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    yle yleVar2 = new yle(z5, z5, 4);
                    final String str12 = str6;
                    final String str13 = str5;
                    Function2 function6 = new Function2() { // from class: t910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            float f;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                                zk40.a aVar3 = zk40.a;
                                d.a aVar4 = d.a.b;
                                d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarB);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar2, aivVarC, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                d dVarG = h.g(aVar4, 20.0f, 32.0f);
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarG);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, i78VarA, bVar2);
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                                lkf0.d(str13, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                                a aVar6 = aVar2;
                                d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                                d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                                int iHashCode3 = Long.hashCode(aVar6.m());
                                ne00 ne00VarO3 = aVar6.o();
                                d dVarC3 = c.c(aVar6, dVarJ);
                                if (aVar6.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar6.D();
                                if (aVar6.g()) {
                                    aVar6.F(aVar5);
                                } else {
                                    aVar6.p();
                                }
                                hlh0.a(aVar6, d160VarA, bVar2);
                                hlh0.a(aVar6, ne00VarO3, dVar);
                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                                }
                                hlh0.a(aVar6, dVarC3, cVar);
                                String str14 = str9;
                                if (str14 != null) {
                                    aVar6.N(-1234521260);
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    f = 1.0f;
                                    vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str14, null, null, null, null, function4, aVar6, 0, 0, 990);
                                    aVar6 = aVar6;
                                    aVar6.H();
                                } else {
                                    f = 1.0f;
                                    aVar6.N(-1234284172);
                                    aVar6.H();
                                }
                                if (f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                if (f > Float.MAX_VALUE) {
                                    f = Float.MAX_VALUE;
                                }
                                a aVar7 = aVar6;
                                xya.a(new LayoutWeightElement(f, true), false, str12, null, null, null, null, null, null, function0, aVar7, 0, 506);
                                aVar7.s();
                                aVar7.s();
                                if (z5) {
                                    aVar7.N(1425197142);
                                    c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                    aVar7.H();
                                } else {
                                    aVar7.N(1425737658);
                                    aVar7.H();
                                }
                                aVar7.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    };
                    z2 = z5;
                    str7 = str9;
                    bVar = bVarA;
                    u60.a(function2, yleVar2, pp8.b(351008366, function6, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
                } else {
                    bVar = bVarA;
                    bVar.G();
                    function4 = function3;
                }
                str8 = str7;
                z4 = z2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: u910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            function3 = function1;
            if ((1572864 & i) == 0) {
                if (bVarA.A(function2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (bVarA.b(z2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarA.q(i8 & 1, z3)) {
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str7;
                    }
                    if (i4 != 0) {
                        objY = bVarA.y();
                        if (objY == a.C0041a.a) {
                            objY = new s910();
                            bVarA.r(objY);
                        }
                        function4 = (Function0) objY;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    yle yleVar3 = new yle(z5, z5, 4);
                    final String str14 = str6;
                    final String str15 = str5;
                    Function2 function7 = new Function2() { // from class: t910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            float f;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                                zk40.a aVar3 = zk40.a;
                                d.a aVar4 = d.a.b;
                                d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarB);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar2, aivVarC, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                d dVarG = h.g(aVar4, 20.0f, 32.0f);
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarG);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, i78VarA, bVar2);
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                                lkf0.d(str15, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                                a aVar6 = aVar2;
                                d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                                d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                                int iHashCode3 = Long.hashCode(aVar6.m());
                                ne00 ne00VarO3 = aVar6.o();
                                d dVarC3 = c.c(aVar6, dVarJ);
                                if (aVar6.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar6.D();
                                if (aVar6.g()) {
                                    aVar6.F(aVar5);
                                } else {
                                    aVar6.p();
                                }
                                hlh0.a(aVar6, d160VarA, bVar2);
                                hlh0.a(aVar6, ne00VarO3, dVar);
                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                                }
                                hlh0.a(aVar6, dVarC3, cVar);
                                String str16 = str9;
                                if (str16 != null) {
                                    aVar6.N(-1234521260);
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    f = 1.0f;
                                    vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str16, null, null, null, null, function4, aVar6, 0, 0, 990);
                                    aVar6 = aVar6;
                                    aVar6.H();
                                } else {
                                    f = 1.0f;
                                    aVar6.N(-1234284172);
                                    aVar6.H();
                                }
                                if (f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                if (f > Float.MAX_VALUE) {
                                    f = Float.MAX_VALUE;
                                }
                                a aVar7 = aVar6;
                                xya.a(new LayoutWeightElement(f, true), false, str14, null, null, null, null, null, null, function0, aVar7, 0, 506);
                                aVar7.s();
                                aVar7.s();
                                if (z5) {
                                    aVar7.N(1425197142);
                                    c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                    aVar7.H();
                                } else {
                                    aVar7.N(1425737658);
                                    aVar7.H();
                                }
                                aVar7.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    };
                    z2 = z5;
                    str7 = str9;
                    bVar = bVarA;
                    u60.a(function2, yleVar3, pp8.b(351008366, function7, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
                } else {
                    bVar = bVarA;
                    bVar.G();
                    function4 = function3;
                }
                str8 = str7;
                z4 = z2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: u910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            z2 = z;
            i8 = i3;
            if ((i8 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarA.q(i8 & 1, z3)) {
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str7;
                }
                if (i4 != 0) {
                    objY = bVarA.y();
                    if (objY == a.C0041a.a) {
                        objY = new s910();
                        bVarA.r(objY);
                    }
                    function4 = (Function0) objY;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                yle yleVar4 = new yle(z5, z5, 4);
                final String str16 = str6;
                final String str17 = str5;
                Function2 function8 = new Function2() { // from class: t910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float f;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                            zk40.a aVar3 = zk40.a;
                            d.a aVar4 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarG = h.g(aVar4, 20.0f, 32.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarG);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                            lkf0.d(str17, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                            a aVar6 = aVar2;
                            d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                            d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                            int iHashCode3 = Long.hashCode(aVar6.m());
                            ne00 ne00VarO3 = aVar6.o();
                            d dVarC3 = c.c(aVar6, dVarJ);
                            if (aVar6.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar6.D();
                            if (aVar6.g()) {
                                aVar6.F(aVar5);
                            } else {
                                aVar6.p();
                            }
                            hlh0.a(aVar6, d160VarA, bVar2);
                            hlh0.a(aVar6, ne00VarO3, dVar);
                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar6, dVarC3, cVar);
                            String str18 = str9;
                            if (str18 != null) {
                                aVar6.N(-1234521260);
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                f = 1.0f;
                                vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str18, null, null, null, null, function4, aVar6, 0, 0, 990);
                                aVar6 = aVar6;
                                aVar6.H();
                            } else {
                                f = 1.0f;
                                aVar6.N(-1234284172);
                                aVar6.H();
                            }
                            if (f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            }
                            a aVar7 = aVar6;
                            xya.a(new LayoutWeightElement(f, true), false, str16, null, null, null, null, null, null, function0, aVar7, 0, 506);
                            aVar7.s();
                            aVar7.s();
                            if (z5) {
                                aVar7.N(1425197142);
                                c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                aVar7.H();
                            } else {
                                aVar7.N(1425737658);
                                aVar7.H();
                            }
                            aVar7.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                };
                z2 = z5;
                str7 = str9;
                bVar = bVarA;
                u60.a(function2, yleVar4, pp8.b(351008366, function8, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
            } else {
                bVar = bVarA;
                bVar.G();
                function4 = function3;
            }
            str8 = str7;
            z4 = z2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        str7 = str4;
        if ((i & 24576) == 0) {
            if (bVarA.A(function0)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function3 = function1;
                if (bVarA.A(function3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if (bVarA.A(function2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (bVarA.b(z2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarA.q(i8 & 1, z3)) {
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str7;
                    }
                    if (i4 != 0) {
                        objY = bVarA.y();
                        if (objY == a.C0041a.a) {
                            objY = new s910();
                            bVarA.r(objY);
                        }
                        function4 = (Function0) objY;
                    } else {
                        function4 = function3;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    yle yleVar5 = new yle(z5, z5, 4);
                    final String str18 = str6;
                    final String str19 = str5;
                    Function2 function9 = new Function2() { // from class: t910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            float f;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                                zk40.a aVar3 = zk40.a;
                                d.a aVar4 = d.a.b;
                                d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarB);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar2, aivVarC, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                d dVarG = h.g(aVar4, 20.0f, 32.0f);
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarG);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, i78VarA, bVar2);
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                                lkf0.d(str19, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                                a aVar6 = aVar2;
                                d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                                d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                                int iHashCode3 = Long.hashCode(aVar6.m());
                                ne00 ne00VarO3 = aVar6.o();
                                d dVarC3 = c.c(aVar6, dVarJ);
                                if (aVar6.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar6.D();
                                if (aVar6.g()) {
                                    aVar6.F(aVar5);
                                } else {
                                    aVar6.p();
                                }
                                hlh0.a(aVar6, d160VarA, bVar2);
                                hlh0.a(aVar6, ne00VarO3, dVar);
                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                                }
                                hlh0.a(aVar6, dVarC3, cVar);
                                String str110 = str9;
                                if (str110 != null) {
                                    aVar6.N(-1234521260);
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    f = 1.0f;
                                    vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str110, null, null, null, null, function4, aVar6, 0, 0, 990);
                                    aVar6 = aVar6;
                                    aVar6.H();
                                } else {
                                    f = 1.0f;
                                    aVar6.N(-1234284172);
                                    aVar6.H();
                                }
                                if (f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                if (f > Float.MAX_VALUE) {
                                    f = Float.MAX_VALUE;
                                }
                                a aVar7 = aVar6;
                                xya.a(new LayoutWeightElement(f, true), false, str18, null, null, null, null, null, null, function0, aVar7, 0, 506);
                                aVar7.s();
                                aVar7.s();
                                if (z5) {
                                    aVar7.N(1425197142);
                                    c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                    aVar7.H();
                                } else {
                                    aVar7.N(1425737658);
                                    aVar7.H();
                                }
                                aVar7.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    };
                    z2 = z5;
                    str7 = str9;
                    bVar = bVarA;
                    u60.a(function2, yleVar5, pp8.b(351008366, function9, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
                } else {
                    bVar = bVarA;
                    bVar.G();
                    function4 = function3;
                }
                str8 = str7;
                z4 = z2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: u910
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            z2 = z;
            i8 = i3;
            if ((i8 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarA.q(i8 & 1, z3)) {
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str7;
                }
                if (i4 != 0) {
                    objY = bVarA.y();
                    if (objY == a.C0041a.a) {
                        objY = new s910();
                        bVarA.r(objY);
                    }
                    function4 = (Function0) objY;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                yle yleVar6 = new yle(z5, z5, 4);
                final String str110 = str6;
                final String str111 = str5;
                Function2 function10 = new Function2() { // from class: t910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float f;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                            zk40.a aVar3 = zk40.a;
                            d.a aVar4 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarG = h.g(aVar4, 20.0f, 32.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarG);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                            lkf0.d(str111, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                            a aVar6 = aVar2;
                            d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                            d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                            int iHashCode3 = Long.hashCode(aVar6.m());
                            ne00 ne00VarO3 = aVar6.o();
                            d dVarC3 = c.c(aVar6, dVarJ);
                            if (aVar6.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar6.D();
                            if (aVar6.g()) {
                                aVar6.F(aVar5);
                            } else {
                                aVar6.p();
                            }
                            hlh0.a(aVar6, d160VarA, bVar2);
                            hlh0.a(aVar6, ne00VarO3, dVar);
                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar6, dVarC3, cVar);
                            String str112 = str9;
                            if (str112 != null) {
                                aVar6.N(-1234521260);
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                f = 1.0f;
                                vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str112, null, null, null, null, function4, aVar6, 0, 0, 990);
                                aVar6 = aVar6;
                                aVar6.H();
                            } else {
                                f = 1.0f;
                                aVar6.N(-1234284172);
                                aVar6.H();
                            }
                            if (f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            }
                            a aVar7 = aVar6;
                            xya.a(new LayoutWeightElement(f, true), false, str110, null, null, null, null, null, null, function0, aVar7, 0, 506);
                            aVar7.s();
                            aVar7.s();
                            if (z5) {
                                aVar7.N(1425197142);
                                c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                aVar7.H();
                            } else {
                                aVar7.N(1425737658);
                                aVar7.H();
                            }
                            aVar7.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                };
                z2 = z5;
                str7 = str9;
                bVar = bVarA;
                u60.a(function2, yleVar6, pp8.b(351008366, function10, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
            } else {
                bVar = bVarA;
                bVar.G();
                function4 = function3;
            }
            str8 = str7;
            z4 = z2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        function3 = function1;
        if ((1572864 & i) == 0) {
            if (bVarA.A(function2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (bVarA.b(z2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarA.q(i8 & 1, z3)) {
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str7;
                }
                if (i4 != 0) {
                    objY = bVarA.y();
                    if (objY == a.C0041a.a) {
                        objY = new s910();
                        bVarA.r(objY);
                    }
                    function4 = (Function0) objY;
                } else {
                    function4 = function3;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                yle yleVar7 = new yle(z5, z5, 4);
                final String str112 = str6;
                final String str113 = str5;
                Function2 function11 = new Function2() { // from class: t910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float f;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                            zk40.a aVar3 = zk40.a;
                            d.a aVar4 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarG = h.g(aVar4, 20.0f, 32.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarG);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                            lkf0.d(str113, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                            a aVar6 = aVar2;
                            d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                            d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                            int iHashCode3 = Long.hashCode(aVar6.m());
                            ne00 ne00VarO3 = aVar6.o();
                            d dVarC3 = c.c(aVar6, dVarJ);
                            if (aVar6.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar6.D();
                            if (aVar6.g()) {
                                aVar6.F(aVar5);
                            } else {
                                aVar6.p();
                            }
                            hlh0.a(aVar6, d160VarA, bVar2);
                            hlh0.a(aVar6, ne00VarO3, dVar);
                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar6, dVarC3, cVar);
                            String str114 = str9;
                            if (str114 != null) {
                                aVar6.N(-1234521260);
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                f = 1.0f;
                                vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str114, null, null, null, null, function4, aVar6, 0, 0, 990);
                                aVar6 = aVar6;
                                aVar6.H();
                            } else {
                                f = 1.0f;
                                aVar6.N(-1234284172);
                                aVar6.H();
                            }
                            if (f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            }
                            a aVar7 = aVar6;
                            xya.a(new LayoutWeightElement(f, true), false, str112, null, null, null, null, null, null, function0, aVar7, 0, 506);
                            aVar7.s();
                            aVar7.s();
                            if (z5) {
                                aVar7.N(1425197142);
                                c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                                aVar7.H();
                            } else {
                                aVar7.N(1425737658);
                                aVar7.H();
                            }
                            aVar7.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                };
                z2 = z5;
                str7 = str9;
                bVar = bVarA;
                u60.a(function2, yleVar7, pp8.b(351008366, function11, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
            } else {
                bVar = bVarA;
                bVar.G();
                function4 = function3;
            }
            str8 = str7;
            z4 = z2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u910
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        z2 = z;
        i8 = i3;
        if ((i8 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarA.q(i8 & 1, z3)) {
            if (i11 != 0) {
                str9 = null;
            } else {
                str9 = str7;
            }
            if (i4 != 0) {
                objY = bVarA.y();
                if (objY == a.C0041a.a) {
                    objY = new s910();
                    bVarA.r(objY);
                }
                function4 = (Function0) objY;
            } else {
                function4 = function3;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            yle yleVar8 = new yle(z5, z5, 4);
            final String str114 = str6;
            final String str115 = str5;
            Function2 function12 = new Function2() { // from class: t910
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long jA = c68.a(R.color.bg_primary_d_base, aVar2);
                        zk40.a aVar3 = zk40.a;
                        d.a aVar4 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar3);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = h.g(aVar4, 20.0f, 32.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        lkf0.d(str, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 0, 0, 130042);
                        lkf0.d(str115, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 48, 0, 130040);
                        a aVar6 = aVar2;
                        d dVarJ = h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        d160 d160VarA = b160.a(new kw0.i(8.0f, false, null), ht.a.j, aVar6, 6);
                        int iHashCode3 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO3 = aVar6.o();
                        d dVarC3 = c.c(aVar6, dVarJ);
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar5);
                        } else {
                            aVar6.p();
                        }
                        hlh0.a(aVar6, d160VarA, bVar2);
                        hlh0.a(aVar6, ne00VarO3, dVar);
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar6, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar6, dVarC3, cVar);
                        String str116 = str9;
                        if (str116 != null) {
                            aVar6.N(-1234521260);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            f = 1.0f;
                            vuc0.b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, str116, null, null, null, null, function4, aVar6, 0, 0, 990);
                            aVar6 = aVar6;
                            aVar6.H();
                        } else {
                            f = 1.0f;
                            aVar6.N(-1234284172);
                            aVar6.H();
                        }
                        if (f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        if (f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        a aVar7 = aVar6;
                        xya.a(new LayoutWeightElement(f, true), false, str114, null, null, null, null, null, null, function0, aVar7, 0, 506);
                        aVar7.s();
                        aVar7.s();
                        if (z5) {
                            aVar7.N(1425197142);
                            c6n.a(function2, androidx.compose.foundation.layout.d.a.b(j.r(aVar4, 42.0f), ht.a.c), false, null, null, zi9.a, aVar7, 1572864, 60);
                            aVar7.H();
                        } else {
                            aVar7.N(1425737658);
                            aVar7.H();
                        }
                        aVar7.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            };
            z2 = z5;
            str7 = str9;
            bVar = bVarA;
            u60.a(function2, yleVar8, pp8.b(351008366, function12, bVarA), bVar, ((i8 >> 18) & 14) | 384, 0);
        } else {
            bVar = bVarA;
            bVar.G();
            function4 = function3;
        }
        str8 = str7;
        z4 = z2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u910
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v910.a(str, str2, str3, str8, function0, function4, function2, z4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
