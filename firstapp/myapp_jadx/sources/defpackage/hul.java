package defpackage;

import com.sportybet.feature.luckynumber.winningpopup.presentation.LNWinningPopupActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hul extends py1 {
    public boolean a = false;

    public hul() {
        addOnContextAvailableListener(new gul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((hkr) generatedComponent()).p2((LNWinningPopupActivity) this);
    }
}
