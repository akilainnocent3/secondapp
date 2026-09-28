package defpackage;

import com.sporty.android.platform.features.newotp.agent.OTPAgentActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hyl extends py1 {
    public boolean a = false;

    public hyl() {
        addOnContextAvailableListener(new gyl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fay) generatedComponent()).B0((OTPAgentActivity) this);
    }
}
