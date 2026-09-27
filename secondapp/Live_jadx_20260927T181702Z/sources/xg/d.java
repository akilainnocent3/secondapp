package xg;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {
    public static final int A = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f145046r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f145047s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f145048t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f145049u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f145050v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f145051w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f145052x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f145053y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f145054z = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k.k
    public int f145060f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f145062h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f145069o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f145055a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f145056b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f145057c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f145058d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f145059e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f145061g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f145063i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f145064j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f145065k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f145066l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f145067m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f145068n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f145070p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f145071q = false;

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

    public static int C(int i10, String str, @Nullable String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public void A(String str) {
        this.f145058d = str;
    }

    @qj.a
    public d B(boolean z10) {
        this.f145065k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f145063i) {
            return this.f145062h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f145071q;
    }

    public int c() {
        if (this.f145061g) {
            return this.f145060f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String d() {
        return this.f145059e;
    }

    public float e() {
        return this.f145069o;
    }

    public int f() {
        return this.f145068n;
    }

    public int g() {
        return this.f145070p;
    }

    public int h(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f145055a.isEmpty() && this.f145056b.isEmpty() && this.f145057c.isEmpty() && this.f145058d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iC = C(C(C(0, this.f145055a, str, 1073741824), this.f145056b, str2, 2), this.f145058d, str3, 4);
        if (iC == -1 || !set.containsAll(this.f145057c)) {
            return 0;
        }
        return iC + (this.f145057c.size() * 4);
    }

    public int i() {
        int i10 = this.f145066l;
        if (i10 == -1 && this.f145067m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f145067m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f145063i;
    }

    public boolean k() {
        return this.f145061g;
    }

    public boolean l() {
        return this.f145064j == 1;
    }

    public boolean m() {
        return this.f145065k == 1;
    }

    @qj.a
    public d n(int i10) {
        this.f145062h = i10;
        this.f145063i = true;
        return this;
    }

    @qj.a
    public d o(boolean z10) {
        this.f145066l = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public d p(boolean z10) {
        this.f145071q = z10;
        return this;
    }

    @qj.a
    public d q(int i10) {
        this.f145060f = i10;
        this.f145061g = true;
        return this;
    }

    @qj.a
    public d r(@Nullable String str) {
        this.f145059e = str == null ? null : zi.c.g(str);
        return this;
    }

    @qj.a
    public d s(float f10) {
        this.f145069o = f10;
        return this;
    }

    @qj.a
    public d t(int i10) {
        this.f145068n = i10;
        return this;
    }

    @qj.a
    public d u(boolean z10) {
        this.f145067m = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public d v(boolean z10) {
        this.f145064j = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public d w(int i10) {
        this.f145070p = i10;
        return this;
    }

    public void x(String[] strArr) {
        this.f145057c = new HashSet(Arrays.asList(strArr));
    }

    public void y(String str) {
        this.f145055a = str;
    }

    public void z(String str) {
        this.f145056b = str;
    }
}
