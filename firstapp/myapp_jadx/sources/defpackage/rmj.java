package defpackage;

import com.sportygames.sportysoccer.model.OngoingGameSessionData;

/* JADX INFO: loaded from: classes8.dex */
public final class rmj extends nmj.a<OngoingGameSessionData> {
    @Override // nmj.a, defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        OngoingGameSessionData ongoingGameSessionData = (OngoingGameSessionData) obj;
        try {
            super.p(su5Var, ongoingGameSessionData);
            omj omjVar = this.d.get();
            if (omjVar != null) {
                omjVar.n(ongoingGameSessionData);
            }
        } catch (Exception unused) {
        }
    }
}
