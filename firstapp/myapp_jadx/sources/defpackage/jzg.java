package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class jzg {
    public static final void a(final int i, a aVar, final Function0 function0, final boolean z) {
        function0.getClass();
        b bVarI = aVar.i(-1437823824);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ddd0.b(null, false, null, null, h.a(2, 10.0f, 0.0f), 4.0f, false, null, qdf0.d, function0, pp8.b(528778616, new Function2() { // from class: ezg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lkf0.d(cb40.a(z ? R.string.common_functions__show_less : R.string.common_functions__show_more, new Object[0], aVar2), null, ((lib0) aVar2.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).n, aVar2, 0, 0, 131066);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, pp8.b(1975359482, new Function2() { // from class: fzg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6n.b(erz.a(R.drawable.ic_chevron_down, 0, aVar2), null, p1a.a(d.a.b, z ? 180.0f : 0.0f), ((lib0) aVar2.O(oib0.a)).P, aVar2, 48, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 221184 | ((i2 << 24) & 1879048192), 390, 2255);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, z) { // from class: gzg
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = z;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzg.a(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x019a  */
    /* JADX WARN: Code duplicated, block: B:116:0x019e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x021e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0222  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f  */
    /* JADX WARN: Code duplicated, block: B:130:0x023d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250  */
    /* JADX WARN: Code duplicated, block: B:136:0x0259  */
    /* JADX WARN: Code duplicated, block: B:138:0x0265  */
    /* JADX WARN: Code duplicated, block: B:141:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x026b  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x030d  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final int i, final List list, final Function1 function1, final Function1 function2, final Function1 function3, Function0 function0, final boolean z, gaj gajVar, a aVar, final int i2, final int i3) {
        int i4;
        gaj gajVar2;
        final Function0 function4;
        final gaj gajVar3;
        final gaj xygVar;
        int i5;
        final boolean z2;
        boolean zB;
        Object objY;
        int i6;
        final ytw ytwVar;
        int iHashCode;
        tsr.a aVar2;
        boolean z3;
        yka.a.C1350a c1350a;
        int iHashCode2;
        Iterator itA;
        final int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objY2;
        final Object next;
        int i8;
        int i9;
        boolean z7;
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function0.getClass();
        b bVarI = aVar.i(529553399);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? bVarI.M(list) : bVarI.A(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= bVarI.b(z) ? 8388608 : 4194304;
        }
        int i10 = 100663296 & i2;
        d.a aVar3 = d.a.b;
        if (i10 == 0) {
            i4 |= bVarI.M(aVar3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            if ((i3 & 512) == 0) {
                gajVar2 = gajVar;
                int i11 = bVarI.A(gajVar2) ? 536870912 : 268435456;
                i4 |= i11;
            } else {
                gajVar2 = gajVar;
            }
            i4 |= i11;
        } else {
            gajVar2 = gajVar;
        }
        int i12 = i4;
        if (bVarI.q(i12 & 1, (i4 & 306783379) != 306783378)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                if ((i3 & 512) != 0) {
                    int i13 = i12 & (-1879048193);
                    xygVar = new xyg();
                    i5 = i13;
                }
                bVarI.Y();
                if (!z || list.size() <= 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object[] objArr = new Object[0];
                zB = bVarI.b(z2);
                objY = bVarI.y();
                i6 = i5;
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zB || objY == c0042a) {
                    objY = new Function0() { // from class: azg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.b(Boolean.valueOf(z2));
                        }
                    };
                    bVarI.r(objY);
                }
                ytwVar = (ytw) o350.e(objArr, (Function0) objY, bVarI, 0);
                d dVarH = h.h(aVar3, 10.0f, 0.0f, 2);
                kw0.k kVar = kw0.c;
                i78 i78VarA = g78.a(kVar, ht.a.n, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarH);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                z3 = z2;
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                e380.a(erz.a(i, (i6 >> 3) & 14, bVarI), str, bVarI, (i6 << 3) & 112);
                d dVarG = j.g(aVar3, 1.0f);
                qyd0 qyd0Var = oib0.a;
                d dVarB = androidx.compose.foundation.a.b(d35.a(dVarG, 1.0f, ((lib0) bVarI.O(qyd0Var)).A, j060.c(4.0f)), ((lib0) bVarI.O(qyd0Var)).n0, zk40.a);
                i78 i78VarA2 = g78.a(kVar, ht.a.m, bVarI, 0);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                itA = yt1.a(bVarI, dVarC2, cVar, 671547251, list);
                i7 = 0;
                while (itA.hasNext()) {
                    next = itA.next();
                    i8 = i7 + 1;
                    if (i7 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        i9 = 3;
                    } else {
                        i9 = 3;
                        if (i7 >= 3) {
                            z7 = false;
                        }
                        hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar4 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((jh0) obj).getClass();
                                if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    i78 i78VarA3 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                                    int iHashCode3 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC3 = c.c(aVar4, d.a.b);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar5);
                                    } else {
                                        aVar4.p();
                                    }
                                    hlh0.a(aVar4, i78VarA3, yka.a.f);
                                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                    }
                                    hlh0.a(aVar4, dVarC3, yka.a.d);
                                    if (i7 > 0) {
                                        aVar4.N(-1664899386);
                                        ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                        aVar4.H();
                                    } else {
                                        aVar4.N(-1664785988);
                                        aVar4.H();
                                    }
                                    Function1 function5 = function1;
                                    Object obj4 = next;
                                    String str2 = (String) function5.invoke(obj4);
                                    String str3 = (String) function2.invoke(obj4);
                                    String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                                    Function1 function6 = function3;
                                    boolean zM = aVar4.M(function6) | aVar4.A(obj4);
                                    Object objY3 = aVar4.y();
                                    if (zM || objY3 == a.C0041a.a) {
                                        objY3 = new hzg(obj4, function6);
                                        aVar4.r(objY3);
                                    }
                                    jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                                    aVar4.s();
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 1600518, 18);
                        i7 = i8;
                        z3 = z3;
                        xygVar = xygVar;
                    }
                    z7 = true;
                    hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((jh0) obj).getClass();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA3 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                                int iHashCode3 = Long.hashCode(aVar4.m());
                                ne00 ne00VarO = aVar4.o();
                                d dVarC3 = c.c(aVar4, d.a.b);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar4.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar5);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, i78VarA3, yka.a.f);
                                hlh0.a(aVar4, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                }
                                hlh0.a(aVar4, dVarC3, yka.a.d);
                                if (i7 > 0) {
                                    aVar4.N(-1664899386);
                                    ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                    aVar4.H();
                                } else {
                                    aVar4.N(-1664785988);
                                    aVar4.H();
                                }
                                Function1 function5 = function1;
                                Object obj4 = next;
                                String str2 = (String) function5.invoke(obj4);
                                String str3 = (String) function2.invoke(obj4);
                                String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                                Function1 function6 = function3;
                                boolean zM = aVar4.M(function6) | aVar4.A(obj4);
                                Object objY3 = aVar4.y();
                                if (zM || objY3 == a.C0041a.a) {
                                    objY3 = new hzg(obj4, function6);
                                    aVar4.r(objY3);
                                }
                                jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                                aVar4.s();
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 1600518, 18);
                    i7 = i8;
                    z3 = z3;
                    xygVar = xygVar;
                }
                z4 = z3;
                gaj gajVar4 = xygVar;
                bVarI.X(false);
                bVarI.X(true);
                if (z4) {
                    function4 = function0;
                    bVarI.N(1739406433);
                    bVarI.X(false);
                } else {
                    bVarI.N(1739141197);
                    boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    boolean zM = bVarI.M(ytwVar);
                    if ((i6 & 3670016) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zM | z5;
                    objY2 = bVarI.y();
                    if (!z6 || objY2 == c0042a) {
                        function4 = function0;
                        objY2 = new Function0() { // from class: czg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytw ytwVar2 = ytwVar;
                                if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    function4.invoke();
                                }
                                ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    } else {
                        function4 = function0;
                    }
                    a(0, bVarI, (Function0) objY2, zBooleanValue);
                    bVarI.X(false);
                }
                bVarI.X(true);
                gajVar3 = gajVar4;
            } else {
                bVarI.G();
                if ((i3 & 512) != 0) {
                    i5 = i12 & (-1879048193);
                }
                xygVar = gajVar2;
                bVarI.Y();
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                Object[] objArr2 = new Object[0];
                zB = bVarI.b(z2);
                objY = bVarI.y();
                i6 = i5;
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                if (zB) {
                    objY = new Function0() { // from class: azg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.b(Boolean.valueOf(z2));
                        }
                    };
                    bVarI.r(objY);
                } else {
                    objY = new Function0() { // from class: azg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.b(Boolean.valueOf(z2));
                        }
                    };
                    bVarI.r(objY);
                }
                ytwVar = (ytw) o350.e(objArr2, (Function0) objY, bVarI, 0);
                d dVarH2 = h.h(aVar3, 10.0f, 0.0f, 2);
                kw0.k kVar2 = kw0.c;
                i78 i78VarA3 = g78.a(kVar2, ht.a.n, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarH2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                z3 = z2;
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, i78VarA3, bVar2);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS3, dVar2);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC3, cVar2);
                e380.a(erz.a(i, (i6 >> 3) & 14, bVarI), str, bVarI, (i6 << 3) & 112);
                d dVarG2 = j.g(aVar3, 1.0f);
                qyd0 qyd0Var2 = oib0.a;
                d dVarB2 = androidx.compose.foundation.a.b(d35.a(dVarG2, 1.0f, ((lib0) bVarI.O(qyd0Var2)).A, j060.c(4.0f)), ((lib0) bVarI.O(qyd0Var2)).n0, zk40.a);
                i78 i78VarA4 = g78.a(kVar2, ht.a.m, bVarI, 0);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarB2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA4, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar2);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                itA = yt1.a(bVarI, dVarC4, cVar2, 671547251, list);
                i7 = 0;
                while (itA.hasNext()) {
                    next = itA.next();
                    i8 = i7 + 1;
                    if (i7 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        i9 = 3;
                        if (i7 >= 3) {
                            z7 = false;
                        }
                        hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar4 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((jh0) obj).getClass();
                                if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    i78 i78VarA5 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                                    int iHashCode3 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC5 = c.c(aVar4, d.a.b);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar5);
                                    } else {
                                        aVar4.p();
                                    }
                                    hlh0.a(aVar4, i78VarA5, yka.a.f);
                                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                    }
                                    hlh0.a(aVar4, dVarC5, yka.a.d);
                                    if (i7 > 0) {
                                        aVar4.N(-1664899386);
                                        ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                        aVar4.H();
                                    } else {
                                        aVar4.N(-1664785988);
                                        aVar4.H();
                                    }
                                    Function1 function5 = function1;
                                    Object obj4 = next;
                                    String str2 = (String) function5.invoke(obj4);
                                    String str3 = (String) function2.invoke(obj4);
                                    String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                                    Function1 function6 = function3;
                                    boolean zM2 = aVar4.M(function6) | aVar4.A(obj4);
                                    Object objY3 = aVar4.y();
                                    if (zM2 || objY3 == a.C0041a.a) {
                                        objY3 = new hzg(obj4, function6);
                                        aVar4.r(objY3);
                                    }
                                    jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                                    aVar4.s();
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 1600518, 18);
                        i7 = i8;
                        z3 = z3;
                        xygVar = xygVar;
                    } else {
                        i9 = 3;
                    }
                    z7 = true;
                    hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((jh0) obj).getClass();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA5 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                                int iHashCode3 = Long.hashCode(aVar4.m());
                                ne00 ne00VarO = aVar4.o();
                                d dVarC5 = c.c(aVar4, d.a.b);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar4.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar5);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, i78VarA5, yka.a.f);
                                hlh0.a(aVar4, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                }
                                hlh0.a(aVar4, dVarC5, yka.a.d);
                                if (i7 > 0) {
                                    aVar4.N(-1664899386);
                                    ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                    aVar4.H();
                                } else {
                                    aVar4.N(-1664785988);
                                    aVar4.H();
                                }
                                Function1 function5 = function1;
                                Object obj4 = next;
                                String str2 = (String) function5.invoke(obj4);
                                String str3 = (String) function2.invoke(obj4);
                                String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                                Function1 function6 = function3;
                                boolean zM2 = aVar4.M(function6) | aVar4.A(obj4);
                                Object objY3 = aVar4.y();
                                if (zM2 || objY3 == a.C0041a.a) {
                                    objY3 = new hzg(obj4, function6);
                                    aVar4.r(objY3);
                                }
                                jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                                aVar4.s();
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 1600518, 18);
                    i7 = i8;
                    z3 = z3;
                    xygVar = xygVar;
                }
                z4 = z3;
                gaj gajVar5 = xygVar;
                bVarI.X(false);
                bVarI.X(true);
                if (z4) {
                    bVarI.N(1739141197);
                    boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
                    boolean zM2 = bVarI.M(ytwVar);
                    if ((i6 & 3670016) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zM2 | z5;
                    objY2 = bVarI.y();
                    if (z6) {
                        function4 = function0;
                        objY2 = new Function0() { // from class: czg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytw ytwVar2 = ytwVar;
                                if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    function4.invoke();
                                }
                                ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    } else {
                        function4 = function0;
                        objY2 = new Function0() { // from class: czg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytw ytwVar2 = ytwVar;
                                if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    function4.invoke();
                                }
                                ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    a(0, bVarI, (Function0) objY2, zBooleanValue2);
                    bVarI.X(false);
                } else {
                    function4 = function0;
                    bVarI.N(1739406433);
                    bVarI.X(false);
                }
                bVarI.X(true);
                gajVar3 = gajVar5;
            }
            i5 = i12;
            xygVar = gajVar2;
            bVarI.Y();
            if (z) {
                z2 = true;
            } else {
                z2 = true;
            }
            Object[] objArr3 = new Object[0];
            zB = bVarI.b(z2);
            objY = bVarI.y();
            i6 = i5;
            a.C0041a.C0042a c0042a3 = a.C0041a.a;
            if (zB) {
                objY = new Function0() { // from class: azg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.b(Boolean.valueOf(z2));
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: azg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.b(Boolean.valueOf(z2));
                    }
                };
                bVarI.r(objY);
            }
            ytwVar = (ytw) o350.e(objArr3, (Function0) objY, bVarI, 0);
            d dVarH3 = h.h(aVar3, 10.0f, 0.0f, 2);
            kw0.k kVar3 = kw0.c;
            i78 i78VarA5 = g78.a(kVar3, ht.a.n, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarH3);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            z3 = z2;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA5, bVar3);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS5, dVar3);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC5, cVar3);
            e380.a(erz.a(i, (i6 >> 3) & 14, bVarI), str, bVarI, (i6 << 3) & 112);
            d dVarG3 = j.g(aVar3, 1.0f);
            qyd0 qyd0Var3 = oib0.a;
            d dVarB3 = androidx.compose.foundation.a.b(d35.a(dVarG3, 1.0f, ((lib0) bVarI.O(qyd0Var3)).A, j060.c(4.0f)), ((lib0) bVarI.O(qyd0Var3)).n0, zk40.a);
            i78 i78VarA6 = g78.a(kVar3, ht.a.m, bVarI, 0);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA6, bVar3);
            hlh0.a(bVarI, ne00VarS6, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            itA = yt1.a(bVarI, dVarC6, cVar3, 671547251, list);
            i7 = 0;
            while (itA.hasNext()) {
                next = itA.next();
                i8 = i7 + 1;
                if (i7 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    i9 = 3;
                    if (i7 >= 3) {
                        z7 = false;
                    }
                    hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((jh0) obj).getClass();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                i78 i78VarA7 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                                int iHashCode3 = Long.hashCode(aVar4.m());
                                ne00 ne00VarO = aVar4.o();
                                d dVarC7 = c.c(aVar4, d.a.b);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar4.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar5);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, i78VarA7, yka.a.f);
                                hlh0.a(aVar4, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                }
                                hlh0.a(aVar4, dVarC7, yka.a.d);
                                if (i7 > 0) {
                                    aVar4.N(-1664899386);
                                    ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                    aVar4.H();
                                } else {
                                    aVar4.N(-1664785988);
                                    aVar4.H();
                                }
                                Function1 function5 = function1;
                                Object obj4 = next;
                                String str2 = (String) function5.invoke(obj4);
                                String str3 = (String) function2.invoke(obj4);
                                String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                                Function1 function6 = function3;
                                boolean zM3 = aVar4.M(function6) | aVar4.A(obj4);
                                Object objY3 = aVar4.y();
                                if (zM3 || objY3 == a.C0041a.a) {
                                    objY3 = new hzg(obj4, function6);
                                    aVar4.r(objY3);
                                }
                                jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                                aVar4.s();
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 1600518, 18);
                    i7 = i8;
                    z3 = z3;
                    xygVar = xygVar;
                } else {
                    i9 = 3;
                }
                z7 = true;
                hh0.b(l78.a, z7, null, f.e(null, null, 15).b(f.f(null, i9)), f.m(null, null, 15).b(f.g(null, i9)), null, pp8.b(-1475877328, new gaj() { // from class: bzg
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            i78 i78VarA7 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                            int iHashCode3 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO = aVar4.o();
                            d dVarC7 = c.c(aVar4, d.a.b);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar5);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, i78VarA7, yka.a.f);
                            hlh0.a(aVar4, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                            }
                            hlh0.a(aVar4, dVarC7, yka.a.d);
                            if (i7 > 0) {
                                aVar4.N(-1664899386);
                                ute.b(null, 0.0f, ((lib0) aVar4.O(oib0.a)).A, aVar4, 0, 3);
                                aVar4.H();
                            } else {
                                aVar4.N(-1664785988);
                                aVar4.H();
                            }
                            Function1 function5 = function1;
                            Object obj4 = next;
                            String str2 = (String) function5.invoke(obj4);
                            String str3 = (String) function2.invoke(obj4);
                            String str4 = (String) xygVar.invoke(obj4, aVar4, 0);
                            Function1 function6 = function3;
                            boolean zM3 = aVar4.M(function6) | aVar4.A(obj4);
                            Object objY3 = aVar4.y();
                            if (zM3 || objY3 == a.C0041a.a) {
                                objY3 = new hzg(obj4, function6);
                                aVar4.r(objY3);
                            }
                            jzg.c(str2, str3, str4, (Function0) objY3, aVar4, 0);
                            aVar4.s();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1600518, 18);
                i7 = i8;
                z3 = z3;
                xygVar = xygVar;
            }
            z4 = z3;
            gaj gajVar6 = xygVar;
            bVarI.X(false);
            bVarI.X(true);
            if (z4) {
                bVarI.N(1739141197);
                boolean zBooleanValue3 = ((Boolean) ytwVar.getValue()).booleanValue();
                boolean zM3 = bVarI.M(ytwVar);
                if ((i6 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zM3 | z5;
                objY2 = bVarI.y();
                if (z6) {
                    function4 = function0;
                    objY2 = new Function0() { // from class: czg
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytw ytwVar2 = ytwVar;
                            if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                function4.invoke();
                            }
                            ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    function4 = function0;
                    objY2 = new Function0() { // from class: czg
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytw ytwVar2 = ytwVar;
                            if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                function4.invoke();
                            }
                            ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                a(0, bVarI, (Function0) objY2, zBooleanValue3);
                bVarI.X(false);
            } else {
                function4 = function0;
                bVarI.N(1739406433);
                bVarI.X(false);
            }
            bVarI.X(true);
            gajVar3 = gajVar6;
        } else {
            function4 = function0;
            bVarI.G();
            gajVar3 = gajVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0 function5 = function4;
            eVarZ.d = new Function2() { // from class: dzg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jzg.b(str, i, list, function1, function2, function3, function5, z, gajVar3, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final String str3, final Function0<Unit> function0, a aVar, final int i) {
        qyd0 qyd0Var;
        int i2;
        b bVarI = aVar.i(-840138918);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(androidx.compose.foundation.d.d(j.i(j.g(aVar2, 1.0f), 48.0f), false, null, null, function0, 15), 12.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d(str2, str, bVarI, ((i3 >> 3) & 14) | ((i3 << 3) & 112));
            d dVarA = zqu.a(1.0f, h.h(aVar2, 12.0f, 0.0f, 2), true);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).j;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, bVarI, i3 & 14, 24960, 110586);
            bVarI = bVarI;
            if (str3 != null) {
                bVarI.N(816398095);
                qyd0Var = qyd0Var3;
                lkf0.d(str3, null, ((lib0) bVarI.O(qyd0Var3)).b, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(qyd0Var2)).q, bVarI, (i3 >> 6) & 14, 24960, 110586);
                bVarI = bVarI;
                i2 = 0;
                bVarI.X(false);
            } else {
                qyd0Var = qyd0Var3;
                i2 = 0;
                bVarI.N(816676258);
                bVarI.X(false);
            }
            bVarI.X(true);
            h6n.b(erz.a(R.drawable.ic_chevron_right, i2, bVarI), null, null, ((lib0) bVarI.O(qyd0Var)).P, bVarI, 48, 4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, function0, i) { // from class: izg
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jzg.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, final String str2, a aVar, final int i) {
        int i2;
        boolean z;
        final String str3 = str;
        b bVarI = aVar.i(721169456);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d.a aVar2 = d.a.b;
            d dVarR = j.r(aVar2, 24.0f);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            if (zBooleanValue) {
                z = true;
                bVarI.N(1087797548);
                bVarI.X(false);
            } else {
                bVarI.N(1087206533);
                d dVarF = dVar2.f(aVar2);
                qyd0 qyd0Var = oib0.a;
                d dVarB = androidx.compose.foundation.a.b(dVarF, ((lib0) bVarI.O(qyd0Var)).i0, j060.a);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                Character chG = wae0.G(StringsKt.t0(str2).toString());
                String strValueOf = chG != null ? String.valueOf(Character.toUpperCase(chG.charValue())) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                lkf0.d(strValueOf, null, ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 0, 0, 131066);
                z = true;
                bVarI.X(true);
                bVarI.X(false);
            }
            d dVarA = dw.a(dVar2.f(aVar2), ((Boolean) ytwVar.getValue()).booleanValue() ? 1.0f : 0.0f);
            boolean zM = bVarI.M(ytwVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new yyg(ytwVar, 0);
                bVarI.r(objY2);
            }
            boolean z3 = z;
            str3 = str;
            mw90.a(str3, null, dVarA, (Function1) objY2, null, null, null, bVarI, i3 | 48, 2024);
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zyg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    jzg.d(str3, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
