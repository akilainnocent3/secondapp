package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f10290b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10291c = "androidx.datastore.preferences.protobuf.Extension";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile v0 f10292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0 f10293e = new v0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<b, l1.h<?, ?>> f10294a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Class<?> f10295a = a();

        public static Class<?> a() {
            try {
                return Class.forName(v0.f10291c);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10297b;

        public b(final Object object, final int number) {
            this.f10296a = object;
            this.f10297b = number;
        }

        public boolean equals(final Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10296a == bVar.f10296a && this.f10297b == bVar.f10297b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10296a) * 65535) + this.f10297b;
        }
    }

    public v0() {
        this.f10294a = new HashMap();
    }

    public static v0 d() {
        v0 v0VarB;
        if (p3.f10185d) {
            return f10293e;
        }
        v0 v0Var = f10292d;
        if (v0Var != null) {
            return v0Var;
        }
        synchronized (v0.class) {
            try {
                v0VarB = f10292d;
                if (v0VarB == null) {
                    v0VarB = u0.b();
                    f10292d = v0VarB;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v0VarB;
    }

    public static boolean f() {
        return f10290b;
    }

    public static v0 g() {
        return p3.f10185d ? new v0() : u0.a();
    }

    public static void h(boolean isEagerlyParse) {
        f10290b = isEagerlyParse;
    }

    public final void a(t0<?, ?> extension) {
        if (l1.h.class.isAssignableFrom(extension.getClass())) {
            b((l1.h) extension);
        }
        if (p3.f10185d || !u0.d(this)) {
            return;
        }
        try {
            getClass().getMethod("add", a.f10295a).invoke(this, extension);
        } catch (Exception e10) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extension), e10);
        }
    }

    public final void b(final l1.h<?, ?> extension) {
        this.f10294a.put(new b(extension.h(), extension.d()), extension);
    }

    public <ContainingType extends v2> l1.h<ContainingType, ?> c(final ContainingType containingTypeDefaultInstance, final int fieldNumber) {
        return (l1.h) this.f10294a.get(new b(containingTypeDefaultInstance, fieldNumber));
    }

    public v0 e() {
        return new v0(this);
    }

    public v0(v0 other) {
        if (other == f10293e) {
            this.f10294a = Collections.EMPTY_MAP;
        } else {
            this.f10294a = Collections.unmodifiableMap(other.f10294a);
        }
    }

    public v0(boolean empty) {
        this.f10294a = Collections.EMPTY_MAP;
    }
}
