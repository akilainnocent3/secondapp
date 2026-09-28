package defpackage;

import com.sportybet.android.social.presentation.SocialActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d3m extends py1 {
    public boolean a = false;

    public d3m() {
        addOnContextAvailableListener(new c3m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((v7a0) generatedComponent()).c1((SocialActivity) this);
    }
}
