package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3799kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f56842d;

    public C3799kl(String universalAdId, String adServingId, int i10, ArrayList trackers) {
        kotlin.jvm.internal.m0.p(universalAdId, "universalAdId");
        kotlin.jvm.internal.m0.p(adServingId, "adServingId");
        kotlin.jvm.internal.m0.p(trackers, "trackers");
        this.f56839a = universalAdId;
        this.f56840b = adServingId;
        this.f56841c = i10;
        this.f56842d = trackers;
    }
}
