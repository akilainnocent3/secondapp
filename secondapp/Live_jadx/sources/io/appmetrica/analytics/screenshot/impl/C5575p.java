package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5575p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f99110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99111c;

    public C5575p(boolean z10, List list, long j10) {
        this.f99109a = z10;
        this.f99110b = list;
        this.f99111c = j10;
    }

    public final long a() {
        return this.f99111c;
    }

    public final boolean b() {
        return this.f99109a;
    }

    public final List c() {
        return this.f99110b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f99109a + ", mediaStoreColumnNames='" + this.f99110b + "', detectWindowSeconds=" + this.f99111c + ')';
    }

    public C5575p() {
        this(new O().f99039a, fr.a0.Uy(new O().f99041c), new O().f99040b);
    }
}
