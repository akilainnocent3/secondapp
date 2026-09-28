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
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rlo {
    public static final void a(final slo sloVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, a aVar, final int i) {
        b bVar;
        sloVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(509745953);
        int i2 = i | (bVarI.M(sloVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarB = v8j0.b(g3w.c(d.a.b));
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            qyd0 qyd0Var = ajb0.a;
            bVar = bVarI;
            v1w.a(function0, dVarB, j590VarG, 0.0f, false, j060.e(((zib0) bVarI.O(qyd0Var)).d, ((zib0) bVarI.O(qyd0Var)).d, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, 0L, n79.a, null, null, pp8.b(-1951313917, new gaj() { // from class: nlo
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        rlo.b(sloVar, function1, function2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i2 >> 3) & 14, 3078, 7064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: olo
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rlo.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final slo sloVar, Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        final Function0<Unit> function2;
        final Function0<Unit> function3 = function1;
        b bVarI = aVar.i(-123005970);
        int i2 = (bVarI.M(sloVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function3) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new plo(0);
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarB = xa80.b(aVar2, false, (Function1) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            ResourceUiText resourceUiText = sloVar.a;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            lkf0.d(resourceUiText.g((Context) bVarI.O(qyd0Var)), g3w.h(h.j(new LayoutWeightElement(1.0f, true), fjb0.d(bVarI).h, 0.0f, 14.0f, 0.0f, 10), "instant_win_selection_description_bottom_sheet_title_text"), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).d, bVarI, 0, 0, 131064);
            h6n.b(erz.a(R.drawable.ic__cancel, 0, bVarI), "Close selection description", j.r(h.f(androidx.compose.foundation.d.d(ls7.a(h.j(aVar2, 0.0f, 0.0f, 22.0f, 0.0f, 11), j060.a), false, null, null, function0, 15), fjb0.d(bVarI).b), 16.0f), fjb0.b(bVarI).P, bVarI, 48, 0);
            bVarI.X(true);
            lkf0.d(sloVar.b.g((Context) bVarI.O(qyd0Var)), h.h(h.j(aVar2, 0.0f, fjb0.d(bVarI).c, 0.0f, 0.0f, 13), fjb0.d(bVarI).h, 0.0f, 2), fjb0.b(bVarI).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).l, bVarI, 0, 0, 131064);
            function2 = function0;
            function3 = function1;
            xya.b(g3w.h(h.g(j.g(aVar2, 1.0f), fjb0.d(bVarI).h, fjb0.d(bVarI).f), "instant_win_selection_description_bottom_sheet_ok_button"), false, null, sya.b, null, 0.0f, null, function3, n79.b, bVarI, 100663296 | ((i3 << 15) & 29360128), 118);
            bVarI.X(true);
        } else {
            function2 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qlo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    rlo.b(sloVar, function2, function3, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
