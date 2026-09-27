package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f45789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f45791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f45792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f45793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f45794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f45795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f45797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f45799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f45802n;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f45789a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f45790b = 65536;
        this.f45791c = new e();
        this.f45792d = new LinkedBlockingDeque();
        this.f45793e = new d();
        this.f45794f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f45795g = new AtomicInteger();
        this.f45800l = 65536;
    }

    public final void a(boolean z10) {
        int andSet = this.f45795g.getAndSet(z10 ? 0 : 2);
        a();
        e eVar = this.f45791c;
        eVar.f45758m = Long.MIN_VALUE;
        eVar.f45759n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f45797i = null;
        }
    }

    public final void b() {
        if (this.f45795g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f45795g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f45791c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f45758m, eVar.f45759n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f45791c;
        synchronized (eVar) {
            oVar = eVar.f45761p ? null : eVar.f45762q;
        }
        return oVar;
    }

    public final void f() {
        long j10;
        e eVar = this.f45791c;
        synchronized (eVar) {
            int i10 = eVar.f45754i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = eVar.f45756k + i10;
                int i12 = eVar.f45746a;
                int i13 = (i11 - 1) % i12;
                eVar.f45756k = i11 % i12;
                eVar.f45755j += i10;
                eVar.f45754i = 0;
                j10 = eVar.f45748c[i13] + ((long) eVar.f45749d[i13]);
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }

    public final boolean a(boolean z10, long j10) {
        long j11;
        e eVar = this.f45791c;
        synchronized (eVar) {
            if (eVar.f45754i != 0) {
                long[] jArr = eVar.f45751f;
                int i10 = eVar.f45756k;
                if (j10 < jArr[i10]) {
                    j11 = -1;
                } else {
                    if (j10 <= eVar.f45759n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != eVar.f45757l && eVar.f45751f[i10] <= j10) {
                            if ((eVar.f45750e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % eVar.f45746a;
                            i12++;
                        }
                        if (i11 != -1) {
                            int i13 = (eVar.f45756k + i11) % eVar.f45746a;
                            eVar.f45756k = i13;
                            eVar.f45755j += i11;
                            eVar.f45754i -= i11;
                            j11 = eVar.f45748c[i13];
                        }
                    }
                    j11 = -1;
                }
            } else {
                j11 = -1;
            }
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130 A[LOOP:0: B:73:0x012e->B:74:0x0130, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0182  */
    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3 A[LOOP:1: B:88:0x01a1->B:89:0x01a3, LOOP_END] */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10, boolean z11, long j10) {
        long j11;
        int i10;
        ByteBuffer byteBuffer;
        int iCapacity;
        int iPosition;
        int i11;
        ByteBuffer byteBufferA;
        long j12;
        ByteBuffer byteBuffer2;
        int i12;
        d dVar;
        byte b10;
        boolean z12;
        com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar;
        long j13;
        int i13;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i14;
        e eVar = this.f45791c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f45797i;
        d dVar2 = this.f45793e;
        synchronized (eVar) {
            int iO = 1;
            if (eVar.f45754i == 0) {
                if (z11) {
                    cVar.f45715a = 4;
                    if (!cVar.b(4)) {
                        return -4;
                    }
                    if (cVar.f45718d < j10) {
                        cVar.f45715a = Integer.MIN_VALUE | cVar.f45715a;
                    }
                    if (cVar.b(1073741824)) {
                        dVar = this.f45793e;
                        long j14 = dVar.f45743b;
                        this.f45794f.c(1);
                        a(j14, this.f45794f.f47130a, 1);
                        long j15 = j14 + 1;
                        b10 = this.f45794f.f47130a[0];
                        if ((b10 & 128) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i15 = b10 & 127;
                        bVar = cVar.f45716b;
                        if (bVar.f45710a == null) {
                            bVar.f45710a = new byte[16];
                        }
                        a(j15, bVar.f45710a, i15);
                        j13 = j15 + ((long) i15);
                        if (z12) {
                            this.f45794f.c(2);
                            a(j13, this.f45794f.f47130a, 2);
                            j13 += 2;
                            iO = this.f45794f.o();
                        }
                        i13 = iO;
                        com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.f45716b;
                        iArr = bVar2.f45711b;
                        if (iArr != null || iArr.length < i13) {
                            iArr = new int[i13];
                        }
                        iArr2 = iArr;
                        iArr3 = bVar2.f45712c;
                        if (iArr3 != null || iArr3.length < i13) {
                            iArr3 = new int[i13];
                        }
                        iArr4 = iArr3;
                        if (z12) {
                            int i16 = i13 * 6;
                            this.f45794f.c(i16);
                            a(j13, this.f45794f.f47130a, i16);
                            j13 += (long) i16;
                            this.f45794f.e(0);
                            for (i14 = 0; i14 < i13; i14++) {
                                iArr2[i14] = this.f45794f.o();
                                iArr4[i14] = this.f45794f.m();
                            }
                        } else {
                            iArr2[0] = 0;
                            iArr4[0] = dVar.f45742a - ((int) (j13 - dVar.f45743b));
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.f45716b;
                        bVar3.a(i13, iArr2, iArr4, dVar.f45745d, bVar3.f45710a);
                        long j16 = dVar.f45743b;
                        int i17 = (int) (j13 - j16);
                        dVar.f45743b = j16 + ((long) i17);
                        dVar.f45742a -= i17;
                    }
                    i10 = this.f45793e.f45742a;
                    byteBuffer = cVar.f45717c;
                    if (byteBuffer == null) {
                        cVar.f45717c = cVar.a(i10);
                    } else {
                        iCapacity = byteBuffer.capacity();
                        iPosition = cVar.f45717c.position();
                        i11 = i10 + iPosition;
                        if (iCapacity < i11) {
                            byteBufferA = cVar.a(i11);
                            if (iPosition > 0) {
                                cVar.f45717c.position(0);
                                cVar.f45717c.limit(iPosition);
                                byteBufferA.put(cVar.f45717c);
                            }
                            cVar.f45717c = byteBufferA;
                        }
                    }
                    d dVar3 = this.f45793e;
                    j12 = dVar3.f45743b;
                    byteBuffer2 = cVar.f45717c;
                    i12 = dVar3.f45742a;
                    while (i12 > 0) {
                        a(j12);
                        int i18 = (int) (j12 - this.f45796h);
                        int iMin = Math.min(i12, this.f45790b - i18);
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f45792d.peek();
                        byteBuffer2.put(aVar.f46937a, aVar.f46938b + i18, iMin);
                        j12 += (long) iMin;
                        i12 -= iMin;
                    }
                    a(this.f45793e.f45744c);
                    return -4;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f45762q;
                if (oVar2 == null || (!z10 && oVar2 == oVar)) {
                    return -3;
                }
                pVar.f46810a = oVar2;
                this.f45797i = pVar.f46810a;
                return -5;
            }
            if (!z10) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.f45753h;
                int i19 = eVar.f45756k;
                if (oVarArr[i19] == oVar) {
                    if (cVar.f45717c == null && cVar.f45719e == 0) {
                        return -3;
                    }
                    long j17 = eVar.f45751f[i19];
                    cVar.f45718d = j17;
                    cVar.f45715a = eVar.f45750e[i19];
                    dVar2.f45742a = eVar.f45749d[i19];
                    dVar2.f45743b = eVar.f45748c[i19];
                    dVar2.f45745d = eVar.f45752g[i19];
                    eVar.f45758m = Math.max(eVar.f45758m, j17);
                    int i20 = eVar.f45754i - 1;
                    eVar.f45754i = i20;
                    int i21 = eVar.f45756k + 1;
                    eVar.f45756k = i21;
                    eVar.f45755j++;
                    if (i21 == eVar.f45746a) {
                        eVar.f45756k = 0;
                    }
                    if (i20 > 0) {
                        j11 = eVar.f45748c[eVar.f45756k];
                    } else {
                        j11 = dVar2.f45743b + ((long) dVar2.f45742a);
                    }
                    dVar2.f45744c = j11;
                    if (!cVar.b(4)) {
                        return -4;
                    }
                    if (cVar.f45718d < j10) {
                        cVar.f45715a = Integer.MIN_VALUE | cVar.f45715a;
                    }
                    if (cVar.b(1073741824)) {
                        dVar = this.f45793e;
                        long j18 = dVar.f45743b;
                        this.f45794f.c(1);
                        a(j18, this.f45794f.f47130a, 1);
                        long j19 = j18 + 1;
                        b10 = this.f45794f.f47130a[0];
                        if ((b10 & 128) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i110 = b10 & 127;
                        bVar = cVar.f45716b;
                        if (bVar.f45710a == null) {
                            bVar.f45710a = new byte[16];
                        }
                        a(j19, bVar.f45710a, i110);
                        j13 = j19 + ((long) i110);
                        if (z12) {
                            this.f45794f.c(2);
                            a(j13, this.f45794f.f47130a, 2);
                            j13 += 2;
                            iO = this.f45794f.o();
                        }
                        i13 = iO;
                        com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar4 = cVar.f45716b;
                        iArr = bVar4.f45711b;
                        if (iArr != null) {
                            iArr = new int[i13];
                        } else {
                            iArr = new int[i13];
                        }
                        iArr2 = iArr;
                        iArr3 = bVar4.f45712c;
                        if (iArr3 != null) {
                            iArr3 = new int[i13];
                        } else {
                            iArr3 = new int[i13];
                        }
                        iArr4 = iArr3;
                        if (z12) {
                            int i111 = i13 * 6;
                            this.f45794f.c(i111);
                            a(j13, this.f45794f.f47130a, i111);
                            j13 += (long) i111;
                            this.f45794f.e(0);
                            while (i14 < i13) {
                                iArr2[i14] = this.f45794f.o();
                                iArr4[i14] = this.f45794f.m();
                            }
                        } else {
                            iArr2[0] = 0;
                            iArr4[0] = dVar.f45742a - ((int) (j13 - dVar.f45743b));
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar5 = cVar.f45716b;
                        bVar5.a(i13, iArr2, iArr4, dVar.f45745d, bVar5.f45710a);
                        long j110 = dVar.f45743b;
                        int i112 = (int) (j13 - j110);
                        dVar.f45743b = j110 + ((long) i112);
                        dVar.f45742a -= i112;
                    }
                    i10 = this.f45793e.f45742a;
                    byteBuffer = cVar.f45717c;
                    if (byteBuffer == null) {
                        cVar.f45717c = cVar.a(i10);
                    } else {
                        iCapacity = byteBuffer.capacity();
                        iPosition = cVar.f45717c.position();
                        i11 = i10 + iPosition;
                        if (iCapacity < i11) {
                            byteBufferA = cVar.a(i11);
                            if (iPosition > 0) {
                                cVar.f45717c.position(0);
                                cVar.f45717c.limit(iPosition);
                                byteBufferA.put(cVar.f45717c);
                            }
                            cVar.f45717c = byteBufferA;
                        }
                    }
                    d dVar4 = this.f45793e;
                    j12 = dVar4.f45743b;
                    byteBuffer2 = cVar.f45717c;
                    i12 = dVar4.f45742a;
                    while (i12 > 0) {
                        a(j12);
                        int i113 = (int) (j12 - this.f45796h);
                        int iMin2 = Math.min(i12, this.f45790b - i113);
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f45792d.peek();
                        byteBuffer2.put(aVar2.f46937a, aVar2.f46938b + i113, iMin2);
                        j12 += (long) iMin2;
                        i12 -= iMin2;
                    }
                    a(this.f45793e.f45744c);
                    return -4;
                }
            }
            pVar.f46810a = eVar.f45753h[eVar.f45756k];
            this.f45797i = pVar.f46810a;
            return -5;
        }
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f45796h);
            int iMin = Math.min(i10 - i11, this.f45790b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f45792d.peek();
            System.arraycopy(aVar.f46937a, aVar.f46938b + i12, bArr, i11, iMin);
            j10 += (long) iMin;
            i11 += iMin;
        }
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f45796h)) / this.f45790b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f45789a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f45792d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f47038a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f45796h += (long) this.f45790b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f45791c;
        synchronized (eVar) {
            z10 = true;
            try {
                if (oVar == null) {
                    eVar.f45761p = true;
                } else {
                    eVar.f45761p = false;
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f45762q;
                    int i10 = z.f47158a;
                    if (!oVar.equals(oVar2)) {
                        eVar.f45762q = oVar;
                    }
                }
                z10 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar = this.f45802n;
        if (fVar == null || !z10) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        b bVar2;
        int iA = 0;
        if (!this.f45795g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f45740f, i10);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f45734g, 0, Math.min(i10, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f45737c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f45799k;
            byte[] bArr = aVar.f46937a;
            int i11 = aVar.f46938b + this.f45800l;
            int i12 = bVar.f45740f;
            if (i12 != 0) {
                int iMin2 = Math.min(i12, iA2);
                System.arraycopy(bVar.f45738d, 0, bArr, i11, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                bVar2 = bVar;
                iA = bVar.a(bArr, i11, iA2, 0, true);
            } else {
                bVar2 = bVar;
            }
            if (iA != -1) {
                bVar2.f45737c += (long) iA;
            }
            if (iA == -1) {
                if (z10) {
                    c();
                    return -1;
                }
                throw new EOFException();
            }
            this.f45800l += iA;
            this.f45798j += (long) iA;
            c();
            return iA;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f45795g.compareAndSet(0, 1)) {
            nVar.e(nVar.f47131b + i10);
            return;
        }
        while (i10 > 0) {
            int iA = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f45799k;
            nVar.a(aVar.f46937a, aVar.f46938b + this.f45800l, iA);
            this.f45800l += iA;
            this.f45798j += (long) iA;
            i10 -= iA;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!this.f45795g.compareAndSet(0, 1)) {
            e eVar = this.f45791c;
            synchronized (eVar) {
                eVar.f45759n = Math.max(eVar.f45759n, j10);
            }
            return;
        }
        try {
            if (this.f45801m) {
                if ((i10 & 1) != 0 && this.f45791c.a(j10)) {
                    this.f45801m = false;
                }
                return;
            }
            this.f45791c.a(j10, i10, (this.f45798j - ((long) i11)) - ((long) i12), i11, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.f45791c;
        eVar.f45755j = 0;
        eVar.f45756k = 0;
        eVar.f45757l = 0;
        eVar.f45754i = 0;
        eVar.f45760o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f45789a;
        LinkedBlockingDeque linkedBlockingDeque = this.f45792d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f45792d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f45789a).a();
        this.f45796h = 0L;
        this.f45798j = 0L;
        this.f45799k = null;
        this.f45800l = this.f45790b;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f45800l == this.f45790b) {
            this.f45800l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f45789a;
            synchronized (lVar) {
                try {
                    lVar.f47040c++;
                    int i11 = lVar.f47041d;
                    if (i11 > 0) {
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f47042e;
                        int i12 = i11 - 1;
                        lVar.f47041d = i12;
                        aVar = aVarArr[i12];
                        aVarArr[i12] = null;
                    } else {
                        aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f45799k = aVar;
            this.f45792d.add(aVar);
        }
        return Math.min(i10, this.f45790b - this.f45800l);
    }
}
