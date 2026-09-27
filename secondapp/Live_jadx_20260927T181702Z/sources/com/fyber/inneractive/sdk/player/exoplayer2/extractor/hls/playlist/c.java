package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f45923i;

    public c(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
        this.f45915a = str;
        this.f45916b = j10;
        this.f45917c = i10;
        this.f45918d = j11;
        this.f45919e = z10;
        this.f45920f = str2;
        this.f45921g = str3;
        this.f45922h = j12;
        this.f45923i = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        if (this.f45918d > l10.longValue()) {
            return 1;
        }
        return this.f45918d < l10.longValue() ? -1 : 0;
    }
}
