package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t49 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h9n.a(erz.a(R.drawable.wd_close_icon, 0, aVar), "Dismiss", null, null, null, 0.0f, new gf4(j58.f, 5), aVar, 1572912, 60);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
