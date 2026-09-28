package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class xsa {
    public static final void a(final ysa ysaVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, a aVar, final int i) {
        ysaVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(1288390592);
        int i2 = i | (bVarI.M(ysaVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            u60.a(function0, new yle(false, false, 3), pp8.b(-374407223, new Function2() { // from class: tsa
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v13 */
                /* JADX WARN: Type inference failed for: r6v8 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    d.a aVar2;
                    tsa tsaVar;
                    int i3;
                    Unit unit;
                    tsr.a aVar3;
                    yka.a.C1350a c1350a;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar5 = d.a.b;
                        d dVarF = g3w.f(j.e(aVar5, 1.0f), true, function0);
                        Object objY = aVar4.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new vsa();
                            aVar4.r(objY);
                        }
                        d dVarB = xa80.b(dVarF, false, (Function1) objY);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC = c.c(aVar4, dVarB);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar4, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar4, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar4, dVarC, cVar);
                        d dVarG = j.g(aVar5, 1.0f);
                        long jA = c68.a(R.color.bg_primary_d_base, aVar4);
                        zk40.a aVar7 = zk40.a;
                        d dVarB2 = androidx.compose.foundation.a.b(dVarG, jA, aVar7);
                        Object objY2 = aVar4.y();
                        if (objY2 == c0042a) {
                            objY2 = new wsa();
                            aVar4.r(objY2);
                        }
                        d dVarF2 = g3w.f(dVarB2, true, (Function0) objY2);
                        n54.a aVar8 = ht.a.m;
                        kw0.k kVar = kw0.c;
                        i78 i78VarA = g78.a(kVar, aVar8, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO2 = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarF2);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA, bVar);
                        hlh0.a(aVar4, ne00VarO2, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, cVar);
                        d dVarJ = h.j(h.h(j.g(aVar5, 1.0f), 12.0f, 0.0f, 2), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        i78 i78VarA2 = g78.a(kVar, ht.a.n, aVar4, 48);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO3 = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarJ);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, bVar);
                        hlh0.a(aVar4, ne00VarO3, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC3, cVar);
                        lkf0.d(cb40.a(R.string.component_betslip__confirm_to_pay, new Object[0], aVar4), null, c68.a(R.color.text_primary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 0, 0, 131066);
                        ysa ysaVar2 = ysaVar;
                        lkf0.d(ysaVar2.a, g3w.h(aVar5, "confirm_dialog_pay_amount_text"), c68.a(R.color.text_primary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_SB, aVar4), aVar4, 48, 0, 131064);
                        a aVar9 = aVar4;
                        UiText uiText = ysaVar2.b;
                        if (uiText == null) {
                            aVar9.N(578481576);
                            aVar9.H();
                        } else {
                            aVar9.N(578481577);
                            lkf0.d(uiText.g((Context) aVar9.O(AndroidCompositionLocals_androidKt.b)), g3w.h(h.j(aVar5, 0.0f, 4.0f, 0.0f, 0.0f, 13), "confirm_dialog_pay_amount_detail_text"), c68.a(R.color.text_primary, aVar9), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar9), aVar9, 48, 0, 131064);
                            aVar9 = aVar9;
                            Unit unit2 = Unit.a;
                            aVar9.H();
                        }
                        aVar9.s();
                        dqk dqkVar = ysaVar2.c;
                        if (dqkVar == null) {
                            aVar9.N(-656694422);
                            aVar9.H();
                            tsaVar = this;
                            unit = null;
                            aVar2 = aVar5;
                            i3 = 0;
                        } else {
                            aVar9.N(-656694421);
                            aVar2 = aVar5;
                            tsaVar = this;
                            i3 = 0;
                            cqk.a(k78.a(ht.a.o, h.j(aVar5, 0.0f, 12.0f, 8.0f, 8.0f, 1)), dqkVar, function1, aVar9, 0);
                            Unit unit3 = Unit.a;
                            aVar9.H();
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            aVar9.N(-2099381292);
                            ty0.a(aVar9, j.r(aVar2, 24.0f));
                        } else {
                            aVar9.N(-2099394529);
                        }
                        aVar9.H();
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar9, i3);
                        int iHashCode4 = Long.hashCode(aVar9.m());
                        ne00 ne00VarO4 = aVar9.o();
                        d dVarC4 = c.c(aVar9, aVar2);
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar3 = aVar6;
                            aVar9.F(aVar3);
                        } else {
                            aVar3 = aVar6;
                            aVar9.p();
                        }
                        hlh0.a(aVar9, d160VarA, bVar);
                        hlh0.a(aVar9, ne00VarO4, dVar);
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode4))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode4, aVar9, iHashCode4, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar9, dVarC4, cVar);
                        d dVarI = j.i(aVar2, 48.0f);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarH = g3w.h(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), c68.a(R.color.bg_inverse_secondary, aVar9), aVar7), false, null, null, function2, 15), "confirm_dialog_cancel_button");
                        n54 n54Var = ht.a.e;
                        aiv aivVarC2 = g75.c(n54Var, i3);
                        int iHashCode5 = Long.hashCode(aVar9.m());
                        ne00 ne00VarO5 = aVar9.o();
                        d dVarC5 = c.c(aVar9, dVarH);
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar9.F(aVar3);
                        } else {
                            aVar9.p();
                        }
                        hlh0.a(aVar9, aivVarC2, bVar);
                        hlh0.a(aVar9, ne00VarO5, dVar);
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar9, iHashCode5, c1350a);
                        }
                        hlh0.a(aVar9, dVarC5, cVar);
                        yka.a.C1350a c1350a3 = c1350a;
                        a aVar10 = aVar9;
                        tsr.a aVar11 = aVar3;
                        lkf0.d(cb40.a(R.string.common_functions__cancel, new Object[i3], aVar9), null, c68.a(R.color.text_inverse_primary, aVar9), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar9), aVar10, 0, 0, 131066);
                        aVar10.s();
                        d dVarI2 = j.i(aVar2, 48.0f);
                        if (2.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarH2 = g3w.h(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI2.n(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), c68.a(R.color.bg_brand_sub_primary_d_base, aVar10), aVar7), false, null, null, function3, 15), "confirm_dialog_confirm_button");
                        aiv aivVarC3 = g75.c(n54Var, false);
                        int iHashCode6 = Long.hashCode(aVar10.m());
                        ne00 ne00VarO6 = aVar10.o();
                        d dVarC6 = c.c(aVar10, dVarH2);
                        if (aVar10.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar10.D();
                        if (aVar10.g()) {
                            aVar10.F(aVar11);
                        } else {
                            aVar10.p();
                        }
                        hlh0.a(aVar10, aivVarC3, bVar);
                        hlh0.a(aVar10, ne00VarO6, dVar);
                        if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode6))) {
                            j3c.a(iHashCode6, aVar10, iHashCode6, c1350a3);
                        }
                        hlh0.a(aVar10, dVarC6, cVar);
                        lkf0.d(cb40.a(R.string.common_functions__confirm, new Object[0], aVar10), null, c68.a(R.color.text_inverse_primary, aVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar10), aVar10, 0, 0, 131066);
                        aVar10.s();
                        aVar10.s();
                        aVar10.s();
                        aVar10.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, i) { // from class: usa
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xsa.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
