package defpackage;

import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class oyl extends py1 {
    public boolean a = false;

    public oyl() {
        addOnContextAvailableListener(new nyl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((bly) generatedComponent()).Q2((OfflineRequestListActivity) this);
    }
}
