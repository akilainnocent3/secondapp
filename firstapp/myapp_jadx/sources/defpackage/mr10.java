package defpackage;

import android.content.Context;
import androidx.compose.animation.f;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class mr10 {
    public static final php[] a = new php[0];
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final void a(final int i, final int i2, op8 op8Var, a aVar, boolean z) {
        int i3;
        final op8 op8Var2;
        final boolean z2;
        b bVarI = aVar.i(122784593);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            t9g t9gVarF = f.f(yi0.e(i, 0, null, 6), 2);
            gzg0 gzg0VarE = yi0.e(i, 0, null, 6);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new fj0();
                bVarI.r(objY);
            }
            t9g t9gVarB = t9gVarF.b(f.p(gzg0VarE, (Function1) objY));
            owg owgVarG = f.g(yi0.e(i, 0, null, 6), 2);
            gzg0 gzg0VarE2 = yi0.e(i, 0, null, 6);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new gj0();
                bVarI.r(objY2);
            }
            op8Var2 = op8Var;
            z2 = z;
            hh0.e(z2, null, t9gVarB, owgVarG.b(f.t(gzg0VarE2, (Function1) objY2)), null, op8Var2, bVarI, ((i3 >> 3) & 14) | ((i3 << 9) & 458752), 18);
        } else {
            op8Var2 = op8Var;
            z2 = z;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    mr10.a(i, iA, op8Var2, (a) obj, z2);
                    return Unit.a;
                }
            };
        }
    }

    public static final phx b(Context context) {
        context.getClass();
        phx phxVar = new phx(context);
        igx igxVar = phxVar.b;
        wkx wkxVar = igxVar.t;
        wkxVar.a(new rga(wkxVar));
        wkx wkxVar2 = igxVar.t;
        wkxVar2.a(new sga());
        wkxVar2.a(new vle());
        return phxVar;
    }

    public static final phx c(vkx[] vkxVarArr, a aVar) {
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(vkxVarArr, vkxVarArr.length);
        int i = 1;
        uv60 uv60Var = new uv60(new gee(context, i), new qhx());
        boolean zA = aVar.A(context);
        Object objY = aVar.y();
        if (zA || objY == a.C0041a.a) {
            objY = new g6j(context, i);
            aVar.r(objY);
        }
        phx phxVar = (phx) o350.d(objArrCopyOf, uv60Var, (Function0) objY, aVar, 0, 4);
        for (vkx vkxVar : vkxVarArr) {
            phxVar.b.t.a(vkxVar);
        }
        return phxVar;
    }
}
