package defpackage;

import android.view.View;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n05 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n05(Object obj, int i) {
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
                if (!bookingCodePanel.I.isLogin()) {
                    bookingCodePanel.N.a();
                } else {
                    mg40 mg40Var = new mg40();
                    BetslipActivity betslipActivity = bookingCodePanel.R;
                    if (betslipActivity != null) {
                        mg40Var.show(betslipActivity.getSupportFragmentManager(), "recentCode");
                    }
                }
                break;
            default:
                int i3 = MyFavoriteSummaryActivity.w;
                MyFavoriteBaseActivity.z1((MyFavoriteSummaryActivity) obj, MyFavoriteTypeEnum.MY_ODDS_RANGE);
                break;
        }
    }
}
