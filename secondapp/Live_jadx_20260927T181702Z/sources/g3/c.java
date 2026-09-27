package g3;

import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b<c> {
    public final a G;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f86002d = -4.2f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f86003e = 62.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f86005b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f86004a = -4.2f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b.p f86006c = new b.p();

        @Override // g3.i
        public float a(float f10, float f11) {
            return f11 * this.f86004a;
        }

        @Override // g3.i
        public boolean b(float f10, float f11) {
            return Math.abs(f11) < this.f86005b;
        }

        public float c() {
            return this.f86004a / (-4.2f);
        }

        public void d(float f10) {
            this.f86004a = f10 * (-4.2f);
        }

        public void e(float f10) {
            this.f86005b = f10 * 62.5f;
        }

        public b.p f(float f10, float f11, long j10) {
            float f12 = j10;
            this.f86006c.f86001b = (float) (((double) f11) * Math.exp((f12 / 1000.0f) * this.f86004a));
            b.p pVar = this.f86006c;
            float f13 = this.f86004a;
            pVar.f86000a = (float) (((double) (f10 - (f11 / f13))) + (((double) (f11 / f13)) * Math.exp((f13 * f12) / 1000.0f)));
            b.p pVar2 = this.f86006c;
            if (b(pVar2.f86000a, pVar2.f86001b)) {
                this.f86006c.f86001b = 0.0f;
            }
            return this.f86006c;
        }
    }

    public c(h hVar) {
        super(hVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f10);
        return this;
    }

    @Override // g3.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c p(float f10) {
        super.p(f10);
        return this;
    }

    @Override // g3.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c q(float f10) {
        super.q(f10);
        return this;
    }

    @Override // g3.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c u(float f10) {
        super.u(f10);
        return this;
    }

    @Override // g3.b
    public float f(float f10, float f11) {
        return this.G.a(f10, f11);
    }

    @Override // g3.b
    public boolean j(float f10, float f11) {
        return f10 >= this.f85992g || f10 <= this.f85993h || this.G.b(f10, f11);
    }

    @Override // g3.b
    public void v(float f10) {
        this.G.e(f10);
    }

    @Override // g3.b
    public boolean y(long j10) {
        b.p pVarF = this.G.f(this.f85987b, this.f85986a, j10);
        float f10 = pVarF.f86000a;
        this.f85987b = f10;
        float f11 = pVarF.f86001b;
        this.f85986a = f11;
        float f12 = this.f85993h;
        if (f10 < f12) {
            this.f85987b = f12;
            return true;
        }
        float f13 = this.f85992g;
        if (f10 <= f13) {
            return j(f10, f11);
        }
        this.f85987b = f13;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> c(K k10, g<K> gVar) {
        super(k10, gVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}
