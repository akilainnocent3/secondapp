package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bd9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            StringUiText stringUiText = vch0.a;
            d.a.C0390a c0390a = new d.a.C0390a(new StringUiText("13 Apr 05:59"), new StringUiText("NGN 500.00"));
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new cd9();
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new dd9(0);
                aVar.r(objY2);
            }
            h.a(null, c0390a, function0, (Function0) objY2, aVar, 3456);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
