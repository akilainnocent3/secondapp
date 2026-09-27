package l7;

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
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class c {
    public static final int A = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f103664r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f103665s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f103666t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f103667u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f103668v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f103669w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f103670x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f103671y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f103672z = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k.k
    public int f103678f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f103680h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f103687o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f103673a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f103674b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f103675c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f103676d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f103677e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103679g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f103681i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f103682j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f103683k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f103684l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f103685m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f103686n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f103688p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f103689q = false;

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
        this.f103676d = str;
    }

    @qj.a
    public c B(boolean z10) {
        this.f103683k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f103681i) {
            return this.f103680h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f103689q;
    }

    public int c() {
        if (this.f103679g) {
            return this.f103678f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String d() {
        return this.f103677e;
    }

    public float e() {
        return this.f103687o;
    }

    public int f() {
        return this.f103686n;
    }

    public int g() {
        return this.f103688p;
    }

    public int h(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f103673a.isEmpty() && this.f103674b.isEmpty() && this.f103675c.isEmpty() && this.f103676d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iC = C(C(C(0, this.f103673a, str, 1073741824), this.f103674b, str2, 2), this.f103676d, str3, 4);
        if (iC == -1 || !set.containsAll(this.f103675c)) {
            return 0;
        }
        return iC + (this.f103675c.size() * 4);
    }

    public int i() {
        int i10 = this.f103684l;
        if (i10 == -1 && this.f103685m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f103685m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f103681i;
    }

    public boolean k() {
        return this.f103679g;
    }

    public boolean l() {
        return this.f103682j == 1;
    }

    public boolean m() {
        return this.f103683k == 1;
    }

    @qj.a
    public c n(int i10) {
        this.f103680h = i10;
        this.f103681i = true;
        return this;
    }

    @qj.a
    public c o(boolean z10) {
        this.f103684l = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public c p(boolean z10) {
        this.f103689q = z10;
        return this;
    }

    @qj.a
    public c q(int i10) {
        this.f103678f = i10;
        this.f103679g = true;
        return this;
    }

    @qj.a
    public c r(@Nullable String str) {
        this.f103677e = str == null ? null : zi.c.g(str);
        return this;
    }

    @qj.a
    public c s(float f10) {
        this.f103687o = f10;
        return this;
    }

    @qj.a
    public c t(int i10) {
        this.f103686n = i10;
        return this;
    }

    @qj.a
    public c u(boolean z10) {
        this.f103685m = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public c v(boolean z10) {
        this.f103682j = z10 ? 1 : 0;
        return this;
    }

    @qj.a
    public c w(int i10) {
        this.f103688p = i10;
        return this;
    }

    public void x(String[] strArr) {
        this.f103675c = new HashSet(Arrays.asList(strArr));
    }

    public void y(String str) {
        this.f103673a = str;
    }

    public void z(String str) {
        this.f103674b = str;
    }
}
