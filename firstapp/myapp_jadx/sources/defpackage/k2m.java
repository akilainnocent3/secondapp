package defpackage;

import com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k2m extends py1 {
    public boolean a = false;

    public k2m() {
        addOnContextAvailableListener(new j2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((r380) generatedComponent()).D2((SecurityActionActivity) this);
    }
}
