package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.model.Balance;
import com.sportygames.sportysoccer.model.GameConfig;
import com.sportygames.sportysoccer.model.GameData;
import com.sportygames.sportysoccer.model.GameProbability;
import com.sportygames.sportysoccer.model.GameSession;
import com.sportygames.sportysoccer.model.LeaderBoard;
import com.sportygames.sportysoccer.model.LeaderBoardData;
import com.sportygames.sportysoccer.model.OngoingGameSessionData;
import com.sportygames.sportysoccer.model.StakeData;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lmj implements omj {
    public hpa0 a;
    public d3i0 b;
    public final WeakReference<moj> c;
    public int d;
    public int e;
    public List<Float> f;
    public List<StakeData> g;
    public final nmj h;
    public int i;
    public boolean j;
    public boolean k;
    public final GameActivity l;
    public String m;
    public String n;

    public lmj(GameActivity gameActivity, GameActivity gameActivity2, nmj nmjVar) {
        this.c = new WeakReference<>(gameActivity2);
        this.h = nmjVar;
        this.l = gameActivity;
        wij wijVarA = wij.a();
        wijVarA.b(gameActivity);
        this.a = wijVarA.c;
        this.b = wijVarA.d;
        this.k = nmjVar.i("tutorial_dialog_welcome");
        d("loading");
    }

    @Override // defpackage.omj
    public final void A() {
        if (this.j) {
            return;
        }
        d("game_ready");
        moj mojVar = this.c.get();
        if (mojVar != null) {
            mojVar.R0();
        }
    }

    public final Float a(int i) {
        List<Float> list = this.f;
        return Float.valueOf((list == null || i < 0 || i >= list.size()) ? 0.0f : this.f.get(i).floatValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b() {
        moj mojVar;
        String str = this.m;
        str.getClass();
        switch (str) {
            case "dialog":
                if (TextUtils.equals("cash_out_celebration", this.n) && (mojVar = this.c.get()) != null) {
                    mojVar.T0();
                }
                return true;
            case "stake":
                return false;
            case "game_ready":
                if (this.h.i("dialog_exit_game")) {
                    e("exit_warning", null);
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c(String str, Bundle bundle) {
        d("game_ready");
        moj mojVar = this.c.get();
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1700974857:
                if (str.equals("real_money_mode_practice")) {
                    b = 0;
                }
                break;
            case -729585971:
                if (str.equals("illegal_session")) {
                    b = 1;
                }
                break;
            case -302694803:
                if (str.equals("cash_out_celebration")) {
                    b = 2;
                }
                break;
            case -102180582:
                if (str.equals("real_money_mode_tutorial")) {
                    b = 3;
                }
                break;
            case 24414274:
                if (str.equals("cash_out")) {
                    b = 4;
                }
                break;
            case 83956091:
                if (str.equals("exit_warning")) {
                    b = 5;
                }
                break;
            case 1442073571:
                if (str.equals("auto_forfeit")) {
                    b = 6;
                }
                break;
        }
        nmj nmjVar = this.h;
        switch (b) {
            case 0:
            case 5:
                if (bundle != null && bundle.getBoolean("dialog_extra_exit_game", false) && mojVar != null) {
                    mojVar.T0();
                    break;
                }
                break;
            case 1:
            case 3:
                if (mojVar != null) {
                    mojVar.T0();
                }
                break;
            case 2:
            case 6:
                nmjVar.q(this);
                break;
            case 4:
                if (!bundle.getBoolean("dialog_extra_cash_out", true)) {
                    nmjVar.m(this);
                } else if (!bundle.getBoolean("dialog_extra_timeout", true)) {
                    nmjVar.l(this);
                } else {
                    nmjVar.j(this);
                }
                break;
        }
    }

    public final void d(String str) {
        this.m = str;
        this.n = null;
    }

    public final void e(String str, Bundle bundle) {
        this.m = "dialog";
        this.n = str;
        moj mojVar = this.c.get();
        if (mojVar != null) {
            if (TextUtils.equals("cash_out", str)) {
                mojVar.d0(bundle);
            } else {
                mojVar.e0(str, bundle);
            }
        }
    }

    @Override // defpackage.omj
    public final void m(int i) {
        d("loading");
        moj mojVar = this.c.get();
        if (mojVar != null) {
            mojVar.m(i);
        }
    }

    @Override // defpackage.omj
    public final void n(OngoingGameSessionData ongoingGameSessionData) {
        byte b;
        if (this.j) {
            return;
        }
        String userId = ongoingGameSessionData.getUserId();
        GameActivity gameActivity = this.l;
        wn20.e(gameActivity, "userSession", "open_net_user_id", userId);
        boolean zIsGameForfeited = ongoingGameSessionData.isGameForfeited();
        String id = ongoingGameSessionData.getId();
        if (TextUtils.isEmpty(id)) {
            b = 0;
        } else {
            b = TextUtils.equals(id, wn20.b(gameActivity, "gameSession", "game_session_id")) ? (byte) 1 : (byte) -1;
        }
        if (b == -1) {
            e("illegal_session", null);
            return;
        }
        nmj nmjVar = this.h;
        if (b != 0) {
            if (b != 1) {
                return;
            }
            nmjVar.o(this);
        } else if (zIsGameForfeited) {
            e("auto_forfeit", null);
        } else {
            nmjVar.q(this);
        }
    }

    @Override // defpackage.omj
    public final void o(GameConfig gameConfig) {
        if (this.j) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.l.getSharedPreferences("gameData", 0).getLong(zre.a() + "practice_real_money_dialog_timestamp", -1L);
        int i = this.d;
        nmj nmjVar = this.h;
        if (i >= 10 && nmjVar.i("practice_dialog_real_money_mode") && jCurrentTimeMillis > 3600000) {
            e("real_money_mode_practice", null);
            wn20.d(System.currentTimeMillis(), "gameData", zre.a() + "practice_real_money_dialog_timestamp", false, this.l);
        }
        this.d = 0;
        this.e = gameConfig.getStreak();
        this.g = gameConfig.getStakePayouts();
        nmjVar.k(this, 900);
    }

    @Override // defpackage.omj
    public final void p(LeaderBoard leaderBoard) {
        LeaderBoardData currentUser = leaderBoard.getCurrentUser();
        int score = currentUser != null ? currentUser.getScore() : 0;
        nmj nmjVar = this.h;
        nmjVar.p(score);
        nmjVar.a(this);
    }

    @Override // defpackage.omj
    public final void q() {
        if (this.j) {
            return;
        }
        this.h.k(this, 901);
    }

    @Override // defpackage.omj
    public final void r(GameSession gameSession) {
        GameActivity gameActivity;
        if (this.j || (gameActivity = this.l) == null) {
            return;
        }
        String id = gameSession.getId();
        nmj nmjVar = this.h;
        nmjVar.r(id, gameActivity);
        nmjVar.m(this);
    }

    @Override // defpackage.omj
    public final void s() {
        if (this.j) {
            return;
        }
        e("real_money_mode_tutorial", null);
    }

    @Override // defpackage.omj
    public final void t(mb5 mb5Var) {
        moj mojVar = this.c.get();
        if (mojVar != null) {
            mojVar.v0();
            mojVar.L0(mb5Var);
        }
    }

    @Override // defpackage.omj
    public final void u() {
        moj mojVar = this.c.get();
        if (mojVar != null) {
            mojVar.v0();
        }
    }

    @Override // defpackage.omj
    public final void v(GameProbability gameProbability) {
        moj mojVar;
        if (this.j || (mojVar = this.c.get()) == null) {
            return;
        }
        boolean result = gameProbability.getResult();
        nmj nmjVar = this.h;
        boolean zI = nmjVar.i("status_bar");
        boolean zI2 = nmjVar.i("tutorial_balls_layout");
        int i = this.d;
        int i2 = this.e;
        a(i - 1);
        mojVar.L(result, zI, zI2, i, i2, a(this.d).floatValue(), nmjVar.g());
    }

    @Override // defpackage.omj
    public final void w(Balance balance, int i) {
        if (this.j) {
            return;
        }
        nmj nmjVar = this.h;
        if (i == 900) {
            if (!nmjVar.i("page_stake")) {
                this.f = Collections.singletonList(Float.valueOf(0.0f));
                nmjVar.f("", this);
                return;
            }
            moj mojVar = this.c.get();
            if (mojVar != null) {
                mojVar.t0(balance.getBalance(), this.g);
            }
            hpa0 hpa0Var = this.a;
            if (hpa0Var != null) {
                hpa0Var.c();
            }
            d("stake");
            return;
        }
        if (i != 901) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("dialog_extra_is_max_streak", this.d == this.e);
        bundle.putFloat("dialog_extra_current_win_amount", a(this.d - 1).floatValue());
        bundle.putString("dialog_extra_balance", balance.getBalance());
        e("cash_out_celebration", bundle);
        hpa0 hpa0Var2 = this.a;
        if (hpa0Var2 != null) {
            hpa0Var2.c();
        }
        GameActivity gameActivity = this.l;
        if (gameActivity == null) {
            return;
        }
        nmjVar.b(gameActivity);
    }

    @Override // defpackage.omj
    public final void x() {
        GameActivity gameActivity = this.l;
        if (gameActivity == null) {
            return;
        }
        nmj nmjVar = this.h;
        nmjVar.b(gameActivity);
        if (this.j) {
            return;
        }
        nmjVar.q(this);
    }

    @Override // defpackage.omj
    public final void y(GameData gameData) {
        if (this.j) {
            return;
        }
        this.d = gameData.getWinningStreak();
        this.e = gameData.getStreak();
        this.f = gameData.getPayouts();
        int i = this.d;
        nmj nmjVar = this.h;
        if (i > nmjVar.g()) {
            nmjVar.p(this.d);
            this.i = this.d;
        }
        if (this.d >= 3 && nmjVar.i("tutorial_dialog_real_money_mode")) {
            nmjVar.n(this);
        }
        if (gameData.isGameSessionEnded()) {
            int i2 = this.e;
            if (i2 > 0 && this.d == i2) {
                nmjVar.k(this, 901);
                return;
            }
            GameActivity gameActivity = this.l;
            if (gameActivity == null) {
                return;
            }
            nmjVar.b(gameActivity);
            nmjVar.q(this);
            return;
        }
        if (nmjVar.i("dialog_cash_out")) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_extra_current_shot_round", this.d);
            bundle.putFloat("dialog_extra_next_win_amount", a(this.d).floatValue());
            e("cash_out", bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("dialog_extra_cash_out", false);
        bundle2.putBoolean("dialog_extra_timeout", false);
        c("cash_out", bundle2);
    }

    @Override // defpackage.omj
    public final void z(GameData gameData) {
        if (this.j) {
            return;
        }
        if (gameData.isGameSessionEnded()) {
            t(new kbg(-3000, new IllegalStateException("Game session should not be ended when getting ongoing game data")));
            return;
        }
        this.d = gameData.getWinningStreak();
        this.e = gameData.getStreak();
        this.f = gameData.getPayouts();
        this.h.m(this);
    }
}
