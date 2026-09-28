package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k8m extends py1 {
    public boolean a = false;

    public k8m() {
        addOnContextAvailableListener(new j8m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((m1k0) generatedComponent()).U((WorldCupPassAnnouncementActivity) this);
    }
}
