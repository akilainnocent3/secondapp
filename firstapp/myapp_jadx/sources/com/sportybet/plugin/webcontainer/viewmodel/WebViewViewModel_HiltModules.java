package com.sportybet.plugin.webcontainer.viewmodel;

import defpackage.j8i0;

/* JADX INFO: loaded from: classes7.dex */
public final class WebViewViewModel_HiltModules {

    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract j8i0 binds(WebViewViewModel webViewViewModel);
    }

    public static final class KeyModule {
        private KeyModule() {
        }

        public static boolean provide() {
            return true;
        }
    }

    private WebViewViewModel_HiltModules() {
    }
}
