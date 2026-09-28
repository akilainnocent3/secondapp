package defpackage;

import com.sportybet.feature.dedicatedteampage.shared.ui.DedicatedTeamPageActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class opl extends py1 {
    public boolean a = false;

    public opl() {
        addOnContextAvailableListener(new npl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((z5d) generatedComponent()).f1((DedicatedTeamPageActivity) this);
    }
}
