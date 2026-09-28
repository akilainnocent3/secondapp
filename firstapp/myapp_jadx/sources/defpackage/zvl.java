package defpackage;

import com.sportybet.feature.luckynumber.luncher.LuckyNumberLuncherActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zvl extends py1 {
    public boolean a = false;

    public zvl() {
        addOnContextAvailableListener(new yvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((c6u) generatedComponent()).T((LuckyNumberLuncherActivity) this);
    }
}
