package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n010 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n010(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                zt2 zt2VarM0 = ((m410) obj3).M0();
                PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(zt2VarM0), null, null, new ot2(zt2VarM0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                break;
            default:
                TxSuccessActivity txSuccessActivity = (TxSuccessActivity) obj3;
                a aVar = (a) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i2 = TxSuccessActivity.A;
                int i3 = 1;
                if (aVar.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new j8h0();
                        aVar.r(objY);
                    }
                    d dVarH = g3w.h(xa80.b(d.a.b, false, (Function1) objY), "withdraw_verify_nin_btn");
                    String strA = cb40.a(R.string.page_payment__verify_nin, new Object[0], aVar);
                    boolean zA = aVar.A(txSuccessActivity);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new cdn(txSuccessActivity, i3);
                        aVar.r(objY2);
                    }
                    vuc0.b(dVarH, false, null, null, null, strA, null, null, null, null, (Function0) objY2, aVar, 0, 0, 990);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
