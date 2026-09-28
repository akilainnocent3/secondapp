package defpackage;

import com.sportygames.sportysoccer.model.GameProbability;

/* JADX INFO: loaded from: classes8.dex */
public final class vmj extends nmj.a<GameProbability> {
    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        GameProbability gameProbability = (GameProbability) obj;
        try {
            super.p(su5Var, gameProbability);
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.v(gameProbability);
            }
        } catch (Exception unused) {
        }
    }
}
