package defpackage;

import com.sportygames.sportysoccer.model.GameConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class smj extends nmj.a<GameConfig> {
    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        GameConfig gameConfig = (GameConfig) obj;
        try {
            super.p(su5Var, gameConfig);
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.o(gameConfig);
            }
        } catch (Exception unused) {
        }
    }
}
