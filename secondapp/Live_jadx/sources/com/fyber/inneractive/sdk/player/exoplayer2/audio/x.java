package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f45690d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f45693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ShortBuffer f45694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f45695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45698l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f45691e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f45692f = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45688b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45689c = -1;

    public x() {
        ByteBuffer byteBuffer = c.f45582a;
        this.f45693g = byteBuffer;
        this.f45694h = byteBuffer.asShortBuffer();
        this.f45695i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (this.f45689c == i10 && this.f45688b == i11) {
            return false;
        }
        this.f45689c = i10;
        this.f45688b = i11;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i10;
        w wVar = this.f45690d;
        int i11 = wVar.f45680q;
        float f10 = wVar.f45678o;
        float f11 = wVar.f45679p;
        int i12 = wVar.f45681r + ((int) ((((i11 / (f10 / f11)) + wVar.f45682s) / f11) + 0.5f));
        wVar.a((wVar.f45668e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wVar.f45668e * 2;
            int i14 = wVar.f45665b;
            if (i13 >= i10 * i14) {
                break;
            }
            wVar.f45671h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wVar.f45680q = i10 + wVar.f45680q;
        wVar.a();
        if (wVar.f45681r > i12) {
            wVar.f45681r = i12;
        }
        wVar.f45680q = 0;
        wVar.f45683t = 0;
        wVar.f45682s = 0;
        this.f45698l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        if (!this.f45698l) {
            return false;
        }
        w wVar = this.f45690d;
        return wVar == null || wVar.f45681r == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f45691e - 1.0f) >= 0.01f || Math.abs(this.f45692f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f45688b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f45690d = null;
        ByteBuffer byteBuffer = c.f45582a;
        this.f45693g = byteBuffer;
        this.f45694h = byteBuffer.asShortBuffer();
        this.f45695i = byteBuffer;
        this.f45688b = -1;
        this.f45689c = -1;
        this.f45696j = 0L;
        this.f45697k = 0L;
        this.f45698l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f45689c, this.f45688b);
        this.f45690d = wVar;
        wVar.f45678o = this.f45691e;
        wVar.f45679p = this.f45692f;
        this.f45695i = c.f45582a;
        this.f45696j = 0L;
        this.f45697k = 0L;
        this.f45698l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f45696j += (long) iRemaining;
            w wVar = this.f45690d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = wVar.f45665b;
            int i11 = iRemaining2 / i10;
            wVar.a(i11);
            shortBufferAsShortBuffer.get(wVar.f45671h, wVar.f45680q * wVar.f45665b, ((i10 * i11) * 2) / 2);
            wVar.f45680q += i11;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f45690d.f45681r * this.f45688b * 2;
        if (i12 > 0) {
            if (this.f45693g.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f45693g = byteBufferOrder;
                this.f45694h = byteBufferOrder.asShortBuffer();
            } else {
                this.f45693g.clear();
                this.f45694h.clear();
            }
            w wVar2 = this.f45690d;
            ShortBuffer shortBuffer = this.f45694h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f45665b, wVar2.f45681r);
            shortBuffer.put(wVar2.f45673j, 0, wVar2.f45665b * iMin);
            int i13 = wVar2.f45681r - iMin;
            wVar2.f45681r = i13;
            short[] sArr = wVar2.f45673j;
            int i14 = wVar2.f45665b;
            System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
            this.f45697k += (long) i12;
            this.f45693g.limit(i12);
            this.f45695i = this.f45693g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f45695i;
        this.f45695i = c.f45582a;
        return byteBuffer;
    }
}
