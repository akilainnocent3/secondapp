package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m05 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m05(Object obj, int i) {
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
                bookingCodePanel.L.d(AnalyticsEvent.CODE_HUB_BETSLIP_CLICKED);
                sh8.c().e(o7d.a(wae.CODE_HUB));
                bookingCodePanel.R.finish();
                break;
            default:
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = (MyFavoriteSummaryActivity) obj;
                int i3 = MyFavoriteSummaryActivity.w;
                if (!TextUtils.equals(myFavoriteSummaryActivity.v, "PreMatchMyFavoriteActivity")) {
                    izw.b("MyFavoriteSummaryActivity");
                } else {
                    myFavoriteSummaryActivity.finish();
                }
                break;
        }
    }
}
