package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dzb implements gaj {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v5b b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ haj i;

    public /* synthetic */ dzb(ved vedVar, List list, v5b v5bVar, h0s h0sVar, gaj gajVar, h0s h0sVar2) {
        this.c = vedVar;
        this.d = list;
        this.b = v5bVar;
        this.e = h0sVar;
        this.i = gajVar;
        this.f = h0sVar2;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        haj hajVar = this.i;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                final zpz zpzVar = (zpz) obj7;
                final List list = (List) obj6;
                final h0s h0sVar = (h0s) obj5;
                final gaj gajVar = (gaj) hajVar;
                final h0s h0sVar2 = (h0s) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((tmz) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    final v5b v5bVar = this.b;
                    a1c.a(6, pp8.b(1802476049, new Function2() { // from class: fzb
                        /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00be  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
                        /* JADX WARN: Code duplicated, block: B:31:0x00df  */
                        /* JADX WARN: Code duplicated, block: B:33:0x015d  */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) throws Throwable {
                            Throwable th;
                            yka.a.c cVar;
                            i78 i78VarA;
                            int iHashCode;
                            ne00 ne00VarO;
                            d dVarC;
                            a aVar2 = (a) obj8;
                            int iIntValue2 = ((Integer) obj9).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                d.a aVar3 = d.a.b;
                                d dVarE = j.e(aVar3, 1.0f);
                                kw0.k kVar = kw0.c;
                                n54.a aVar4 = ht.a.m;
                                i78 i78VarA2 = g78.a(kVar, aVar4, aVar2, 0);
                                int iHashCode2 = Long.hashCode(aVar2.m());
                                ne00 ne00VarO2 = aVar2.o();
                                d dVarC2 = c.c(aVar2, dVarE);
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
                                yka.a.b bVar = yka.a.f;
                                hlh0.a(aVar2, i78VarA2, bVar);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar2, ne00VarO2, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g()) {
                                    th = null;
                                } else {
                                    th = null;
                                    if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                    }
                                    cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    ty0.a(aVar2, j.i(aVar3, 44.0f));
                                    d dVarI = h.i(aVar3, 16.0f, 20.0f, 20.0f, 0.0f);
                                    i78VarA = g78.a(kVar, aVar4, aVar2, 0);
                                    iHashCode = Long.hashCode(aVar2.m());
                                    ne00VarO = aVar2.o();
                                    dVarC = c.c(aVar2, dVarI);
                                    if (aVar2.k() != null) {
                                        l2a.b();
                                        throw th;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar5);
                                    } else {
                                        aVar2.p();
                                    }
                                    hlh0.a(aVar2, i78VarA, bVar);
                                    hlh0.a(aVar2, ne00VarO, dVar);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC, cVar);
                                    d dVarH = h.h(aVar3, 50.0f, 0.0f, 2);
                                    long j = j58.l;
                                    long jA = c68.a(R.color.text_type2_primary, aVar2);
                                    final zpz zpzVar2 = zpzVar;
                                    int iK = zpzVar2.k();
                                    op8 op8VarB = pp8.b(910462101, new gaj() { // from class: gzb
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            List list2 = (List) obj10;
                                            a aVar6 = (a) obj11;
                                            int iIntValue3 = ((Integer) obj12).intValue();
                                            list2.getClass();
                                            if ((iIntValue3 & 6) == 0) {
                                                iIntValue3 |= (iIntValue3 & 8) == 0 ? aVar6.M(list2) : aVar6.A(list2) ? 4 : 2;
                                            }
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                i2f0.a.c(i2f0.d((z1f0) list2.get(zpzVar2.k())), 4.0f, c68.a(R.color.text_type2_primary, aVar6), aVar6, 3120, 0);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2);
                                    final List list2 = list;
                                    final v5b v5bVar2 = v5bVar;
                                    j3f0.g(iK, dVarH, j, jA, op8VarB, bw8.a, pp8.b(1157643925, new Function2() { // from class: hzb
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj10, Object obj11) {
                                            a aVar6 = (a) obj10;
                                            int iIntValue3 = ((Integer) obj11).intValue();
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                final int i2 = 0;
                                                for (Object obj12 : list2) {
                                                    int i3 = i2 + 1;
                                                    if (i2 < 0) {
                                                        b.q();
                                                        throw null;
                                                    }
                                                    final String str = (String) obj12;
                                                    final zpz zpzVar3 = zpzVar2;
                                                    boolean z = zpzVar3.k() == i2;
                                                    final v5b v5bVar3 = v5bVar2;
                                                    boolean zA = aVar6.A(v5bVar3) | aVar6.M(zpzVar3) | aVar6.d(i2);
                                                    Object objY = aVar6.y();
                                                    if (zA || objY == a.C0041a.a) {
                                                        objY = new Function0() { // from class: azb
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                ej5.c(v5bVar3, null, null, new szb.a(i2, null, zpzVar3), 3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar6.r(objY);
                                                    }
                                                    w1f0.a(z, (Function0) objY, null, false, 0L, 0L, pp8.b(-1985442578, new gaj() { // from class: jzb
                                                        @Override // defpackage.gaj
                                                        public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                            a aVar7 = (a) obj14;
                                                            int iIntValue4 = ((Integer) obj15).intValue();
                                                            ((j78) obj13).getClass();
                                                            if (aVar7.q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                d dVarI2 = j.i(d.a.b, 44.0f);
                                                                d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar7, 48);
                                                                int iHashCode3 = Long.hashCode(aVar7.m());
                                                                ne00 ne00VarO3 = aVar7.o();
                                                                d dVarC3 = c.c(aVar7, dVarI2);
                                                                yka.k.getClass();
                                                                tsr.a aVar8 = yka.a.b;
                                                                if (aVar7.k() == null) {
                                                                    l2a.b();
                                                                    throw null;
                                                                }
                                                                aVar7.D();
                                                                if (aVar7.g()) {
                                                                    aVar7.F(aVar8);
                                                                } else {
                                                                    aVar7.p();
                                                                }
                                                                hlh0.a(aVar7, d160VarA, yka.a.f);
                                                                hlh0.a(aVar7, ne00VarO3, yka.a.e);
                                                                yka.a.C1350a c1350a2 = yka.a.g;
                                                                if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode3))) {
                                                                    j3c.a(iHashCode3, aVar7, iHashCode3, c1350a2);
                                                                }
                                                                hlh0.a(aVar7, dVarC3, yka.a.d);
                                                                lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar7, 0, 0, 262142);
                                                                aVar7.s();
                                                            } else {
                                                                aVar7.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, aVar6), aVar6, 12582912, 124);
                                                    i2 = i3;
                                                }
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2), aVar2, 1794480, 0);
                                    d dVarE2 = j.e(aVar3, 1.0f);
                                    final h0s h0sVar3 = h0sVar;
                                    final gaj gajVar2 = gajVar;
                                    final h0s h0sVar4 = h0sVar2;
                                    dpz.a(0.0f, 0, 48, 16380, null, pp8.b(-515826626, new iaj() { // from class: izb
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj10, Object obj11, Object obj12, Object obj13) {
                                            int iIntValue3 = ((Integer) obj11).intValue();
                                            a aVar6 = (a) obj12;
                                            int iIntValue4 = ((Integer) obj13).intValue();
                                            ((opz) obj10).getClass();
                                            if ((iIntValue4 & 48) == 0) {
                                                iIntValue4 |= aVar6.d(iIntValue3) ? 32 : 16;
                                            }
                                            if (aVar6.q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                                gaj gajVar3 = gajVar2;
                                                if (iIntValue3 == 0) {
                                                    aVar6.N(402054151);
                                                    szb.a(h0sVar3, true, gajVar3, aVar6, 56);
                                                    aVar6.H();
                                                } else if (iIntValue3 != 1) {
                                                    aVar6.N(402359780);
                                                    aVar6.H();
                                                } else {
                                                    aVar6.N(402212902);
                                                    szb.a(h0sVar4, false, gajVar3, aVar6, 56);
                                                    aVar6.H();
                                                }
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2), null, null, null, null, zpzVar2, null, null, aVar2, dVarE2, null, false);
                                    aVar2.s();
                                    aVar2.s();
                                }
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC2, cVar);
                                ty0.a(aVar2, j.i(aVar3, 44.0f));
                                d dVarI2 = h.i(aVar3, 16.0f, 20.0f, 20.0f, 0.0f);
                                i78VarA = g78.a(kVar, aVar4, aVar2, 0);
                                iHashCode = Long.hashCode(aVar2.m());
                                ne00VarO = aVar2.o();
                                dVarC = c.c(aVar2, dVarI2);
                                if (aVar2.k() != null) {
                                    l2a.b();
                                    throw th;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar5);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, i78VarA, bVar);
                                hlh0.a(aVar2, ne00VarO, dVar);
                                if (aVar2.g()) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                } else {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                hlh0.a(aVar2, dVarC, cVar);
                                d dVarH2 = h.h(aVar3, 50.0f, 0.0f, 2);
                                long j2 = j58.l;
                                long jA2 = c68.a(R.color.text_type2_primary, aVar2);
                                final zpz zpzVar3 = zpzVar;
                                int iK2 = zpzVar3.k();
                                op8 op8VarB2 = pp8.b(910462101, new gaj() { // from class: gzb
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                        List list3 = (List) obj10;
                                        a aVar6 = (a) obj11;
                                        int iIntValue3 = ((Integer) obj12).intValue();
                                        list3.getClass();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= (iIntValue3 & 8) == 0 ? aVar6.M(list3) : aVar6.A(list3) ? 4 : 2;
                                        }
                                        if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                            i2f0.a.c(i2f0.d((z1f0) list3.get(zpzVar3.k())), 4.0f, c68.a(R.color.text_type2_primary, aVar6), aVar6, 3120, 0);
                                        } else {
                                            aVar6.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                final List list3 = list;
                                final v5b v5bVar3 = v5bVar;
                                j3f0.g(iK2, dVarH2, j2, jA2, op8VarB2, bw8.a, pp8.b(1157643925, new Function2() { // from class: hzb
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj10, Object obj11) {
                                        a aVar6 = (a) obj10;
                                        int iIntValue3 = ((Integer) obj11).intValue();
                                        if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            final int i2 = 0;
                                            for (Object obj12 : list3) {
                                                int i3 = i2 + 1;
                                                if (i2 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                final String str = (String) obj12;
                                                final zpz zpzVar4 = zpzVar3;
                                                boolean z = zpzVar4.k() == i2;
                                                final v5b v5bVar4 = v5bVar3;
                                                boolean zA = aVar6.A(v5bVar4) | aVar6.M(zpzVar4) | aVar6.d(i2);
                                                Object objY = aVar6.y();
                                                if (zA || objY == a.C0041a.a) {
                                                    objY = new Function0() { // from class: azb
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            ej5.c(v5bVar4, null, null, new szb.a(i2, null, zpzVar4), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar6.r(objY);
                                                }
                                                w1f0.a(z, (Function0) objY, null, false, 0L, 0L, pp8.b(-1985442578, new gaj() { // from class: jzb
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                        a aVar7 = (a) obj14;
                                                        int iIntValue4 = ((Integer) obj15).intValue();
                                                        ((j78) obj13).getClass();
                                                        if (aVar7.q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                            d dVarI3 = j.i(d.a.b, 44.0f);
                                                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar7, 48);
                                                            int iHashCode3 = Long.hashCode(aVar7.m());
                                                            ne00 ne00VarO3 = aVar7.o();
                                                            d dVarC3 = c.c(aVar7, dVarI3);
                                                            yka.k.getClass();
                                                            tsr.a aVar8 = yka.a.b;
                                                            if (aVar7.k() == null) {
                                                                l2a.b();
                                                                throw null;
                                                            }
                                                            aVar7.D();
                                                            if (aVar7.g()) {
                                                                aVar7.F(aVar8);
                                                            } else {
                                                                aVar7.p();
                                                            }
                                                            hlh0.a(aVar7, d160VarA, yka.a.f);
                                                            hlh0.a(aVar7, ne00VarO3, yka.a.e);
                                                            yka.a.C1350a c1350a2 = yka.a.g;
                                                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode3))) {
                                                                j3c.a(iHashCode3, aVar7, iHashCode3, c1350a2);
                                                            }
                                                            hlh0.a(aVar7, dVarC3, yka.a.d);
                                                            lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar7, 0, 0, 262142);
                                                            aVar7.s();
                                                        } else {
                                                            aVar7.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar6), aVar6, 12582912, 124);
                                                i2 = i3;
                                            }
                                        } else {
                                            aVar6.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 1794480, 0);
                                d dVarE3 = j.e(aVar3, 1.0f);
                                final h0s h0sVar5 = h0sVar;
                                final gaj gajVar3 = gajVar;
                                final h0s h0sVar6 = h0sVar2;
                                dpz.a(0.0f, 0, 48, 16380, null, pp8.b(-515826626, new iaj() { // from class: izb
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj10, Object obj11, Object obj12, Object obj13) {
                                        int iIntValue3 = ((Integer) obj11).intValue();
                                        a aVar6 = (a) obj12;
                                        int iIntValue4 = ((Integer) obj13).intValue();
                                        ((opz) obj10).getClass();
                                        if ((iIntValue4 & 48) == 0) {
                                            iIntValue4 |= aVar6.d(iIntValue3) ? 32 : 16;
                                        }
                                        if (aVar6.q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                            gaj gajVar4 = gajVar3;
                                            if (iIntValue3 == 0) {
                                                aVar6.N(402054151);
                                                szb.a(h0sVar5, true, gajVar4, aVar6, 56);
                                                aVar6.H();
                                            } else if (iIntValue3 != 1) {
                                                aVar6.N(402359780);
                                                aVar6.H();
                                            } else {
                                                aVar6.N(402212902);
                                                szb.a(h0sVar6, false, gajVar4, aVar6, 56);
                                                aVar6.H();
                                            }
                                        } else {
                                            aVar6.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), null, null, null, null, zpzVar3, null, null, aVar2, dVarE3, null, false);
                                aVar2.s();
                                aVar2.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                break;
            default:
                u1v u1vVar = (u1v) obj7;
                final j590 j590Var = (j590) obj6;
                final wyu wyuVar = (wyu) obj5;
                xyu xyuVar = (xyu) obj4;
                yyu yyuVar = (yyu) hajVar;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                    dnn dnnVarC = r8j0.c(q8j0.a.a(aVar2).k, aVar2);
                    d dVarI = j.i(j.g(d.a.b, 1.0f), ((mla.f((int) (((a8j0) aVar2.O(kna.t)).a() & 4294967295L), aVar2) - dnnVarC.d()) - dnnVarC.a()) * 0.8f);
                    final v5b v5bVar2 = this.b;
                    boolean zA = aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(wyuVar);
                    Object objY = aVar2.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: d1v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ej5.c(v5bVar2, null, null, new k1v(j590Var, wyuVar, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY);
                    }
                    j1v.e(dVarI, u1vVar, (Function0) objY, xyuVar, yyuVar, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dzb(u1v u1vVar, v5b v5bVar, j590 j590Var, wyu wyuVar, xyu xyuVar, yyu yyuVar) {
        this.c = u1vVar;
        this.b = v5bVar;
        this.d = j590Var;
        this.e = wyuVar;
        this.f = xyuVar;
        this.i = yyuVar;
    }
}
