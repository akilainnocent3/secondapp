package defpackage;

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
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class h92 {
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final op8 op8Var, final int i, final float f, final String str2, final Function0 function0, final d dVar, String str3, Function0 function1, a aVar, final int i2, final int i3) {
        int i4;
        final String str4;
        int i5;
        Function0 function2;
        int i6;
        int i7;
        boolean z;
        final Function0 function3;
        e eVarZ;
        final String str5;
        final Function0 function4;
        Object objY;
        function0.getClass();
        b bVarI = aVar.i(-2048959214);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.M(dVar) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 == 0) {
            if ((12582912 & i2) == 0) {
                str4 = str3;
                i4 |= bVarI.M(str4) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                if ((100663296 & i2) == 0) {
                    function2 = function1;
                    if (bVarI.A(function2)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
                i7 = i4;
                if ((38347923 & i4) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i8 != 0) {
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new b92(0);
                        bVarI.r(objY);
                    }
                    u60.a((Function0) objY, new yle(false, false, false), pp8.b(53553755, new Function2() { // from class: c92
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i9 = 0;
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d dVarJ = h.j(androidx.compose.foundation.a.b(dVar, c68.a(R.color.background_general_primary, aVar2), zk40.a), 0.0f, 0.0f, 0.0f, 28.0f, 7);
                                kw0.k kVar = kw0.c;
                                n54.a aVar3 = ht.a.n;
                                i78 i78VarA = g78.a(kVar, aVar3, aVar2, 48);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarJ);
                                yka.k.getClass();
                                tsr.a aVar4 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                yka.a.b bVar = yka.a.f;
                                hlh0.a(aVar2, i78VarA, bVar);
                                yka.a.d dVar2 = yka.a.e;
                                hlh0.a(aVar2, ne00VarO, dVar2);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC, cVar);
                                d.a aVar5 = d.a.b;
                                h9n.a(erz.a(i, 0, aVar2), null, j.r(h.j(aVar5, 0.0f, 40.0f, 0.0f, 0.0f, 13), f), null, d0b.a.b, 0.0f, null, aVar2, 24624, 104);
                                lkf0.d(str, h.j(aVar5, 20.0f, 36.0f, 20.0f, 0.0f, 8), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 0, 0, 130040);
                                d dVarJ2 = h.j(aVar5, 20.0f, 12.0f, 20.0f, 0.0f, 8);
                                i78 i78VarA2 = g78.a(kVar, aVar3, aVar2, 48);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarJ2);
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar4);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, i78VarA2, bVar);
                                hlh0.a(aVar2, ne00VarO2, dVar2);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar2, dVarC2, cVar);
                                op8Var.invoke(aVar2, 0);
                                aVar2.s();
                                d dVarI = j.i(h.j(j.g(aVar5, 1.0f), 24.0f, 24.0f, 24.0f, 0.0f, 8), 40.0f);
                                final String str6 = str2;
                                xya.b(dVarI, false, null, null, null, 0.0f, null, function0, pp8.b(821161403, new gaj() { // from class: e92
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar6 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((e160) obj3).getClass();
                                        if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            lkf0.d(str6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar6), aVar6, 0, 0, 131070);
                                        } else {
                                            aVar6.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                                a aVar6 = aVar2;
                                final String str7 = str5;
                                if (str7 != null) {
                                    aVar6.N(53950324);
                                    d dVarJ3 = h.j(aVar5, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                    Function0 function5 = function4;
                                    boolean zM = aVar6.M(function5);
                                    Object objY2 = aVar6.y();
                                    if (zM || objY2 == a.C0041a.a) {
                                        objY2 = new f92(function5, i9);
                                        aVar6.r(objY2);
                                    }
                                    nk5.c((Function0) objY2, dVarJ3, false, null, null, null, null, null, pp8.b(-2109142963, new gaj() { // from class: g92
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar7 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            ((e160) obj3).getClass();
                                            if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                lkf0.d(str7, null, c68.a(R.color.text_brand_sub_primary_d_base, aVar7), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar7), aVar7, 0, 0, 131066);
                                            } else {
                                                aVar7.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar6), aVar6, 805306416, 508);
                                    aVar6 = aVar6;
                                    aVar6.H();
                                } else {
                                    aVar6.N(54434141);
                                    aVar6.H();
                                }
                                aVar6.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 438, 0);
                    str4 = str5;
                    function3 = function4;
                } else {
                    bVarI.G();
                    function3 = function2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: d92
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h92.a(str, op8Var, i, f, str2, function0, dVar, str4, function3, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            function2 = function1;
            i7 = i4;
            if ((38347923 & i4) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i8 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i5 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new b92(0);
                    bVarI.r(objY);
                }
                u60.a((Function0) objY, new yle(false, false, false), pp8.b(53553755, new Function2() { // from class: c92
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i9 = 0;
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarJ = h.j(androidx.compose.foundation.a.b(dVar, c68.a(R.color.background_general_primary, aVar2), zk40.a), 0.0f, 0.0f, 0.0f, 28.0f, 7);
                            kw0.k kVar = kw0.c;
                            n54.a aVar3 = ht.a.n;
                            i78 i78VarA = g78.a(kVar, aVar3, aVar2, 48);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarJ);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar2);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d.a aVar5 = d.a.b;
                            h9n.a(erz.a(i, 0, aVar2), null, j.r(h.j(aVar5, 0.0f, 40.0f, 0.0f, 0.0f, 13), f), null, d0b.a.b, 0.0f, null, aVar2, 24624, 104);
                            lkf0.d(str, h.j(aVar5, 20.0f, 36.0f, 20.0f, 0.0f, 8), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 0, 0, 130040);
                            d dVarJ2 = h.j(aVar5, 20.0f, 12.0f, 20.0f, 0.0f, 8);
                            i78 i78VarA2 = g78.a(kVar, aVar3, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarJ2);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar2);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op8Var.invoke(aVar2, 0);
                            aVar2.s();
                            d dVarI = j.i(h.j(j.g(aVar5, 1.0f), 24.0f, 24.0f, 24.0f, 0.0f, 8), 40.0f);
                            final String str6 = str2;
                            xya.b(dVarI, false, null, null, null, 0.0f, null, function0, pp8.b(821161403, new gaj() { // from class: e92
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar6 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((e160) obj3).getClass();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lkf0.d(str6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar6), aVar6, 0, 0, 131070);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                            a aVar6 = aVar2;
                            final String str7 = str5;
                            if (str7 != null) {
                                aVar6.N(53950324);
                                d dVarJ3 = h.j(aVar5, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                Function0 function5 = function4;
                                boolean zM = aVar6.M(function5);
                                Object objY2 = aVar6.y();
                                if (zM || objY2 == a.C0041a.a) {
                                    objY2 = new f92(function5, i9);
                                    aVar6.r(objY2);
                                }
                                nk5.c((Function0) objY2, dVarJ3, false, null, null, null, null, null, pp8.b(-2109142963, new gaj() { // from class: g92
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((e160) obj3).getClass();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            lkf0.d(str7, null, c68.a(R.color.text_brand_sub_primary_d_base, aVar7), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar7), aVar7, 0, 0, 131066);
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar6), aVar6, 805306416, 508);
                                aVar6 = aVar6;
                                aVar6.H();
                            } else {
                                aVar6.N(54434141);
                                aVar6.H();
                            }
                            aVar6.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 438, 0);
                str4 = str5;
                function3 = function4;
            } else {
                bVarI.G();
                function3 = function2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: d92
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h92.a(str, op8Var, i, f, str2, function0, dVar, str4, function3, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        str4 = str3;
        i5 = i3 & 256;
        if (i5 != 0) {
            if ((100663296 & i2) == 0) {
                function2 = function1;
                if (bVarI.A(function2)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            i7 = i4;
            if ((38347923 & i4) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i8 != 0) {
                    str5 = null;
                } else {
                    str5 = str4;
                }
                if (i5 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new b92(0);
                    bVarI.r(objY);
                }
                u60.a((Function0) objY, new yle(false, false, false), pp8.b(53553755, new Function2() { // from class: c92
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i9 = 0;
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarJ = h.j(androidx.compose.foundation.a.b(dVar, c68.a(R.color.background_general_primary, aVar2), zk40.a), 0.0f, 0.0f, 0.0f, 28.0f, 7);
                            kw0.k kVar = kw0.c;
                            n54.a aVar3 = ht.a.n;
                            i78 i78VarA = g78.a(kVar, aVar3, aVar2, 48);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarJ);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar2);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d.a aVar5 = d.a.b;
                            h9n.a(erz.a(i, 0, aVar2), null, j.r(h.j(aVar5, 0.0f, 40.0f, 0.0f, 0.0f, 13), f), null, d0b.a.b, 0.0f, null, aVar2, 24624, 104);
                            lkf0.d(str, h.j(aVar5, 20.0f, 36.0f, 20.0f, 0.0f, 8), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 0, 0, 130040);
                            d dVarJ2 = h.j(aVar5, 20.0f, 12.0f, 20.0f, 0.0f, 8);
                            i78 i78VarA2 = g78.a(kVar, aVar3, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarJ2);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar2);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op8Var.invoke(aVar2, 0);
                            aVar2.s();
                            d dVarI = j.i(h.j(j.g(aVar5, 1.0f), 24.0f, 24.0f, 24.0f, 0.0f, 8), 40.0f);
                            final String str6 = str2;
                            xya.b(dVarI, false, null, null, null, 0.0f, null, function0, pp8.b(821161403, new gaj() { // from class: e92
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar6 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((e160) obj3).getClass();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lkf0.d(str6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar6), aVar6, 0, 0, 131070);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                            a aVar6 = aVar2;
                            final String str7 = str5;
                            if (str7 != null) {
                                aVar6.N(53950324);
                                d dVarJ3 = h.j(aVar5, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                                Function0 function5 = function4;
                                boolean zM = aVar6.M(function5);
                                Object objY2 = aVar6.y();
                                if (zM || objY2 == a.C0041a.a) {
                                    objY2 = new f92(function5, i9);
                                    aVar6.r(objY2);
                                }
                                nk5.c((Function0) objY2, dVarJ3, false, null, null, null, null, null, pp8.b(-2109142963, new gaj() { // from class: g92
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((e160) obj3).getClass();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            lkf0.d(str7, null, c68.a(R.color.text_brand_sub_primary_d_base, aVar7), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar7), aVar7, 0, 0, 131066);
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar6), aVar6, 805306416, 508);
                                aVar6 = aVar6;
                                aVar6.H();
                            } else {
                                aVar6.N(54434141);
                                aVar6.H();
                            }
                            aVar6.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 438, 0);
                str4 = str5;
                function3 = function4;
            } else {
                bVarI.G();
                function3 = function2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: d92
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h92.a(str, op8Var, i, f, str2, function0, dVar, str4, function3, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        function2 = function1;
        i7 = i4;
        if ((38347923 & i4) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i7 & 1, z)) {
            if (i8 != 0) {
                str5 = null;
            } else {
                str5 = str4;
            }
            if (i5 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new b92(0);
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(53553755, new Function2() { // from class: c92
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i9 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarJ = h.j(androidx.compose.foundation.a.b(dVar, c68.a(R.color.background_general_primary, aVar2), zk40.a), 0.0f, 0.0f, 0.0f, 28.0f, 7);
                        kw0.k kVar = kw0.c;
                        n54.a aVar3 = ht.a.n;
                        i78 i78VarA = g78.a(kVar, aVar3, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarJ);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d.a aVar5 = d.a.b;
                        h9n.a(erz.a(i, 0, aVar2), null, j.r(h.j(aVar5, 0.0f, 40.0f, 0.0f, 0.0f, 13), f), null, d0b.a.b, 0.0f, null, aVar2, 24624, 104);
                        lkf0.d(str, h.j(aVar5, 20.0f, 36.0f, 20.0f, 0.0f, 8), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 0, 0, 130040);
                        d dVarJ2 = h.j(aVar5, 20.0f, 12.0f, 20.0f, 0.0f, 8);
                        i78 i78VarA2 = g78.a(kVar, aVar3, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarJ2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        op8Var.invoke(aVar2, 0);
                        aVar2.s();
                        d dVarI = j.i(h.j(j.g(aVar5, 1.0f), 24.0f, 24.0f, 24.0f, 0.0f, 8), 40.0f);
                        final String str6 = str2;
                        xya.b(dVarI, false, null, null, null, 0.0f, null, function0, pp8.b(821161403, new gaj() { // from class: e92
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar6 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e160) obj3).getClass();
                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    lkf0.d(str6, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar6), aVar6, 0, 0, 131070);
                                } else {
                                    aVar6.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 100663296, WebSocketProtocol.PAYLOAD_SHORT);
                        a aVar6 = aVar2;
                        final String str7 = str5;
                        if (str7 != null) {
                            aVar6.N(53950324);
                            d dVarJ3 = h.j(aVar5, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                            Function0 function5 = function4;
                            boolean zM = aVar6.M(function5);
                            Object objY2 = aVar6.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new f92(function5, i9);
                                aVar6.r(objY2);
                            }
                            nk5.c((Function0) objY2, dVarJ3, false, null, null, null, null, null, pp8.b(-2109142963, new gaj() { // from class: g92
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar7 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((e160) obj3).getClass();
                                    if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lkf0.d(str7, null, c68.a(R.color.text_brand_sub_primary_d_base, aVar7), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar7), aVar7, 0, 0, 131066);
                                    } else {
                                        aVar7.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar6), aVar6, 805306416, 508);
                            aVar6 = aVar6;
                            aVar6.H();
                        } else {
                            aVar6.N(54434141);
                            aVar6.H();
                        }
                        aVar6.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438, 0);
            str4 = str5;
            function3 = function4;
        } else {
            bVarI.G();
            function3 = function2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d92
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h92.a(str, op8Var, i, f, str2, function0, dVar, str4, function3, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }
}
