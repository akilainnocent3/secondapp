package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_keyboard_arrow_right_black_24dp, 0, aVar), cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], aVar), null, 0L, aVar, 0, 12);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
