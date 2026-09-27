package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47129d;

    public m(byte[] bArr) {
        int length = bArr.length;
        this.f47126a = bArr;
        this.f47129d = length;
    }

    public final int a(int i10) {
        int i11;
        this.f47128c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f47128c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f47128c = i13;
            byte[] bArr = this.f47126a;
            int i14 = this.f47127b;
            this.f47127b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f47126a;
        int i15 = this.f47127b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f47128c = 0;
            this.f47127b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f47127b = i11;
        this.f47128c = i10 - (i11 * 8);
        a();
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f47127b + i11;
        this.f47127b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f47128c;
        this.f47128c = i13;
        if (i13 > 7) {
            this.f47127b = i12 + 1;
            this.f47128c = i13 - 8;
        }
        a();
    }

    public final boolean b() {
        byte[] bArr = this.f47126a;
        int i10 = this.f47127b;
        byte b10 = bArr[i10];
        int i11 = this.f47128c;
        boolean z10 = (b10 & (128 >> i11)) != 0;
        int i12 = i11 + 1;
        this.f47128c = i12;
        if (i12 == 8) {
            this.f47128c = 0;
            this.f47127b = i10 + 1;
        }
        a();
        return z10;
    }

    public final void a() {
        int i10 = this.f47127b;
        if (i10 >= 0) {
            int i11 = this.f47129d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f47128c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
