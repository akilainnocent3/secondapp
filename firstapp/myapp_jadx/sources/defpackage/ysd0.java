package defpackage;

import com.sportygames.sportysoccer.model.GameSessionBaseline;

/* JADX INFO: loaded from: classes8.dex */
public final class ysd0 extends y3l {
    public final /* synthetic */ zsd0 d;

    public ysd0(zsd0 zsd0Var) {
        this.d = zsd0Var;
    }

    @Override // defpackage.y3l
    public final void o(mb5 mb5Var) {
        try {
            this.d.a.m(new GameSessionBaseline(false));
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.y3l
    public final void p(su5 su5Var, Object obj) {
        GameSessionBaseline gameSessionBaseline = (GameSessionBaseline) obj;
        try {
            gameSessionBaseline.isValid = true;
            this.d.a.m(gameSessionBaseline);
        } catch (Exception unused) {
        }
    }
}
