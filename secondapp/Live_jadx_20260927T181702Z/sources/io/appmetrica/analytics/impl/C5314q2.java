package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5314q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xe f98168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f98171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f98172e;

    public C5314q2(R4 r10, Xe xe2) {
        this.f98168a = xe2;
        r10.b();
        this.f98169b = TimeUnit.MINUTES.toMillis(1L);
        this.f98170c = TimeUnit.DAYS.toMillis(7L);
        this.f98171d = new SystemTimeProvider();
        Map<String, Long> mapF = xe2.f();
        a(mapF);
        this.f98172e = mapF;
    }

    public final void a(Map map) {
        long jCurrentTimeMillis = this.f98171d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis - this.f98170c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
