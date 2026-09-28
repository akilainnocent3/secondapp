package defpackage;

import com.sportybet.android.account.international.INTAuthActivity;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dsl extends BaseAccountAuthenticatorActivity {
    public boolean a = false;

    public dsl() {
        addOnContextAvailableListener(new csl(this));
    }

    @Override // com.sportybet.android.auth.Hilt_BaseAccountAuthenticatorActivity, com.sportybet.android.account.b, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((xum) generatedComponent()).S2((INTAuthActivity) this);
    }
}
