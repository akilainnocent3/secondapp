package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class q4e0 {
    public static final void a(final r4e0 r4e0Var, final Function1<? super i04, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        r4e0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(556171567);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(r4e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVar = bVarI;
            bVar.G();
        } else if (r4e0Var instanceof r4e0.a) {
            bVarI.N(-1076480789);
            String strA = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
            UiText uiText = ((r4e0.a) r4e0Var).a;
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new w56(function1, 3);
                bVarI.r(objY);
            }
            nzj.b(null, strA, strG, null, null, null, null, null, null, null, null, null, (Function0) objY, null, bVarI, 0, 0, 12281);
            bVar = bVarI;
            bVar.X(false);
        } else {
            bVar = bVarI;
            if (!r4e0Var.equals(r4e0.b.a)) {
                throw igf0.a(bVar, 1904935309, false);
            }
            bVar.N(-1076157583);
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    q4e0.a(r4e0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
