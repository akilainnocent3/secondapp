package defpackage;

import com.sportybet.feature.profile.ProfileActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v0m extends py1 {
    public boolean a = false;

    public v0m() {
        addOnContextAvailableListener(new u0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((iz20) generatedComponent()).w2((ProfileActivity) this);
    }
}
