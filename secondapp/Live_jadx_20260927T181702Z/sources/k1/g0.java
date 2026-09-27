package k1;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final g0 f101691e = new g0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101695d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class a {
        @k.t
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public g0(int i10, int i11, int i12, int i13) {
        this.f101692a = i10;
        this.f101693b = i11;
        this.f101694c = i12;
        this.f101695d = i13;
    }

    @NonNull
    public static g0 a(@NonNull g0 g0Var, @NonNull g0 g0Var2) {
        return d(g0Var.f101692a + g0Var2.f101692a, g0Var.f101693b + g0Var2.f101693b, g0Var.f101694c + g0Var2.f101694c, g0Var.f101695d + g0Var2.f101695d);
    }

    @NonNull
    public static g0 b(@NonNull g0 g0Var, @NonNull g0 g0Var2) {
        return d(Math.max(g0Var.f101692a, g0Var2.f101692a), Math.max(g0Var.f101693b, g0Var2.f101693b), Math.max(g0Var.f101694c, g0Var2.f101694c), Math.max(g0Var.f101695d, g0Var2.f101695d));
    }

    @NonNull
    public static g0 c(@NonNull g0 g0Var, @NonNull g0 g0Var2) {
        return d(Math.min(g0Var.f101692a, g0Var2.f101692a), Math.min(g0Var.f101693b, g0Var2.f101693b), Math.min(g0Var.f101694c, g0Var2.f101694c), Math.min(g0Var.f101695d, g0Var2.f101695d));
    }

    @NonNull
    public static g0 d(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f101691e : new g0(i10, i11, i12, i13);
    }

    @NonNull
    public static g0 e(@NonNull Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public static g0 f(@NonNull g0 g0Var, @NonNull g0 g0Var2) {
        return d(g0Var.f101692a - g0Var2.f101692a, g0Var.f101693b - g0Var2.f101693b, g0Var.f101694c - g0Var2.f101694c, g0Var.f101695d - g0Var2.f101695d);
    }

    @NonNull
    @k.t0(api = 29)
    public static g0 g(@NonNull Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @Deprecated
    @k.t0(api = 29)
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static g0 i(@NonNull Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f101695d == g0Var.f101695d && this.f101692a == g0Var.f101692a && this.f101694c == g0Var.f101694c && this.f101693b == g0Var.f101693b;
    }

    @NonNull
    @k.t0(29)
    public Insets h() {
        return a.a(this.f101692a, this.f101693b, this.f101694c, this.f101695d);
    }

    public int hashCode() {
        return (((((this.f101692a * 31) + this.f101693b) * 31) + this.f101694c) * 31) + this.f101695d;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.f101692a + ", top=" + this.f101693b + ", right=" + this.f101694c + ", bottom=" + this.f101695d + fw.b.f85383j;
    }
}
