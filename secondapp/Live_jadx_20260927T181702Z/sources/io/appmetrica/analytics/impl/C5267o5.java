package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5267o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicLogger f98006a;

    public C5267o5(String str) {
        this.f98006a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i10) {
        if (i10 < 100) {
            this.f98006a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i10 + ". Default value (100) will be used", new Object[0]);
            return 100;
        }
        if (i10 <= 10000) {
            return i10;
        }
        this.f98006a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i10 + ". Default value (10000) will be used", new Object[0]);
        return 10000;
    }
}
