package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f45931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f45932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f45934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f45935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f45936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f45937o;

    public d(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, c cVar, List list, List list2) {
        super(str);
        this.f45924b = i10;
        this.f45926d = j11;
        this.f45927e = z10;
        this.f45928f = i11;
        this.f45929g = i12;
        this.f45930h = i13;
        this.f45931i = j12;
        this.f45932j = z11;
        this.f45933k = z12;
        this.f45934l = cVar;
        this.f45935m = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f45937o = 0L;
        } else {
            c cVar2 = (c) list.get(list.size() - 1);
            this.f45937o = cVar2.f45918d + cVar2.f45916b;
        }
        if (j10 == -9223372036854775807L) {
            j10 = -9223372036854775807L;
        } else if (j10 < 0) {
            j10 += this.f45937o;
        }
        this.f45925c = j10;
        this.f45936n = Collections.unmodifiableList(list2);
    }
}
