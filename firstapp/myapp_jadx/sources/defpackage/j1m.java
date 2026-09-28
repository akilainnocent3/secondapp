package defpackage;

import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j1m extends WebViewActivity {
    public boolean a = false;

    public j1m() {
        addOnContextAvailableListener(new i1m(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((vw40) generatedComponent()).k((RegistrationKYCWebViewActivity) this);
    }
}
