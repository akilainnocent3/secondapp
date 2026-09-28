package defpackage;

import com.sportybet.feature.settings.NotificationSettingsActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cyl extends py1 {
    public boolean a = false;

    public cyl() {
        addOnContextAvailableListener(new byl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((n3y) generatedComponent()).U0((NotificationSettingsActivity) this);
    }
}
