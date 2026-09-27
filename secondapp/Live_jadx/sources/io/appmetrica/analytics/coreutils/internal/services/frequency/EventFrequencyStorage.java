package io.appmetrica.analytics.coreutils.internal.services.frequency;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface EventFrequencyStorage {
    @m
    Integer getWindowOccurrencesCount(@l String str);

    @m
    Long getWindowStart(@l String str);

    void putWindowOccurrencesCount(@l String str, int i10);

    void putWindowStart(@l String str, long j10);
}
