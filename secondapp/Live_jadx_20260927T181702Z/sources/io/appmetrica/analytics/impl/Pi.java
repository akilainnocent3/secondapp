package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f96330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vm f96331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5029en f96332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5029en f96333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f96334e;

    public Pi(Revenue revenue, PublicLogger publicLogger) {
        this.f96334e = publicLogger;
        this.f96330a = revenue;
        this.f96331b = new Vm(30720, "revenue payload", publicLogger);
        this.f96332c = new C5029en(new Vm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f96333d = new C5029en(new Ym(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
