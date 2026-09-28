package defpackage;

import com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog.DeviceBlockingAlertDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bql extends py1 {
    public boolean a = false;

    public bql() {
        addOnContextAvailableListener(new aql(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tbe) generatedComponent()).J((DeviceBlockingAlertDialogActivity) this);
    }
}
