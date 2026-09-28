package defpackage;

import android.text.TextUtils;
import com.sportygames.sportysoccer.model.GameSession;

/* JADX INFO: loaded from: classes8.dex */
public final class umj extends nmj.a<GameSession> {
    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        GameSession gameSession = (GameSession) obj;
        try {
            super.p(su5Var, gameSession);
            if (TextUtils.isEmpty(gameSession.getId())) {
                o(new kbg(-9002, new IllegalArgumentException("can not get game session id from api")));
                return;
            }
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.r(gameSession);
            }
        } catch (Exception unused) {
        }
    }
}
