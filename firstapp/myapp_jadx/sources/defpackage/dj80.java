package defpackage;

import android.view.View;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.activities.SettingsActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dj80 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = SettingsActivity.i;
        SportyGamesManager.getInstance().gotoSportyBet(xae.C, null);
    }
}
