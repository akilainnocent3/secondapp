package i7;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final int A = 3;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f90518v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f90519w = Float.MAX_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f90520x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f90521y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f90522z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f90523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f90527e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f90533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f90534l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f90537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f90538p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public i7.b f90540r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f90542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f90543u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90528f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90529g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90530h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90531i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90532j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f90535m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f90536n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f90539q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f90541s = Float.MAX_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @qj.a
    public g A(int i10) {
        this.f90524b = i10;
        this.f90525c = true;
        return this;
    }

    @qj.a
    public g B(@Nullable String str) {
        this.f90523a = str;
        return this;
    }

    @qj.a
    public g C(float f10) {
        this.f90533k = f10;
        return this;
    }

    @qj.a
    public g D(int i10) {
        this.f90532j = i10;
        return this;
    }

    @qj.a
    public g E(@Nullable String str) {
        this.f90534l = str;
        return this;
    }

    @qj.a
    public g F(boolean z10) {
        this.f90531i = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g G(boolean z10) {
        this.f90528f = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g H(@Nullable Layout.Alignment alignment) {
        this.f90538p = alignment;
        return this;
    }

    @qj.a
    public g I(@Nullable String str) {
        this.f90542t = str;
        return this;
    }

    @qj.a
    public g J(int i10) {
        this.f90536n = i10;
        return this;
    }

    @qj.a
    public g K(int i10) {
        this.f90535m = i10;
        return this;
    }

    @qj.a
    public g L(float f10) {
        this.f90541s = f10;
        return this;
    }

    @qj.a
    public g M(@Nullable Layout.Alignment alignment) {
        this.f90537o = alignment;
        return this;
    }

    @qj.a
    public g N(boolean z10) {
        this.f90539q = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g O(@Nullable i7.b bVar) {
        this.f90540r = bVar;
        return this;
    }

    @qj.a
    public g P(boolean z10) {
        this.f90529g = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g a(@Nullable g gVar) {
        return u(gVar, true);
    }

    public int b() {
        if (this.f90527e) {
            return this.f90526d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    @Nullable
    public String c() {
        return this.f90543u;
    }

    public int d() {
        if (this.f90525c) {
            return this.f90524b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String e() {
        return this.f90523a;
    }

    public float f() {
        return this.f90533k;
    }

    public int g() {
        return this.f90532j;
    }

    @Nullable
    public String h() {
        return this.f90534l;
    }

    @Nullable
    public Layout.Alignment i() {
        return this.f90538p;
    }

    @Nullable
    public String j() {
        return this.f90542t;
    }

    public int k() {
        return this.f90536n;
    }

    public int l() {
        return this.f90535m;
    }

    public float m() {
        return this.f90541s;
    }

    public int n() {
        int i10 = this.f90530h;
        if (i10 == -1 && this.f90531i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f90531i == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment o() {
        return this.f90537o;
    }

    public boolean p() {
        return this.f90539q == 1;
    }

    @Nullable
    public i7.b q() {
        return this.f90540r;
    }

    public boolean r() {
        return this.f90527e;
    }

    public boolean s() {
        return this.f90525c;
    }

    @qj.a
    public g t(@Nullable g gVar) {
        return u(gVar, false);
    }

    @qj.a
    public final g u(@Nullable g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f90525c && gVar.f90525c) {
                A(gVar.f90524b);
            }
            if (this.f90530h == -1) {
                this.f90530h = gVar.f90530h;
            }
            if (this.f90531i == -1) {
                this.f90531i = gVar.f90531i;
            }
            if (this.f90523a == null && (str = gVar.f90523a) != null) {
                this.f90523a = str;
            }
            if (this.f90528f == -1) {
                this.f90528f = gVar.f90528f;
            }
            if (this.f90529g == -1) {
                this.f90529g = gVar.f90529g;
            }
            if (this.f90536n == -1) {
                this.f90536n = gVar.f90536n;
            }
            if (this.f90537o == null && (alignment2 = gVar.f90537o) != null) {
                this.f90537o = alignment2;
            }
            if (this.f90538p == null && (alignment = gVar.f90538p) != null) {
                this.f90538p = alignment;
            }
            if (this.f90539q == -1) {
                this.f90539q = gVar.f90539q;
            }
            if (this.f90532j == -1) {
                this.f90532j = gVar.f90532j;
                this.f90533k = gVar.f90533k;
            }
            if (this.f90540r == null) {
                this.f90540r = gVar.f90540r;
            }
            if (this.f90541s == Float.MAX_VALUE) {
                this.f90541s = gVar.f90541s;
            }
            if (this.f90542t == null) {
                this.f90542t = gVar.f90542t;
            }
            if (this.f90543u == null) {
                this.f90543u = gVar.f90543u;
            }
            if (z10 && !this.f90527e && gVar.f90527e) {
                x(gVar.f90526d);
            }
            if (z10 && this.f90535m == -1 && (i10 = gVar.f90535m) != -1) {
                this.f90535m = i10;
            }
        }
        return this;
    }

    public boolean v() {
        return this.f90528f == 1;
    }

    public boolean w() {
        return this.f90529g == 1;
    }

    @qj.a
    public g x(int i10) {
        this.f90526d = i10;
        this.f90527e = true;
        return this;
    }

    @qj.a
    public g y(boolean z10) {
        this.f90530h = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g z(@Nullable String str) {
        this.f90543u = str;
        return this;
    }
}
