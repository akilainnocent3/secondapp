package defpackage;

import com.sportybet.android.user.avatar.ChangeAvatarActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class znl extends py1 {
    public boolean a = false;

    public znl() {
        addOnContextAvailableListener(new ynl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((d47) generatedComponent()).l((ChangeAvatarActivity) this);
    }
}
