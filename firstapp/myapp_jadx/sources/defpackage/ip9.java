package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class ip9 {
    public static final op8 a = new op8(1950260410, new ep9(), false);
    public static final op8 b = new op8(1178790834, new fp9(), false);
    public static final op8 c = new op8(667469925, new gp9(), false);
    public static final op8 d = new op8(770863728, new hp9(), false);

    public static final void a(Function0 function0, a aVar, int i) {
        Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(-303712239);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            v910.a(cb40.a(R.string.common_functions__error, new Object[0], bVarI), cb40.a(R.string.common_feedback__something_went_wrong_tip, new Object[0], bVarI), cb40.a(R.string.common_functions__ok, new Object[0], bVarI), null, function1, null, function0, false, bVarI, ((i2 << 12) & 57344) | ((i2 << 18) & 3670016), 168);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new omi(function1, i, 1);
        }
    }
}
