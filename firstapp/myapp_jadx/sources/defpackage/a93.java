package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.bethistory.presentation.dialog.a;
import com.sportybet.plugin.realsports.data.Event;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a93 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ a93(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
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
                    betDialogResult = BetDialogResult.Won.a;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    betDialogResult = BetDialogResult.Settled.a;
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
                textView.setEnabled(true);
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
                textView3.setEnabled(false);
                ab8Var.a();
                ab8Var.P.j(Boolean.TRUE);
                return;
            default:
                com.sportybet.android.bookingcode.presentation.activity.a aVar2 = (com.sportybet.android.bookingcode.presentation.activity.a) onCreateContextMenuListener;
                gkl gklVarN0 = aVar2.n0();
                String str = aVar2.y;
                if (str == null) {
                    Intrinsics.n(EventKeys.ERROR_CODE);
                    throw null;
                }
                List<? extends Event> list = aVar2.w;
                if (list != null) {
                    gklVarN0.x1(str, list, w8s.a);
                    return;
                } else {
                    Intrinsics.n("itemList");
                    throw null;
                }
        }
    }
}
