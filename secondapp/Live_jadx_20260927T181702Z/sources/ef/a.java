package ef;

import af.g0;
import eh.t0;
import java.util.Collections;
import re.d4;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80826e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80827f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80828g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80829h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f80830i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f80831j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f80832k = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80835d;

    public a(g0 g0Var) {
        super(g0Var);
    }

    @Override // ef.e
    public boolean b(t0 t0Var) throws e.a {
        if (this.f80833b) {
            t0Var.Z(1);
        } else {
            int iL = t0Var.L();
            int i10 = (iL >> 4) & 15;
            this.f80835d = i10;
            if (i10 == 2) {
                this.f80875a.c(new n2.b().g0("audio/mpeg").J(1).h0(f80832k[(iL >> 2) & 3]).G());
                this.f80834c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f80875a.c(new n2.b().g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000).G());
                this.f80834c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f80835d);
            }
            this.f80833b = true;
        }
        return true;
    }

    @Override // ef.e
    public boolean c(t0 t0Var, long j10) throws d4 {
        if (this.f80835d == 2) {
            int iA = t0Var.a();
            this.f80875a.f(t0Var, iA);
            this.f80875a.b(j10, 1, iA, 0, null);
            return true;
        }
        int iL = t0Var.L();
        if (iL != 0 || this.f80834c) {
            if (this.f80835d == 10 && iL != 1) {
                return false;
            }
            int iA2 = t0Var.a();
            this.f80875a.f(t0Var, iA2);
            this.f80875a.b(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = t0Var.a();
        byte[] bArr = new byte[iA3];
        t0Var.n(bArr, 0, iA3);
        te.a.c cVarF = te.a.f(bArr);
        this.f80875a.c(new n2.b().g0("audio/mp4a-latm").K(cVarF.f136467c).J(cVarF.f136466b).h0(cVarF.f136465a).V(Collections.singletonList(bArr)).G());
        this.f80834c = true;
        return false;
    }

    @Override // ef.e
    public void d() {
    }
}
