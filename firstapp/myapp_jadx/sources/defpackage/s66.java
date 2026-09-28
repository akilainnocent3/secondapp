package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class s66 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;

    public s66(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            int iIntValue3 = ((Number) this.a.get(iIntValue)).intValue();
            aVar2.N(-376128025);
            d.a aVar3 = d.a.b;
            if (iIntValue3 == 1) {
                aVar2.N(-376119594);
                ty0.a(aVar2, j.i(aVar3, fw20.a(R.dimen._8sdp, aVar2)));
            } else {
                aVar2.N(-389767375);
            }
            aVar2.H();
            b96.a(c.a(j.g(aVar3, 1.0f), 2.0f), aVar2, 6);
            if (iIntValue3 == this.b) {
                aVar2.N(-375774378);
                ty0.a(aVar2, j.i(aVar3, fw20.a(R.dimen._8sdp, aVar2)));
            } else {
                aVar2.N(-389767375);
            }
            aVar2.H();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
