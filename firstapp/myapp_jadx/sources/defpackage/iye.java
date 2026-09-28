package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iye {
    public static final /* synthetic */ int a = 0;

    public static final void a(final int i, final op8 op8Var, a aVar) {
        b bVarI = aVar.i(1237531397);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ot50(j58.f, new nt50(0.4f, 0.4f, 0.4f, 0.4f));
                bVarI.r(objY);
            }
            hna.a(ut50.a.a((ot50) objY), pp8.b(-1475486139, new a520(op8Var, 1), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var) { // from class: qui0
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iye.a(qj40.a(7), this.a, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
