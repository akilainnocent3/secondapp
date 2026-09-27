package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ym f95724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ym f95725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5241n4 f95726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f95727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95728e;

    public Dc(String str, PublicLogger publicLogger) {
        this(new C5241n4(30), new Ym(50, str.concat("map key"), publicLogger), new Ym(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Dc(C5241n4 c5241n4, Ym ym2, Ym ym3, String str, PublicLogger publicLogger) {
        this.f95726c = c5241n4;
        this.f95724a = ym2;
        this.f95725b = ym3;
        this.f95728e = str;
        this.f95727d = publicLogger;
    }
}
