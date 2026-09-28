package defpackage;

import com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z0m extends py1 {
    public boolean a = false;

    public z0m() {
        addOnContextAvailableListener(new y0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((js30) generatedComponent()).k0((RSportsBetDetailsActivity) this);
    }
}
