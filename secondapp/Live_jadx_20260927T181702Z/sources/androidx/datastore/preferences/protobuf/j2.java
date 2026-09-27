package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f10057a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f10058b = new i2();

    public static h2 a() {
        return f10057a;
    }

    public static h2 b() {
        return f10058b;
    }

    public static h2 c() {
        if (p3.f10185d) {
            return null;
        }
        try {
            return (h2) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
