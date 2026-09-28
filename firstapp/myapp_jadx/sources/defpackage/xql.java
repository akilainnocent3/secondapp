package defpackage;

import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xql extends WebViewActivity {
    public boolean a = false;

    public xql() {
        addOnContextAvailableListener(new wql(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t6h) generatedComponent()).b0((FacialRecognitionActivity) this);
    }
}
