package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 {
    public static final void a(final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(2064964257);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            b(dVar, op8Var, bVarI, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ac0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ic0.a(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(771959668);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.a(null, epx.a);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new cc0(ytwVar, 0);
                bVarI.r(objY2);
            }
            hna.a(ref0.b.a(c((Function0) objY2, bVarI, 0)), pp8.b(-291176396, new gc0(dVar, ytwVar, op8Var), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ic0.b(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final xb0 c(Function0 function0, a aVar, int i) {
        View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        boolean zM = aVar.M(view);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (zM || objY == obj) {
            objY = new xb0(view, null, function0);
            aVar.r(objY);
        }
        final xb0 xb0Var = (xb0) objY;
        boolean zA = aVar.A(xb0Var);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj) {
            objY2 = new Function1() { // from class: bc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    xb0 xb0Var2 = xb0Var;
                    xb0Var2.e.e();
                    return new hc0(xb0Var2);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(xb0Var, (Function1) objY2, aVar);
        return xb0Var;
    }
}
