package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wv9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((m75) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            h9n.a(erz.a(R.drawable.sg_collection, 0, aVar), "collection", j.r(d.a.b, 16.0f), null, null, 0.0f, new gf4(j58.f, 5), aVar, 1573296, 56);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
