package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f55463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f55468h;

    public S2(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        kotlin.jvm.internal.m0.p(url, "url");
        this.f55461a = i10;
        this.f55462b = url;
        this.f55463c = map;
        this.f55464d = z10;
        this.f55465e = z11;
        this.f55466f = i11;
        this.f55467g = j10;
        this.f55468h = j11;
    }

    public /* synthetic */ S2(String str, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
