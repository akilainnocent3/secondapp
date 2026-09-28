package defpackage;

import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yzl extends ty1 {
    public boolean a = false;

    public yzl() {
        addOnContextAvailableListener(new xzl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((em10) generatedComponent()).W((PlayTimeControlDialogActivity) this);
    }
}
