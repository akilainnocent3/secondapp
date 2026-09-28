package com.sportybet.plugin.realsports.data;

import defpackage.k650;
import defpackage.l730;

/* JADX INFO: loaded from: classes7.dex */
public final class LiveStreamDataParser_Factory implements l730 {
    private final l730<k650> remoteConfigRepositoryProvider;

    private LiveStreamDataParser_Factory(l730<k650> l730Var) {
        this.remoteConfigRepositoryProvider = l730Var;
    }

    public static LiveStreamDataParser_Factory create(l730<k650> l730Var) {
        return new LiveStreamDataParser_Factory(l730Var);
    }

    public static LiveStreamDataParser newInstance(k650 k650Var) {
        return new LiveStreamDataParser(k650Var);
    }

    @Override // defpackage.m730
    public LiveStreamDataParser get() {
        return newInstance(this.remoteConfigRepositoryProvider.get());
    }
}
