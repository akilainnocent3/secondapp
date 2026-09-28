package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vqe {
    public static final void a(final int i, final op8 op8Var, a aVar) {
        b bVarI = aVar.i(-242242918);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            qyd0 qyd0Var = kna.q;
            jmf0 jmf0Var = (jmf0) bVarI.O(qyd0Var);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new tqe(jmf0Var);
                bVarI.r(objY);
            }
            hna.a(qyd0Var.a((tqe) objY), op8Var, bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var) { // from class: uqe
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vqe.a(qj40.a(7), this.a, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
