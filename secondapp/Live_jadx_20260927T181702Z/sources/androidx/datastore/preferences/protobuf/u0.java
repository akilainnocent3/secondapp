package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10267a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f10268b = e();

    public static v0 a() {
        v0 v0VarC = c("newInstance");
        return v0VarC != null ? v0VarC : new v0();
    }

    public static v0 b() {
        v0 v0VarC = c("getEmptyRegistry");
        return v0VarC != null ? v0VarC : v0.f10293e;
    }

    public static final v0 c(String methodName) {
        Class<?> cls = f10268b;
        if (cls == null) {
            return null;
        }
        try {
            return (v0) cls.getDeclaredMethod(methodName, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d(v0 registry) {
        Class<?> cls;
        return (p3.f10185d || (cls = f10268b) == null || !cls.isAssignableFrom(registry.getClass())) ? false : true;
    }

    public static Class<?> e() {
        try {
            return Class.forName(f10267a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
