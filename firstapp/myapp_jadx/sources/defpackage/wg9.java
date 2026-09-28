package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wg9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e160) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            lkf0.d(cb40.a(R.string.page_notification_center__dialog_allow, new Object[0], aVar), null, 0L, null, d2l.f(14), null, t9i.C, null, 0L, null, null, d2l.f(20), 0, false, 0, 0, null, null, aVar, 1597440, 48, 260014);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
