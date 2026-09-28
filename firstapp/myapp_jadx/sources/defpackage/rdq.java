package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rdq {
    public static final void a(Function1<? super nvp, Unit> function1, a aVar, final int i) {
        int i2;
        final Function1<? super nvp, Unit> function2;
        function1.getClass();
        b bVarI = aVar.i(66237137);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.A(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zA = bVarI.A(view);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: odq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ViewParent parent = view.getParent();
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        Window window = emeVar != null ? emeVar.getWindow() : null;
                        if (window != null) {
                            window.setWindowAnimations(R.style.AnimBottom);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
            d.a aVar2 = d.a.b;
            d dVarW = j.w(aVar2, 320.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarF = h.f(androidx.compose.foundation.a.b(dVarW, ((lib0) bVarI.O(qyd0Var)).i0, j060.c(8.0f)), 24.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.o, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarG = j.g(aVar2, 1.0f);
            String strA = cb40.a(R.string.component_betslip__gift_unavailable, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, dVarG, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).a, bVarI, 48, 0, 131064);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__gift_unavailable_message, new Object[0], bVarI), j.g(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).l, bVarI, 48, 0, 131064);
            bVarI = bVarI;
            d dVarJ = h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                function2 = function1;
                objY2 = new pdq(function2, 0);
                bVarI.r(objY2);
            } else {
                function2 = function1;
            }
            ddd0.a(dVarJ, false, null, null, null, false, null, null, (Function0) objY2, d99.a, bVarI, 805306374, 254);
            bVarI.X(true);
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qdq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    rdq.a(function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
