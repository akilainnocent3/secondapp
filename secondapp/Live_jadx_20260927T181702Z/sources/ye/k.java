package ye;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f159208f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f159209g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f159210h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f159211i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f159212j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f159213k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f159214l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f159215m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f159216n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f159217o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f159218p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f159219q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f159220r = 256;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f159221s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f159222t = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f159223u = 2048;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f159224v = 4096;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f159225w = 8192;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f159226x = 16384;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f159227y = 32768;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f159229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f159230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f159231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f159232e;

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

    public k(String str, n2 n2Var, n2 n2Var2, int i10, int i11) {
        eh.a.a(i10 == 0 || i11 == 0);
        this.f159228a = eh.a.e(str);
        this.f159229b = (n2) eh.a.g(n2Var);
        this.f159230c = (n2) eh.a.g(n2Var2);
        this.f159231d = i10;
        this.f159232e = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f159231d == kVar.f159231d && this.f159232e == kVar.f159232e && this.f159228a.equals(kVar.f159228a) && this.f159229b.equals(kVar.f159229b) && this.f159230c.equals(kVar.f159230c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f159231d) * 31) + this.f159232e) * 31) + this.f159228a.hashCode()) * 31) + this.f159229b.hashCode()) * 31) + this.f159230c.hashCode();
    }
}
