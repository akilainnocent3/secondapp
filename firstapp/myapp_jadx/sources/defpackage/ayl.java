package defpackage;

import com.sportybet.feature.notificationcenter.NotificationCenterActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ayl extends py1 {
    public boolean a = false;

    public ayl() {
        addOnContextAvailableListener(new zxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((o0y) generatedComponent()).s((NotificationCenterActivity) this);
    }
}
