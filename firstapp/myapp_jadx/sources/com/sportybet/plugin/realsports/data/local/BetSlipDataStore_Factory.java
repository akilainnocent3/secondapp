package com.sportybet.plugin.realsports.data.local;

import android.content.Context;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class BetSlipDataStore_Factory implements l730 {
    private final l730<Context> contextProvider;

    private BetSlipDataStore_Factory(l730<Context> l730Var) {
        this.contextProvider = l730Var;
    }

    public static BetSlipDataStore_Factory create(l730<Context> l730Var) {
        return new BetSlipDataStore_Factory(l730Var);
    }

    public static BetSlipDataStore newInstance(Context context) {
        return new BetSlipDataStore(context);
    }

    @Override // defpackage.m730
    public BetSlipDataStore get() {
        return newInstance(this.contextProvider.get());
    }
}
