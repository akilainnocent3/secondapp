package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d2a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h9n.a(erz.a(R.drawable.spr_ic_keyboard_arrow_left_black_24dp, 0, aVar), null, null, null, null, 0.0f, new gf4(c68.a(R.color.white, aVar), 5), aVar, 48, 60);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
