package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f45808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f45810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f45811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f45812m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i10, Object obj, byte[] bArr, String str) {
        super(3, i10, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.f45808i = bArr;
        this.f45811l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f45810k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f45810k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f45809j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f46834h.a(this.f46827a);
            int i10 = 0;
            this.f45809j = 0;
            while (i10 != -1 && !this.f45810k) {
                byte[] bArr = this.f45808i;
                if (bArr == null) {
                    this.f45808i = new byte[16384];
                } else if (bArr.length < this.f45809j + 16384) {
                    this.f45808i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f46834h.read(this.f45808i, this.f45809j, 16384);
                if (i10 != -1) {
                    this.f45809j += i10;
                }
            }
            if (!this.f45810k) {
                this.f45812m = Arrays.copyOf(this.f45808i, this.f45809j);
            }
        } finally {
            z.a(this.f46834h);
        }
    }
}
