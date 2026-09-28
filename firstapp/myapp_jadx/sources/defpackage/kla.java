package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kla {
    public static final void a(final int i, final op8 op8Var, a aVar) {
        Object obj;
        b bVarI = aVar.i(1142933672);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            Configuration configuration = (Configuration) bVarI.O(chfVar);
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) bVarI.O(qyd0Var);
            boolean zM = bVarI.M(configuration);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                obj = objY;
                Configuration configuration2 = new Configuration(configuration);
                configuration2.uiMode = (configuration2.uiMode & (-49)) | 32;
                bVarI.r(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            boolean zM2 = bVarI.M(context) | bVarI.M(configuration3);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = context.createConfigurationContext(configuration3);
                bVarI.r(objY2);
            }
            Context context2 = (Context) objY2;
            j730 j730VarA = chfVar.a(configuration3);
            context2.getClass();
            hna.b(new j730[]{j730VarA, qyd0Var.a(context2)}, op8Var, bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var) { // from class: zka
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    kla.a(qj40.a(7), this.a, (a) obj2);
                    return Unit.a;
                }
            };
        }
    }

    public static final float b(String str, olf0 olf0Var, imf0 imf0Var, a aVar) {
        str.getClass();
        olf0Var.getClass();
        imf0Var.getClass();
        return mla.f((int) (olf0.a(olf0Var, str, imf0Var, 0L, 1020).c >> 32), aVar);
    }
}
