package com.sportybet.android.auth;

import defpackage.l730;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthViewModel_HiltModules_KeyModule_ProvideFactory implements l730 {

    public static final class InstanceHolder {
        static final AuthViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AuthViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static AuthViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return AuthViewModel_HiltModules.KeyModule.provide();
    }

    @Override // defpackage.m730
    public Boolean get() {
        return Boolean.valueOf(provide());
    }
}
