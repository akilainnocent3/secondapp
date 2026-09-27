package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f45648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f45650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f45651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f45652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45653i;

    public s() {
        ByteBuffer byteBuffer = c.f45582a;
        this.f45651g = byteBuffer;
        this.f45652h = byteBuffer;
        this.f45646b = -1;
        this.f45647c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        boolean zEquals = Arrays.equals(this.f45648d, this.f45650f);
        boolean z10 = !zEquals;
        int[] iArr = this.f45648d;
        this.f45650f = iArr;
        if (iArr == null) {
            this.f45649e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (zEquals && this.f45647c == i10 && this.f45646b == i11) {
            return false;
        }
        this.f45647c = i10;
        this.f45646b = i11;
        this.f45649e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f45650f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new b(i10, i11, i12);
            }
            this.f45649e = (i14 != i13) | this.f45649e;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f45653i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f45653i && this.f45652h == c.f45582a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f45649e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f45650f;
        return iArr == null ? this.f45646b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f45582a;
        this.f45652h = byteBuffer;
        this.f45653i = false;
        this.f45651g = byteBuffer;
        this.f45646b = -1;
        this.f45647c = -1;
        this.f45650f = null;
        this.f45649e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f45652h = c.f45582a;
        this.f45653i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f45646b * 2)) * this.f45650f.length * 2;
        if (this.f45651g.capacity() < length) {
            this.f45651g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f45651g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f45650f) {
                this.f45651g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f45646b * 2;
        }
        byteBuffer.position(iLimit);
        this.f45651g.flip();
        this.f45652h = this.f45651g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f45652h;
        this.f45652h = c.f45582a;
        return byteBuffer;
    }
}
