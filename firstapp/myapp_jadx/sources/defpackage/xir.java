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
public final class xir {
    public static final void a(final int i, a aVar, final String str, Function0 function0) {
        int i2;
        final Function0 function1 = function0;
        b bVarA = mzj.a(723111658, aVar, str, function1);
        if ((i & 6) == 0) {
            i2 = i | (bVarA.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarA.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarA, 54);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarA, dVarC, yka.a.d, 1.0f, false);
            imf0 imf0Var = ((ijb0) bVarA.O(kjb0.a)).o;
            qyd0 qyd0Var = oib0.a;
            lkf0.d(str, layoutWeightElementA, ((lib0) bVarA.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, bVarA, i3 & 14, 24960, 110584);
            bVarA = bVarA;
            function1 = function0;
            h6n.b(erz.a(R.drawable.ic_me_play_info, 0, bVarA), "info_icon", androidx.compose.foundation.d.d(ls7.a(h.f(j.r(aVar2, 12.0f), 1.0f), j060.a), false, null, null, mla.d(function1, bVarA, i3 & 112), 15), ((lib0) bVarA.O(qyd0Var)).P, bVarA, 48, 0);
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wir
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xir.a(qj40.a(i | 1), (a) obj, str, function1);
                    return Unit.a;
                }
            };
        }
    }
}
