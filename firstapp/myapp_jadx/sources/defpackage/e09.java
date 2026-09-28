package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e09 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            g75.a(androidx.compose.foundation.a.b(j.i(j.w(h.j(d.a.b, 0.0f, 16.0f, 0.0f, 0.0f, 13), 31.0f), 2.0f), c68.a(R.color.border_secondary, aVar), j060.c(8.0f)), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
