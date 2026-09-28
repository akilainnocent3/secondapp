package defpackage;

import android.app.Dialog;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class if9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final Dialog dialog = (Dialog) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        dialog.getClass();
        String strA = cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], aVar);
        String strA2 = cb40.a(R.string.common_feedback__please_try_again_later, new Object[0], aVar);
        boolean zA = aVar.A(dialog);
        Object objY = aVar.y();
        if (zA || objY == a.C0041a.a) {
            objY = new Function0() { // from class: jf9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    dialog.dismiss();
                    return Unit.a;
                }
            };
            aVar.r(objY);
        }
        nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
        return Unit.a;
    }
}
