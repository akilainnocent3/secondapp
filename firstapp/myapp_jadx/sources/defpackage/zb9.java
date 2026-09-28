package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zb9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h9n.a(erz.a(R.drawable.progress_background, 0, aVar), "bg", g.c(j.t(d.a.b, 426.0f, 538.0f), -109.0f, 105.0f), null, null, 0.0f, null, aVar, 432, 120);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
