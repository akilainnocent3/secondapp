package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.NonUILoadCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yxl extends py1 {
    public boolean a = false;

    public yxl() {
        addOnContextAvailableListener(new xxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((vxx) generatedComponent()).z1((NonUILoadCodeActivity) this);
    }
}
