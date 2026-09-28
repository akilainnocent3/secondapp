package defpackage;

import com.sportybet.plugin.realsports.activities.ForcedPasswordResetActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class erl extends py1 {
    public boolean a = false;

    public erl() {
        addOnContextAvailableListener(new drl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((nti) generatedComponent()).Y((ForcedPasswordResetActivity) this);
    }
}
