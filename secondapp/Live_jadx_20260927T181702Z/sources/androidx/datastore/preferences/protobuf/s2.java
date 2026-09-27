package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2 f10206a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q2 f10207b = new r2();

    public static q2 a() {
        return f10206a;
    }

    public static q2 b() {
        return f10207b;
    }

    public static q2 c() {
        if (p3.f10185d) {
            return null;
        }
        try {
            return (q2) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
