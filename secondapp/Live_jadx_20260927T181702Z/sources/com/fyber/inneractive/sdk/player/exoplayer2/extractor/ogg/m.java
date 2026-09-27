package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46362d;

    public m(byte[] bArr) {
        this.f46359a = bArr;
        this.f46360b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f46359a[this.f46361c] & 255) >> this.f46362d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f46361c + i11;
        this.f46361c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f46362d;
        this.f46362d = i13;
        if (i13 > 7) {
            this.f46361c = i12 + 1;
            this.f46362d = i13 - 8;
        }
        int i14 = this.f46361c;
        if (i14 >= 0) {
            int i15 = this.f46360b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f46362d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i10) {
        int i11 = this.f46361c;
        int iMin = Math.min(i10, 8 - this.f46362d);
        int i12 = i11 + 1;
        int i13 = ((this.f46359a[i11] & 255) >> this.f46362d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f46359a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
