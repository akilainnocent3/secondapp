package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoHistoryActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mnl extends py1 {
    public boolean a = false;

    public mnl() {
        addOnContextAvailableListener(new lnl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((bf5) generatedComponent()).N0((BuildAndGoHistoryActivity) this);
    }
}
