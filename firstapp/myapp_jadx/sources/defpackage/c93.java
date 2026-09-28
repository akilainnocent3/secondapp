package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.bethistory.presentation.dialog.a;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c93 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                int iOrdinal = aVar.b.ordinal();
                if (iOrdinal == 0) {
                    BetDialogResult.Void r5 = BetDialogResult.Void.a;
                    aVar.c = r5;
                    aVar.m0();
                    aVar.getParentFragmentManager().m0("bet_status_result_details", vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_RESULT, r5)));
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    aVar.c = null;
                    aVar.m0();
                    aVar.getParentFragmentManager().m0("bet_status_result_details", vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_RESULT, null), new Pair("mode", aVar.b)));
                }
                aVar.dismiss();
                return;
            case 1:
                azm azmVar = ((PartnerWithdrawRequestDetailsActivity) obj).c;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return;
                } else {
                    Intrinsics.n("router");
                    throw null;
                }
            default:
                int i2 = SearchView.T;
                ((SearchView) obj).f();
                return;
        }
    }
}
