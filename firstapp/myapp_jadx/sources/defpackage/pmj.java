package defpackage;

import com.sportygames.sportysoccer.model.GameProbability;

/* JADX INFO: loaded from: classes8.dex */
public final class pmj extends nmj {
    @Override // defpackage.mmj
    public final boolean i(String str) {
        return "status_bar".equals(str);
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void m(lmj lmjVar) {
        lmjVar.v(new GameProbability(false));
    }
}
