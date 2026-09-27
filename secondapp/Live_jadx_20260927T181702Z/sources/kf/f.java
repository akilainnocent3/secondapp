package kf;

import af.n;
import af.p;
import eh.t0;
import java.io.IOException;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102181l = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f102182m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f102183n = 65025;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f102184o = 65307;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f102185p = 1332176723;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f102186q = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f102189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f102190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f102191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f102193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f102194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f102195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f102196j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f102197k = new t0(255);

    public boolean a(n nVar, boolean z10) throws IOException {
        b();
        this.f102197k.U(27);
        if (!p.b(nVar, this.f102197k.e(), 0, 27, z10) || this.f102197k.N() != 1332176723) {
            return false;
        }
        int iL = this.f102197k.L();
        this.f102187a = iL;
        if (iL != 0) {
            if (z10) {
                return false;
            }
            throw d4.e("unsupported bit stream revision");
        }
        this.f102188b = this.f102197k.L();
        this.f102189c = this.f102197k.y();
        this.f102190d = this.f102197k.A();
        this.f102191e = this.f102197k.A();
        this.f102192f = this.f102197k.A();
        int iL2 = this.f102197k.L();
        this.f102193g = iL2;
        this.f102194h = iL2 + 27;
        this.f102197k.U(iL2);
        if (!p.b(nVar, this.f102197k.e(), 0, this.f102193g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f102193g; i10++) {
            this.f102196j[i10] = this.f102197k.L();
            this.f102195i += this.f102196j[i10];
        }
        return true;
    }

    public void b() {
        this.f102187a = 0;
        this.f102188b = 0;
        this.f102189c = 0L;
        this.f102190d = 0L;
        this.f102191e = 0L;
        this.f102192f = 0L;
        this.f102193g = 0;
        this.f102194h = 0;
        this.f102195i = 0;
    }

    public boolean c(n nVar) throws IOException {
        return d(nVar, -1L);
    }

    public boolean d(n nVar, long j10) throws IOException {
        eh.a.a(nVar.getPosition() == nVar.getPeekPosition());
        this.f102197k.U(4);
        while (true) {
            if ((j10 != -1 && nVar.getPosition() + 4 >= j10) || !p.b(nVar, this.f102197k.e(), 0, 4, true)) {
                break;
            }
            this.f102197k.Y(0);
            if (this.f102197k.N() == 1332176723) {
                nVar.resetPeekPosition();
                return true;
            }
            nVar.skipFully(1);
        }
        do {
            if (j10 != -1 && nVar.getPosition() >= j10) {
                break;
            }
        } while (nVar.skip(1) != -1);
        return false;
    }
}
