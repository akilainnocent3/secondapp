package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class fi50 {

    public static final class a implements jbs {
        public final /* synthetic */ so10 a;
        public final /* synthetic */ ytw b;

        public a(obs obsVar, so10 so10Var, ytw ytwVar) {
            this.a = so10Var;
            this.b = ytwVar;
        }

        @Override // defpackage.jbs
        public final void a() {
            this.b.setValue(Boolean.valueOf(this.a.Q()));
        }
    }

    public static final void a(final so10 so10Var, androidx.compose.runtime.a aVar, final int i) {
        so10Var.getClass();
        b bVarI = aVar.i(-1379611904);
        int i2 = (bVarI.A(so10Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zA = bVarI.A(so10Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: di50
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        obs obsVar = (obs) obj;
                        obsVar.getClass();
                        ytw ytwVar2 = ytwVar;
                        boolean zBooleanValue = ((Boolean) ytwVar2.getValue()).booleanValue();
                        so10 so10Var2 = so10Var;
                        if (zBooleanValue && !so10Var2.Q()) {
                            so10Var2.d();
                            so10Var2.T();
                        }
                        so10Var2.n(((Boolean) ytwVar2.getValue()).booleanValue());
                        return new fi50.a(obsVar, so10Var2, ytwVar2);
                    }
                };
                bVarI.r(objY2);
            }
            zas.b(so10Var, null, (Function1) objY2, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: ei50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fi50.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
