package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45658b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45659c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45660d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f45661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f45662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45663g;

    public v() {
        ByteBuffer byteBuffer = c.f45582a;
        this.f45661e = byteBuffer;
        this.f45662f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new b(i10, i11, i12);
        }
        if (this.f45658b == i10 && this.f45659c == i11 && this.f45660d == i12) {
            return false;
        }
        this.f45658b = i10;
        this.f45659c = i11;
        this.f45660d = i12;
        if (i12 != 2) {
            return true;
        }
        this.f45661e = c.f45582a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f45663g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f45663g && this.f45662f == c.f45582a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        int i10 = this.f45660d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f45659c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f45582a;
        this.f45662f = byteBuffer;
        this.f45663g = false;
        this.f45661e = byteBuffer;
        this.f45658b = -1;
        this.f45659c = -1;
        this.f45660d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f45662f = c.f45582a;
        this.f45663g = false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[ADDED_TO_REGION, LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_START, PHI: r0
      0x0049: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0047, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION, LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_START, PHI: r0
      0x006a: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0045, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
      0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_END] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f45660d;
        if (i13 == Integer.MIN_VALUE) {
            i12 /= 3;
        } else {
            if (i13 != 3) {
                if (i13 == 1073741824) {
                    i10 = i12 / 2;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f45661e.capacity() < i10) {
                this.f45661e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
            } else {
                this.f45661e.clear();
            }
            i11 = this.f45660d;
            if (i11 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f45661e.put(byteBuffer.get(iPosition + 1));
                    this.f45661e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i11 != 3) {
                while (iPosition < iLimit) {
                    this.f45661e.put((byte) 0);
                    this.f45661e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i11 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f45661e.put(byteBuffer.get(iPosition + 2));
                    this.f45661e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f45661e.flip();
            this.f45662f = this.f45661e;
        }
        i10 = i12 * 2;
        if (this.f45661e.capacity() < i10) {
            this.f45661e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f45661e.clear();
        }
        i11 = this.f45660d;
        if (i11 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f45661e.put(byteBuffer.get(iPosition + 1));
                this.f45661e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i11 != 3) {
            while (iPosition < iLimit) {
                this.f45661e.put((byte) 0);
                this.f45661e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i11 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f45661e.put(byteBuffer.get(iPosition + 2));
                this.f45661e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f45661e.flip();
        this.f45662f = this.f45661e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f45662f;
        this.f45662f = c.f45582a;
        return byteBuffer;
    }
}
