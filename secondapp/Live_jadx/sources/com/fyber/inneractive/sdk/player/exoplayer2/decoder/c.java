package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import gi.j;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45715a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f45717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45718d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f45716b = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45719e = 0;

    public final void a() {
        this.f45715a = 0;
        ByteBuffer byteBuffer = this.f45717c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i10) {
        return (this.f45715a & i10) == i10;
    }

    public final ByteBuffer a(int i10) {
        int i11 = this.f45719e;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f45717c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + j.f86771d);
    }
}
