package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.StringUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hs9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            StringUiText stringUiText = vch0.a;
            StringUiText stringUiText2 = new StringUiText("Confirm Action");
            iyf0 iyf0Var = iyf0.a;
            zs7 zs7Var = new zs7(6, ((cjb0) aVar.O(ejb0.a)).f);
            StringUiText stringUiText3 = new StringUiText("Continue");
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ds9();
                aVar.r(objY);
            }
            w45.c cVarA = w45.a.a(stringUiText3, null, (Function0) objY, 6);
            StringUiText stringUiText4 = new StringUiText("Go Back");
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new es9();
                aVar.r(objY2);
            }
            z45.d dVar = new z45.d(cVarA, w45.a.b(stringUiText4, (Function0) objY2));
            Object objY3 = aVar.y();
            if (objY3 == c0042a) {
                objY3 = new fs9();
                aVar.r(objY3);
            }
            jib0.e(null, stringUiText2, 0L, iyf0Var, zs7Var, dVar, null, null, (Function0) objY3, null, ns9.i, aVar, 100666368, 6, 709);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
