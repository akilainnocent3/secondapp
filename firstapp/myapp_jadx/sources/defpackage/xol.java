package defpackage;

import com.sportybet.plugin.realsports.activities.CommonDialogActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xol extends py1 {
    public boolean a = false;

    public xol() {
        addOnContextAvailableListener(new wol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fd8) generatedComponent()).Y0((CommonDialogActivity) this);
    }
}
