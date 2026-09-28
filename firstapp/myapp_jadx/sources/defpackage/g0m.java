package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g0m extends py1 {
    public boolean a = false;

    public g0m() {
        addOnContextAvailableListener(new f0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qd20) generatedComponent()).j0((PreMatchEventActivity) this);
    }
}
