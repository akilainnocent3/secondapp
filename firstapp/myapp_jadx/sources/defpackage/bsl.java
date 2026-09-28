package defpackage;

import com.sportybet.feature.horseracing.view.HorseRacingActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bsl extends WebViewActivity {
    public boolean a = false;

    public bsl() {
        addOnContextAvailableListener(new asl(this));
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((bkm) generatedComponent()).R1((HorseRacingActivity) this);
    }
}
