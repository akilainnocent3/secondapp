package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v3k0 {
    public static final void a(final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        b bVar;
        b bVarA = v2g.a(function0, function1, aVar, 804055146);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            float f = d1g0.a;
            qyd0 qyd0Var = oib0.a;
            bVar = bVarA;
            c1g0 c1g0VarC = d1g0.c(((lib0) bVarA.O(qyd0Var)).H0, 0L, ((lib0) bVarA.O(qyd0Var)).a0, ((lib0) bVarA.O(qyd0Var)).o, ((lib0) bVarA.O(qyd0Var)).a0, 0L, bVar, 34);
            rth rthVarA = r8j0.a(0, 14);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            vp0.a(b2a.a, j.i(u8j0.a(d.a.b, q8j0.a.a(bVar).f), 44.0f), pp8.b(-1000088413, new Function2() { // from class: t3k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c6n.a(function0, g3w.h(d.a.b, "back_button"), false, null, null, b2a.b, aVar2, 1572912, 60);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar), pp8.b(-679265702, new jgz(function1, 1), bVar), 0.0f, rthVarA, c1g0VarC, bVar, 3462, 144);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0, function1) { // from class: u3k0
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = function0;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    v3k0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
