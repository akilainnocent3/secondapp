package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m010 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m010(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 3;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                zt2 zt2VarM0 = ((m410) obj3).M0();
                PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(zt2VarM0), null, null, new ot2(zt2VarM0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                break;
            default:
                final TxSuccessActivity txSuccessActivity = (TxSuccessActivity) obj3;
                a aVar = (a) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = TxSuccessActivity.A;
                int i4 = 2;
                if (aVar.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    irj0 irj0Var = (irj0) txSuccessActivity.z.getValue();
                    boolean zA = aVar.A(txSuccessActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: h8h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                bf bfVar = txSuccessActivity.i;
                                if (bfVar != null) {
                                    bfVar.P.setVisibility(8);
                                    return Unit.a;
                                }
                                Intrinsics.n("binding");
                                throw null;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(txSuccessActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: i8h0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = TxSuccessActivity.A;
                                TxSuccessActivity txSuccessActivity2 = txSuccessActivity;
                                azm azmVarZ1 = txSuccessActivity2.z1();
                                bnh0 bnh0Var = txSuccessActivity2.d;
                                if (bnh0Var == null) {
                                    Intrinsics.n("urlCreator");
                                    throw null;
                                }
                                azm.c(azmVarZ1, bnh0.d(bnh0Var, new String[]{"my_accounts/transactions/materials_upload"}, u.a("from", "withdraw"), 4), null, null, 6);
                                f00 f00Var = vgb0.a;
                                vgb0.b(AnalyticsEvent.NIN_VERIFICATION_DONT_HAVE_NIN_CLICKED, (Bundle) txSuccessActivity2.f.getValue());
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(txSuccessActivity);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new a7i(txSuccessActivity, i2);
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA4 = aVar.A(txSuccessActivity);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new b7i(txSuccessActivity, i4);
                        aVar.r(objY4);
                    }
                    noj0.c(null, function0, function1, function2, (Function0) objY4, irj0Var, aVar, 262144);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
