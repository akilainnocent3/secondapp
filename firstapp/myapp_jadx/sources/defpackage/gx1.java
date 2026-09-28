package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gx1 {
    public static final void a(final int i, a aVar, final d dVar, final String str, Function0 function0) {
        final Function0 function1;
        b bVarI = aVar.i(-1046272529);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarI = h.i(androidx.compose.foundation.a.b(dVar, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 24.0f, 24.0f, 24.0f, 4.0f);
            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
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
            function1 = function0;
            lkf0.d(str, androidx.compose.ui.platform.d.a(new LayoutWeightElement(1.0f, true), "deposit_bank_selection_title"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i2 >> 3) & 14, 0, 131064);
            bVarI = bVarI;
            h6n.b(erz.a(R.drawable.ic_icon_cancel, 0, bVarI), null, androidx.compose.ui.platform.d.a(g3w.f(j.r(d.a.b, 16.0f), true, function1), "deposit_bank_selection_close_icon"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str, function1) { // from class: xw1
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = dVar;
                    this.b = str;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gx1.a(qj40.a(7), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(lw1 lw1Var, a aVar, int i) {
        b bVar;
        int i2;
        String str;
        b bVarI = aVar.i(360904700);
        int i3 = (bVarI.d(lw1Var.ordinal()) ? 4 : 2) | i;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            int iOrdinal = lw1Var.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.page_payment__recommended;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                i2 = R.string.page_payment__other_banks;
            }
            int iOrdinal2 = lw1Var.ordinal();
            if (iOrdinal2 == 0) {
                str = "deposit_bank_recommend_bank_title";
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                str = "deposit_bank_other_banks_title";
            }
            d dVarA = androidx.compose.ui.platform.d.a(h.h(j.k(j.g(d.a.b, 1.0f), 24.0f, 0.0f, 2), 12.0f, 0.0f, 2), str);
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(i2, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new bx1(lw1Var, i);
        }
    }

    public static final void c(final rw1 rw1Var, d dVar, final Function0 function0, final Function1 function1, a aVar, final int i) {
        Function0 function2;
        rw1Var.getClass();
        b bVarI = aVar.i(104483067);
        int i2 = (bVarI.M(rw1Var) ? 4 : 2) | i | 48 | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            float f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new g7f(f * 0.9f);
                bVarI.r(objY);
            }
            final float f2 = ((g7f) objY).a;
            function2 = function0;
            ac8.h(0.0f, null, function2, pp8.b(175918913, new Function2() { // from class: sw1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarE = j.e(d.a.b, 1.0f);
                        long j = j58.l;
                        final float f3 = f2;
                        final Function0 function3 = function0;
                        final rw1 rw1Var2 = rw1Var;
                        final Function1 function4 = function1;
                        g900.a(dVarE, null, j, null, pp8.b(1456899659, new gaj() { // from class: vw1
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                tmz tmzVar = (tmz) obj3;
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                tmzVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar3.M(tmzVar) ? 4 : 2;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarE2 = h.e(j.e(aVar4, 1.0f), tmzVar);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarE2);
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
                                    hlh0.a(aVar3, aivVarC, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    d dVarA = androidx.compose.ui.platform.d.a(androidx.compose.foundation.layout.d.a.b(j.k(j.g(aVar4, 1.0f), 0.0f, f3, 1), ht.a.h), "deposit_bank_selection_modal");
                                    final Function0 function5 = function3;
                                    final rw1 rw1Var3 = rw1Var2;
                                    final Function1 function6 = function4;
                                    ac8.k(dVarA, 0L, pp8.b(1485758809, new Function2() { // from class: ww1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar6, 0);
                                                int iHashCode2 = Long.hashCode(aVar6.m());
                                                ne00 ne00VarO2 = aVar6.o();
                                                d.a aVar7 = d.a.b;
                                                d dVarC2 = c.c(aVar6, aVar7);
                                                yka.k.getClass();
                                                tsr.a aVar8 = yka.a.b;
                                                if (aVar6.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar6.D();
                                                if (aVar6.g()) {
                                                    aVar6.F(aVar8);
                                                } else {
                                                    aVar6.p();
                                                }
                                                hlh0.a(aVar6, i78VarA, yka.a.f);
                                                hlh0.a(aVar6, ne00VarO2, yka.a.e);
                                                yka.a.C1350a c1350a2 = yka.a.g;
                                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode2))) {
                                                    j3c.a(iHashCode2, aVar6, iHashCode2, c1350a2);
                                                }
                                                hlh0.a(aVar6, dVarC2, yka.a.d);
                                                gx1.a(6, aVar6, j.g(aVar7, 1.0f), cb40.a(R.string.page_payment__select_a_bank, new Object[0], aVar6), function5);
                                                gx1.e(0, aVar6, zqu.a(1.0f, j.g(aVar7, 1.0f), false), rw1Var3.b, function6);
                                                aVar6.s();
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3), aVar3, 384, 2);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 24960, 10);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 896) | 3072, 3);
            dVar = d.a.b;
        } else {
            function2 = function0;
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0 function3 = function2;
            eVarZ.d = new Function2(dVar2, function3, function1, i) { // from class: uw1
                public final /* synthetic */ d b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gx1.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(1529260274);
        if (bVarI.q(i & 1, i != 0)) {
            ute.b(j.g(d.a.b, 1.0f), 1.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 54, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ax1();
        }
    }

    public static final void e(final int i, a aVar, final d dVar, final List list, final Function1 function1) {
        Object objG;
        b bVarI = aVar.i(-307767192);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(list) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                ArrayList arrayListA = kw5.a(list);
                for (Object obj : list) {
                    if (((aoe0.a) obj).h) {
                        arrayListA.add(obj);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((aoe0.a) obj2).h) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayListA.isEmpty() || arrayList.isEmpty()) {
                    objG = g(list);
                } else {
                    ngs ngsVarB = kotlin.collections.a.b();
                    ngsVarB.add(new mw1.b(lw1.a));
                    ngsVarB.addAll(g(arrayListA));
                    ngsVarB.add(mw1.a.a);
                    ngsVarB.add(new mw1.b(lw1.b));
                    ngsVarB.addAll(g(arrayList));
                    objG = kotlin.collections.a.a(ngsVarB);
                }
                objY = objG;
                bVarI.r(objY);
            }
            final List list2 = (List) objY;
            boolean zM = bVarI.M(list2);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                Iterator it = list2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    mw1 mw1Var = (mw1) it.next();
                    if ((mw1Var instanceof mw1.c) && ((mw1.c) mw1Var).a.f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                objY2 = Integer.valueOf(i3);
                bVarI.r(objY2);
            }
            int iIntValue = ((Number) objY2).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zM2 = bVarI.M(zzrVarA) | bVarI.d(iIntValue);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new dx1(iIntValue, null, zzrVarA);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY3);
            d dVarF = h.f(dVar, 20.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean zA = bVarI.A(list2) | ((i2 & 896) == 256);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new Function1() { // from class: yw1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        szr szrVar = (szr) obj3;
                        szrVar.getClass();
                        List list3 = list2;
                        szrVar.d(list3.size(), null, new ex1(list3), new op8(802480018, new fx1(list3, function1), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            aur.a(null, zzrVarA, null, false, null, null, null, false, null, (Function1) objY4, bVarI, 0, 509);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, list, function1) { // from class: zw1
                public final /* synthetic */ d a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = dVar;
                    this.b = list;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    gx1.e(qj40.a(1), (a) obj3, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, final aoe0.a aVar, final Function1 function1, a aVar2, final int i) {
        final aoe0.a aVar3;
        final d dVar2;
        b bVarI = aVar2.i(-1573829988);
        int i2 = i | 6 | (bVarI.M(aVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            String str = aVar.h ? "deposit_bank_recommend_bank_list" : "deposit_bank_other_banks_list";
            d.a aVar4 = d.a.b;
            d dVarG = j.g(aVar4, 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: cx1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(aVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA = androidx.compose.ui.platform.d.a(h.f(g3w.f(dVarG, true, (Function0) objY), 12.0f), str);
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            h9n.a(erz.a(R.drawable.ic_check, 0, bVarI), null, j.r(aVar4, 24.0f), null, null, aVar.f ? 1.0f : 0.0f, new gf4(c68.a(R.color.brand_secondary, bVarI), 5), bVarI, 432, 24);
            d.a aVar6 = aVar4;
            mw90.b(aVar.c, null, androidx.compose.ui.platform.d.a(j.i(j.w(aVar4, 28.0f), 20.0f), "deposit_bank_list_item_icon"), erz.a(R.drawable.icon_default, 0, bVarI), erz.a(R.drawable.icon_default, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            i78 i78VarA = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            aVar3 = aVar;
            String str2 = aVar3.b;
            if (str2 == null) {
                str2 = "";
            }
            lkf0.d(str2, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
            bVarI = bVarI;
            if (aVar3.i.length() > 0) {
                bVarI.N(472251302);
                d dVarA2 = androidx.compose.ui.platform.d.a(aVar6, "deposit_bank_recommend_bank_description");
                aVar6 = aVar6;
                lkf0.d(aVar3.i, dVarA2, c68.a(R.color.text_brand_sub_primary_d_lighter, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 130040);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(472628448);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar6;
        } else {
            aVar3 = aVar;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(aVar3, function1, i) { // from class: tw1
                public final /* synthetic */ aoe0.a b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gx1.f(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final ArrayList g(List list) {
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            aoe0.a aVar = (aoe0.a) obj;
            boolean z = true;
            i060 i060VarD = j060.d(i == 0 ? 8.0f : 0.0f, i == 0 ? 8.0f : 0.0f, i == list.size() - 1 ? 8.0f : 0.0f, i == list.size() - 1 ? 8.0f : 0.0f);
            if (i >= list.size() - 1) {
                z = false;
            }
            arrayList.add(new mw1.c(aVar, i060VarD, z));
            i = i2;
        }
        return arrayList;
    }
}
