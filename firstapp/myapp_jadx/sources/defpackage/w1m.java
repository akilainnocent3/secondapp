package defpackage;

import com.sportybet.android.home.RestrictionActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w1m extends py1 {
    public boolean a = false;

    public w1m() {
        addOnContextAvailableListener(new v1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ri50) generatedComponent()).w1((RestrictionActivity) this);
    }
}
