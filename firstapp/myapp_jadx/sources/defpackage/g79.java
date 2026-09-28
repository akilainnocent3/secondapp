package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.vip.data.LastHeroStandingListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g79 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(androidx.compose.foundation.a.b(ls7.a(j.t(h.j(d.a.b, 0.0f, 12.0f, 0.0f, 10.0f, 5), 32.0f, 2.0f), j060.c(((zib0) aVar.O(ajb0.a)).d)), ((lib0) aVar.O(oib0.a)).B, zk40.a), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                LastHeroStandingListResponse lastHeroStandingListResponse = (LastHeroStandingListResponse) obj2;
                lastHeroStandingListResponse.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(lastHeroStandingListResponse.getCashoutCoefficient());
                sb.append('-');
                sb.append(iIntValue2);
                return sb.toString();
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new qdk((mum) qn70Var.a(jq40.a(mum.class), null, null));
        }
    }
}
