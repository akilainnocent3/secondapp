package gf;

import af.n;
import eh.t0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86606c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86607d = 440786851;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f86608a = new t0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86609b;

    public final long a(n nVar) throws IOException {
        int i10 = 0;
        nVar.peekFully(this.f86608a.e(), 0, 1);
        int i11 = this.f86608a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        nVar.peekFully(this.f86608a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f86608a.e()[i10] & 255) + (i14 << 8);
        }
        this.f86609b += i13 + 1;
        return i14;
    }

    public boolean b(n nVar) throws IOException {
        long length = nVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        nVar.peekFully(this.f86608a.e(), 0, 4);
        long jN = this.f86608a.N();
        this.f86609b = 4;
        while (jN != 440786851) {
            int i11 = this.f86609b + 1;
            this.f86609b = i11;
            if (i11 == i10) {
                return false;
            }
            nVar.peekFully(this.f86608a.e(), 0, 1);
            jN = ((jN << 8) & (-256)) | ((long) (this.f86608a.e()[0] & 255));
        }
        long jA = a(nVar);
        long j11 = this.f86609b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f86609b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(nVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(nVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        return false;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        nVar.advancePeekPosition(i13);
                        this.f86609b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
