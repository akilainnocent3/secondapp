package t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0.e f135958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f135959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0.e.b f135960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f135961e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f135962f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f135963g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f135964h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f135965i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f135966j = b.NONE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135967a;

        static {
            int[] iArr = new int[s0.d.a.values().length];
            f135967a = iArr;
            try {
                iArr[s0.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135967a[s0.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f135967a[s0.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f135967a[s0.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f135967a[s0.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(s0.e eVar) {
        this.f135958b = eVar;
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f135905l.add(fVar2);
        fVar.f135899f = i10;
        fVar2.f135904k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f135905l.add(fVar2);
        fVar.f135905l.add(this.f135961e);
        fVar.f135901h = i10;
        fVar.f135902i = gVar;
        fVar2.f135904k.add(fVar);
        gVar.f135904k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            s0.e eVar = this.f135958b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f128274z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            s0.e eVar2 = this.f135958b;
            int i13 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public final f h(s0.d dVar) {
        s0.d dVar2 = dVar.f128184f;
        if (dVar2 == null) {
            return null;
        }
        s0.e eVar = dVar2.f128182d;
        int i10 = a.f135967a[dVar2.f128183e.ordinal()];
        if (i10 == 1) {
            return eVar.f128232e.f135964h;
        }
        if (i10 == 2) {
            return eVar.f128232e.f135965i;
        }
        if (i10 == 3) {
            return eVar.f128234f.f135964h;
        }
        if (i10 == 4) {
            return eVar.f128234f.f135939k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f128234f.f135965i;
    }

    public final f i(s0.d dVar, int i10) {
        s0.d dVar2 = dVar.f128184f;
        if (dVar2 == null) {
            return null;
        }
        s0.e eVar = dVar2.f128182d;
        p pVar = i10 == 0 ? eVar.f128232e : eVar.f128234f;
        int i11 = a.f135967a[dVar2.f128183e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f135965i;
        }
        return pVar.f135964h;
    }

    public long j() {
        g gVar = this.f135961e;
        if (gVar.f135903j) {
            return gVar.f135900g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f135964h.f135905l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f135964h.f135905l.get(i11).f135897d != this) {
                i10++;
            }
        }
        int size2 = this.f135965i.f135905l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.f135965i.f135905l.get(i12).f135897d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean l() {
        return this.f135961e.f135903j;
    }

    public boolean m() {
        return this.f135963g;
    }

    public abstract void n();

    public final void o(int i10, int i11) {
        int i12 = this.f135957a;
        if (i12 == 0) {
            this.f135961e.e(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f135961e.e(Math.min(g(this.f135961e.f135915m, i10), i11));
            return;
        }
        if (i12 == 2) {
            s0.e eVarU = this.f135958b.U();
            if (eVarU != null) {
                g gVar = (i10 == 0 ? eVarU.f128232e : eVarU.f128234f).f135961e;
                if (gVar.f135903j) {
                    this.f135961e.e(g((int) ((gVar.f135900g * (i10 == 0 ? this.f135958b.B : this.f135958b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        s0.e eVar = this.f135958b;
        p pVar = eVar.f128232e;
        s0.e.b bVar = pVar.f135960d;
        s0.e.b bVar2 = s0.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f135957a == 3) {
            n nVar = eVar.f128234f;
            if (nVar.f135960d == bVar2 && nVar.f135957a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f128234f;
        }
        if (pVar.f135961e.f135903j) {
            float fA = eVar.A();
            this.f135961e.e(i10 == 1 ? (int) ((pVar.f135961e.f135900g / fA) + 0.5f) : (int) ((fA * pVar.f135961e.f135900g) + 0.5f));
        }
    }

    public abstract boolean p();

    public void q(d dVar, s0.d dVar2, s0.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f135903j && fVarH2.f135903j) {
            int iG = fVarH.f135900g + dVar2.g();
            int iG2 = fVarH2.f135900g - dVar3.g();
            int i11 = iG2 - iG;
            if (!this.f135961e.f135903j && this.f135960d == s0.e.b.MATCH_CONSTRAINT) {
                o(i10, i11);
            }
            g gVar = this.f135961e;
            if (gVar.f135903j) {
                if (gVar.f135900g == i11) {
                    this.f135964h.e(iG);
                    this.f135965i.e(iG2);
                    return;
                }
                float fE = i10 == 0 ? this.f135958b.E() : this.f135958b.g0();
                if (fVarH == fVarH2) {
                    iG = fVarH.f135900g;
                    iG2 = fVarH2.f135900g;
                    fE = 0.5f;
                }
                this.f135964h.e((int) (iG + 0.5f + (((iG2 - iG) - this.f135961e.f135900g) * fE)));
                this.f135965i.e(this.f135964h.f135900g + this.f135961e.f135900g);
            }
        }
    }

    public long t(int i10) {
        g gVar = this.f135961e;
        if (!gVar.f135903j) {
            return 0L;
        }
        long j10 = gVar.f135900g;
        if (k()) {
            return j10 + ((long) (this.f135964h.f135899f - this.f135965i.f135899f));
        }
        return i10 == 0 ? j10 + ((long) this.f135964h.f135899f) : j10 - ((long) this.f135965i.f135899f);
    }

    @Override // t0.d
    public void a(d dVar) {
    }

    public void r(d dVar) {
    }

    public void s(d dVar) {
    }
}
