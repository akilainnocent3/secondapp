package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.StringUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qr9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            StringUiText stringUiText = vch0.a;
            StringUiText stringUiText2 = new StringUiText("Loyalty Streak Boost");
            iyf0 iyf0Var = iyf0.a;
            zs7 zs7Var = new zs7(6, ((cjb0) aVar.O(ejb0.a)).f);
            StringUiText stringUiText3 = new StringUiText("OK");
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new bs9(0);
                aVar.r(objY);
            }
            Function0 function0 = (Function0) objY;
            uxs uxsVar = uxs.ENABLE;
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function0.getClass();
            z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", stringUiText3, uxsVar, m2gVar, function0));
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new cs9(0);
                aVar.r(objY2);
            }
            jib0.e(null, stringUiText2, 0L, iyf0Var, zs7Var, cVar, null, null, (Function0) objY2, null, ns9.g, aVar, 100666368, 6, 709);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
