package defpackage;

import android.os.CountDownTimer;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class ohj extends CountDownTimer {
    public final /* synthetic */ GameActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohj(GameActivity gameActivity) {
        super(30000L, 1000L);
        this.a = gameActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i = GameActivity.H;
        this.a.w1(true, true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        GameActivity gameActivity = this.a;
        gameActivity.w.setBtnCashOutText(gameActivity.getString(R.string.sg_common_functions_game_countdown_cash_out, String.valueOf((int) (j / 1000))));
    }
}
