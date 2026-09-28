package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
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
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class bmk {
    public static final void a(final Function1<? super jkk, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(244302229);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            mw90.a(xib0.GIFT_GRAB_ALREADY, "image", c.a(h.h(aVar2, 62.0f, 0.0f, 2), 1.0f), null, null, null, null, bVarI, 438, 2040);
            d dVarJ = h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
            String strA = cb40.a(R.string.page_gift_grab__already_received_vouchers, new Object[0], bVarI);
            imf0 imf0Var = (imf0) bVarI.O(lkf0.a);
            bVarI.N(-1448733677);
            List listK = kotlin.collections.b.k(Integer.valueOf(R.color.gift_grab_text01_light), Integer.valueOf(R.color.gift_grab_text01_medium), Integer.valueOf(R.color.gift_grab_text01_darkest));
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(new j58(c68.a(((Number) it.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            lkf0.d(strA, dVarJ, 0L, null, mla.m(28.0f, bVarI), null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.a(imf0Var, new hfs(arrayList, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), t9i.E, f8i.b, null, null, 33554358), bVarI, 48, 0, 130028);
            lkf0.d(cb40.a(R.string.page_gift_grab__already_received_vouchers_info, new Object[0], bVarI), h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
            d dVarJ2 = h.j(aVar2, 0.0f, 40.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: xlk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(jkk.a.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            c6n.a((Function0) objY, dVarJ2, false, null, null, e49.c, bVarI, 1572912, 60);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ylk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bmk.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final cmk cmkVar, final Function1<? super jkk, Unit> function1, a aVar, final int i) {
        cmkVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(1316278408);
        int i2 = (bVarI.M(cmkVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = h.h(androidx.compose.foundation.a.b(d.a.b, j58.l, zk40.a), 20.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (cmkVar instanceof cmk.b) {
                bVarI.N(-1127019242);
                c((cmk.b) cmkVar, function1, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            } else if (cmkVar instanceof cmk.c) {
                bVarI.N(-577692251);
                d((cmk.c) cmkVar, function1, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                bVarI.X(false);
            } else if (cmkVar instanceof cmk.d) {
                bVarI.N(-577489511);
                e(cb40.a(R.string.page_gift_grab__you_missed_it, new Object[0], bVarI), cb40.a(R.string.page_gift_grab__not_fast_enough, new Object[0], bVarI), function1, bVarI, (i2 << 3) & 896);
                bVarI.X(false);
            } else {
                if (!(cmkVar instanceof cmk.a)) {
                    throw igf0.a(bVarI, -1127021111, false);
                }
                bVarI.N(-577154308);
                a(function1, bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: plk
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bmk.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final cmk.b bVar, final Function1<? super jkk, Unit> function1, a aVar, final int i) {
        Integer numValueOf = Integer.valueOf(R.color.gift_grab_text01_darkest);
        Integer numValueOf2 = Integer.valueOf(R.color.gift_grab_text01_medium);
        Integer numValueOf3 = Integer.valueOf(R.color.gift_grab_text01_light);
        b bVarI = aVar.i(1346248881);
        int i2 = i | (bVarI.M(bVar) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            mw90.a(xib0.GIFT_GRAB_CONFIRM_DIALOG_IMAGE, "image", c.a(j.g(aVar2, 1.0f), 1.7777778f), null, null, null, null, bVarI, 438, 2040);
            d dVarJ = h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
            String strA = cb40.a(R.string.page_gift_grab__grab_your_gift_now, new Object[0], bVarI);
            imf0 imf0Var = (imf0) bVarI.O(lkf0.a);
            bVarI.N(960045295);
            List listK = kotlin.collections.b.k(numValueOf3, numValueOf2, numValueOf);
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(new j58(c68.a(((Number) it.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            ya5.a aVar3 = ya5.a;
            lkf0.d(strA, dVarJ, 0L, null, mla.m(28.0f, bVarI), null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.a(imf0Var, ya5.a.h(aVar3, arrayList, 0.0f, 0.0f, 14), t9i.E, f8i.b, null, null, 33554358), bVarI, 48, 0, 130028);
            d dVarH = h.h(h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), 20.0f, 0.0f, 2);
            String strA2 = cb40.a(R.string.page_gift_grab__you_have_qualified_for_the_gift, new Object[]{bVar.b, bVar.a}, bVarI);
            imf0 imf0VarL = mla.l(R.style.H4_B, bVarI);
            bVarI.N(960071887);
            List listK2 = kotlin.collections.b.k(numValueOf3, numValueOf2, numValueOf);
            ArrayList arrayList2 = new ArrayList(l48.r(listK2, 10));
            Iterator it2 = listK2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new j58(c68.a(((Number) it2.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            lkf0.d(strA2, dVarH, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.a(imf0VarL, ya5.a.h(aVar3, arrayList2, 0.0f, 0.0f, 14), null, null, null, null, 33554430), bVarI, 48, 0, 130044);
            b bVar2 = bVarI;
            if (bVar.d) {
                bVar2.N(-302439591);
                lkf0.d(cb40.a(R.string.page_gift_grab__grab_popup_cash_out_block_description, new Object[0], bVar2), h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type2_primary, bVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVar2), bVar2, 48, 0, 130040);
                bVar2 = bVar2;
                bVar2.X(false);
            } else {
                bVar2.N(-302072303);
                bVar2.X(false);
            }
            d dVarJ2 = h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(new kw0.i(20.0f, true, new hw0()), ht.a.j, bVar2, 6);
            int iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS = bVar2.S();
            d dVarC = androidx.compose.ui.c.c(bVar2, dVarJ2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA, yka.a.f);
            hlh0.a(bVar2, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            hlh0.a(bVar2, dVarC, yka.a.d);
            d dVarW = j.w(aVar2, 148.0f);
            String strA3 = cb40.a(R.string.common_functions__cancel, new Object[0], bVar2);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new slk(function1, 0);
                bVar2.r(objY);
            }
            b bVar3 = bVar2;
            vuc0.b(dVarW, false, null, null, null, strA3, null, null, null, null, (Function0) objY, bVar3, 6, 0, 990);
            d dVarW2 = j.w(aVar2, 148.0f);
            String strA4 = cb40.a(R.string.page_gift_grab__grab, new Object[0], bVar3);
            uxs uxsVar = bVar.c;
            boolean z2 = i3 == 32;
            Object objY2 = bVar3.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new tlk(0, function1);
                bVar3.r(objY2);
            }
            aza.a(dVarW2, strA4, uxsVar, null, null, null, null, null, (Function0) objY2, null, bVar3, 6, 760);
            bVarI = bVar3;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: ulk
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bmk.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final cmk.c cVar, final Function1<? super jkk, Unit> function1, a aVar, final int i) {
        b bVar;
        Integer numValueOf = Integer.valueOf(R.color.gift_grab_text01_darkest);
        Integer numValueOf2 = Integer.valueOf(R.color.gift_grab_text01_medium);
        Integer numValueOf3 = Integer.valueOf(R.color.gift_grab_text01_light);
        b bVarI = aVar.i(-326791673);
        int i2 = (bVarI.M(cVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final Resources resources = ((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources();
            boolean zA = bVarI.A(resources);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: zlk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        b01.b.d dVar = (b01.b.d) obj;
                        dVar.getClass();
                        u7n u7nVar = dVar.b.a;
                        Resources resources2 = resources;
                        resources2.getClass();
                        o28.a(zbn.a(u7nVar, resources2));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            b01 b01VarB = nw90.b(xib0.GIFT_GRAB_SUCCESS, (Function1) objY, bVarI, 6);
            d.a aVar2 = d.a.b;
            h9n.a(b01VarB, "contentDescription", c.a(aVar2, 1.3846154f), null, null, 0.0f, null, bVarI, 432, 120);
            d dVarJ = h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
            String strA = cb40.a(R.string.page_gift_grab__congratulations, new Object[0], bVarI);
            imf0 imf0Var = (imf0) bVarI.O(lkf0.a);
            bVarI.N(-514151931);
            List listK = kotlin.collections.b.k(numValueOf3, numValueOf2, numValueOf);
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(new j58(c68.a(((Number) it.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            ya5.a aVar3 = ya5.a;
            lkf0.d(strA, dVarJ, 0L, null, mla.m(28.0f, bVarI), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.a(imf0Var, ya5.a.h(aVar3, arrayList, 0.0f, 0.0f, 14), t9i.E, f8i.b, null, null, 33554358), bVarI, 48, 0, 131052);
            d dVarJ2 = h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            String strA2 = cb40.a(R.string.page_gift_grab__you_have_qualified_for_the_gift, new Object[]{cVar.b, cVar.a}, bVarI);
            imf0 imf0VarL = mla.l(R.style.H4_B, bVarI);
            bVarI.N(-514126811);
            List listK2 = kotlin.collections.b.k(numValueOf3, numValueOf2, numValueOf);
            ArrayList arrayList2 = new ArrayList(l48.r(listK2, 10));
            Iterator it2 = listK2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new j58(c68.a(((Number) it2.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            lkf0.d(strA2, dVarJ2, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.a(imf0VarL, ya5.a.h(aVar3, arrayList2, 0.0f, 0.0f, 14), null, null, null, null, 33554430), bVarI, 48, 0, 130044);
            d dVarJ3 = h.j(aVar2, 0.0f, 30.0f, 0.0f, 0.0f, 13);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function0() { // from class: amk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(jkk.b.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            lkf0.d(cb40.a(R.string.page_gift_grab__check_gift_vouchers, new Object[0], bVarI), androidx.compose.foundation.d.d(dVarJ3, false, null, null, (Function0) objY2, 15), c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.H4_M, bVarI), 0L, 0L, null, null, null, 0L, yef0.c, null, null, 0, 0L, null, null, 16773119), bVarI, 0, 0, 131064);
            d dVarJ4 = h.j(aVar2, 0.0f, 40.0f, 0.0f, 0.0f, 13);
            boolean z2 = i3 == 32;
            Object objY3 = bVarI.y();
            if (z2 || objY3 == c0042a) {
                objY3 = new qlk(0, function1);
                bVarI.r(objY3);
            }
            c6n.a((Function0) objY3, dVarJ4, false, null, null, e49.a, bVarI, 1572912, 60);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: rlk
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bmk.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, String str2, Function1<? super jkk, Unit> function1, a aVar, final int i) {
        int i2;
        final String str3;
        b bVar;
        final Function1<? super jkk, Unit> function2 = function1;
        b bVarI = aVar.i(44293618);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            mw90.a(xib0.GIFT_GRAB_MISS, "image", c.a(h.h(aVar2, 61.0f, 0.0f, 2), 1.0f), null, null, null, null, bVarI, 438, 2040);
            d dVarJ = h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13);
            imf0 imf0Var = (imf0) bVarI.O(lkf0.a);
            bVarI.N(-383482768);
            List listK = kotlin.collections.b.k(Integer.valueOf(R.color.gift_grab_text02_light), Integer.valueOf(R.color.gift_grab_text02_medium), Integer.valueOf(R.color.gift_grab_text02_darkest));
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(new j58(c68.a(((Number) it.next()).intValue(), bVarI)));
            }
            bVarI.X(false);
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i3 = i2;
            lkf0.d(str, dVarJ, 0L, null, mla.m(28.0f, bVarI), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.a(imf0Var, new hfs(arrayList, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), t9i.E, f8i.b, null, null, 33554358), bVarI, (i2 & 14) | 48, 0, 131052);
            str3 = str2;
            lkf0.d(str3, h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, ((i3 >> 3) & 14) | 48, 0, 130040);
            d dVarJ2 = h.j(aVar2, 0.0f, 40.0f, 0.0f, 0.0f, 13);
            boolean z = (i3 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                function2 = function1;
                objY = new vlk(0, function2);
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            c6n.a((Function0) objY, dVarJ2, false, null, null, e49.b, bVarI, 1572912, 60);
            bVar = bVarI;
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wlk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bmk.e(str, str3, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
