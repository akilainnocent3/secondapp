package defpackage;

import com.sportybet.android.sportypin.VerifyResetPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f7m extends py1 {
    public boolean a = false;

    public f7m() {
        addOnContextAvailableListener(new e7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((p1i0) generatedComponent()).C0((VerifyResetPinActivity) this);
    }
}
