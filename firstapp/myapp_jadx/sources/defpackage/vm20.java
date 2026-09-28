package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vm20 {
    public static final void a(boolean z, Function2 function2, a aVar, int i) {
        int i2;
        b bVarI = aVar.i(-642000585);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            ytw ytwVarC = m.c(function2, bVarI);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                nna nnaVar = new nna(xvf.i(e.a, bVarI));
                bVarI.r(nnaVar);
                objY = nnaVar;
            }
            v5b v5bVar = ((nna) objY).a;
            Object objY2 = bVarI.y();
            Object obj = objY2;
            if (objY2 == c0042a) {
                Function2<? super lyh<sr1>, ? super v1b<? super Unit>, ? extends Object> function3 = (Function2) ytwVarC.getValue();
                qm20 qm20Var = new qm20(z);
                qm20Var.d = v5bVar;
                qm20Var.e = function3;
                bVarI.r(qm20Var);
                obj = qm20Var;
            }
            qm20 qm20Var2 = (qm20) obj;
            boolean zM = bVarI.M((Function2) ytwVarC.getValue()) | bVarI.M(v5bVar);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                qm20Var2.e = (Function2) ytwVarC.getValue();
                qm20Var2.d = v5bVar;
                bVarI.r(Unit.a);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = ((i2 & 14) == 4) | bVarI.A(qm20Var2);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new rm20(qm20Var2, z, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY4);
            nny nnyVarA = odt.a(bVarI);
            if (nnyVarA == null) {
                ib5.a("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            iny onBackPressedDispatcher = nnyVarA.getOnBackPressedDispatcher();
            ibs ibsVar = (ibs) bVarI.O(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zA2 = bVarI.A(onBackPressedDispatcher) | bVarI.A(ibsVar) | bVarI.A(qm20Var2);
            Object objY5 = bVarI.y();
            if (zA2 || objY5 == c0042a) {
                objY5 = new tm20(onBackPressedDispatcher, ibsVar, qm20Var2);
                bVarI.r(objY5);
            }
            xvf.a(ibsVar, onBackPressedDispatcher, (Function1) objY5, bVarI);
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new um20(z, function2, i);
        }
    }
}
