package defpackage;

import com.sportybet.plugin.realsports.home.KycVerificationInProgressBottomSheetActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dul extends py1 {
    public boolean a = false;

    public dul() {
        addOnContextAvailableListener(new cul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((jup) generatedComponent()).A1((KycVerificationInProgressBottomSheetActivity) this);
    }
}
