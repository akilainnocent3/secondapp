package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class uye0 implements gaj<j58, a, Integer, Unit> {
    public final /* synthetic */ boolean a;

    public uye0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gaj
    public final Unit invoke(j58 j58Var, a aVar, Integer num) {
        long j = j58Var.a;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.e(j) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = this.a;
            d.a aVar3 = d.a.b;
            if (z) {
                aVar2.N(-446775936);
                h9n.a(erz.a(R.drawable.wd_infinite, 0, aVar2), "-", j.r(aVar3, 17.78f), null, null, 0.0f, new gf4(j, 5), aVar2, 432, 56);
                aVar2.H();
            } else {
                aVar2.N(-446496099);
                wye0.a(h.f(aVar3, 5.0f), c.c(vue0.X0.i, new String[0], aVar2), new imf0(j, i7f.b(10.0f, aVar2), new t9i(700), null, null, 0L, null, null, 0, i7f.b(10.0f, aVar2), null, null, 16646136), aVar2, 6);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
