package defpackage;

import com.sportybet.android.user.SelfExclusionDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p2m extends py1 {
    public boolean a = false;

    public p2m() {
        addOnContextAvailableListener(new o2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fa80) generatedComponent()).N1((SelfExclusionDialogActivity) this);
    }
}
