package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vq9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.icon_outright_search, 0, aVar), cb40.a(R.string.common_functions__search, new Object[0], aVar), j.r(h.j(d.a.b, 11.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f), c68.a(R.color.text_type1_secondary, aVar), aVar, 384, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
