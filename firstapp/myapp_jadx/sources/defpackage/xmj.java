package defpackage;

import androidx.recyclerview.widget.r;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.model.BodyCashOut;
import com.sportygames.sportysoccer.model.BodyGameResult;
import com.sportygames.sportysoccer.model.GameData;

/* JADX INFO: loaded from: classes8.dex */
public final class xmj extends nmj {

    public class a extends nmj.a<GameData> {
        @Override // nmj.a, defpackage.y3l
        public final void p(su5 su5Var, Object obj) {
            GameData gameData = (GameData) obj;
            try {
                super.p(su5Var, gameData);
                omj omjVar = this.d.get();
                if (omjVar != null) {
                    omjVar.y(gameData);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b extends nmj.a<Void> {
        @Override // nmj.a, defpackage.y3l
        public final void p(su5 su5Var, Object obj) {
            try {
                super.p(su5Var, (Void) obj);
                omj omjVar = this.d.get();
                if (omjVar != null) {
                    omjVar.x();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void a(lmj lmjVar) {
        nmj.s(this.a.r(), new rmj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void b(GameActivity gameActivity) {
        SportyGamesManager.getInstance().setSportySoccerGameActivityToken("");
        if (gameActivity == null) {
            return;
        }
        wn20.e(gameActivity, "gameSession", "game_session_id", "");
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final int d(int i) {
        if (i >= 8) {
            return 201;
        }
        if (i >= 4) {
            return 202;
        }
        return r.d.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void e(boolean z, omj omjVar) {
        nmj.s(this.a.u(new BodyGameResult(z)), new a(omjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void f(String str, lmj lmjVar) {
        nmj.s(this.a.z(str), new umj(lmjVar));
    }

    @Override // defpackage.mmj
    public final boolean i(String str) {
        switch (str) {
            case "dialog_exit_game":
            case "status_bar":
            case "dialog_cash_out":
            case "page_stake":
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void j(omj omjVar) {
        nmj.s(this.a.t(new BodyCashOut(true)), new b(omjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void k(lmj lmjVar, int i) {
        nmj.s(this.a.o(), new tmj(lmjVar, i));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void l(lmj lmjVar) {
        nmj.s(this.a.t(new BodyCashOut(false)), new ymj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void m(lmj lmjVar) {
        nmj.s(this.a.v(), new vmj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void o(lmj lmjVar) {
        nmj.s(this.a.p(), new wmj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void q(lmj lmjVar) {
        nmj.s(this.a.C(), new smj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void r(String str, GameActivity gameActivity) {
        SportyGamesManager.getInstance().setSportySoccerGameActivityToken(str);
        if (gameActivity == null) {
            return;
        }
        wn20.e(gameActivity, "gameSession", "game_session_id", str);
    }
}
