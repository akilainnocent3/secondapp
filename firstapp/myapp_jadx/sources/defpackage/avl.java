package defpackage;

import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class avl extends l22 {
    public boolean e = false;

    public avl() {
        addOnContextAvailableListener(new zul(this));
    }

    @Override // defpackage.fml, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((bvs) generatedComponent()).b1((LiveTournamentActivity) this);
    }
}
