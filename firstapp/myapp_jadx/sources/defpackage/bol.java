package defpackage;

import com.sportybet.android.user.ChangeLocationActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bol extends py1 {
    public boolean a = false;

    public bol() {
        addOnContextAvailableListener(new aol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((v47) generatedComponent()).R2((ChangeLocationActivity) this);
    }
}
