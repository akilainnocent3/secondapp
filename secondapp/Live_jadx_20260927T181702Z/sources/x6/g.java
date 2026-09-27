package x6;

import f6.v;
import java.io.IOException;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144729c = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144730d = 440786851;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f144731a = new v0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144732b;

    public final long a(v vVar) throws IOException {
        int i10 = 0;
        vVar.peekFully(this.f144731a.f(), 0, 1);
        int i11 = this.f144731a.f()[0] & 255;
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
        vVar.peekFully(this.f144731a.f(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f144731a.f()[i10] & 255) + (i14 << 8);
        }
        this.f144732b += i13 + 1;
        return i14;
    }

    public boolean b(v vVar) throws IOException {
        long length = vVar.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        vVar.peekFully(this.f144731a.f(), 0, 4);
        long jW = this.f144731a.W();
        this.f144732b = 4;
        while (jW != 440786851) {
            int i11 = this.f144732b + 1;
            this.f144732b = i11;
            if (i11 == i10) {
                return false;
            }
            vVar.peekFully(this.f144731a.f(), 0, 1);
            jW = ((jW << 8) & (-256)) | ((long) (this.f144731a.f()[0] & 255));
        }
        long jA = a(vVar);
        long j11 = this.f144732b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f144732b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(vVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(vVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        return false;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        vVar.advancePeekPosition(i13);
                        this.f144732b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
