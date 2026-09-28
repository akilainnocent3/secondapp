package defpackage;

import com.sportybet.android.social.presentation.custom.CustomCodeActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kpl extends py1 {
    public boolean a = false;

    public kpl() {
        addOnContextAvailableListener(new jpl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((x6c) generatedComponent()).Q((CustomCodeActivity) this);
    }
}
