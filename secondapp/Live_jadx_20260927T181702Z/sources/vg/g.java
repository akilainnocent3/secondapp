package vg;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f141042t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f141043u = Float.MAX_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f141044v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f141045w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f141046x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f141047y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f141048z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f141049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f141051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f141053e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f141059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f141060l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f141063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f141064p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public vg.b f141066r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f141054f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f141055g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f141056h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f141057i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f141058j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f141061m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f141062n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f141065q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f141067s = Float.MAX_VALUE;

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
        this.f141058j = i10;
        return this;
    }

    @qj.a
    public g B(@Nullable String str) {
        this.f141060l = str;
        return this;
    }

    @qj.a
    public g C(boolean z10) {
        this.f141057i = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g D(boolean z10) {
        this.f141054f = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g E(@Nullable Layout.Alignment alignment) {
        this.f141064p = alignment;
        return this;
    }

    @qj.a
    public g F(int i10) {
        this.f141062n = i10;
        return this;
    }

    @qj.a
    public g G(int i10) {
        this.f141061m = i10;
        return this;
    }

    @qj.a
    public g H(float f10) {
        this.f141067s = f10;
        return this;
    }

    @qj.a
    public g I(@Nullable Layout.Alignment alignment) {
        this.f141063o = alignment;
        return this;
    }

    @qj.a
    public g J(boolean z10) {
        this.f141065q = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g K(@Nullable vg.b bVar) {
        this.f141066r = bVar;
        return this;
    }

    @qj.a
    public g L(boolean z10) {
        this.f141055g = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g a(@Nullable g gVar) {
        return s(gVar, true);
    }

    public int b() {
        if (this.f141053e) {
            return this.f141052d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f141051c) {
            return this.f141050b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String d() {
        return this.f141049a;
    }

    public float e() {
        return this.f141059k;
    }

    public int f() {
        return this.f141058j;
    }

    @Nullable
    public String g() {
        return this.f141060l;
    }

    @Nullable
    public Layout.Alignment h() {
        return this.f141064p;
    }

    public int i() {
        return this.f141062n;
    }

    public int j() {
        return this.f141061m;
    }

    public float k() {
        return this.f141067s;
    }

    public int l() {
        int i10 = this.f141056h;
        if (i10 == -1 && this.f141057i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f141057i == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment m() {
        return this.f141063o;
    }

    public boolean n() {
        return this.f141065q == 1;
    }

    @Nullable
    public vg.b o() {
        return this.f141066r;
    }

    public boolean p() {
        return this.f141053e;
    }

    public boolean q() {
        return this.f141051c;
    }

    @qj.a
    public g r(@Nullable g gVar) {
        return s(gVar, false);
    }

    @qj.a
    public final g s(@Nullable g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f141051c && gVar.f141051c) {
                x(gVar.f141050b);
            }
            if (this.f141056h == -1) {
                this.f141056h = gVar.f141056h;
            }
            if (this.f141057i == -1) {
                this.f141057i = gVar.f141057i;
            }
            if (this.f141049a == null && (str = gVar.f141049a) != null) {
                this.f141049a = str;
            }
            if (this.f141054f == -1) {
                this.f141054f = gVar.f141054f;
            }
            if (this.f141055g == -1) {
                this.f141055g = gVar.f141055g;
            }
            if (this.f141062n == -1) {
                this.f141062n = gVar.f141062n;
            }
            if (this.f141063o == null && (alignment2 = gVar.f141063o) != null) {
                this.f141063o = alignment2;
            }
            if (this.f141064p == null && (alignment = gVar.f141064p) != null) {
                this.f141064p = alignment;
            }
            if (this.f141065q == -1) {
                this.f141065q = gVar.f141065q;
            }
            if (this.f141058j == -1) {
                this.f141058j = gVar.f141058j;
                this.f141059k = gVar.f141059k;
            }
            if (this.f141066r == null) {
                this.f141066r = gVar.f141066r;
            }
            if (this.f141067s == Float.MAX_VALUE) {
                this.f141067s = gVar.f141067s;
            }
            if (z10 && !this.f141053e && gVar.f141053e) {
                v(gVar.f141052d);
            }
            if (z10 && this.f141061m == -1 && (i10 = gVar.f141061m) != -1) {
                this.f141061m = i10;
            }
        }
        return this;
    }

    public boolean t() {
        return this.f141054f == 1;
    }

    public boolean u() {
        return this.f141055g == 1;
    }

    @qj.a
    public g v(int i10) {
        this.f141052d = i10;
        this.f141053e = true;
        return this;
    }

    @qj.a
    public g w(boolean z10) {
        this.f141056h = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public g x(int i10) {
        this.f141050b = i10;
        this.f141051c = true;
        return this;
    }

    @qj.a
    public g y(@Nullable String str) {
        this.f141049a = str;
        return this;
    }

    @qj.a
    public g z(float f10) {
        this.f141059k = f10;
        return this;
    }
}
