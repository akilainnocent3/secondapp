package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z570 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final c670 c670Var, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        yka.a.d dVar;
        yka.a.C1350a c1350a;
        yka.a.b bVar2;
        d.a aVar2;
        float f;
        boolean z;
        float f2;
        int i3;
        float f3;
        androidx.compose.runtime.d dVar2;
        androidx.compose.runtime.d dVar3;
        d.a aVar3;
        tsr.a aVar4;
        boolean z2;
        yka.a.C1350a c1350a2;
        b bVar3;
        c670Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-613431978);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(c670Var) : bVarI.A(c670Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d dVar4 = oib0.a;
            long j = ((lib0) bVarI.O(dVar4)).i0;
            d.a aVar5 = d.a.b;
            zk40.a aVar6 = zk40.a;
            d dVarJ = h.j(androidx.compose.foundation.a.b(aVar5, j, aVar6), 10.0f, 1.0f, 10.0f, 0.0f, 8);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wxp(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarJ, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB2 = androidx.compose.foundation.a.b(ls7.a(j.i(j.g(aVar5, 1.0f), 24.0f), j060.c(((zib0) bVarI.O(ajb0.a)).c)), ((lib0) bVarI.O(dVar4)).A, aVar6);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar4);
            hlh0.a(bVarI, ne00VarS2, dVar5);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a3);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            boolean z3 = c670Var.a;
            n54.b bVar5 = ht.a.l;
            if (z3) {
                bVarI.N(699589782);
                dVar = dVar5;
                c1350a = c1350a3;
                f3 = 24.0f;
                bVar2 = bVar4;
                i3 = 0;
                f2 = 28.0f;
                f = 1.0f;
                aVar2 = aVar5;
                z = true;
                h6n.b(erz.a(R.drawable.ic__arrow_chevron_left, 0, bVarI), "Show previous head to head stats", g3w.h(j.r(h.f(androidx.compose.foundation.d.d(ls7.a(h.h(new VerticalAlignElement(bVar5), 2.0f, 0.0f, 2), j060.a), false, null, null, function0, 15), 2.0f), 20.0f), "head_to_head_stats_left_arrow_icon"), ((lib0) bVarI.O(dVar4)).Q, bVarI, 48, 0);
                bVarI.X(false);
            } else {
                dVar = dVar5;
                c1350a = c1350a3;
                bVar2 = bVar4;
                aVar2 = aVar5;
                f = 1.0f;
                z = true;
                f2 = 28.0f;
                i3 = 0;
                f3 = 24.0f;
                bVarI.N(700239759);
                ty0.a(bVarI, j.t(aVar2, 28.0f, 24.0f));
                bVarI.X(false);
            }
            ResourceUiText resourceUiText = c670Var.c;
            androidx.compose.runtime.d dVar6 = AndroidCompositionLocals_androidKt.b;
            String strG = resourceUiText.g((Context) bVarI.O(dVar6));
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarH = g3w.h(new LayoutWeightElement(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, z), "head_to_head_stats_title_text");
            long j2 = ((lib0) bVarI.O(dVar4)).a;
            gdf0 gdf0Var = new gdf0(3);
            androidx.compose.runtime.d dVar7 = kjb0.a;
            androidx.compose.runtime.d dVar8 = dVar6;
            lkf0.d(strG, dVarH, j2, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(dVar7)).n, bVarI, 0, 0, 130040);
            b bVar6 = bVarI;
            if (c670Var.b) {
                bVar6.N(700713687);
                aVar3 = aVar2;
                aVar4 = aVar7;
                boolean z4 = i3;
                dVar8 = dVar8;
                h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, i3, bVar6), "Show next head to head stats", g3w.h(j.r(h.f(androidx.compose.foundation.d.d(ls7.a(h.h(new VerticalAlignElement(bVar5), 2.0f, 0.0f, 2), j060.a), false, null, null, function1, 15), 2.0f), 20.0f), "head_to_head_stats_right_arrow_icon"), ((lib0) bVar6.O(dVar4)).Q, bVar6, 48, 0);
                bVar6.X(z4);
                dVar2 = dVar7;
                dVar3 = dVar4;
                z2 = z4;
            } else {
                dVar2 = dVar7;
                dVar3 = dVar4;
                aVar3 = aVar2;
                float f4 = f2;
                boolean z5 = i3;
                aVar4 = aVar7;
                bVar6.N(701362703);
                ty0.a(bVar6, j.t(aVar3, f4, f3));
                bVar6.X(z5);
                z2 = z5;
            }
            bVar6.X(true);
            d dVarH2 = g3w.h(aVar3, "head_to_head_stats_content");
            aiv aivVarC = g75.c(ht.a.a, z2);
            androidx.compose.runtime.d dVar9 = dVar3;
            int iHashCode3 = Long.hashCode(bVar6.T);
            ne00 ne00VarS3 = bVar6.S();
            d dVarC3 = c.c(bVar6, dVarH2);
            bVar6.D();
            if (bVar6.S) {
                bVar6.F(aVar4);
            } else {
                bVar6.p();
            }
            hlh0.a(bVar6, aivVarC, bVar2);
            yka.a.d dVar10 = dVar;
            hlh0.a(bVar6, ne00VarS3, dVar10);
            if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode3))) {
                c1350a2 = c1350a;
                n30.a(iHashCode3, bVar6, iHashCode3, c1350a2);
            } else {
                c1350a2 = c1350a;
            }
            hlh0.a(bVar6, dVarC3, cVar);
            l670 l670Var = c670Var.d;
            if (l670Var instanceof w670) {
                bVar6.N(-150709206);
                r7j0.d(h.g(aVar3, 10.0f, 8.0f), ((w670) l670Var).a, bVar6, 6);
                bVar6.X(false);
                bVar3 = bVar6;
            } else if (l670Var instanceof b670) {
                bVar6.N(-150397470);
                gp1.a(h.g(aVar3, 10.0f, 8.0f), ((b670) l670Var).a, bVar6, 6);
                bVar6.X(false);
                bVar3 = bVar6;
            } else if (l670Var instanceof t670) {
                bVar6.N(-150032538);
                d dVarG = h.g(j.g(aVar3, 1.0f), 10.0f, 8.0f);
                kw0.i iVar = new kw0.i(8.0f, true, new hw0());
                n54.a aVar8 = ht.a.n;
                i78 i78VarA2 = g78.a(iVar, aVar8, bVar6, 54);
                int iHashCode4 = Long.hashCode(bVar6.T);
                ne00 ne00VarS4 = bVar6.S();
                d dVarC4 = c.c(bVar6, dVarG);
                bVar6.D();
                if (bVar6.S) {
                    bVar6.F(aVar4);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, i78VarA2, bVar2);
                hlh0.a(bVar6, ne00VarS4, dVar10);
                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVar6, iHashCode4, c1350a2);
                }
                hlh0.a(bVar6, dVarC4, cVar);
                t670 t670Var = (t670) l670Var;
                rlv.a(null, t670Var.a, bVar6, 0);
                qcn<klv> qcnVar = t670Var.b;
                Object[] objArr = {String.valueOf(qcnVar.size())};
                StringUiText stringUiText = vch0.a;
                lkf0.d(new ResourceUiText(R.string.page_instant_virtual__last_vnum_matches, ay0.S(objArr)).g((Context) bVar6.O(dVar8)), new HorizontalAlignElement(aVar8), ((lib0) bVar6.O(dVar9)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar6.O(dVar2)).n, bVar6, 0, 0, 131064);
                b bVar7 = bVar6;
                nlv.a(null, qcnVar, bVar7, 64);
                bVar7.X(true);
                bVar7.X(false);
                bVar3 = bVar7;
            } else {
                if (!(l670Var instanceof p670)) {
                    throw igf0.a(bVar6, -697600112, false);
                }
                bVar6.N(-148906928);
                hor.a(h.g(aVar3, 10.0f, 8.0f), ((p670) l670Var).a, bVar6, 6);
                bVar6.X(false);
                bVar3 = bVar6;
            }
            bVar3.X(true);
            bVar3.X(true);
            bVar = bVar3;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y570
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    z570.a(c670Var, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
