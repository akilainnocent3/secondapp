package defpackage;

import com.sportybet.android.user.verifiedinfo.VerifiedInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u6m extends py1 {
    public boolean a = false;

    public u6m() {
        addOnContextAvailableListener(new t6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((rxh0) generatedComponent()).G0((VerifiedInfoActivity) this);
    }
}
