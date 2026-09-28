package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gr9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarJ = g3w.j(h.j(d.a.b, 0.0f, ((cjb0) aVar.O(ejb0.a)).i, 0.0f, 0.0f, 13), 14);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.component_two_fa__secure_dialog_title);
            iyf0 iyf0Var = iyf0.b;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_two_fa__secure_dialog_primary_action);
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new yr9();
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function0.getClass();
            z45.d dVar = new z45.d(new w45.c("bottom_sheet_primary_button", resourceUiText2, uxsVar, m2gVar, function0), new w45.b(ns9.l));
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new zr9();
                aVar.r(objY2);
            }
            jib0.e(dVarJ, resourceUiText, 0L, iyf0Var, null, dVar, null, null, (Function0) objY2, null, ns9.m, aVar, 100690944, 6, 708);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
