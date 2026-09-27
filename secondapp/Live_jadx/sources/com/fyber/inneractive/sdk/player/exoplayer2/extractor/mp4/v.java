package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f46287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f46288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f46290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f46291f;

    public v(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.f46287b = jArr;
        this.f46288c = iArr;
        this.f46289d = i10;
        this.f46290e = jArr2;
        this.f46291f = iArr2;
        this.f46286a = jArr.length;
    }
}
