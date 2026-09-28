package defpackage;

import com.sportygames.sportysoccer.model.BodyLeaderBoard;
import com.sportygames.sportysoccer.model.GameData;
import com.sportygames.sportysoccer.model.LeaderBoard;

/* JADX INFO: loaded from: classes8.dex */
public final class qmj extends nmj {
    public int d;
    public int e;

    public class a extends nmj.a<LeaderBoard> {
        @Override // nmj.a, defpackage.y3l
        public final void p(su5 su5Var, Object obj) {
            LeaderBoard leaderBoard = (LeaderBoard) obj;
            try {
                super.p(su5Var, leaderBoard);
                omj omjVar = this.d.get();
                if (omjVar != null) {
                    omjVar.p(leaderBoard);
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
                    omjVar.A();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void c(int i, omj omjVar) {
        nmj.s(this.a.s(new BodyLeaderBoard(i)), new b(omjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void e(boolean z, omj omjVar) {
        if (z) {
            this.d++;
        }
        omjVar.y(new GameData(null, !z, this.d, 0));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final int g() {
        return this.e;
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void h(omj omjVar) {
        nmj.s(this.a.B(0), new a(omjVar));
    }

    @Override // defpackage.mmj
    public final boolean i(String str) {
        return str.equals("status_bar") || str.equals("practice_dialog_real_money_mode");
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void p(int i) {
        this.e = i;
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void q(lmj lmjVar) {
        this.d = 0;
        super.q(lmjVar);
    }
}
