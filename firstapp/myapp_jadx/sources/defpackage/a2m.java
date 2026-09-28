package defpackage;

import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a2m extends py1 {
    public boolean a = false;

    public a2m() {
        addOnContextAvailableListener(new z1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qm50) generatedComponent()).g1((ResultsSearchActivity) this);
    }
}
