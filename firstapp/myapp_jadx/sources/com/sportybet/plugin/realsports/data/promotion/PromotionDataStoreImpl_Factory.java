package com.sportybet.plugin.realsports.data.promotion;

import android.content.Context;
import defpackage.k5b;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class PromotionDataStoreImpl_Factory implements l730 {
    private final l730<Context> contextProvider;
    private final l730<k5b> ioDispatcherProvider;
    private final l730<k5b> mainDispatcherProvider;

    private PromotionDataStoreImpl_Factory(l730<Context> l730Var, l730<k5b> l730Var2, l730<k5b> l730Var3) {
        this.contextProvider = l730Var;
        this.ioDispatcherProvider = l730Var2;
        this.mainDispatcherProvider = l730Var3;
    }

    public static PromotionDataStoreImpl_Factory create(l730<Context> l730Var, l730<k5b> l730Var2, l730<k5b> l730Var3) {
        return new PromotionDataStoreImpl_Factory(l730Var, l730Var2, l730Var3);
    }

    public static PromotionDataStoreImpl newInstance(Context context, k5b k5bVar, k5b k5bVar2) {
        return new PromotionDataStoreImpl(context, k5bVar, k5bVar2);
    }

    @Override // defpackage.m730
    public PromotionDataStoreImpl get() {
        return newInstance(this.contextProvider.get(), this.ioDispatcherProvider.get(), this.mainDispatcherProvider.get());
    }
}
