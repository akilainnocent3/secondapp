package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.android.cashoutphase3.CashOutTeamInfoView;

/* JADX INFO: loaded from: classes5.dex */
public final class ns6 implements g6i0 {
    public final CashOutTeamInfoView a;
    public final TextView b;
    public final TextView c;

    public ns6(CashOutTeamInfoView cashOutTeamInfoView, TextView textView, TextView textView2) {
        this.a = cashOutTeamInfoView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
