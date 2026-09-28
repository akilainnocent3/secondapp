package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wrl extends py1 {
    public boolean a = false;

    public wrl() {
        addOnContextAvailableListener(new vrl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zjl) generatedComponent()).C2((HighLiabilityCodeActivity) this);
    }
}
