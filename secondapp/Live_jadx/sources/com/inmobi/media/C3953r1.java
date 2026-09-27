package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3953r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3804l1 f57497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3724hk f57498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f57499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f57500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f57501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f57502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f57503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f57504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f57505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3929q1 f57506j;

    public C3953r1(AbstractC3804l1 adUnit) {
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        this.f57497a = adUnit;
        this.f57498b = new C3724hk();
        this.f57506j = new C3929q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        AdSet adSetR = this.f57497a.r();
        return (adSetR == null || (ads = adSetR.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) fr.r0.L2(ads)) == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
