package defpackage;

import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vxl extends WebViewActivity {
    public boolean a = false;

    public vxl() {
        addOnContextAvailableListener(new uxl(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((lex) generatedComponent()).V1((NameUpdateWebViewActivity) this);
    }
}
