package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f47026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f47027b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47031f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47029d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47030e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f47028c = new byte[1];

    public j(h hVar, k kVar) {
        this.f47026a = hVar;
        this.f47027b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47030e) {
            return;
        }
        this.f47026a.close();
        this.f47030e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f47028c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f47028c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f47030e) {
            if (!this.f47029d) {
                this.f47026a.a(this.f47027b);
                this.f47029d = true;
            }
            int i12 = this.f47026a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f47031f += (long) i12;
            return i12;
        }
        throw new IllegalStateException();
    }
}
