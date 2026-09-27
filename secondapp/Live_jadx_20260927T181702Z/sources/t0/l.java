package t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f135925k = new int[2];

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135926a;

        static {
            int[] iArr = new int[p.b.values().length];
            f135926a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135926a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f135926a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(s0.e eVar) {
        super(eVar);
        this.f135964h.f135898e = f.a.LEFT;
        this.f135965i.f135898e = f.a.RIGHT;
        this.f135962f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // t0.p, t0.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float fA;
        float fA2;
        int i11;
        int i12 = a.f135926a[this.f135966j.ordinal()];
        if (i12 == 1) {
            s(dVar);
        } else if (i12 == 2) {
            r(dVar);
        } else if (i12 == 3) {
            s0.e eVar = this.f135958b;
            q(dVar, eVar.Q, eVar.S, 0);
            return;
        }
        if (!this.f135961e.f135903j && this.f135960d == s0.e.b.MATCH_CONSTRAINT) {
            s0.e eVar2 = this.f135958b;
            int i13 = eVar2.f128268w;
            if (i13 == 2) {
                s0.e eVarU = eVar2.U();
                if (eVarU != null) {
                    g gVar = eVarU.f128232e.f135961e;
                    if (gVar.f135903j) {
                        this.f135961e.e((int) ((gVar.f135900g * this.f135958b.B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = eVar2.f128270x;
                if (i14 == 0 || i14 == 3) {
                    n nVar = eVar2.f128234f;
                    f fVar = nVar.f135964h;
                    f fVar2 = nVar.f135965i;
                    boolean z10 = eVar2.Q.f128184f != null;
                    boolean z11 = eVar2.R.f128184f != null;
                    boolean z12 = eVar2.S.f128184f != null;
                    boolean z13 = eVar2.T.f128184f != null;
                    int iB = eVar2.B();
                    if (z10 && z11 && z12 && z13) {
                        float fA3 = this.f135958b.A();
                        if (fVar.f135903j && fVar2.f135903j) {
                            f fVar3 = this.f135964h;
                            if (fVar3.f135896c && this.f135965i.f135896c) {
                                u(f135925k, this.f135964h.f135899f + fVar3.f135905l.get(0).f135900g, this.f135965i.f135905l.get(0).f135900g - this.f135965i.f135899f, fVar.f135899f + fVar.f135900g, fVar2.f135900g - fVar2.f135899f, fA3, iB);
                                this.f135961e.e(f135925k[0]);
                                this.f135958b.f128234f.f135961e.e(f135925k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f135964h;
                        if (fVar4.f135903j) {
                            f fVar5 = this.f135965i;
                            if (fVar5.f135903j) {
                                if (!fVar.f135896c || !fVar2.f135896c) {
                                    return;
                                }
                                u(f135925k, fVar4.f135900g + fVar4.f135899f, fVar5.f135900g - fVar5.f135899f, fVar.f135899f + fVar.f135905l.get(0).f135900g, fVar2.f135905l.get(0).f135900g - fVar2.f135899f, fA3, iB);
                                this.f135961e.e(f135925k[0]);
                                this.f135958b.f128234f.f135961e.e(f135925k[1]);
                            }
                        }
                        f fVar6 = this.f135964h;
                        if (!fVar6.f135896c || !this.f135965i.f135896c || !fVar.f135896c || !fVar2.f135896c) {
                            return;
                        }
                        u(f135925k, this.f135964h.f135899f + fVar6.f135905l.get(0).f135900g, this.f135965i.f135905l.get(0).f135900g - this.f135965i.f135899f, fVar.f135899f + fVar.f135905l.get(0).f135900g, fVar2.f135905l.get(0).f135900g - fVar2.f135899f, fA3, iB);
                        this.f135961e.e(f135925k[0]);
                        this.f135958b.f128234f.f135961e.e(f135925k[1]);
                    } else if (z10 && z12) {
                        if (!this.f135964h.f135896c || !this.f135965i.f135896c) {
                            return;
                        }
                        float fA4 = this.f135958b.A();
                        int i15 = this.f135964h.f135905l.get(0).f135900g + this.f135964h.f135899f;
                        int i16 = this.f135965i.f135905l.get(0).f135900g - this.f135965i.f135899f;
                        if (iB == -1 || iB == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fA4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fA4) + 0.5f);
                            }
                            this.f135961e.e(iG3);
                            this.f135958b.f128234f.f135961e.e(iG4);
                        } else if (iB == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fA4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fA4) + 0.5f);
                            }
                            this.f135961e.e(iG5);
                            this.f135958b.f128234f.f135961e.e(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f135896c || !fVar2.f135896c) {
                            return;
                        }
                        float fA5 = this.f135958b.A();
                        int i19 = fVar.f135905l.get(0).f135900g + fVar.f135899f;
                        int i20 = fVar2.f135905l.get(0).f135900g - fVar2.f135899f;
                        if (iB == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fA5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fA5) + 0.5f);
                            }
                            this.f135961e.e(iG2);
                            this.f135958b.f128234f.f135961e.e(iG);
                        } else if (iB == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fA5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fA5) + 0.5f);
                            }
                            this.f135961e.e(iG8);
                            this.f135958b.f128234f.f135961e.e(iG7);
                        } else if (iB == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fA5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fA5) + 0.5f);
                            }
                            this.f135961e.e(iG2);
                            this.f135958b.f128234f.f135961e.e(iG);
                        }
                    }
                } else {
                    int iB2 = eVar2.B();
                    if (iB2 != -1) {
                        if (iB2 == 0) {
                            s0.e eVar3 = this.f135958b;
                            fA2 = eVar3.f128234f.f135961e.f135900g / eVar3.A();
                            i11 = (int) (fA2 + 0.5f);
                        } else if (iB2 != 1) {
                            i11 = 0;
                        } else {
                            s0.e eVar4 = this.f135958b;
                            f10 = eVar4.f128234f.f135961e.f135900g;
                            fA = eVar4.A();
                        }
                        this.f135961e.e(i11);
                    } else {
                        s0.e eVar5 = this.f135958b;
                        f10 = eVar5.f128234f.f135961e.f135900g;
                        fA = eVar5.A();
                    }
                    fA2 = f10 * fA;
                    i11 = (int) (fA2 + 0.5f);
                    this.f135961e.e(i11);
                }
            }
        }
        f fVar7 = this.f135964h;
        if (fVar7.f135896c) {
            f fVar8 = this.f135965i;
            if (fVar8.f135896c) {
                if (fVar7.f135903j && fVar8.f135903j && this.f135961e.f135903j) {
                    return;
                }
                if (!this.f135961e.f135903j && this.f135960d == s0.e.b.MATCH_CONSTRAINT) {
                    s0.e eVar6 = this.f135958b;
                    if (eVar6.f128268w == 0 && !eVar6.B0()) {
                        f fVar9 = this.f135964h.f135905l.get(0);
                        f fVar10 = this.f135965i.f135905l.get(0);
                        int i22 = fVar9.f135900g;
                        f fVar11 = this.f135964h;
                        int i23 = i22 + fVar11.f135899f;
                        int i24 = fVar10.f135900g + this.f135965i.f135899f;
                        fVar11.e(i23);
                        this.f135965i.e(i24);
                        this.f135961e.e(i24 - i23);
                        return;
                    }
                }
                if (!this.f135961e.f135903j && this.f135960d == s0.e.b.MATCH_CONSTRAINT && this.f135957a == 1 && this.f135964h.f135905l.size() > 0 && this.f135965i.f135905l.size() > 0) {
                    int iMin = Math.min((this.f135965i.f135905l.get(0).f135900g + this.f135965i.f135899f) - (this.f135964h.f135905l.get(0).f135900g + this.f135964h.f135899f), this.f135961e.f135915m);
                    s0.e eVar7 = this.f135958b;
                    int i25 = eVar7.A;
                    int iMax = Math.max(eVar7.f128274z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f135961e.e(iMax);
                }
                if (this.f135961e.f135903j) {
                    f fVar12 = this.f135964h.f135905l.get(0);
                    f fVar13 = this.f135965i.f135905l.get(0);
                    int i26 = fVar12.f135900g + this.f135964h.f135899f;
                    int i27 = fVar13.f135900g + this.f135965i.f135899f;
                    float fE = this.f135958b.E();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f135900g;
                        i27 = fVar13.f135900g;
                        fE = 0.5f;
                    }
                    this.f135964h.e((int) (i26 + 0.5f + (((i27 - i26) - this.f135961e.f135900g) * fE)));
                    this.f135965i.e(this.f135964h.f135900g + this.f135961e.f135900g);
                }
            }
        }
    }

    @Override // t0.p
    public void d() {
        s0.e eVarU;
        s0.e eVarU2;
        s0.e eVar = this.f135958b;
        if (eVar.f128224a) {
            this.f135961e.e(eVar.m0());
        }
        if (this.f135961e.f135903j) {
            s0.e.b bVar = this.f135960d;
            s0.e.b bVar2 = s0.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarU = this.f135958b.U()) != null && (eVarU.H() == s0.e.b.FIXED || eVarU.H() == bVar2)) {
                b(this.f135964h, eVarU.f128232e.f135964h, this.f135958b.Q.g());
                b(this.f135965i, eVarU.f128232e.f135965i, -this.f135958b.S.g());
                return;
            }
        } else {
            s0.e.b bVarH = this.f135958b.H();
            this.f135960d = bVarH;
            if (bVarH != s0.e.b.MATCH_CONSTRAINT) {
                s0.e.b bVar3 = s0.e.b.MATCH_PARENT;
                if (bVarH == bVar3 && (eVarU2 = this.f135958b.U()) != null && (eVarU2.H() == s0.e.b.FIXED || eVarU2.H() == bVar3)) {
                    int iM0 = (eVarU2.m0() - this.f135958b.Q.g()) - this.f135958b.S.g();
                    b(this.f135964h, eVarU2.f128232e.f135964h, this.f135958b.Q.g());
                    b(this.f135965i, eVarU2.f128232e.f135965i, -this.f135958b.S.g());
                    this.f135961e.e(iM0);
                    return;
                }
                if (this.f135960d == s0.e.b.FIXED) {
                    this.f135961e.e(this.f135958b.m0());
                }
            }
        }
        g gVar = this.f135961e;
        if (gVar.f135903j) {
            s0.e eVar2 = this.f135958b;
            if (eVar2.f128224a) {
                s0.d[] dVarArr = eVar2.Y;
                s0.d dVar = dVarArr[0];
                s0.d dVar2 = dVar.f128184f;
                if (dVar2 != null && dVarArr[1].f128184f != null) {
                    if (eVar2.B0()) {
                        this.f135964h.f135899f = this.f135958b.Y[0].g();
                        this.f135965i.f135899f = -this.f135958b.Y[1].g();
                        return;
                    }
                    f fVarH = h(this.f135958b.Y[0]);
                    if (fVarH != null) {
                        b(this.f135964h, fVarH, this.f135958b.Y[0].g());
                    }
                    f fVarH2 = h(this.f135958b.Y[1]);
                    if (fVarH2 != null) {
                        b(this.f135965i, fVarH2, -this.f135958b.Y[1].g());
                    }
                    this.f135964h.f135895b = true;
                    this.f135965i.f135895b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f135964h, fVarH3, this.f135958b.Y[0].g());
                        b(this.f135965i, this.f135964h, this.f135961e.f135900g);
                        return;
                    }
                    return;
                }
                s0.d dVar3 = dVarArr[1];
                if (dVar3.f128184f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f135965i, fVarH4, -this.f135958b.Y[1].g());
                        b(this.f135964h, this.f135965i, -this.f135961e.f135900g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof s0.i) || eVar2.U() == null || this.f135958b.r(s0.d.a.CENTER).f128184f != null) {
                    return;
                }
                b(this.f135964h, this.f135958b.U().f128232e.f135964h, this.f135958b.o0());
                b(this.f135965i, this.f135964h, this.f135961e.f135900g);
                return;
            }
        }
        if (this.f135960d == s0.e.b.MATCH_CONSTRAINT) {
            s0.e eVar3 = this.f135958b;
            int i10 = eVar3.f128268w;
            if (i10 == 2) {
                s0.e eVarU3 = eVar3.U();
                if (eVarU3 != null) {
                    g gVar2 = eVarU3.f128234f.f135961e;
                    this.f135961e.f135905l.add(gVar2);
                    gVar2.f135904k.add(this.f135961e);
                    g gVar3 = this.f135961e;
                    gVar3.f135895b = true;
                    gVar3.f135904k.add(this.f135964h);
                    this.f135961e.f135904k.add(this.f135965i);
                }
            } else if (i10 == 3) {
                if (eVar3.f128270x == 3) {
                    this.f135964h.f135894a = this;
                    this.f135965i.f135894a = this;
                    n nVar = eVar3.f128234f;
                    nVar.f135964h.f135894a = this;
                    nVar.f135965i.f135894a = this;
                    gVar.f135894a = this;
                    if (eVar3.D0()) {
                        this.f135961e.f135905l.add(this.f135958b.f128234f.f135961e);
                        this.f135958b.f128234f.f135961e.f135904k.add(this.f135961e);
                        n nVar2 = this.f135958b.f128234f;
                        nVar2.f135961e.f135894a = this;
                        this.f135961e.f135905l.add(nVar2.f135964h);
                        this.f135961e.f135905l.add(this.f135958b.f128234f.f135965i);
                        this.f135958b.f128234f.f135964h.f135904k.add(this.f135961e);
                        this.f135958b.f128234f.f135965i.f135904k.add(this.f135961e);
                    } else if (this.f135958b.B0()) {
                        this.f135958b.f128234f.f135961e.f135905l.add(this.f135961e);
                        this.f135961e.f135904k.add(this.f135958b.f128234f.f135961e);
                    } else {
                        this.f135958b.f128234f.f135961e.f135905l.add(this.f135961e);
                    }
                } else {
                    g gVar4 = eVar3.f128234f.f135961e;
                    gVar.f135905l.add(gVar4);
                    gVar4.f135904k.add(this.f135961e);
                    this.f135958b.f128234f.f135964h.f135904k.add(this.f135961e);
                    this.f135958b.f128234f.f135965i.f135904k.add(this.f135961e);
                    g gVar5 = this.f135961e;
                    gVar5.f135895b = true;
                    gVar5.f135904k.add(this.f135964h);
                    this.f135961e.f135904k.add(this.f135965i);
                    this.f135964h.f135905l.add(this.f135961e);
                    this.f135965i.f135905l.add(this.f135961e);
                }
            }
        }
        s0.e eVar4 = this.f135958b;
        s0.d[] dVarArr2 = eVar4.Y;
        s0.d dVar4 = dVarArr2[0];
        s0.d dVar5 = dVar4.f128184f;
        if (dVar5 != null && dVarArr2[1].f128184f != null) {
            if (eVar4.B0()) {
                this.f135964h.f135899f = this.f135958b.Y[0].g();
                this.f135965i.f135899f = -this.f135958b.Y[1].g();
                return;
            }
            f fVarH5 = h(this.f135958b.Y[0]);
            f fVarH6 = h(this.f135958b.Y[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f135966j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f135964h, fVarH7, this.f135958b.Y[0].g());
                c(this.f135965i, this.f135964h, 1, this.f135961e);
                return;
            }
            return;
        }
        s0.d dVar6 = dVarArr2[1];
        if (dVar6.f128184f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f135965i, fVarH8, -this.f135958b.Y[1].g());
                c(this.f135964h, this.f135965i, -1, this.f135961e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof s0.i) || eVar4.U() == null) {
            return;
        }
        b(this.f135964h, this.f135958b.U().f128232e.f135964h, this.f135958b.o0());
        c(this.f135965i, this.f135964h, 1, this.f135961e);
    }

    @Override // t0.p
    public void e() {
        f fVar = this.f135964h;
        if (fVar.f135903j) {
            this.f135958b.g2(fVar.f135900g);
        }
    }

    @Override // t0.p
    public void f() {
        this.f135959c = null;
        this.f135964h.c();
        this.f135965i.c();
        this.f135961e.c();
        this.f135963g = false;
    }

    @Override // t0.p
    public void n() {
        this.f135963g = false;
        this.f135964h.c();
        this.f135964h.f135903j = false;
        this.f135965i.c();
        this.f135965i.f135903j = false;
        this.f135961e.f135903j = false;
    }

    @Override // t0.p
    public boolean p() {
        return this.f135960d != s0.e.b.MATCH_CONSTRAINT || this.f135958b.f128268w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f135958b.y();
    }

    public final void u(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }
}
