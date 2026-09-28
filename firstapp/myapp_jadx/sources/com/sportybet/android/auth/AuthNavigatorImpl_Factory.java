package com.sportybet.android.auth;

import defpackage.l730;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthNavigatorImpl_Factory implements l730 {

    public static final class InstanceHolder {
        static final AuthNavigatorImpl_Factory INSTANCE = new AuthNavigatorImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static AuthNavigatorImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AuthNavigatorImpl newInstance() {
        return new AuthNavigatorImpl();
    }

    @Override // defpackage.m730
    public AuthNavigatorImpl get() {
        return newInstance();
    }
}
