package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ezv {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(-1528791311);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            nzj.b(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), cb40.a(R.string.common_feedback__something_went_wrong_tip, new Object[0], bVarI), null, null, null, null, null, null, null, null, function0, function0, null, bVarI, 0, ((i2 << 3) & 112) | ((i2 << 6) & 896), 10233);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: dzv
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ezv.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
