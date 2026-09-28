package com.sportybet.android.auth;

import defpackage.k5b;
import defpackage.l730;
import defpackage.uqm;

/* JADX INFO: loaded from: classes5.dex */
public final class GetUserAccessTokenUseCase_Factory implements l730 {
    private final l730<uqm> accountHelperProvider;
    private final l730<k5b> dispatcherProvider;

    private GetUserAccessTokenUseCase_Factory(l730<uqm> l730Var, l730<k5b> l730Var2) {
        this.accountHelperProvider = l730Var;
        this.dispatcherProvider = l730Var2;
    }

    public static GetUserAccessTokenUseCase_Factory create(l730<uqm> l730Var, l730<k5b> l730Var2) {
        return new GetUserAccessTokenUseCase_Factory(l730Var, l730Var2);
    }

    public static GetUserAccessTokenUseCase newInstance(uqm uqmVar, k5b k5bVar) {
        return new GetUserAccessTokenUseCase(uqmVar, k5bVar);
    }

    @Override // defpackage.m730
    public GetUserAccessTokenUseCase get() {
        return newInstance(this.accountHelperProvider.get(), this.dispatcherProvider.get());
    }
}
