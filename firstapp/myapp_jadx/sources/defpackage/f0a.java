package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0a implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((m75) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            h9n.a(erz.a(R.drawable.ic__gift, 0, aVar), "gift", g3w.h(h.f(j.r(d.a.b, 24.0f), 4.0f), "virtual_lobby_gift_icon"), null, d0b.a.g, 0.0f, new gf4(c68.a(R.color.text_type2_primary, aVar), 5), aVar, 25008, 40);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
