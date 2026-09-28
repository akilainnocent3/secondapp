package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.android.bookingcode.presentation.activity.a;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class za8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ za8(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
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
                textView2.setEnabled(false);
                TextView textView3 = ab8Var.M;
                if (textView3 == null) {
                    Intrinsics.n("rangeHeader");
                    throw null;
                }
                textView3.setEnabled(true);
                ab8Var.a();
                ab8Var.O.j(Boolean.TRUE);
                return;
            case 1:
                a aVar = (a) onCreateContextMenuListener;
                gkl gklVarN0 = aVar.n0();
                String str = aVar.y;
                if (str == null) {
                    Intrinsics.n(EventKeys.ERROR_CODE);
                    throw null;
                }
                List<? extends Event> list = aVar.w;
                if (list != null) {
                    gklVarN0.x1(str, list, w8s.b);
                    return;
                } else {
                    Intrinsics.n("itemList");
                    throw null;
                }
            default:
                PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity = (PartnerWithdrawRequestDetailsActivity) onCreateContextMenuListener;
                int i2 = PartnerWithdrawRequestDetailsActivity.w;
                buz buzVar = (buz) partnerWithdrawRequestDetailsActivity.v.getValue();
                String str2 = partnerWithdrawRequestDetailsActivity.f;
                if (str2 != null) {
                    ej5.c(o8i0.d(buzVar), null, null, new wtz(buzVar, str2, null), 3);
                    return;
                } else {
                    Intrinsics.n("tradeId");
                    throw null;
                }
        }
    }
}
