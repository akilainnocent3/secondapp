package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.r;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.model.Balance;
import com.sportygames.sportysoccer.model.GameConfig;
import com.sportygames.sportysoccer.model.GameData;
import com.sportygames.sportysoccer.model.GameProbability;
import com.sportygames.sportysoccer.model.GameSession;
import com.sportygames.sportysoccer.model.LeaderBoard;
import com.sportygames.sportysoccer.model.OngoingGameSessionData;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nmj implements mmj {
    public static final String[] c = {"/session/check"};
    public final cbd0 a = bbd0.b.a;
    public final Context b;

    public static class a<T> extends y3l {
        public final WeakReference<omj> d;

        public a(omj omjVar) {
            this.d = new WeakReference<>(omjVar);
        }

        @Override // defpackage.y3l
        public final void o(mb5 mb5Var) {
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.t(mb5Var);
            }
        }

        @Override // defpackage.y3l
        public void p(su5<T> su5Var, T t) {
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.u();
            }
        }
    }

    public nmj(GameActivity gameActivity) {
        this.b = gameActivity;
    }

    public static void s(su5 su5Var, a aVar) {
        omj omjVar = aVar.d.get();
        if (omjVar != null) {
            omjVar.m(su5Var.request().url().getI().contains(c[0]) ? 0 : 1000);
        }
        i0.a(su5Var, 2, aVar);
    }

    @Override // defpackage.mmj
    public void a(lmj lmjVar) {
        lmjVar.n(new OngoingGameSessionData(false, "", wn20.b(this.b, "userSession", "open_net_user_id")));
    }

    @Override // defpackage.mmj
    public void c(int i, omj omjVar) {
        if (omjVar != null) {
            omjVar.A();
        }
    }

    @Override // defpackage.mmj
    public int d(int i) {
        return r.d.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    @Override // defpackage.mmj
    public void e(boolean z, omj omjVar) {
        omjVar.y(new GameData(null, !z, 0, 0));
    }

    @Override // defpackage.mmj
    public void f(String str, lmj lmjVar) {
        lmjVar.r(new GameSession(""));
    }

    @Override // defpackage.mmj
    public int g() {
        return -1;
    }

    @Override // defpackage.mmj
    public void h(omj omjVar) {
        omjVar.p(new LeaderBoard(null, null));
    }

    @Override // defpackage.mmj
    public void j(omj omjVar) {
        if (omjVar != null) {
            omjVar.x();
        }
    }

    @Override // defpackage.mmj
    public void k(lmj lmjVar, int i) {
        lmjVar.w(new Balance("0"), i);
    }

    @Override // defpackage.mmj
    public void l(lmj lmjVar) {
        lmjVar.q();
    }

    @Override // defpackage.mmj
    public void m(lmj lmjVar) {
        lmjVar.v(new GameProbability(true));
    }

    @Override // defpackage.mmj
    public void n(lmj lmjVar) {
        lmjVar.s();
    }

    @Override // defpackage.mmj
    public void o(lmj lmjVar) {
        lmjVar.z(new GameData(null, false, 0, 0));
    }

    @Override // defpackage.mmj
    public void q(lmj lmjVar) {
        lmjVar.o(new GameConfig("", null, 0));
    }

    @Override // defpackage.mmj
    public void b(GameActivity gameActivity) {
    }

    @Override // defpackage.mmj
    public void p(int i) {
    }

    @Override // defpackage.mmj
    public void r(String str, GameActivity gameActivity) {
    }
}
