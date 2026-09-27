package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f46502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46504c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.o f46507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f46508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f46511j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f46513l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f46517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f46518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46519r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f46505d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f46506e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f46514m = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f46515n = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46512k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f46516o = false;

    public l(com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar, boolean z10, boolean z11) {
        this.f46502a = rVar;
        this.f46503b = z10;
        this.f46504c = z11;
        byte[] bArr = new byte[128];
        this.f46508g = bArr;
        this.f46507f = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(bArr, 0, 0);
        k kVar = this.f46515n;
        kVar.f46487b = false;
        kVar.f46486a = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    public final void a(byte[] bArr, int i10, int i11) {
        boolean zC;
        boolean zC2;
        boolean z10;
        boolean z11;
        int iD;
        int i12;
        int iE;
        int iE2;
        int i13;
        int iB;
        if (this.f46512k) {
            int i14 = i11 - i10;
            byte[] bArr2 = this.f46508g;
            int length = bArr2.length;
            int i15 = this.f46509h + i14;
            if (length < i15) {
                this.f46508g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i10, this.f46508g, this.f46509h, i14);
            int i16 = this.f46509h + i14;
            this.f46509h = i16;
            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = this.f46507f;
            oVar.f47133a = this.f46508g;
            int i17 = 0;
            oVar.f47135c = 0;
            oVar.f47134b = i16;
            oVar.f47136d = 0;
            oVar.a();
            if (this.f46507f.a(8)) {
                this.f46507f.f();
                int iB2 = this.f46507f.b(2);
                this.f46507f.d(5);
                if (this.f46507f.b()) {
                    this.f46507f.d();
                    if (this.f46507f.b()) {
                        int iD2 = this.f46507f.d();
                        if (!this.f46504c) {
                            this.f46512k = false;
                            k kVar = this.f46515n;
                            kVar.f46490e = iD2;
                            kVar.f46487b = true;
                            return;
                        }
                        if (this.f46507f.b()) {
                            int iD3 = this.f46507f.d();
                            if (this.f46506e.indexOfKey(iD3) < 0) {
                                this.f46512k = false;
                                return;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.j) this.f46506e.get(iD3);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.k) this.f46505d.get(jVar.f47110a);
                            if (kVar2.f47116e) {
                                if (!this.f46507f.a(2)) {
                                    return;
                                } else {
                                    this.f46507f.d(2);
                                }
                            }
                            if (this.f46507f.a(kVar2.f47118g)) {
                                int iB3 = this.f46507f.b(kVar2.f47118g);
                                if (!kVar2.f47117f) {
                                    if (this.f46507f.a(1)) {
                                        zC = this.f46507f.c();
                                        if (!zC) {
                                            zC2 = false;
                                        } else {
                                            if (!this.f46507f.a(1)) {
                                                return;
                                            }
                                            zC2 = this.f46507f.c();
                                            z10 = true;
                                        }
                                        if (this.f46510i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iD = 0;
                                        } else if (!this.f46507f.b()) {
                                            return;
                                        } else {
                                            iD = this.f46507f.d();
                                        }
                                        i12 = kVar2.f47119h;
                                        if (i12 == 0) {
                                            if (!this.f46507f.a(kVar2.f47120i)) {
                                                return;
                                            }
                                            iB = this.f46507f.b(kVar2.f47120i);
                                            if (jVar.f47111b || zC) {
                                                iE = 0;
                                                i13 = iB;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f46507f.b()) {
                                                    return;
                                                }
                                                iE = this.f46507f.e();
                                                i13 = iB;
                                                iE2 = 0;
                                            }
                                        } else if (i12 == 1 || kVar2.f47121j) {
                                            iE = 0;
                                            iE2 = 0;
                                            i13 = 0;
                                        } else {
                                            if (!this.f46507f.b()) {
                                                return;
                                            }
                                            int iE3 = this.f46507f.e();
                                            if (!jVar.f47111b || zC) {
                                                iE = 0;
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f46507f.b()) {
                                                    return;
                                                }
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = this.f46507f.e();
                                                iE = 0;
                                            }
                                        }
                                        k kVar3 = this.f46515n;
                                        kVar3.f46488c = kVar2;
                                        kVar3.f46489d = iB2;
                                        kVar3.f46490e = iD2;
                                        kVar3.f46491f = iB3;
                                        kVar3.f46492g = iD3;
                                        kVar3.f46493h = zC;
                                        kVar3.f46494i = z10;
                                        kVar3.f46495j = zC2;
                                        kVar3.f46496k = z11;
                                        kVar3.f46497l = iD;
                                        kVar3.f46498m = i13;
                                        kVar3.f46499n = iE;
                                        kVar3.f46500o = i17;
                                        kVar3.f46501p = iE2;
                                        kVar3.f46486a = true;
                                        kVar3.f46487b = true;
                                        this.f46512k = false;
                                    }
                                    return;
                                }
                                zC = false;
                                zC2 = false;
                                z10 = zC2;
                                if (this.f46510i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iD = 0;
                                } else if (!this.f46507f.b()) {
                                    return;
                                } else {
                                    iD = this.f46507f.d();
                                }
                                i12 = kVar2.f47119h;
                                if (i12 == 0) {
                                    if (!this.f46507f.a(kVar2.f47120i)) {
                                        return;
                                    }
                                    iB = this.f46507f.b(kVar2.f47120i);
                                    if (jVar.f47111b) {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    } else {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    }
                                } else if (i12 == 1) {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                } else {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                }
                                k kVar4 = this.f46515n;
                                kVar4.f46488c = kVar2;
                                kVar4.f46489d = iB2;
                                kVar4.f46490e = iD2;
                                kVar4.f46491f = iB3;
                                kVar4.f46492g = iD3;
                                kVar4.f46493h = zC;
                                kVar4.f46494i = z10;
                                kVar4.f46495j = zC2;
                                kVar4.f46496k = z11;
                                kVar4.f46497l = iD;
                                kVar4.f46498m = i13;
                                kVar4.f46499n = iE;
                                kVar4.f46500o = i17;
                                kVar4.f46501p = iE2;
                                kVar4.f46486a = true;
                                kVar4.f46487b = true;
                                this.f46512k = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
