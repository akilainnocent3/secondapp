package defpackage;

import com.sportygames.sportysoccer.model.GameData;

/* JADX INFO: loaded from: classes8.dex */
public final class wmj extends nmj.a<GameData> {
    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        GameData gameData = (GameData) obj;
        try {
            super.p(su5Var, gameData);
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.z(gameData);
            }
        } catch (Exception unused) {
        }
    }
}
