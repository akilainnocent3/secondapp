package com.sportybet.android.auth;

import android.content.Context;
import defpackage.k5b;
import defpackage.l730;
import defpackage.mgb0;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthLoginListener_Factory implements l730 {
    private final l730<mgb0> accountManagerProvider;
    private final l730<Context> contextProvider;
    private final l730<k5b> dispatcherProvider;

    private AuthLoginListener_Factory(l730<mgb0> l730Var, l730<k5b> l730Var2, l730<Context> l730Var3) {
        this.accountManagerProvider = l730Var;
        this.dispatcherProvider = l730Var2;
        this.contextProvider = l730Var3;
    }

    public static AuthLoginListener_Factory create(l730<mgb0> l730Var, l730<k5b> l730Var2, l730<Context> l730Var3) {
        return new AuthLoginListener_Factory(l730Var, l730Var2, l730Var3);
    }

    public static AuthLoginListener newInstance(mgb0 mgb0Var, k5b k5bVar, Context context) {
        return new AuthLoginListener(mgb0Var, k5bVar, context);
    }

    @Override // defpackage.m730
    public AuthLoginListener get() {
        return newInstance(this.accountManagerProvider.get(), this.dispatcherProvider.get(), this.contextProvider.get());
    }
}
