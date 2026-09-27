package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4409mf implements T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final H3 f63048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private ConcurrentHashMap<String, Integer> f63049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private ConcurrentHashMap<String, Long> f63050c;

    public C4409mf(@oy.l H3 storage) {
        kotlin.jvm.internal.m0.p(storage, "storage");
        this.f63048a = storage;
        this.f63049b = new ConcurrentHashMap<>();
        this.f63050c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.T8
    public void a(int i10, @oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f63049b.put(identifier, Integer.valueOf(i10));
        this.f63048a.a(identifier, i10);
    }

    @Override // com.ironsource.T8
    @oy.m
    public Long b(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        Long l10 = this.f63050c.get(identifier);
        if (l10 != null) {
            return l10;
        }
        Long lA = this.f63048a.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f63050c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.T8
    public int a(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        Integer num = this.f63049b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f63048a.c(identifier);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.f63049b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f63049b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.T8
    public void a(long j10, @oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f63050c.put(identifier, Long.valueOf(j10));
        this.f63048a.b(identifier, j10);
    }
}
