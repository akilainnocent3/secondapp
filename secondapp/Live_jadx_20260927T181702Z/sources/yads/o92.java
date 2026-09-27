package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f153410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f153414f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f153415g = new jb2(255);

    public final boolean a(ld0 ld0Var, boolean z10) throws ob2, EOFException {
        this.f153409a = 0;
        this.f153410b = 0L;
        this.f153411c = 0;
        this.f153412d = 0;
        this.f153413e = 0;
        this.f153415g.c(27);
        try {
            if (ld0Var.b(this.f153415g.f151001a, 0, 27, z10) && this.f153415g.n() == 1332176723) {
                if (this.f153415g.m() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw ob2.b("unsupported bit stream revision");
                }
                this.f153409a = this.f153415g.m();
                this.f153410b = this.f153415g.e();
                this.f153415g.g();
                this.f153415g.g();
                this.f153415g.g();
                int iM = this.f153415g.m();
                this.f153411c = iM;
                this.f153412d = iM + 27;
                this.f153415g.c(iM);
                try {
                    if (ld0Var.b(this.f153415g.f151001a, 0, this.f153411c, z10)) {
                        for (int i10 = 0; i10 < this.f153411c; i10++) {
                            this.f153414f[i10] = this.f153415g.m();
                            this.f153413e += this.f153414f[i10];
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f151947d;
        if (j11 == ((long) ld0Var.f151949f) + j11) {
            this.f153415g.c(4);
            while (true) {
                if (j10 != -1 && ld0Var.f151947d + 4 >= j10) {
                    break;
                }
                try {
                    if (!ld0Var.b(this.f153415g.f151001a, 0, 4, true)) {
                        break;
                    }
                    this.f153415g.e(0);
                    if (this.f153415g.n() == 1332176723) {
                        ld0Var.f151949f = 0;
                        return true;
                    }
                    ld0Var.a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (j10 != -1 && ld0Var.f151947d >= j10) {
                    break;
                }
            } while (ld0Var.c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
