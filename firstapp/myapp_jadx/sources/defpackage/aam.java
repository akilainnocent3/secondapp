package defpackage;

import android.view.View;
import com.sportygames.roulette.activities.HistoryActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class aam implements View.OnClickListener {
    public final /* synthetic */ HistoryActivity a;

    public aam(HistoryActivity historyActivity) {
        this.a = historyActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = HistoryActivity.S;
        View view2 = this.a.I;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
