package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class lpi {
    public static final /* synthetic */ int a = 0;

    public static final void a(final koi koiVar, a aVar, final int i) {
        b bVarI = aVar.i(1488426905);
        int i2 = (bVarI.M(koiVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zM = bVarI.M(context);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                objY = ((noi) qag.a(applicationContext, noi.class)).S();
                bVarI.r(objY);
            }
            ((roi) objY).a(koiVar, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: uoi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lpi.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(rdd0 rdd0Var, psm psmVar, pdd0 pdd0Var, k00[] k00VarArr, Function1 function1) {
        rdd0Var.getClass();
        psmVar.getClass();
        pdd0Var.getClass();
        if (((Boolean) function1.invoke(psmVar)).booleanValue()) {
            rdd0Var.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
        }
    }
}
