package s0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f128155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f128156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f128157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f128158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f128159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f128160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f128161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f128162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f128163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f128164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f128165k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f128166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f128167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f128168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f128169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f128170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f128171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f128172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f128173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f128174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f128175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f128176v;

    public c(e eVar, int i10, boolean z10) {
        this.f128155a = eVar;
        this.f128170p = i10;
        this.f128171q = z10;
    }

    public static boolean k(e eVar, int i10) {
        if (eVar.l0() == 8 || eVar.f128227b0[i10] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = eVar.f128272y[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f128176v) {
            b();
        }
        this.f128176v = true;
    }

    public final void b() {
        int i10 = this.f128170p * 2;
        e eVar = this.f128155a;
        this.f128169o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f128163i++;
            e[] eVarArr = eVar.P0;
            int i11 = this.f128170p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.O0[i11] = null;
            if (eVar.l0() != 8) {
                this.f128166l++;
                e.b bVarZ = eVar.z(this.f128170p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarZ != bVar) {
                    this.f128167m += eVar.M(this.f128170p);
                }
                int iG = this.f128167m + eVar.Y[i10].g();
                this.f128167m = iG;
                int i12 = i10 + 1;
                this.f128167m = iG + eVar.Y[i12].g();
                int iG2 = this.f128168n + eVar.Y[i10].g();
                this.f128168n = iG2;
                this.f128168n = iG2 + eVar.Y[i12].g();
                if (this.f128156b == null) {
                    this.f128156b = eVar;
                }
                this.f128158d = eVar;
                e.b[] bVarArr = eVar.f128227b0;
                int i13 = this.f128170p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f128272y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f128164j++;
                        float f10 = eVar.N0[i13];
                        if (f10 > 0.0f) {
                            this.f128165k += f10;
                        }
                        if (k(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f128172r = true;
                            } else {
                                this.f128173s = true;
                            }
                            if (this.f128162h == null) {
                                this.f128162h = new ArrayList<>();
                            }
                            this.f128162h.add(eVar);
                        }
                        if (this.f128160f == null) {
                            this.f128160f = eVar;
                        }
                        e eVar4 = this.f128161g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f128170p] = eVar;
                        }
                        this.f128161g = eVar;
                    }
                    if (this.f128170p == 0) {
                        if (eVar.f128268w != 0 || eVar.f128274z != 0 || eVar.A != 0) {
                            this.f128169o = false;
                        }
                    } else if (eVar.f128270x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f128169o = false;
                    }
                    if (eVar.f128235f0 != 0.0f) {
                        this.f128169o = false;
                        this.f128175u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f128170p] = eVar;
            }
            d dVar = eVar.Y[i10 + 1].f128184f;
            if (dVar != null) {
                e eVar5 = dVar.f128182d;
                d dVar2 = eVar5.Y[i10].f128184f;
                if (dVar2 != null && dVar2.f128182d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f128156b;
        if (eVar6 != null) {
            this.f128167m -= eVar6.Y[i10].g();
        }
        e eVar7 = this.f128158d;
        if (eVar7 != null) {
            this.f128167m -= eVar7.Y[i10 + 1].g();
        }
        this.f128157c = eVar;
        if (this.f128170p == 0 && this.f128171q) {
            this.f128159e = eVar;
        } else {
            this.f128159e = this.f128155a;
        }
        this.f128174t = this.f128173s && this.f128172r;
    }

    public e c() {
        return this.f128155a;
    }

    public e d() {
        return this.f128160f;
    }

    public e e() {
        return this.f128156b;
    }

    public e f() {
        return this.f128159e;
    }

    public e g() {
        return this.f128157c;
    }

    public e h() {
        return this.f128161g;
    }

    public e i() {
        return this.f128158d;
    }

    public float j() {
        return this.f128165k;
    }
}
