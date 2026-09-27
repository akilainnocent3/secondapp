package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ld0 implements nq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30 f151945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f151946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f151947d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f151949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f151950g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f151948e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f151944a = new byte[4096];

    static {
        ho0.a("goog.exo.extractor");
    }

    public ld0(p30 p30Var, long j10, long j11) {
        this.f151945b = p30Var;
        this.f151947d = j10;
        this.f151946c = j11;
    }

    public final boolean a(boolean z10, int i10) throws EOFException, InterruptedIOException {
        int i11 = this.f151949f + i10;
        byte[] bArr = this.f151948e;
        if (i11 > bArr.length) {
            int i12 = ib3.f150516a;
            this.f151948e = Arrays.copyOf(this.f151948e, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iA = this.f151950g - this.f151949f;
        while (iA < i10) {
            boolean z11 = z10;
            int i13 = i10;
            iA = a(this.f151948e, this.f151949f, i13, iA, z11);
            if (iA == -1) {
                return false;
            }
            this.f151950g = this.f151949f + iA;
            i10 = i13;
            z10 = z11;
        }
        this.f151949f += i10;
        return true;
    }

    @Override // yads.nq0
    public final void b(int i10) throws EOFException, InterruptedIOException {
        a(false, i10);
    }

    @Override // yads.nq0
    public final long c() {
        return this.f151947d + ((long) this.f151949f);
    }

    public final void d(int i10) {
        int i11 = this.f151950g - i10;
        this.f151950g = i11;
        this.f151949f = 0;
        byte[] bArr = this.f151948e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f151948e = bArr2;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f151946c;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int i12 = this.f151950g;
        int iA = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f151948e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            ld0Var = this;
            iA = ld0Var.a(bArr, i10, i11, 0, true);
        } else {
            ld0Var = this;
        }
        if (iA != -1) {
            ld0Var.f151947d += (long) iA;
        }
        return iA;
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        a(bArr, i10, i11, false);
    }

    public final int b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int iMin;
        int i12 = this.f151949f + i11;
        byte[] bArr2 = this.f151948e;
        if (i12 > bArr2.length) {
            int i13 = ib3.f150516a;
            this.f151948e = Arrays.copyOf(this.f151948e, Math.max(65536 + i12, Math.min(bArr2.length * 2, i12 + 524288)));
        }
        int i14 = this.f151950g;
        int i15 = this.f151949f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            ld0Var = this;
            iMin = ld0Var.a(this.f151948e, i15, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            ld0Var.f151950g += iMin;
        } else {
            ld0Var = this;
            iMin = Math.min(i11, i16);
        }
        System.arraycopy(ld0Var.f151948e, ld0Var.f151949f, bArr, i10, iMin);
        ld0Var.f151949f += iMin;
        return iMin;
    }

    public final int c(int i10) throws EOFException, InterruptedIOException {
        ld0 ld0Var;
        int iMin = Math.min(this.f151950g, i10);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f151944a;
            ld0Var = this;
            iMin = ld0Var.a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            ld0Var = this;
        }
        if (iMin != -1) {
            ld0Var.f151947d += (long) iMin;
        }
        return iMin;
    }

    @Override // yads.nq0
    public final long a() {
        return this.f151947d;
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iA;
        int i12 = this.f151950g;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f151948e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f151947d += (long) iA;
        }
        return iA != -1;
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(z10, i11)) {
            return false;
        }
        System.arraycopy(this.f151948e, this.f151949f - i11, bArr, i10, i11);
        return true;
    }

    @Override // yads.nq0
    public final void b() {
        this.f151949f = 0;
    }

    @Override // yads.nq0
    public final void a(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f151950g, i10);
        d(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(this.f151944a, -iA, Math.min(i10, this.f151944a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f151947d += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i13 = this.f151945b.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                return i12 + i13;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
