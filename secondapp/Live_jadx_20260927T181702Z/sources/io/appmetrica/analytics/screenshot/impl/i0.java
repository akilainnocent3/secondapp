package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f99087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99088c;

    public i0(boolean z10, List list, long j10) {
        this.f99086a = z10;
        this.f99087b = list;
        this.f99088c = j10;
    }

    public final long a() {
        return this.f99088c;
    }

    public final boolean b() {
        return this.f99086a;
    }

    public final List c() {
        return this.f99087b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f99086a + ", mediaStoreColumnNames=" + this.f99087b + ", detectWindowSeconds=" + this.f99088c + ')';
    }

    public i0(C5575p c5575p) {
        this(c5575p.b(), c5575p.c(), c5575p.a());
    }
}
