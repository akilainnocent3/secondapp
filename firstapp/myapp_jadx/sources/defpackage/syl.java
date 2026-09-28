package defpackage;

import com.sportybet.android.openbet.presentation.activity.OpenBetActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class syl extends py1 {
    public boolean a = false;

    public syl() {
        addOnContextAvailableListener(new ryl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tyy) generatedComponent()).v((OpenBetActivity) this);
    }
}
