package defpackage;

import android.content.Intent;
import android.view.View;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c05 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c05(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BookingCodePanel bookingCodePanel = (BookingCodePanel) obj;
                int i2 = BookingCodePanel.e0;
                yrh0.s(bookingCodePanel.getContext(), new Intent(bookingCodePanel.getContext(), (Class<?>) MultiMakerActivity.class), true);
                ((BetslipActivity) bookingCodePanel.getContext()).finish();
                break;
            default:
                int i3 = MyFavoriteSummaryActivity.w;
                ((MyFavoriteSummaryActivity) obj).onBackPressed();
                break;
        }
    }
}
