package defpackage;

import com.sportybet.feature.recap.presentation.RecapActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g1m extends py1 {
    public boolean a = false;

    public g1m() {
        addOnContextAvailableListener(new f1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((sc40) generatedComponent()).p1((RecapActivity) this);
    }
}
