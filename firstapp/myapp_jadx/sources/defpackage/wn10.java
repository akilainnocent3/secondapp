package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wn10 {
    public static final void a(final gr10 gr10Var, Function0<Unit> function0, a aVar, final int i) {
        final Function0<Unit> function1;
        float f;
        d.a aVar2;
        gr10Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(2116568235);
        int i2 = i | (bVarI.M(gr10Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar3 = d.a.b;
            d dVarG = h.g(aVar3, 32.0f, 20.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.playtime_control__removed_24_hours_first_desc, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVarI), bVarI, 0, 0, 131066);
            b bVar = bVarI;
            String str = gr10Var.a;
            if (str == null) {
                bVar.N(-259534046);
                bVar.X(false);
                f = 16.0f;
                aVar2 = aVar3;
            } else {
                hnw.a(bVar, -259534045, aVar3, 16.0f, bVar);
                f = 16.0f;
                aVar2 = aVar3;
                lkf0.d(str, null, c68.a(R.color.text_type1_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVar), bVar, 0, 0, 131066);
                bVar = bVar;
                bVar.X(false);
            }
            ty0.a(bVar, j.i(aVar2, f));
            b bVar2 = bVar;
            lkf0.d(cb40.a(R.string.playtime_control__removed_24_hours_second_desc, new Object[0], bVar), null, c68.a(R.color.text_type1_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVar), bVar2, 0, 0, 131066);
            bVarI = bVar2;
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            d dVarG2 = j.g(aVar2, 1.0f);
            String strA = cb40.a(R.string.common_functions__ok, new Object[0], bVarI);
            uxs uxsVar = gr10Var.c;
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                function1 = function0;
                objY = new xl5(function1, 1);
                bVarI.r(objY);
            } else {
                function1 = function0;
            }
            aza.a(dVarG2, strA, uxsVar, null, null, null, null, null, (Function0) objY, null, bVarI, 6, 760);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: vn10
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wn10.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
