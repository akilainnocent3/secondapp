package defpackage;

import com.sportybet.feature.gift.gift.presentation.GiftActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jrl extends py1 {
    public boolean a = false;

    public jrl() {
        addOnContextAvailableListener(new irl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((lik) generatedComponent()).t((GiftActivity) this);
    }
}
