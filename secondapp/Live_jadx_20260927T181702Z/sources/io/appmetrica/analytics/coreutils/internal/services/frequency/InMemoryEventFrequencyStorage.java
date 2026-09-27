package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f95362a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f95363b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    @m
    public Integer getWindowOccurrencesCount(@l String str) {
        return (Integer) this.f95363b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    @m
    public Long getWindowStart(@l String str) {
        return (Long) this.f95362a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(@l String str, int i10) {
        this.f95363b.put(str, Integer.valueOf(i10));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(@l String str, long j10) {
        this.f95362a.put(str, Long.valueOf(j10));
    }
}
