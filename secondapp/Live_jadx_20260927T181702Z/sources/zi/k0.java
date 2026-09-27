package zi;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@k
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f161747a = e();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements j0 {
        public b() {
        }

        @Override // zi.j0
        public h a(String pattern) {
            return new b0(Pattern.compile(pattern));
        }

        @Override // zi.j0
        public boolean b() {
            return true;
        }
    }

    public static h a(String pattern) {
        l0.E(pattern);
        return f161747a.a(pattern);
    }

    @zq.a
    public static String b(@zq.a String string) {
        if (i(string)) {
            return null;
        }
        return string;
    }

    public static String c(double value) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(value));
    }

    public static <T extends Enum<T>> g0<T> d(Class<T> enumClass, String value) {
        WeakReference<? extends Enum<?>> weakReference = l.a(enumClass).get(value);
        return weakReference == null ? g0.d() : g0.h(enumClass.cast(weakReference.get()));
    }

    public static j0 e() {
        return new b();
    }

    public static String f(@zq.a String string) {
        return string == null ? "" : string;
    }

    public static boolean g() {
        return f161747a.b();
    }

    public static e h(e matcher) {
        return matcher.K();
    }

    public static boolean i(@zq.a String string) {
        return string == null || string.isEmpty();
    }
}
