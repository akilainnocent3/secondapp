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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yh2 {
    public static final void a(final int i, a aVar, final d dVar, final String str, Function0 function0) {
        final Function0 function1;
        b bVarI = aVar.i(538109101);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarJ = h.j(d35.a(j.i(j.g(dVar, 1.0f), 32.0f), 1.0f, c68.a(R.color.line_type2_secondary, bVarI), j060.c(2.0f)), 12.0f, 0.0f, 10.0f, 0.0f, 10);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new vh2(0);
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarJ, false, (Function1) objY), "bet_builder_selection_item_container");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            lkf0.d(str, new LayoutWeightElement(1.0f, true), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, (i2 >> 3) & 14, 24960, 110584);
            bVarI = bVarI;
            d.a aVar3 = d.a.b;
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            crz crzVarA = erz.a(R.drawable.spr_ic_cancel_bordered, 0, bVarI);
            d dVarR = j.r(aVar3, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                function1 = function0;
                objY2 = new wh2(function1, 0);
                bVarI.r(objY2);
            } else {
                function1 = function0;
            }
            h6n.b(crzVarA, "remove selection", g3w.h(h.f(androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY2, 15), 2.0f), "bet_builder_selection_item_remove_icon"), c68.a(R.color.text_type2_secondary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str, function1) { // from class: xh2
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
                    yh2.a(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
