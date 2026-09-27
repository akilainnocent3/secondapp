package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47041d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f47042e = new a[100];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f47038a = new a[1];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f47039b;
        this.f47039b = i10;
        if (z10) {
            a();
        }
    }

    public final synchronized void a(a[] aVarArr) {
        try {
            int i10 = this.f47041d;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f47042e;
            if (length >= aVarArr2.length) {
                this.f47042e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f46937a;
                if (bArr != null && bArr.length != 65536) {
                    throw new IllegalArgumentException();
                }
                a[] aVarArr3 = this.f47042e;
                int i11 = this.f47041d;
                this.f47041d = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f47040c -= aVarArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        int i10 = this.f47039b;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f47040c);
        int i12 = this.f47041d;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f47042e, iMax, i12, (Object) null);
        this.f47041d = iMax;
    }
}
