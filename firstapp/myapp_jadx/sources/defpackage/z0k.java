package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0k {
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    public static final void a(final qcn qcnVar, int i, long j, a4f0 a4f0Var, a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        final a4f0 a4f0Var2;
        final int i6;
        final long j2;
        long jA;
        int i7;
        a4f0 a4f0Var3;
        boolean z;
        Object objY;
        a.C0041a.C0042a c0042a;
        ved vedVarB;
        Object objY2;
        final osw oswVar;
        boolean zM;
        Object objY3;
        boolean zM2;
        Object objY4;
        d.a aVar2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.b bVar;
        yka.a.d dVar;
        yka.a.C1350a c1350a;
        int i8;
        yka.a.c cVar;
        int iHashCode2;
        final long j3;
        boolean z2;
        b bVar2;
        qcnVar.getClass();
        b bVarI = aVar.i(-1682041388);
        int i9 = (bVarI.M(qcnVar) ? 4 : 2) | i2;
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 = i9 | 48;
            i4 = i;
        } else {
            i4 = i;
            i5 = i9 | (bVarI.d(i4) ? 32 : 16);
        }
        int i11 = i5 | 128;
        int i12 = i3 & 8;
        if (i12 != 0) {
            i11 = i5 | 3200;
        } else if ((i2 & 3072) == 0) {
            i11 |= bVarI.d(a4f0Var == null ? -1 : a4f0Var.ordinal()) ? 2048 : 1024;
        }
        int i13 = i11 | 24576;
        if (bVarI.q(i13 & 1, (i13 & 9363) != 9362)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                if (i10 != 0) {
                    i4 = 0;
                }
                jA = c68.a(R.color.background_general_secondary, bVarI);
                i7 = i13 & (-897);
                if (i12 != 0) {
                    a4f0Var3 = a4f0.a;
                }
                bVarI.Y();
                if ((i7 & 14) != 4) {
                    z = false;
                } else {
                    z = true;
                }
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (z || objY == c0042a) {
                    objY = new qu1(qcnVar, 1);
                    bVarI.r(objY);
                }
                vedVarB = eqz.b(0, (Function0) objY, bVarI, 0, 3);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = k.a(i4);
                    bVarI.r(objY2);
                }
                oswVar = (osw) objY2;
                Integer numValueOf = Integer.valueOf(oswVar.D());
                zM = bVarI.M(vedVarB);
                objY3 = bVarI.y();
                if (zM || objY3 == c0042a) {
                    objY3 = new x0k(vedVarB, oswVar, null);
                    bVarI.r(objY3);
                }
                xvf.e(bVarI, numValueOf, (Function2) objY3);
                Integer numValueOf2 = Integer.valueOf(vedVarB.k());
                Boolean boolValueOf = Boolean.valueOf(vedVarB.k.c());
                zM2 = bVarI.M(vedVarB);
                objY4 = bVarI.y();
                if (zM2 || objY4 == c0042a) {
                    objY4 = new y0k(vedVarB, oswVar, null);
                    bVarI.r(objY4);
                }
                xvf.g(numValueOf2, boolValueOf, (Function2) objY4, bVarI);
                aVar2 = d.a.b;
                d dVarE = j.e(aVar2, 1.0f);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarE);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                bVar = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar);
                dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    i8 = i4;
                } else {
                    i8 = i4;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    if (a4f0Var3 != a4f0.b || qcnVar.size() > 3) {
                        bVarI.N(342538753);
                        d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        iHashCode2 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVarB);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVarC, bVar);
                        hlh0.a(bVarI, ne00VarS2, dVar);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                        }
                        hlh0.a(bVarI, dVarC2, cVar);
                        j3 = jA;
                        z2 = true;
                        ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                        j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar4 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                                }
                                if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar4 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final int i14 = 0;
                                    for (Object obj3 : qcnVar) {
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            kotlin.collections.b.q();
                                            throw null;
                                        }
                                        final m1f0 m1f0Var = (m1f0) obj3;
                                        final osw oswVar2 = oswVar;
                                        final boolean z3 = i14 == oswVar2.D();
                                        d dVarB2 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                        boolean zD = aVar4.d(i14);
                                        Object objY5 = aVar4.y();
                                        if (zD || objY5 == a.C0041a.a) {
                                            objY5 = new Function0() { // from class: u0k
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    oswVar2.k(i14);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY5);
                                        }
                                        w1f0.b(z3, (Function0) objY5, dVarB2, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj4, Object obj5) {
                                                a aVar5 = (a) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    z0k.b(m1f0Var, z3, aVar5, 0);
                                                } else {
                                                    aVar5.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                        i14 = i15;
                                    }
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 12804528, 64);
                        bVar2 = bVarI;
                        bVar2.X(true);
                        bVar2.X(false);
                    } else {
                        bVarI.N(344201655);
                        long j4 = jA;
                        j3f0.g(oswVar.D(), j.g(aVar2, 1.0f), j4, j4, pp8.b(134196066, new gaj() { // from class: q0k
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar4 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                                }
                                if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), y39.a, pp8.b(1751628130, new Function2() { // from class: r0k
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar4 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final int i14 = 0;
                                    for (Object obj3 : qcnVar) {
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            kotlin.collections.b.q();
                                            throw null;
                                        }
                                        final m1f0 m1f0Var = (m1f0) obj3;
                                        final osw oswVar2 = oswVar;
                                        final boolean z3 = i14 == oswVar2.D();
                                        boolean zD = aVar4.d(i14);
                                        Object objY5 = aVar4.y();
                                        if (zD || objY5 == a.C0041a.a) {
                                            objY5 = new Function0() { // from class: w0k
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    oswVar2.k(i14);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar4.r(objY5);
                                        }
                                        w1f0.b(z3, (Function0) objY5, null, false, pp8.b(-804534359, new Function2() { // from class: m0k
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj4, Object obj5) {
                                                a aVar5 = (a) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    z0k.b(m1f0Var, z3, aVar5, 0);
                                                } else {
                                                    aVar5.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar4), 0L, 0L, aVar4, 24576, 492);
                                        i14 = i15;
                                    }
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 1794096, 0);
                        bVar2 = bVarI;
                        bVar2.X(false);
                        z2 = true;
                        j3 = j4;
                    }
                    b bVar3 = bVar2;
                    dpz.a(0.0f, 0, 1572864, 16318, ht.a.j, pp8.b(-461718339, new iaj() { // from class: s0k
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.iaj
                        public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                            Integer num = (Integer) obj2;
                            int iIntValue = num.intValue();
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((opz) obj).getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                            }
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                aVar4.C(-1329691478, num);
                                ((m1f0) qcnVar.get(iIntValue)).d.invoke(aVar4, 0);
                                aVar4.K();
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVar2), null, null, null, null, vedVarB, null, null, bVar3, null, null, false);
                    bVarI = bVar3;
                    bVarI.X(z2);
                    j2 = j3;
                    i6 = i8;
                    a4f0Var2 = a4f0Var3;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (a4f0Var3 != a4f0.b) {
                    bVarI.N(342538753);
                    d dVarB2 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                    aiv aivVarC2 = g75.c(ht.a.a, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarB2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar);
                    hlh0.a(bVarI, ne00VarS3, dVar);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    j3 = jA;
                    z2 = true;
                    ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                    j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                            }
                            if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final int i14 = 0;
                                for (Object obj3 : qcnVar) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    final m1f0 m1f0Var = (m1f0) obj3;
                                    final osw oswVar2 = oswVar;
                                    final boolean z3 = i14 == oswVar2.D();
                                    d dVarB3 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                    boolean zD = aVar4.d(i14);
                                    Object objY5 = aVar4.y();
                                    if (zD || objY5 == a.C0041a.a) {
                                        objY5 = new Function0() { // from class: u0k
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                oswVar2.k(i14);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY5);
                                    }
                                    w1f0.b(z3, (Function0) objY5, dVarB3, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar5 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                z0k.b(m1f0Var, z3, aVar5, 0);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                    i14 = i15;
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 12804528, 64);
                    bVar2 = bVarI;
                    bVar2.X(true);
                    bVar2.X(false);
                } else {
                    bVarI.N(342538753);
                    d dVarB3 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                    aiv aivVarC3 = g75.c(ht.a.a, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarB3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC3, bVar);
                    hlh0.a(bVarI, ne00VarS4, dVar);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, cVar);
                    j3 = jA;
                    z2 = true;
                    ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                    j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                            }
                            if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final int i14 = 0;
                                for (Object obj3 : qcnVar) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    final m1f0 m1f0Var = (m1f0) obj3;
                                    final osw oswVar2 = oswVar;
                                    final boolean z3 = i14 == oswVar2.D();
                                    d dVarB4 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                    boolean zD = aVar4.d(i14);
                                    Object objY5 = aVar4.y();
                                    if (zD || objY5 == a.C0041a.a) {
                                        objY5 = new Function0() { // from class: u0k
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                oswVar2.k(i14);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY5);
                                    }
                                    w1f0.b(z3, (Function0) objY5, dVarB4, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar5 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                z0k.b(m1f0Var, z3, aVar5, 0);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                    i14 = i15;
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 12804528, 64);
                    bVar2 = bVarI;
                    bVar2.X(true);
                    bVar2.X(false);
                }
                b bVar4 = bVar2;
                dpz.a(0.0f, 0, 1572864, 16318, ht.a.j, pp8.b(-461718339, new iaj() { // from class: s0k
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.iaj
                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                        Integer num = (Integer) obj2;
                        int iIntValue = num.intValue();
                        a aVar4 = (a) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        ((opz) obj).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                        }
                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            aVar4.C(-1329691478, num);
                            ((m1f0) qcnVar.get(iIntValue)).d.invoke(aVar4, 0);
                            aVar4.K();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVar2), null, null, null, null, vedVarB, null, null, bVar4, null, null, false);
                bVarI = bVar4;
                bVarI.X(z2);
                j2 = j3;
                i6 = i8;
                a4f0Var2 = a4f0Var3;
            } else {
                bVarI.G();
                i7 = i13 & (-897);
                jA = j;
            }
            a4f0Var3 = a4f0Var;
            bVarI.Y();
            if ((i7 & 14) != 4) {
                z = false;
            } else {
                z = true;
            }
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (z) {
                objY = new qu1(qcnVar, 1);
                bVarI.r(objY);
            } else {
                objY = new qu1(qcnVar, 1);
                bVarI.r(objY);
            }
            vedVarB = eqz.b(0, (Function0) objY, bVarI, 0, 3);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(i4);
                bVarI.r(objY2);
            }
            oswVar = (osw) objY2;
            Integer numValueOf3 = Integer.valueOf(oswVar.D());
            zM = bVarI.M(vedVarB);
            objY3 = bVarI.y();
            if (zM) {
                objY3 = new x0k(vedVarB, oswVar, null);
                bVarI.r(objY3);
            } else {
                objY3 = new x0k(vedVarB, oswVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, numValueOf3, (Function2) objY3);
            Integer numValueOf4 = Integer.valueOf(vedVarB.k());
            Boolean boolValueOf2 = Boolean.valueOf(vedVarB.k.c());
            zM2 = bVarI.M(vedVarB);
            objY4 = bVarI.y();
            if (zM2) {
                objY4 = new y0k(vedVarB, oswVar, null);
                bVarI.r(objY4);
            } else {
                objY4 = new y0k(vedVarB, oswVar, null);
                bVarI.r(objY4);
            }
            xvf.g(numValueOf4, boolValueOf2, (Function2) objY4, bVarI);
            aVar2 = d.a.b;
            d dVarE2 = j.e(aVar2, 1.0f);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarE2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA2, bVar);
            dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS5, dVar);
            c1350a = yka.a.g;
            if (bVarI.S) {
                i8 = i4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC5, cVar);
                if (a4f0Var3 != a4f0.b) {
                    bVarI.N(342538753);
                    d dVarB4 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                    aiv aivVarC4 = g75.c(ht.a.a, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS6 = bVarI.S();
                    d dVarC6 = c.c(bVarI, dVarB4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC4, bVar);
                    hlh0.a(bVarI, ne00VarS6, dVar);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC6, cVar);
                    j3 = jA;
                    z2 = true;
                    ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                    j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                            }
                            if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final int i14 = 0;
                                for (Object obj3 : qcnVar) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    final m1f0 m1f0Var = (m1f0) obj3;
                                    final osw oswVar2 = oswVar;
                                    final boolean z3 = i14 == oswVar2.D();
                                    d dVarB5 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                    boolean zD = aVar4.d(i14);
                                    Object objY5 = aVar4.y();
                                    if (zD || objY5 == a.C0041a.a) {
                                        objY5 = new Function0() { // from class: u0k
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                oswVar2.k(i14);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY5);
                                    }
                                    w1f0.b(z3, (Function0) objY5, dVarB5, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar5 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                z0k.b(m1f0Var, z3, aVar5, 0);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                    i14 = i15;
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 12804528, 64);
                    bVar2 = bVarI;
                    bVar2.X(true);
                    bVar2.X(false);
                } else {
                    bVarI.N(342538753);
                    d dVarB5 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                    aiv aivVarC5 = g75.c(ht.a.a, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC7 = c.c(bVarI, dVarB5);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC5, bVar);
                    hlh0.a(bVarI, ne00VarS7, dVar);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC7, cVar);
                    j3 = jA;
                    z2 = true;
                    ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                    j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                            }
                            if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar4 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final int i14 = 0;
                                for (Object obj3 : qcnVar) {
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    final m1f0 m1f0Var = (m1f0) obj3;
                                    final osw oswVar2 = oswVar;
                                    final boolean z3 = i14 == oswVar2.D();
                                    d dVarB6 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                    boolean zD = aVar4.d(i14);
                                    Object objY5 = aVar4.y();
                                    if (zD || objY5 == a.C0041a.a) {
                                        objY5 = new Function0() { // from class: u0k
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                oswVar2.k(i14);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY5);
                                    }
                                    w1f0.b(z3, (Function0) objY5, dVarB6, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            a aVar5 = (a) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                z0k.b(m1f0Var, z3, aVar5, 0);
                                            } else {
                                                aVar5.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                    i14 = i15;
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 12804528, 64);
                    bVar2 = bVarI;
                    bVar2.X(true);
                    bVar2.X(false);
                }
                b bVar5 = bVar2;
                dpz.a(0.0f, 0, 1572864, 16318, ht.a.j, pp8.b(-461718339, new iaj() { // from class: s0k
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.iaj
                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                        Integer num = (Integer) obj2;
                        int iIntValue = num.intValue();
                        a aVar4 = (a) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        ((opz) obj).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                        }
                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            aVar4.C(-1329691478, num);
                            ((m1f0) qcnVar.get(iIntValue)).d.invoke(aVar4, 0);
                            aVar4.K();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVar2), null, null, null, null, vedVarB, null, null, bVar5, null, null, false);
                bVarI = bVar5;
                bVarI.X(z2);
                j2 = j3;
                i6 = i8;
                a4f0Var2 = a4f0Var3;
            } else {
                i8 = i4;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC5, cVar);
            if (a4f0Var3 != a4f0.b) {
                bVarI.N(342538753);
                d dVarB6 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                aiv aivVarC6 = g75.c(ht.a.a, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarB6);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC6, bVar);
                hlh0.a(bVarI, ne00VarS8, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC8, cVar);
                j3 = jA;
                z2 = true;
                ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        List list = (List) obj;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        list.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                        }
                        if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final int i14 = 0;
                            for (Object obj3 : qcnVar) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                final m1f0 m1f0Var = (m1f0) obj3;
                                final osw oswVar2 = oswVar;
                                final boolean z3 = i14 == oswVar2.D();
                                d dVarB7 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                boolean zD = aVar4.d(i14);
                                Object objY5 = aVar4.y();
                                if (zD || objY5 == a.C0041a.a) {
                                    objY5 = new Function0() { // from class: u0k
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            oswVar2.k(i14);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY5);
                                }
                                w1f0.b(z3, (Function0) objY5, dVarB7, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar5 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            z0k.b(m1f0Var, z3, aVar5, 0);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                i14 = i15;
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 12804528, 64);
                bVar2 = bVarI;
                bVar2.X(true);
                bVar2.X(false);
            } else {
                bVarI.N(342538753);
                d dVarB7 = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), jA, zk40.a);
                aiv aivVarC7 = g75.c(ht.a.a, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS9 = bVarI.S();
                d dVarC9 = c.c(bVarI, dVarB7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC7, bVar);
                hlh0.a(bVarI, ne00VarS9, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC9, cVar);
                j3 = jA;
                z2 = true;
                ute.b(j.g(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g), 1.0f), 0.0f, 0L, bVarI, 0, 6);
                j3f0.b(oswVar.D(), aVar2, j58.l, j3, 0.0f, pp8.b(1460073981, new gaj() { // from class: o0k
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        List list = (List) obj;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        list.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                        }
                        if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            i2f0.a.c(i2f0.d((z1f0) list.get(oswVar.D())), 4.0f, c68.a(R.color.brand_secondary, aVar4), aVar4, 3120, 0);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), null, pp8.b(-694057987, new Function2() { // from class: p0k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final int i14 = 0;
                            for (Object obj3 : qcnVar) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                final m1f0 m1f0Var = (m1f0) obj3;
                                final osw oswVar2 = oswVar;
                                final boolean z3 = i14 == oswVar2.D();
                                d dVarB8 = androidx.compose.foundation.a.b(d.a.b, j3, zk40.a);
                                boolean zD = aVar4.d(i14);
                                Object objY5 = aVar4.y();
                                if (zD || objY5 == a.C0041a.a) {
                                    objY5 = new Function0() { // from class: u0k
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            oswVar2.k(i14);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY5);
                                }
                                w1f0.b(z3, (Function0) objY5, dVarB8, false, pp8.b(1021565828, new Function2() { // from class: v0k
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar5 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            z0k.b(m1f0Var, z3, aVar5, 0);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), 0L, 0L, aVar4, 24576, 488);
                                i14 = i15;
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 12804528, 64);
                bVar2 = bVarI;
                bVar2.X(true);
                bVar2.X(false);
            }
            b bVar6 = bVar2;
            dpz.a(0.0f, 0, 1572864, 16318, ht.a.j, pp8.b(-461718339, new iaj() { // from class: s0k
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    Integer num = (Integer) obj2;
                    int iIntValue = num.intValue();
                    a aVar4 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        aVar4.C(-1329691478, num);
                        ((m1f0) qcnVar.get(iIntValue)).d.invoke(aVar4, 0);
                        aVar4.K();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVar2), null, null, null, null, vedVarB, null, null, bVar6, null, null, false);
            bVarI = bVar6;
            bVarI.X(z2);
            j2 = j3;
            i6 = i8;
            a4f0Var2 = a4f0Var3;
        } else {
            bVarI.G();
            a4f0Var2 = a4f0Var;
            i6 = i4;
            j2 = j;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t0k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z0k.a(qcnVar, i6, j2, a4f0Var2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final m1f0 m1f0Var, final boolean z, a aVar, final int i) {
        d.a aVar2;
        b bVarI = aVar.i(-1903728554);
        int i2 = (bVarI.M(m1f0Var) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = z ? R.color.text_type1_primary : m1f0Var.b;
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            if (m1f0Var.c == null) {
                bVarI.N(100490437);
                bVarI.X(false);
                aVar2 = aVar3;
            } else {
                bVarI.N(100490438);
                aVar2 = aVar3;
                h9n.a(erz.a(m1f0Var.c.intValue(), 0, bVarI), null, j.r(aVar3, 16.0f), null, null, 0.0f, null, bVarI, 432, 120);
                bVarI.X(false);
            }
            lkf0.d(m1f0Var.a, h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, i) { // from class: n0k
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z0k.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
