package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class k850 {
    public static final void a(final UiText uiText, final Function1<? super i04, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        uiText.getClass();
        function1.getClass();
        b bVarI = aVar.i(1655333241);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__streak_repair);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new i850(function1, 0);
                bVarI.r(objY);
            }
            z45.c cVar = new z45.c(new w45.c(resourceUiText2, "streak_repair_dialog_ok_button", (Function0) objY));
            boolean z2 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new x7s(function1, 1);
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jib0.d(null, resourceUiText, null, 0L, 0L, 0L, null, null, cVar, null, null, null, (Function0) objY2, null, null, null, pp8.b(1006811419, new suw(uiText), bVarI), bVar, 0, 1572864, 61181);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j850
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    k850.a(uiText, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
