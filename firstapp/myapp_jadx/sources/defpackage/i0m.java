package defpackage;

import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i0m extends py1 {
    public boolean a = false;

    public i0m() {
        addOnContextAvailableListener(new h0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((uh20) generatedComponent()).r1((PreMatchMyFavoriteActivity) this);
    }
}
