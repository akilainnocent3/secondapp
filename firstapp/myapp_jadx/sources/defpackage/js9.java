package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.StringUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class js9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            StringUiText stringUiText = vch0.a;
            StringUiText stringUiText2 = new StringUiText("Mission complete! Bet now with your ₦200 free bet in Casino.");
            iyf0 iyf0Var = iyf0.a;
            qyd0 qyd0Var = ejb0.a;
            zs7 zs7Var = new zs7(6, ((cjb0) aVar.O(qyd0Var)).f);
            z45.b bVar = z45.b.a;
            h55 h55VarA = h55.a.a(null, h.a(3, 0.0f, 0.0f), null, null, aVar, 13);
            m65 m65VarA = m65.a.a(((cjb0) aVar.O(qyd0Var)).f, 0.0f, 0.0f, 0.0f, aVar, 14);
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new ur9();
                aVar.r(objY);
            }
            jib0.e(null, stringUiText2, 0L, iyf0Var, zs7Var, bVar, m65VarA, h55VarA, (Function0) objY, null, ns9.j, aVar, 100862976, 6, 517);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
