package com.sportybet.android.basepay.data;

import defpackage.l730;
import defpackage.psm;
import defpackage.ta8;

/* JADX INFO: loaded from: classes5.dex */
public final class CommonConfigsRepositoryImpl_Factory implements l730 {
    private final l730<ta8> apiServiceProvider;
    private final l730<psm> countryManagerProvider;

    private CommonConfigsRepositoryImpl_Factory(l730<psm> l730Var, l730<ta8> l730Var2) {
        this.countryManagerProvider = l730Var;
        this.apiServiceProvider = l730Var2;
    }

    public static CommonConfigsRepositoryImpl_Factory create(l730<psm> l730Var, l730<ta8> l730Var2) {
        return new CommonConfigsRepositoryImpl_Factory(l730Var, l730Var2);
    }

    public static CommonConfigsRepositoryImpl newInstance(psm psmVar, ta8 ta8Var) {
        return new CommonConfigsRepositoryImpl(psmVar, ta8Var);
    }

    @Override // defpackage.m730
    public CommonConfigsRepositoryImpl get() {
        return newInstance(this.countryManagerProvider.get(), this.apiServiceProvider.get());
    }
}
