package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3939qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f57429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57431f;

    public C3939qb(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        kotlin.jvm.internal.m0.p(fileName, "fileName");
        this.f57426a = fileName;
        this.f57427b = j10;
        this.f57428c = i10;
        this.f57429d = j11;
        this.f57430e = z10;
        this.f57431f = i11;
    }

    public /* synthetic */ C3939qb(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
