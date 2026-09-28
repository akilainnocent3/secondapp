package defpackage;

import android.app.Dialog;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wox implements gaj {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ wox(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final Dialog dialog = (Dialog) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        dialog.getClass();
        String strA = cb40.a(R.string.component_betslip__never_down_intro_title, new Object[0], aVar);
        String strA2 = cb40.a(R.string.component_betslip__never_down_intro_content, new Object[0], aVar);
        boolean zA = aVar.A(dialog);
        final Function0 function0 = this.a;
        boolean zM = zA | aVar.M(function0);
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            objY = new Function0() { // from class: xox
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    dialog.dismiss();
                    function0.invoke();
                    return Unit.a;
                }
            };
            aVar.r(objY);
        }
        nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
        return Unit.a;
    }
}
