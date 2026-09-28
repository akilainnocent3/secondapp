package com.sportybet.plugin.webcontainer.activities;

import android.content.Context;
import defpackage.aoy;

/* JADX INFO: loaded from: classes7.dex */
abstract class Hilt_WebViewActivity extends BaseWebViewActivity {
    private boolean injected = false;

    public Hilt_WebViewActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new aoy() { // from class: com.sportybet.plugin.webcontainer.activities.Hilt_WebViewActivity.1
            @Override // defpackage.aoy
            public void onContextAvailable(Context context) {
                Hilt_WebViewActivity.this.inject();
            }
        });
    }

    @Override // com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity, com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((WebViewActivity_GeneratedInjector) generatedComponent()).injectWebViewActivity((WebViewActivity) this);
    }
}
