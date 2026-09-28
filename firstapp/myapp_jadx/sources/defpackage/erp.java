package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class erp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ erp(d dVar, int i) {
        this.a = 0;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                grp.b((d) obj3, (a) obj, qj40.a(1));
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                fu2 fu2VarS0 = ((kab0) obj3).s0();
                PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(fu2VarS0), null, null, new ut2(fu2VarS0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                break;
            default:
                dlp dlpVar = (dlp) obj3;
                a aVar = (a) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ihj0.a((WithdrawAlertHintStatus) wyh.c(dlpVar.K0, aVar, 0, 7).getValue(), false, new umz(0.0f, 0.0f, 0.0f, 0.0f), aVar, 384, 2);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ erp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
