package defpackage;

import com.sporty.android.platform.features.dateofbirth.ui.screens.reminder.DobVerificationReminderActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iql extends py1 {
    public boolean a = false;

    public iql() {
        addOnContextAvailableListener(new hql(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((oxe) generatedComponent()).P1((DobVerificationReminderActivity) this);
    }
}
