package defpackage;

import com.sporty.android.platform.features.userfeedback.UserFeedbackActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s6m extends py1 {
    public boolean a = false;

    public s6m() {
        addOnContextAvailableListener(new r6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((woh0) generatedComponent()).R0((UserFeedbackActivity) this);
    }
}
