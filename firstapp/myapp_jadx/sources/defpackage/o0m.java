package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.PreviewCodeActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0m extends py1 {
    public boolean a = false;

    public o0m() {
        addOnContextAvailableListener(new n0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((kq20) generatedComponent()).m2((PreviewCodeActivity) this);
    }
}
