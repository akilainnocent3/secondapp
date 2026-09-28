package defpackage;

import com.sportybet.android.user.ChangeUserInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hol extends py1 {
    public boolean a = false;

    public hol() {
        addOnContextAvailableListener(new gol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((e67) generatedComponent()).h((ChangeUserInfoActivity) this);
    }
}
