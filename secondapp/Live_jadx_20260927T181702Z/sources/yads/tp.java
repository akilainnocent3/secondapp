package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np f156004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp f156005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pp f156006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156007d;

    public tp(qp qpVar, sp spVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f156005b = spVar;
        this.f156007d = i10;
        this.f156004a = new np(qpVar, j10, j11, j12, j13, j14);
    }

    public final int a(ld0 ld0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        while (true) {
            pp ppVar = this.f156006c;
            if (ppVar == null) {
                throw new IllegalStateException();
            }
            long j10 = ppVar.f154052f;
            long j11 = ppVar.f154053g;
            long j12 = ppVar.f154054h;
            if (j11 - j10 <= this.f156007d) {
                this.f156006c = null;
                this.f156005b.a();
                if (j10 == ld0Var.f151947d) {
                    return 0;
                }
                gg2Var.f149607a = j10;
                return 1;
            }
            long j13 = ld0Var.f151947d;
            long j14 = j12 - j13;
            if (j14 < 0 || j14 > 262144) {
                if (j12 == j13) {
                    return 0;
                }
                gg2Var.f149607a = j12;
                return 1;
            }
            ld0Var.a((int) j14);
            ld0Var.f151949f = 0;
            rp rpVarA = this.f156005b.a(ld0Var, ppVar.f154048b);
            int i10 = rpVarA.f155081a;
            if (i10 == -3) {
                this.f156006c = null;
                this.f156005b.a();
                if (j12 == ld0Var.f151947d) {
                    return 0;
                }
                gg2Var.f149607a = j12;
                return 1;
            }
            if (i10 == -2) {
                long j15 = rpVarA.f155082b;
                long j16 = rpVarA.f155083c;
                ppVar.f154050d = j15;
                ppVar.f154052f = j16;
                ppVar.f154054h = pp.a(ppVar.f154048b, j15, ppVar.f154051e, j16, ppVar.f154053g, ppVar.f154049c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j17 = rpVarA.f155083c - ld0Var.f151947d;
                    if (j17 >= 0 && j17 <= 262144) {
                        ld0Var.a((int) j17);
                    }
                    this.f156006c = null;
                    this.f156005b.a();
                    long j18 = rpVarA.f155083c;
                    if (j18 == ld0Var.f151947d) {
                        return 0;
                    }
                    gg2Var.f149607a = j18;
                    return 1;
                }
                long j19 = rpVarA.f155082b;
                long j20 = rpVarA.f155083c;
                ppVar.f154051e = j19;
                ppVar.f154053g = j20;
                ppVar.f154054h = pp.a(ppVar.f154048b, ppVar.f154050d, j19, ppVar.f154052f, j20, ppVar.f154049c);
            }
        }
    }

    public final void a(long j10) {
        pp ppVar = this.f156006c;
        if (ppVar == null || ppVar.f154047a != j10) {
            long jA = this.f156004a.f153107a.a(j10);
            np npVar = this.f156004a;
            this.f156006c = new pp(j10, jA, npVar.f153109c, npVar.f153110d, npVar.f153111e, npVar.f153112f, npVar.f153113g);
        }
    }
}
