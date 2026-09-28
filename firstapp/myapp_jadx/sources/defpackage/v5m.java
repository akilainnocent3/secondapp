package defpackage;

import com.sportybet.android.kepay.TransactionSuccessfulActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class v5m extends py1 {
    public boolean a = false;

    public v5m() {
        addOnContextAvailableListener(new u5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zqg0) generatedComponent()).y2((TransactionSuccessfulActivity) this);
    }
}
