package defpackage;

import com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i8m extends py1 {
    public boolean a = false;

    public i8m() {
        addOnContextAvailableListener(new h8m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((k1k0) generatedComponent()).T0((WorldCupPassActivity) this);
    }
}
