package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rv0 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f155163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uv0 f155165c = new uv0();

    public rv0(int i10, bw0 bw0Var) {
        this.f155163a = bw0Var;
        this.f155164b = i10;
    }

    @Override // yads.sp
    public /* synthetic */ void a() {
        xa4.a(this);
    }

    public final long a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        long j10;
        while (true) {
            long j11 = ld0Var.f151947d + ((long) ld0Var.f151949f);
            long j12 = 6;
            if (j11 >= ld0Var.f151946c - 6) {
                j10 = 6;
                break;
            }
            bw0 bw0Var = this.f155163a;
            int i10 = this.f155164b;
            uv0 uv0Var = this.f155165c;
            byte[] bArr = new byte[2];
            ld0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i10) {
                jb2 jb2Var = new jb2(16);
                System.arraycopy(bArr, 0, jb2Var.f151001a, 0, 2);
                byte[] bArr2 = jb2Var.f151001a;
                int i11 = 0;
                while (true) {
                    if (i11 >= 14) {
                        j10 = j12;
                        break;
                    }
                    j10 = j12;
                    int iB = ld0Var.b(bArr2, 2 + i11, 14 - i11);
                    if (iB == -1) {
                        break;
                    }
                    i11 += iB;
                    j12 = j10;
                }
                jb2Var.d(i11);
                ld0Var.f151949f = 0;
                ld0Var.a(false, (int) (j11 - ld0Var.f151947d));
                if (vv0.a(jb2Var, bw0Var, i10, uv0Var)) {
                    break;
                }
            } else {
                ld0Var.f151949f = 0;
                ld0Var.a(false, (int) (j11 - ld0Var.f151947d));
            }
            ld0Var.a(false, 1);
        }
        long j13 = ld0Var.f151947d + ((long) ld0Var.f151949f);
        long j14 = ld0Var.f151946c;
        if (j13 < j14 - j10) {
            return this.f155165c.f156652a;
        }
        ld0Var.a(false, (int) (j14 - j13));
        return this.f155163a.f147375j;
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f151947d;
        long jA = a(ld0Var);
        long j12 = ld0Var.f151947d + ((long) ld0Var.f151949f);
        ld0Var.a(false, Math.max(6, this.f155163a.f147368c));
        long jA2 = a(ld0Var);
        long j13 = ld0Var.f151947d + ((long) ld0Var.f151949f);
        if (jA <= j10 && jA2 > j10) {
            return new rp(0, -9223372036854775807L, j12);
        }
        if (jA2 <= j10) {
            return new rp(-2, jA2, j13);
        }
        return new rp(-1, jA, j11);
    }
}
