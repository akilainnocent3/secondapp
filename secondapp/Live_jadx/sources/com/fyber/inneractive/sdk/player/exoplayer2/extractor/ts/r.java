package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f46582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46583e;

    public r(int i10) {
        this.f46579a = i10;
        byte[] bArr = new byte[131];
        this.f46582d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f46580b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f46582d;
            int length = bArr2.length;
            int i13 = this.f46583e + i12;
            if (length < i13) {
                this.f46582d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f46582d, this.f46583e, i12);
            this.f46583e += i12;
        }
    }

    public final void b(int i10) {
        if (this.f46580b) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f46579a;
        this.f46580b = z10;
        if (z10) {
            this.f46583e = 3;
            this.f46581c = false;
        }
    }

    public final boolean a(int i10) {
        if (!this.f46580b) {
            return false;
        }
        this.f46583e -= i10;
        this.f46580b = false;
        this.f46581c = true;
        return true;
    }
}
