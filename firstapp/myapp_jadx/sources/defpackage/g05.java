package defpackage;

import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g05 implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g05(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BookingCodePanel bookingCodePanel = (BookingCodePanel) obj2;
                lk50 lk50Var = (lk50) obj;
                int i2 = BookingCodePanel.e0;
                if (lk50Var instanceof lk50.c) {
                    bookingCodePanel.M.c.a();
                    bookingCodePanel.H((Boolean) ((lk50.c) lk50Var).a);
                } else if (lk50Var instanceof lk50.b) {
                    bookingCodePanel.M.c.d();
                } else if (lk50Var instanceof lk50.a) {
                    bookingCodePanel.M.c.a();
                    bookingCodePanel.H(Boolean.FALSE);
                }
                break;
            default:
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = (MyFavoriteSummaryActivity) obj2;
                int i3 = MyFavoriteSummaryActivity.w;
                myFavoriteSummaryActivity.f.setDescription(myFavoriteSummaryActivity.z1((String) obj));
                break;
        }
    }
}
