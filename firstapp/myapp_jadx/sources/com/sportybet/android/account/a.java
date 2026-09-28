package com.sportybet.android.account;

import android.content.Context;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import defpackage.aoy;
import defpackage.h8;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends WebViewActivity {
    public boolean a = false;

    /* JADX INFO: renamed from: com.sportybet.android.account.a$a, reason: collision with other inner class name */
    public final class C0218a implements aoy {
        public C0218a() {
        }

        @Override // defpackage.aoy
        public final void onContextAvailable(Context context) {
            a.this.inject();
        }
    }

    public a() {
        addOnContextAvailableListener(new C0218a());
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity, com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((h8) generatedComponent()).q((AccountActivationWebViewActivity) this);
    }
}
