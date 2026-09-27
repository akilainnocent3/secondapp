package androidx.leanback.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f12613e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f12614m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f12615n = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12620e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12621f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12622g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f12623h = 50.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f12624i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12625j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f12626k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f12627l;

        public a(String str) {
            s();
        }

        public void A(float f10) {
            if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f12623h = f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r4.f12619d = r4.f12617b - r4.f12625j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            r4.f12618c = (r4.f12616a - r4.f12625j) - r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void B(int r5, int r6, int r7, int r8) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.h3.a.B(int, int, int, int):void");
        }

        public int a() {
            if (this.f12627l) {
                int i10 = this.f12622g;
                int i11 = i10 >= 0 ? this.f12624i - i10 : -i10;
                float f10 = this.f12623h;
                return f10 != -1.0f ? i11 - ((int) ((this.f12624i * f10) / 100.0f)) : i11;
            }
            int i12 = this.f12622g;
            if (i12 < 0) {
                i12 += this.f12624i;
            }
            float f11 = this.f12623h;
            return f11 != -1.0f ? i12 + ((int) ((this.f12624i * f11) / 100.0f)) : i12;
        }

        public int b(int i10, int i11) {
            return i10 - i11;
        }

        public int c() {
            return (this.f12624i - this.f12625j) - this.f12626k;
        }

        public int d() {
            return this.f12618c;
        }

        public int e() {
            return this.f12619d;
        }

        public int f() {
            return this.f12626k;
        }

        public int g() {
            return this.f12625j;
        }

        public int h(int i10) {
            int i11;
            int i12;
            int i13 = i();
            int iA = a();
            boolean zP = p();
            boolean zO = o();
            if (!zP) {
                int i14 = this.f12625j;
                int i15 = iA - i14;
                if (this.f12627l ? (this.f12621f & 2) != 0 : (this.f12621f & 1) != 0) {
                    int i16 = this.f12617b;
                    if (i10 - i16 <= i15) {
                        int i17 = i16 - i14;
                        return (zO || i17 <= (i12 = this.f12618c)) ? i17 : i12;
                    }
                }
            }
            if (!zO) {
                int i18 = this.f12626k;
                int i19 = (i13 - iA) - i18;
                if (this.f12627l ? (this.f12621f & 1) != 0 : (this.f12621f & 2) != 0) {
                    int i20 = this.f12616a;
                    if (i20 - i10 <= i19) {
                        int i21 = i20 - (i13 - i18);
                        return (zP || i21 >= (i11 = this.f12619d)) ? i21 : i11;
                    }
                }
            }
            return b(i10, iA);
        }

        public int i() {
            return this.f12624i;
        }

        public int j() {
            return this.f12621f;
        }

        public int k() {
            return this.f12622g;
        }

        public float l() {
            return this.f12623h;
        }

        public void m() {
            this.f12616a = Integer.MAX_VALUE;
            this.f12618c = Integer.MAX_VALUE;
        }

        public void n() {
            this.f12617b = Integer.MIN_VALUE;
            this.f12619d = Integer.MIN_VALUE;
        }

        public boolean o() {
            return this.f12616a == Integer.MAX_VALUE;
        }

        public boolean p() {
            return this.f12617b == Integer.MIN_VALUE;
        }

        public boolean q() {
            return (this.f12620e & 2) != 0;
        }

        public boolean r() {
            return (this.f12620e & 1) != 0;
        }

        public void s() {
            this.f12617b = Integer.MIN_VALUE;
            this.f12616a = Integer.MAX_VALUE;
        }

        public void t(int i10, int i11) {
            this.f12625j = i10;
            this.f12626k = i11;
        }

        public String toString() {
            return " min:" + this.f12617b + " " + this.f12619d + " max:" + this.f12616a + " " + this.f12618c;
        }

        public void u(boolean z10) {
            this.f12620e = z10 ? this.f12620e | 2 : this.f12620e & (-3);
        }

        public void v(boolean z10) {
            this.f12620e = z10 ? this.f12620e | 1 : this.f12620e & (-2);
        }

        public void w(boolean z10) {
            this.f12627l = z10;
        }

        public void x(int i10) {
            this.f12624i = i10;
        }

        public void y(int i10) {
            this.f12621f = i10;
        }

        public void z(int i10) {
            this.f12622g = i10;
        }
    }

    public h3() {
        a aVar = new a("vertical");
        this.f12610b = aVar;
        a aVar2 = new a("horizontal");
        this.f12611c = aVar2;
        this.f12612d = aVar2;
        this.f12613e = aVar;
    }

    public int a() {
        return this.f12609a;
    }

    public a b() {
        return this.f12612d;
    }

    public void c() {
        b().s();
    }

    public a d() {
        return this.f12613e;
    }

    public void e(int i10) {
        this.f12609a = i10;
        if (i10 == 0) {
            this.f12612d = this.f12611c;
            this.f12613e = this.f12610b;
        } else {
            this.f12612d = this.f12610b;
            this.f12613e = this.f12611c;
        }
    }

    public String toString() {
        return "horizontal=" + this.f12611c + "; vertical=" + this.f12610b;
    }
}
