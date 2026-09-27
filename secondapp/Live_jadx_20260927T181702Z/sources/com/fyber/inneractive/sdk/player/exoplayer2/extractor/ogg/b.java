package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f46308a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f46311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f46316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f46317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f46319l;

    public b(long j10, long j11, l lVar, int i10, long j12) {
        if (j10 < 0 || j11 <= j10) {
            throw new IllegalArgumentException();
        }
        this.f46311d = lVar;
        this.f46309b = j10;
        this.f46310c = j11;
        if (i10 != j11 - j10) {
            this.f46312e = 0;
        } else {
            this.f46313f = j12;
            this.f46312e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[LOOP:0: B:49:0x00df->B:51:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8 A[EDGE_INSN: B:71:0x00f8->B:52:0x00f8 BREAK  A[LOOP:0: B:49:0x00df->B:51:0x00e7], SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, IOException {
        g gVar;
        long j10;
        long jMin;
        long j11;
        long j12;
        g gVar2;
        int i10;
        int i11 = this.f46312e;
        long j13 = 0;
        if (i11 == 0) {
            long j14 = bVar.f45737c;
            this.f46314g = j14;
            this.f46312e = 1;
            long j15 = this.f46310c - 65307;
            if (j15 > j14) {
                return j15;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j16 = this.f46315h;
            if (j16 == 0) {
                i10 = 3;
                j10 = 2;
            } else {
                long j17 = this.f46316i;
                long j18 = this.f46317j;
                if (j17 == j18) {
                    j11 = this.f46318k;
                } else {
                    long j19 = bVar.f45737c;
                    if (a(bVar, j18)) {
                        this.f46308a.a(bVar, false);
                        bVar.f45739e = 0;
                        g gVar3 = this.f46308a;
                        long j20 = gVar3.f46335b;
                        long j21 = j16 - j20;
                        int i12 = gVar3.f46337d + gVar3.f46338e;
                        if (j21 < 0 || j21 > 72000) {
                            if (j21 < 0) {
                                this.f46317j = j19;
                                this.f46319l = j20;
                                j10 = 2;
                            } else {
                                j10 = 2;
                                long j22 = i12;
                                long j23 = bVar.f45737c + j22;
                                this.f46316i = j23;
                                this.f46318k = j20;
                                if ((this.f46317j - j23) + j22 < 100000) {
                                    bVar.a(i12);
                                    jMin = -(this.f46318k + 2);
                                }
                            }
                            long j24 = this.f46317j;
                            long j25 = this.f46316i;
                            long j26 = j24 - j25;
                            if (j26 < 100000) {
                                this.f46317j = j25;
                                jMin = j25;
                            } else {
                                jMin = Math.min(Math.max(((j26 * j21) / (this.f46319l - this.f46318k)) + (bVar.f45737c - ((long) (i12 * (j21 <= 0 ? 2 : 1)))), j25), this.f46317j - 1);
                            }
                        } else {
                            bVar.a(i12);
                            j11 = this.f46308a.f46335b;
                        }
                    } else {
                        jMin = this.f46316i;
                        if (jMin == j19) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j10 = 2;
                    }
                    if (jMin >= 0) {
                        return jMin;
                    }
                    j12 = this.f46315h;
                    j13 = -(jMin + j10);
                    this.f46308a.a(bVar, false);
                    while (true) {
                        gVar2 = this.f46308a;
                        if (gVar2.f46335b < j12) {
                            break;
                        }
                        bVar.a(gVar2.f46337d + gVar2.f46338e);
                        g gVar4 = this.f46308a;
                        long j27 = gVar4.f46335b;
                        gVar4.a(bVar, false);
                        j13 = j27;
                    }
                    bVar.f45739e = 0;
                    i10 = 3;
                }
                jMin = -(j11 + 2);
                j10 = 2;
                if (jMin >= 0) {
                    return jMin;
                }
                j12 = this.f46315h;
                j13 = -(jMin + j10);
                this.f46308a.a(bVar, false);
                while (true) {
                    gVar2 = this.f46308a;
                    if (gVar2.f46335b < j12) {
                        break;
                        break;
                    }
                    bVar.a(gVar2.f46337d + gVar2.f46338e);
                    g gVar5 = this.f46308a;
                    long j28 = gVar5.f46335b;
                    gVar5.a(bVar, false);
                    j13 = j28;
                }
                bVar.f45739e = 0;
                i10 = 3;
            }
            this.f46312e = i10;
            return -(j13 + j10);
        }
        if (!a(bVar, this.f46310c)) {
            throw new EOFException();
        }
        g gVar6 = this.f46308a;
        gVar6.f46334a = 0;
        gVar6.f46335b = 0L;
        gVar6.f46336c = 0;
        gVar6.f46337d = 0;
        gVar6.f46338e = 0;
        while (true) {
            gVar = this.f46308a;
            if ((gVar.f46334a & 4) == 4 || bVar.f45737c >= this.f46310c) {
                break;
            }
            gVar.a(bVar, false);
            g gVar7 = this.f46308a;
            bVar.a(gVar7.f46337d + gVar7.f46338e);
        }
        this.f46313f = gVar.f46335b;
        this.f46312e = 3;
        return this.f46314g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f46313f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        int i10 = this.f46312e;
        if (i10 != 3 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        long j11 = j10 == 0 ? 0L : (((long) this.f46311d.f46354i) * j10) / 1000000;
        this.f46315h = j11;
        this.f46312e = 2;
        this.f46316i = this.f46309b;
        this.f46317j = this.f46310c;
        this.f46318k = 0L;
        this.f46319l = this.f46313f;
        return j11;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j10) throws InterruptedException, EOFException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f46310c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j11 = bVar.f45737c;
            int i12 = 0;
            if (((long) i11) + j11 > jMin && (i11 = (int) (jMin - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.a(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.a(i10);
        }
    }
}
