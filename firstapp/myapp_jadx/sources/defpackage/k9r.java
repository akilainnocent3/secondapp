package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k9r implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                sx70.e eVar = (sx70.e) obj4;
                gwr gwrVar = (gwr) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gwrVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.M(gwrVar) ? 4 : 2;
                }
                if (aVar2.q(1 & iIntValue, (iIntValue & 19) != 18)) {
                    lkf0.d(cb40.a(R.string.page_lucky_numbers__results_count_hint, new Object[]{Integer.valueOf(eVar.b)}, aVar2), h.j(gwrVar.c(aVar, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6)), 8.0f, 12.0f, 0.0f, 8.0f, 4), ((lib0) aVar2.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).j, aVar2, 0, 0, 131064);
                } else {
                    aVar2.G();
                }
                break;
            default:
                h0s h0sVar = (h0s) obj4;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    hxs hxsVar = h0sVar.d().c;
                    aVar3.N(-87740837);
                    ty0.a(aVar3, j.i(aVar, 1.0f));
                    aVar3.H();
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
