package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pzl extends py1 {
    public boolean a = false;

    public pzl() {
        addOnContextAvailableListener(new ozl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((aa10) generatedComponent()).X0((PixBtgQrCodeActivity) this);
    }
}
