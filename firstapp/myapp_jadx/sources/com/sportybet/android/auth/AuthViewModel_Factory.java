package com.sportybet.android.auth;

import defpackage.l730;
import defpackage.yck;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthViewModel_Factory implements l730 {
    private final l730<yck> getRegSuccessDescUseCaseProvider;

    private AuthViewModel_Factory(l730<yck> l730Var) {
        this.getRegSuccessDescUseCaseProvider = l730Var;
    }

    public static AuthViewModel_Factory create(l730<yck> l730Var) {
        return new AuthViewModel_Factory(l730Var);
    }

    public static AuthViewModel newInstance(yck yckVar) {
        return new AuthViewModel(yckVar);
    }

    @Override // defpackage.m730
    public AuthViewModel get() {
        return newInstance(this.getRegSuccessDescUseCaseProvider.get());
    }
}
