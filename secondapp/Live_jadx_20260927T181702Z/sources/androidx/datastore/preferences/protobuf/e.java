package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f9683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f9684b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f9685c;

    static {
        f9685c = (f9683a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f9684b;
    }

    public static boolean c() {
        if (f9683a) {
            return true;
        }
        return (f9684b == null || f9685c) ? false : true;
    }
}
