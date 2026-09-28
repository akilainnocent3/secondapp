package com.sportybet.plugin.webcontainer.activities;

import android.content.Context;
import defpackage.aoy;

/* JADX INFO: loaded from: classes7.dex */
abstract class Hilt_BaseWebViewActivity extends BaseActivity {
    private boolean injected = false;

    public Hilt_BaseWebViewActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new aoy() { // from class: com.sportybet.plugin.webcontainer.activities.Hilt_BaseWebViewActivity.1
            @Override // defpackage.aoy
            public void onContextAvailable(Context context) {
                Hilt_BaseWebViewActivity.this.inject();
            }
        });
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((BaseWebViewActivity_GeneratedInjector) generatedComponent()).injectBaseWebViewActivity((BaseWebViewActivity) this);
    }
}
