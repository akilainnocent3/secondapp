package defpackage;

import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jwl extends py1 {
    public boolean a = false;

    public jwl() {
        addOnContextAvailableListener(new iwl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((dku) generatedComponent()).V((MainActivity) this);
    }
}
