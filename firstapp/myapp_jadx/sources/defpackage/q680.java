package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class q680 {
    public static final void a(final r680 r680Var, a aVar, final int i) {
        b bVarI = aVar.i(-1539212958);
        int i2 = (bVarI.M(r680Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Integer num = r680Var.c;
            d.a aVar2 = d.a.b;
            if (num != null) {
                bVarI.N(-1622286556);
                h6n.b(erz.a(r680Var.c.intValue(), 0, bVarI), null, j.r(aVar2, 16.0f), c68.a(R.color.icon_secondary, bVarI), bVarI, 432, 0);
                dd3.b(aVar2, 4.0f, bVarI, false);
            } else {
                String str = r680Var.b;
                if (str == null || StringsKt.U(str)) {
                    bVarI.N(-1621597984);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1621930676);
                    mw90.a(r680Var.b, null, ls7.a(j.r(aVar2, 16.0f), j060.a), null, null, d0b.a.b, null, bVarI, 1572912, 1976);
                    bVarI = bVarI;
                    dd3.b(aVar2, 4.0f, bVarI, false);
                }
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: y580
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    q680.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final uf00<r680> uf00Var, final r680 r680Var, final Function1<? super r680, Unit> function1, a aVar, final int i) {
        int i2;
        uf00Var.getClass();
        r680Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(2016553475);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(uf00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(r680Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new nf8(ytwVar, 1);
                bVarI.r(objY2);
            }
            m1h.a(zBooleanValue, (Function1) objY2, null, pp8.b(1945828781, new gaj() { // from class: k680
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final ytw ytwVar2;
                    a1h a1hVar = (a1h) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    a1hVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(a1hVar) : aVar2.A(a1hVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarG = h.g(d35.a(androidx.compose.foundation.a.b(j.i(a1hVar.a(), 24.0f), c68.a(R.color.bg_primary_d_base, aVar2), j060.b(50)), 1.0f, c68.a(R.color.border_primary, aVar2), j060.b(50)), 12.0f, 2.0f);
                        final r680 r680Var2 = r680Var;
                        String str = r680Var2.a;
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY3 == c0042a2) {
                            objY3 = new m680();
                            aVar2.r(objY3);
                        }
                        final ytw ytwVar3 = ytwVar;
                        ab2.b(str, (Function1) objY3, dVarG, false, true, null, null, null, true, 0, 0, null, null, null, null, pp8.b(-170474928, new gaj() { // from class: n680
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar3 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((Function2) obj4).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarG2 = j.g(aVar4, 1.0f);
                                    kw0.g gVar = kw0.g;
                                    n54.b bVar = ht.a.k;
                                    d160 d160VarA = b160.a(gVar, bVar, aVar3, 54);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    yka.a.b bVar2 = yka.a.f;
                                    hlh0.a(aVar3, d160VarA, bVar2);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC, cVar);
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                    d160 d160VarA2 = b160.a(kw0.a, bVar, aVar3, 48);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO2 = aVar3.o();
                                    d dVarC2 = c.c(aVar3, layoutWeightElement);
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA2, bVar2);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    r680 r680Var3 = r680Var2;
                                    q680.a(r680Var3, aVar3, 0);
                                    lkf0.d(r680Var3.a, null, c68.a(R.color.text_tertiary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_R, aVar3), aVar3, 0, 24960, 110586);
                                    aVar3.s();
                                    h6n.a(((Boolean) ytwVar3.getValue()).booleanValue() ? eop.a() : bop.a(), null, j.r(aVar4, 20.0f), c68.a(R.color.icon_secondary, aVar3), aVar3, 432, 0);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 100687920, 196608, 32488);
                        d dVarB = androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.bg_secondary_d_base, aVar2), zk40.a);
                        boolean zBooleanValue2 = ((Boolean) ytwVar3.getValue()).booleanValue();
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L);
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a2) {
                            ytwVar2 = ytwVar3;
                            objY4 = new zzz(ytwVar2, 1);
                            aVar2.r(objY4);
                        } else {
                            ytwVar2 = ytwVar3;
                        }
                        final uf00 uf00Var2 = uf00Var;
                        final Function1 function2 = function1;
                        z80.a(zBooleanValue2, (Function0) objY4, dVarB, jFloatToRawIntBits, null, null, null, 0L, 0.0f, pp8.b(-798413400, new gaj() { // from class: o680
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long jA;
                                op8 op8VarB;
                                a aVar3 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((j78) obj4).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    for (final r680 r680Var3 : uf00Var2) {
                                        final boolean zG = Intrinsics.g(r680Var3, r680Var2);
                                        if (zG) {
                                            jA = m7b.a(aVar3, -1898746437, R.color.bg_brand_sub_secondary_d_base, aVar3);
                                        } else {
                                            aVar3.N(-1898743379);
                                            aVar3.H();
                                            jA = j58.l;
                                        }
                                        d dVarB2 = androidx.compose.foundation.a.b(d.a.b, jA, zk40.a);
                                        if (r680Var3.b == null && r680Var3.c == null) {
                                            aVar3.N(1268703020);
                                            aVar3.H();
                                            op8VarB = null;
                                        } else {
                                            aVar3.N(1268621459);
                                            op8VarB = pp8.b(176560841, new xf8(r680Var3, 2), aVar3);
                                            aVar3.H();
                                        }
                                        op8 op8Var = op8VarB;
                                        op8 op8VarB2 = pp8.b(-1670660814, new Function2() { // from class: p680
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                a aVar4 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    lkf0.d(r680Var3.a, null, c68.a(R.color.text_tertiary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, aVar4), aVar4, 0, 24960, 110586);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3);
                                        final Function1 function3 = function2;
                                        boolean zM = aVar3.M(function3) | aVar3.M(r680Var3);
                                        Object objY5 = aVar3.y();
                                        if (zM || objY5 == a.C0041a.a) {
                                            final ytw ytwVar4 = ytwVar2;
                                            objY5 = new Function0() { // from class: w580
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(r680Var3);
                                                    ytwVar4.setValue(Boolean.FALSE);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY5);
                                        }
                                        z80.b(op8VarB2, (Function0) objY5, dVarB2, op8Var, pp8.b(-593354578, new Function2() { // from class: x580
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                a aVar4 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                if (!aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    aVar4.G();
                                                } else if (zG) {
                                                    aVar4.N(1459236066);
                                                    h6n.a(vi7.a(), null, null, c68.a(R.color.bg_brand_sub_primary_d_base, aVar4), aVar4, 48, 4);
                                                    aVar4.H();
                                                } else {
                                                    aVar4.N(1459494420);
                                                    aVar4.H();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3), false, null, null, aVar3, 24582, 480);
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 3120, 2032);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l680
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    q680.b(uf00Var, r680Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final uf00<String> uf00Var, final String str, final Function1<? super String, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(1271552249);
        int i2 = (bVarI.M(uf00Var) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new Function1() { // from class: a680
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).getClass();
                        ytw ytwVar2 = ytwVar;
                        ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            m1h.a(zBooleanValue, (Function1) objY2, null, pp8.b(361658019, new gaj() { // from class: b680
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a1h a1hVar = (a1h) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    a1hVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(a1hVar) : aVar2.A(a1hVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarG = h.g(d35.a(androidx.compose.foundation.a.b(j.i(a1hVar.a(), 24.0f), c68.a(R.color.bg_primary_d_base, aVar2), j060.b(50)), 1.0f, c68.a(R.color.border_primary, aVar2), j060.b(50)), 12.0f, 2.0f);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY3 == c0042a2) {
                            objY3 = new d680();
                            aVar2.r(objY3);
                        }
                        final ytw ytwVar2 = ytwVar;
                        final String str2 = str;
                        ab2.b(str2, (Function1) objY3, dVarG, false, true, null, null, null, true, 0, 0, null, null, null, null, pp8.b(1507757638, new gaj() { // from class: e680
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar3 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((Function2) obj4).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarG2 = j.g(aVar4, 1.0f);
                                    d160 d160VarA = b160.a(kw0.g, ht.a.k, aVar3, 54);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar3, d160VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC, cVar);
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO2 = aVar3.o();
                                    d dVarC2 = c.c(aVar3, layoutWeightElement);
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, aivVarC, bVar);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    lkf0.d(str2, null, c68.a(R.color.text_tertiary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_R, aVar3), aVar3, 0, 24960, 110586);
                                    aVar3.s();
                                    h6n.a(((Boolean) ytwVar2.getValue()).booleanValue() ? eop.a() : bop.a(), null, j.r(aVar4, 20.0f), c68.a(R.color.icon_secondary, aVar3), aVar3, 432, 0);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 100687920, 196608, 32488);
                        d dVarB = androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.bg_secondary_d_base, aVar2), zk40.a);
                        boolean zBooleanValue2 = ((Boolean) ytwVar2.getValue()).booleanValue();
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L);
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a2) {
                            objY4 = new Function0() { // from class: f680
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar2.setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        final uf00 uf00Var2 = uf00Var;
                        final Function1 function2 = function1;
                        z80.a(zBooleanValue2, (Function0) objY4, dVarB, jFloatToRawIntBits, null, null, null, 0L, 0.0f, pp8.b(-1025650274, new gaj() { // from class: g680
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long jA;
                                a aVar3 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((j78) obj4).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    for (final String str3 : uf00Var2) {
                                        final boolean zG = Intrinsics.g(str3, str2);
                                        if (zG) {
                                            jA = m7b.a(aVar3, -2001076825, R.color.bg_brand_sub_secondary_d_base, aVar3);
                                        } else {
                                            aVar3.N(-2001073767);
                                            aVar3.H();
                                            jA = j58.l;
                                        }
                                        d dVarB2 = androidx.compose.foundation.a.b(d.a.b, jA, zk40.a);
                                        op8 op8VarB = pp8.b(-111167458, new Function2() { // from class: h680
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                a aVar4 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    lkf0.d(str3, null, c68.a(R.color.text_tertiary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, aVar4), aVar4, 0, 24960, 110586);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3);
                                        final Function1 function3 = function2;
                                        boolean zM = aVar3.M(function3) | aVar3.M(str3);
                                        Object objY5 = aVar3.y();
                                        if (zM || objY5 == a.C0041a.a) {
                                            final ytw ytwVar3 = ytwVar2;
                                            objY5 = new Function0() { // from class: i680
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(str3);
                                                    ytwVar3.setValue(Boolean.FALSE);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY5);
                                        }
                                        z80.b(op8VarB, (Function0) objY5, dVarB2, null, pp8.b(1583649690, new Function2() { // from class: j680
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                a aVar4 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                if (!aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    aVar4.G();
                                                } else if (zG) {
                                                    aVar4.N(-1707752842);
                                                    h6n.a(vi7.a(), null, null, c68.a(R.color.bg_brand_sub_primary_d_base, aVar4), aVar4, 48, 4);
                                                    aVar4.H();
                                                } else {
                                                    aVar4.N(-1707494488);
                                                    aVar4.H();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3), false, null, null, aVar3, 24582, 488);
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 3120, 2032);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3120);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, i) { // from class: c680
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    q680.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(ComposeView composeView, final uf00<String> uf00Var, final String str, final Function1<? super String, Unit> function1) {
        composeView.setContent(new op8(450888748, new Function2() { // from class: z580
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q680.c(uf00Var, str, function1, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
