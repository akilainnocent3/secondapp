package com.sportybet.plugin.webcontainer.viewmodel;

import defpackage.l730;
import defpackage.lyz;
import defpackage.mgb0;
import defpackage.rdd0;
import defpackage.xq00;

/* JADX INFO: loaded from: classes7.dex */
public final class WebViewViewModel_Factory implements l730 {
    private final l730<mgb0> accountStorageProvider;
    private final l730<lyz> patronRepositoryProvider;
    private final l730<xq00> preferenceDataStoreProvider;
    private final l730<rdd0> sportyTrackingUseCaseProvider;

    private WebViewViewModel_Factory(l730<rdd0> l730Var, l730<lyz> l730Var2, l730<mgb0> l730Var3, l730<xq00> l730Var4) {
        this.sportyTrackingUseCaseProvider = l730Var;
        this.patronRepositoryProvider = l730Var2;
        this.accountStorageProvider = l730Var3;
        this.preferenceDataStoreProvider = l730Var4;
    }

    public static WebViewViewModel_Factory create(l730<rdd0> l730Var, l730<lyz> l730Var2, l730<mgb0> l730Var3, l730<xq00> l730Var4) {
        return new WebViewViewModel_Factory(l730Var, l730Var2, l730Var3, l730Var4);
    }

    public static WebViewViewModel newInstance(rdd0 rdd0Var, lyz lyzVar, mgb0 mgb0Var, xq00 xq00Var) {
        return new WebViewViewModel(rdd0Var, lyzVar, mgb0Var, xq00Var);
    }

    @Override // defpackage.m730
    public WebViewViewModel get() {
        return newInstance(this.sportyTrackingUseCaseProvider.get(), this.patronRepositoryProvider.get(), this.accountStorageProvider.get(), this.preferenceDataStoreProvider.get());
    }
}
