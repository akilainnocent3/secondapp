package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.feature.inappreview.c;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cdn implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cdn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(c.e.a);
                return Unit.a;
            default:
                TxSuccessActivity txSuccessActivity = (TxSuccessActivity) obj;
                bf bfVar = txSuccessActivity.i;
                if (bfVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                bfVar.P.setVisibility(0);
                ((irj0) txSuccessActivity.z.getValue()).y1();
                f00 f00Var = vgb0.a;
                vgb0.b(AnalyticsEvent.WITHDRAWAL_REVIEW_VERIFY_NIN_CLICKED, (Bundle) txSuccessActivity.f.getValue());
                return Unit.a;
        }
    }
}
