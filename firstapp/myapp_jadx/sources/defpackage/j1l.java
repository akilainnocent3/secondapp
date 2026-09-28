package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class j1l {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final void a(final UiText uiText, final Function0 function0, a aVar, final int i) {
        uiText.getClass();
        function0.getClass();
        b bVarI = aVar.i(-2030886933);
        int i2 = i | (bVarI.M(uiText) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            nzj.b(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), vch0.a(uiText, bVarI), null, null, null, null, null, null, null, null, function0, function0, null, bVarI, 0, (i2 & 112) | ((i2 << 3) & 896), 10233);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: l2k0
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j1l.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final eae0 b(String str) {
        str.getClass();
        return new eae0(str);
    }
}
