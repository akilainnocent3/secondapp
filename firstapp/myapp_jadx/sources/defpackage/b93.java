package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.bethistory.presentation.dialog.a;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b93 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ b93(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BetDialogResult betDialogResult;
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                a aVar = (a) onCreateContextMenuListener;
                int iOrdinal = aVar.b.ordinal();
                if (iOrdinal == 0) {
                    betDialogResult = BetDialogResult.Lost.a;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    betDialogResult = BetDialogResult.Unsettled.a;
                }
                aVar.c = betDialogResult;
                aVar.m0();
                aVar.getParentFragmentManager().m0("bet_status_result_details", vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_RESULT, betDialogResult)));
                aVar.dismiss();
                return;
            case 1:
                ab8 ab8Var = (ab8) onCreateContextMenuListener;
                TextView textView = ab8Var.N;
                if (textView == null) {
                    Intrinsics.n("classicHeader");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = ab8Var.L;
                if (textView2 == null) {
                    Intrinsics.n("ouHeader");
                    throw null;
                }
                textView2.setEnabled(true);
                TextView textView3 = ab8Var.M;
                if (textView3 == null) {
                    Intrinsics.n("rangeHeader");
                    throw null;
                }
                textView3.setEnabled(true);
                ab8Var.a();
                ab8Var.Q.j(Boolean.TRUE);
                return;
            default:
                int i2 = PartnerWithdrawRequestDetailsActivity.w;
                ((PartnerWithdrawRequestDetailsActivity) onCreateContextMenuListener).finish();
                return;
        }
    }
}
