package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
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
public final class v0r {
    public static final void a(final int i, final int i2, a aVar, final String str, final Function1 function1, boolean z) {
        boolean z2;
        int i3;
        final boolean z3;
        str.getClass();
        function1.getClass();
        b bVarI = aVar.i(640912128);
        int i4 = (bVarI.M(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (bVarI.b(z2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            final boolean z4 = i5 != 0 ? false : z2;
            final View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zA = ((i3 & 112) == 32) | bVarI.A(view);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: s0r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Window window;
                        ViewParent parent = view.getParent();
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        if (emeVar != null && (window = emeVar.getWindow()) != null) {
                            window.setWindowAnimations(R.style.AnimBottom);
                            if (z4) {
                                window.clearFlags(2);
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.dimAmount = 0.0f;
                                window.setAttributes(attributes);
                            }
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
            String strA = cb40.a(R.string.common_helps__how_to_play, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            boolean z5 = z4;
            lkf0.d(strA, dVarG, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).b, bVarI, 48, 0, 131064);
            lkf0.d(str, j.g(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).l, bVarI, (i3 & 14) | 48, 0, 131064);
            bVarI = bVarI;
            d dVarJ = h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            boolean z6 = (i3 & 896) == 256;
            Object objY2 = bVarI.y();
            if (z6 || objY2 == c0042a) {
                objY2 = new t0r(function1, 0);
                bVarI.r(objY2);
            }
            ddd0.a(dVarJ, false, null, null, null, false, null, null, (Function0) objY2, ja9.a, bVarI, 805306374, 254);
            bVarI.X(true);
            z3 = z5;
        } else {
            bVarI.G();
            z3 = z2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u0r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v0r.a(qj40.a(i | 1), i2, (a) obj, str, function1, z3);
                    return Unit.a;
                }
            };
        }
    }
}
