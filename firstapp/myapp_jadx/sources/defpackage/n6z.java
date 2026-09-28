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

/* JADX INFO: loaded from: classes5.dex */
public final class n6z {
    public static final void a(UiText uiText, UiText uiText2, Function0<Unit> function0, a aVar, int i) {
        b bVar;
        uiText.getClass();
        uiText2.getClass();
        function0.getClass();
        b bVarI = aVar.i(1625998686);
        int i2 = i | (bVarI.M(uiText) ? 4 : 2) | (bVarI.M(uiText2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            bVar = bVarI;
            nzj.b(null, uiText.g((Context) bVarI.O(qyd0Var)), uiText2.g((Context) bVarI.O(qyd0Var)), null, null, null, cb40.a(R.string.common_functions__ok, new Object[0], bVarI), null, null, null, null, function0, function0, null, bVar, 0, ((i2 >> 3) & 112) | (i2 & 896), 10169);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new efu(i, 1, function0, uiText, uiText2);
        }
    }
}
