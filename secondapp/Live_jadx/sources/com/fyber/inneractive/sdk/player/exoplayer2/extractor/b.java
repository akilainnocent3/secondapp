package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f45734g = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f45735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f45738d = new byte[65536];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45740f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, long j10, long j11) {
        this.f45735a = hVar;
        this.f45737c = j10;
        this.f45736b = j11;
    }

    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f45738d, this.f45739e - i11, bArr, i10, i11);
        return true;
    }

    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, EOFException {
        int iA;
        int i12 = this.f45740f;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f45738d, 0, bArr, i10, iMin);
            b(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f45737c += (long) iA;
        }
        return iA != -1;
    }

    public final boolean a(int i10, boolean z10) throws InterruptedException, EOFException {
        int i11 = this.f45739e + i10;
        byte[] bArr = this.f45738d;
        if (i11 > bArr.length) {
            int i12 = z.f47158a;
            this.f45738d = Arrays.copyOf(this.f45738d, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iMin = Math.min(this.f45740f - this.f45739e, i10);
        while (iMin < i10) {
            int i13 = i10;
            boolean z11 = z10;
            iMin = a(this.f45738d, this.f45739e, i13, iMin, z11);
            if (iMin == -1) {
                return false;
            }
            i10 = i13;
            z10 = z11;
        }
        int i14 = this.f45739e + i10;
        this.f45739e = i14;
        this.f45740f = Math.max(this.f45740f, i14);
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f45740f - i10;
        this.f45740f = i11;
        this.f45739e = 0;
        byte[] bArr = this.f45738d;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f45738d = bArr2;
    }

    public final void a(int i10) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f45740f, i10);
        b(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(f45734g, -iA, Math.min(i10, iA + 4096), iA, false);
        }
        if (iA != -1) {
            this.f45737c += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, EOFException {
        if (!Thread.interrupted()) {
            int i13 = this.f45735a.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                return i12 + i13;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
