package defpackage;

import com.sportybet.android.bvn.VerifyBvnActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z6m extends e5 {
    public boolean v = false;

    public z6m() {
        addOnContextAvailableListener(new y6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.v) {
            return;
        }
        this.v = true;
        ((czh0) generatedComponent()).t1((VerifyBvnActivity) this);
    }
}
