package defpackage;

import android.app.Dialog;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aq9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Dialog dialog = (Dialog) obj;
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        dialog.getClass();
        String strA = cb40.a(R.string.personal_page__max_following_reached_title, new Object[0], aVar);
        String strA2 = cb40.a(R.string.personal_page__max_following_reached_text, new Object[0], aVar);
        boolean zA = aVar.A(dialog);
        Object objY = aVar.y();
        if (zA || objY == a.C0041a.a) {
            objY = new bvn(dialog, 2);
            aVar.r(objY);
        }
        nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
        return Unit.a;
    }
}
