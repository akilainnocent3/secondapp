package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f10031a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f3 f10032b = new g3();

    public static f3 a() {
        return f10031a;
    }

    public static f3 b() {
        return f10032b;
    }

    public static f3 c() {
        if (p3.f10185d) {
            return null;
        }
        try {
            return (f3) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
