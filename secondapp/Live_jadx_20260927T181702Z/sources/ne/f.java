package ne;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@ge.e
public abstract class f {
    @ge.f
    @cr.b("SQLITE_DB_NAME")
    public static String b() {
        return w0.f116513d;
    }

    @ge.f
    @cr.b("PACKAGE_NAME")
    @cr.f
    public static String d(Context context) {
        return context.getPackageName();
    }

    @ge.f
    @cr.b("SCHEMA_VERSION")
    public static int e() {
        return w0.f116529t;
    }

    @ge.f
    public static e f() {
        return e.f116462f;
    }

    @ge.a
    public abstract c a(n0 n0Var);

    @ge.a
    public abstract d c(n0 n0Var);

    @ge.a
    public abstract oe.b g(n0 n0Var);
}
