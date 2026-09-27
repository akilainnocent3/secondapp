package d8;

import androidx.annotation.NonNull;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f78616e = 0.26f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f78617f = 0.45f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f78618g = 0.55f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f78619h = 0.74f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f78620i = 0.3f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f78621j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f78622k = 0.7f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f78623l = 0.3f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f78624m = 0.4f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f78625n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f78626o = 0.35f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f78627p = 0.24f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f78628q = 0.52f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f78629r = 0.24f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78630s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f78631t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f78632u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f78633v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f78634w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f78635x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f78636y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f78637z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f78638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f78639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f78640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78641d;

    static {
        c cVar = new c();
        f78636y = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f78637z = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        A = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        B = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        C = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        D = cVar6;
        l(cVar6);
        n(cVar6);
    }

    public c() {
        float[] fArr = new float[3];
        this.f78638a = fArr;
        float[] fArr2 = new float[3];
        this.f78639b = fArr2;
        this.f78640c = new float[3];
        this.f78641d = true;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(c cVar) {
        float[] fArr = cVar.f78639b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(c cVar) {
        float[] fArr = cVar.f78639b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(c cVar) {
        float[] fArr = cVar.f78638a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(c cVar) {
        float[] fArr = cVar.f78639b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(c cVar) {
        float[] fArr = cVar.f78638a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f78640c[1];
    }

    @w(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f78639b[2];
    }

    @w(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f78638a[2];
    }

    @w(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f78639b[0];
    }

    @w(from = 0.0d, to = 1.0d)
    public float e() {
        return this.f78638a[0];
    }

    public float f() {
        return this.f78640c[2];
    }

    public float g() {
        return this.f78640c[0];
    }

    @w(from = 0.0d, to = 1.0d)
    public float h() {
        return this.f78639b[1];
    }

    @w(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f78638a[1];
    }

    public boolean j() {
        return this.f78641d;
    }

    public void k() {
        int length = this.f78640c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f78640c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f78640c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f78640c;
                float f12 = fArr[i11];
                if (f12 > 0.0f) {
                    fArr[i11] = f12 / f10;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.f78640c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f78642a;

        public a() {
            this.f78642a = new c();
        }

        @NonNull
        public c a() {
            return this.f78642a;
        }

        @NonNull
        public a b(boolean z10) {
            this.f78642a.f78641d = z10;
            return this;
        }

        @NonNull
        public a c(@w(from = 0.0d) float f10) {
            this.f78642a.f78640c[1] = f10;
            return this;
        }

        @NonNull
        public a d(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78639b[2] = f10;
            return this;
        }

        @NonNull
        public a e(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78638a[2] = f10;
            return this;
        }

        @NonNull
        public a f(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78639b[0] = f10;
            return this;
        }

        @NonNull
        public a g(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78638a[0] = f10;
            return this;
        }

        @NonNull
        public a h(@w(from = 0.0d) float f10) {
            this.f78642a.f78640c[2] = f10;
            return this;
        }

        @NonNull
        public a i(@w(from = 0.0d) float f10) {
            this.f78642a.f78640c[0] = f10;
            return this;
        }

        @NonNull
        public a j(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78639b[1] = f10;
            return this;
        }

        @NonNull
        public a k(@w(from = 0.0d, to = 1.0d) float f10) {
            this.f78642a.f78638a[1] = f10;
            return this;
        }

        public a(@NonNull c cVar) {
            this.f78642a = new c(cVar);
        }
    }

    public c(@NonNull c cVar) {
        float[] fArr = new float[3];
        this.f78638a = fArr;
        float[] fArr2 = new float[3];
        this.f78639b = fArr2;
        float[] fArr3 = new float[3];
        this.f78640c = fArr3;
        this.f78641d = true;
        System.arraycopy(cVar.f78638a, 0, fArr, 0, fArr.length);
        System.arraycopy(cVar.f78639b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(cVar.f78640c, 0, fArr3, 0, fArr3.length);
    }
}
