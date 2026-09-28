package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pw8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j040) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            g75.a(androidx.compose.foundation.a.b(lx80.d(j.r(d.a.b, 18.0f), 4.0f, null, false, 0L, 0L, 30), c68.a(R.color.brand_quaternary, aVar), j060.a), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
