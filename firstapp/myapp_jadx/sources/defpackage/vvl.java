package defpackage;

import com.sportybet.android.loyalty.LoyaltyWebActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class vvl extends WebViewActivity {
    public boolean a = false;

    public vvl() {
        addOnContextAvailableListener(new uvl(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((n4u) generatedComponent()).O2((LoyaltyWebActivity) this);
    }
}
