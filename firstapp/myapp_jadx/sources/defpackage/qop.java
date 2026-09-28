package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qop implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qop(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                KeyboardView keyboardView = (KeyboardView) obj;
                int i2 = KeyboardView.b0;
                int i3 = keyboardView.O;
                if (i3 == 1) {
                    keyboardView.O = 2;
                } else if (i3 == 2) {
                    keyboardView.O = 1;
                }
                keyboardView.H();
                break;
            default:
                OfflineRequestListActivity offlineRequestListActivity = (OfflineRequestListActivity) obj;
                int i4 = OfflineRequestListActivity.E;
                offlineRequestListActivity.b.K();
                offlineRequestListActivity.A1();
                break;
        }
    }
}
