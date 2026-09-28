package defpackage;

import com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d7m extends py1 {
    public boolean a = false;

    public d7m() {
        addOnContextAvailableListener(new c7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((k0i0) generatedComponent()).D1((VerifyPhoneForBonusActivity) this);
    }
}
