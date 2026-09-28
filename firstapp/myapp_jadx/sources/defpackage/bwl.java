package defpackage;

import com.sportybet.android.luckynumber.LuckyNumberWebView;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class bwl extends WebViewActivity {
    public boolean a = false;

    public bwl() {
        addOnContextAvailableListener(new awl(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((m8u) generatedComponent()).i0((LuckyNumberWebView) this);
    }
}
