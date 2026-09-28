package defpackage;

import com.sportybet.android.activity.AboutUsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ill extends py1 {
    public boolean a = false;

    public ill() {
        addOnContextAvailableListener(new hll(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((v1) generatedComponent()).L((AboutUsActivity) this);
    }
}
