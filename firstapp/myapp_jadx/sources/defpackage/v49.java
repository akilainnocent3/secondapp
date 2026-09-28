package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v49 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            g75.a(androidx.compose.foundation.a.b(ls7.a(j.t(h.j(d.a.b, 0.0f, 12.0f, 0.0f, 18.0f, 5), 32.0f, 2.0f), j060.c(8.0f)), c68.a(R.color.line_type2_secondary, aVar), zk40.a), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
