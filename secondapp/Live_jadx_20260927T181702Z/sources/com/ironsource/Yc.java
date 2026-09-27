package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Yc implements M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final H3 f60380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private ConcurrentHashMap<String, Long> f60381b;

    public Yc(@oy.l H3 storage) {
        kotlin.jvm.internal.m0.p(storage, "storage");
        this.f60380a = storage;
        this.f60381b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.M7
    @oy.m
    public Long a(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        Long l10 = this.f60381b.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long lB = this.f60380a.b(identifier);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f60381b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.M7
    public void a(long j10, @oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f60381b.put(identifier, Long.valueOf(j10));
        this.f60380a.a(identifier, j10);
    }
}
