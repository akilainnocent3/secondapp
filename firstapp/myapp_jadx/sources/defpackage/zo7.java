package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.stp.clabe.d;
import com.sportybet.android.globalpay.stp.clabe.f;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zo7 {

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f fVar = (f) this.receiver;
            fVar.i.c(((cp7) fVar.a.getValue()).e);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object value;
            f fVar = (f) this.receiver;
            wwd0 wwd0Var = fVar.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, cp7.a((cp7) value, false, uxs.LOADING, 31)));
            ej5.c(o8i0.d(fVar), null, null, new d(fVar, null), 3);
            return Unit.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final String str, Function0 function0) {
        final Function0 function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(1173421404);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = h.g(androidx.compose.foundation.a.b(ls7.a(j.g(aVar2, 1.0f), j060.c(4.0f)), c68.a(R.color.bg_surface_primary, bVarI), zk40.a), 20.0f, 16.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            lkf0.d(pwo.e(R.string.int_clabe, bVarI), h.j(aVar2, 0.0f, 0.0f, 12.0f, 0.0f, 11), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            lkf0.d(str, h.j(aVar2, 0.0f, 0.0f, 7.0f, 0.0f, 11), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H2_M, bVarI), bVarI, (i2 & 14) | 48, 0, 131064);
            bVarI = bVarI;
            function1 = function0;
            h6n.b(erz.a(R.drawable.icon_copy, 0, bVarI), pwo.e(R.string.common_functions__copy, bVarI), c9j.c(androidx.compose.foundation.d.d(j.r(aVar2, 13.0f), false, null, null, function0, 15), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "deposit__stp_copy_clabe_btn"), c68.a(R.color.text_secondary, bVarI), bVarI, 0, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function1) { // from class: wo7
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zo7.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, androidx.compose.runtime.a aVar, int i) {
        fVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1397344198);
        int i2 = (bVarI.A(fVar) ? 4 : 2) | i;
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            cp7 cp7Var = (cp7) wyh.c(fVar.b, bVarI, 0, 7).getValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || bVarI.A(fVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                a aVar2 = new a(0, fVar, f.class, "onCopyClabe", "onCopyClabe()V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            Function0 function0 = (Function0) ((chp) objY);
            if (i3 != 4 && !bVarI.A(fVar)) {
                z = false;
            }
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new b(0, fVar, f.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                bVarI.r(objY2);
            }
            c(cp7Var, function0, (Function0) ((chp) objY2), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new to7(i, 0, fVar);
        }
    }

    public static final void c(cp7 cp7Var, Function0<Unit> function0, Function0<Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1536694079);
        int i2 = i | (bVarI.M(cp7Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar2 = zk40.a;
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = op70.c(h.f(j.e(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 1.0f), 20.0f), op70.a(bVarI), 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            d(cp7Var.c, cp7Var.b, bVarI, 0);
            ty0.a(bVarI, j.i(aVar3, 24.0f));
            a(i2 & 112, bVarI, cp7Var.e, function0);
            ty0.a(bVarI, j.i(aVar3, 24.0f));
            f(cp7Var.d, bVarI, 0);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            ac8.a(j.g(aVar3, 1.0f), bt.a, new nk0(pwo.e(R.string.page_payment__transaction_initiated_complete_in_your_bank, bVarI)), mla.l(R.style.B2_R, bVarI), R.drawable.ic_selection_status_not_started, bVarI, 54, 0);
            aza.a(c9j.c(hib0.a(aVar3, 20.0f, bVarI, aVar3, 1.0f), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "deposit__confirm_btn"), pwo.e(R.string.common_functions__done, bVarI), cp7Var.f, null, null, null, null, null, function1, null, bVarI, (i2 << 18) & 234881024, 760);
            bVarI = bVarI;
            bVarI.X(true);
            if (cp7Var.a) {
                bVarI.N(404596513);
                f330.a(0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(404627265);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new uo7(i, 0, function1, cp7Var, function0);
        }
    }

    public static final void d(String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        final String str3 = str;
        androidx.compose.runtime.b bVarI = aVar.i(663628274);
        int i2 = i | (bVarI.M(str3) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            h9n.a(erz.a(R.drawable.spei_by_stp_logo, 0, bVarI), null, j.w(aVar2, 105.0f), null, d0b.a.c, 0.0f, null, bVarI, 25008, 104);
            d040.a(1.0f, true, bVarI);
            lkf0.d(pwo.f(R.string.page_payment__deposit_amount_currency, new Object[]{tug.a("(", str2, ")")}, bVarI), h.j(aVar2, 0.0f, 0.0f, 2.0f, 0.0f, 11), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 48, 0, 131064);
            str3 = str;
            lkf0.d(str3, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, i2 & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str3, str2, i) { // from class: vo7
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zo7.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, nk0 nk0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final nk0 nk0Var2 = nk0Var;
        androidx.compose.runtime.b bVarI = aVar.i(-812477354);
        int i2 = i | (bVarI.M(nk0Var2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.r(h.j(aVar2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 16.0f), c68.a(R.color.bg_surface_secondary, bVarI), j060.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(str, null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 6, 0, 131066);
            bVarI.X(true);
            nk0Var2 = nk0Var;
            lkf0.e(nk0Var2, null, c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, mla.m(16.0f, bVarI), 0, false, 0, 0, null, null, null, bVarI, (i2 >> 3) & 14, 0, 522234);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, nk0Var2, i) { // from class: yo7
                public final /* synthetic */ String a;
                public final /* synthetic */ nk0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    zo7.e(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final String str, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(554722574);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            kw0.k kVar = kw0.c;
            n54.a aVar2 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = c.c(bVarI, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lkf0.d(pwo.e(R.string.page_payment__payment_steps, bVarI), h.j(h.j(aVar3, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0.0f, 0.0f, 0.0f, 14.0f, 7), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            i78 i78VarA2 = g78.a(new kw0.i(16.0f, true, new hw0()), aVar2, bVar, 6);
            int iHashCode2 = Long.hashCode(bVar.T);
            ne00 ne00VarS2 = bVar.S();
            androidx.compose.ui.d dVarC2 = c.c(bVar, aVar3);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar4);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, i78VarA2, bVar2);
            hlh0.a(bVar, ne00VarS2, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            }
            hlh0.a(bVar, dVarC2, cVar);
            e("1", g(cb40.a(R.string.page_payment__stp_payment_step_1, new Object[0], bVar), bVar), bVar, 6);
            e("2", g(cb40.a(R.string.page_payment__stp_payment_step_2, new Object[]{str}, bVar), bVar), bVar, 6);
            e("3", g(cb40.a(R.string.page_payment__stp_payment_step_3, new Object[0], bVar), bVar), bVar, 6);
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: xo7
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zo7.f(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nk0 g(String str, androidx.compose.runtime.a aVar) {
        ora0 ora0Var;
        ora0 ora0Var2 = new ora0(0L, mla.m(12.0f, aVar), (t9i) null, (n9i) null, (o9i) null, f8i.b, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65501);
        s9e0.a.getClass();
        nk0 nk0VarB = s9e0.b(str);
        nk0.b bVar = new nk0.b((Object) null);
        bVar.l(ora0Var2);
        bVar.g(nk0VarB.b);
        bVar.h();
        Iterable<nk0.d> iterable = nk0VarB.c;
        if (iterable == null) {
            iterable = m2g.a;
        }
        for (nk0.d dVar : iterable) {
            T t = dVar.a;
            int i = dVar.c;
            int i2 = dVar.b;
            t9i t9iVar = ((ora0) t).c;
            t9i t9iVar2 = t9i.E;
            if (Intrinsics.g(t9iVar, t9iVar2)) {
                ora0Var = ora0Var2;
                bVar.d(ora0.a(ora0Var, 0L, t9iVar2, null, null, 65531), i2, i);
            } else {
                ora0Var = ora0Var2;
            }
            n9i n9iVar = ((ora0) dVar.a).d;
            if (n9iVar != null && n9iVar.a == 1) {
                bVar.d(ora0.a(ora0Var, 0L, null, new n9i(1), null, 65527), i2, i);
            }
            ora0Var2 = ora0Var;
        }
        return bVar.m();
    }
}
