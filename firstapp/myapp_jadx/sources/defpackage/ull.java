package defpackage;

import com.sportybet.plugin.realsports.activities.AlertBannerActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ull extends py1 {
    public boolean a = false;

    public ull() {
        addOnContextAvailableListener(new tll(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cs) generatedComponent()).F((AlertBannerActivity) this);
    }
}
