package defpackage;

import com.sportybet.plugin.realsports.activities.ResultsActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y1m extends py1 {
    public boolean a = false;

    public y1m() {
        addOnContextAvailableListener(new x1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((yk50) generatedComponent()).K2((ResultsActivity) this);
    }
}
