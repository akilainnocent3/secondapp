package defpackage;

import com.sportybet.feature.loyal.LoyalJoinDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hvl extends py1 {
    public boolean a = false;

    public hvl() {
        addOnContextAvailableListener(new gvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tpt) generatedComponent()).R((LoyalJoinDialogActivity) this);
    }
}
