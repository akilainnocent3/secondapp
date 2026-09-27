package a7;

import f6.v;
import f6.x;
import java.io.IOException;
import u4.p1;
import x4.v0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f3935l = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f3936m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3937n = 65025;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3938o = 65307;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3939p = 1332176723;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3940q = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f3950j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f3951k = new v0(255);

    public boolean a(v vVar, boolean z10) throws IOException {
        b();
        this.f3951k.f0(27);
        if (!x.c(vVar, this.f3951k.f(), 0, 27, z10) || this.f3951k.W() != 1332176723) {
            return false;
        }
        int iU = this.f3951k.U();
        this.f3941a = iU;
        if (iU != 0) {
            if (z10) {
                return false;
            }
            throw p1.f("unsupported bit stream revision");
        }
        this.f3942b = this.f3951k.U();
        this.f3943c = this.f3951k.H();
        this.f3944d = this.f3951k.J();
        this.f3945e = this.f3951k.J();
        this.f3946f = this.f3951k.J();
        int iU2 = this.f3951k.U();
        this.f3947g = iU2;
        this.f3948h = iU2 + 27;
        this.f3951k.f0(iU2);
        if (!x.c(vVar, this.f3951k.f(), 0, this.f3947g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f3947g; i10++) {
            this.f3950j[i10] = this.f3951k.U();
            this.f3949i += this.f3950j[i10];
        }
        return true;
    }

    public void b() {
        this.f3941a = 0;
        this.f3942b = 0;
        this.f3943c = 0L;
        this.f3944d = 0L;
        this.f3945e = 0L;
        this.f3946f = 0L;
        this.f3947g = 0;
        this.f3948h = 0;
        this.f3949i = 0;
    }

    public boolean c(v vVar) throws IOException {
        return d(vVar, -1L);
    }

    public boolean d(v vVar, long j10) throws IOException {
        l0.d(vVar.getPosition() == vVar.getPeekPosition());
        this.f3951k.f0(4);
        while (true) {
            if ((j10 != -1 && vVar.getPosition() + 4 >= j10) || !x.c(vVar, this.f3951k.f(), 0, 4, true)) {
                break;
            }
            this.f3951k.j0(0);
            if (this.f3951k.W() == 1332176723) {
                vVar.resetPeekPosition();
                return true;
            }
            vVar.skipFully(1);
        }
        do {
            if (j10 != -1 && vVar.getPosition() >= j10) {
                break;
            }
        } while (vVar.skip(1) != -1);
        return false;
    }
}
