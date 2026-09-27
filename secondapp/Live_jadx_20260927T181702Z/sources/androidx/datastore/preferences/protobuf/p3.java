package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p3 f10184c = new p3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f10185d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, w3<?>> f10187b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3 f10186a = new n2();

    public static p3 a() {
        return f10184c;
    }

    public int b() {
        int iR = 0;
        for (w3<?> w3Var : this.f10187b.values()) {
            if (w3Var instanceof y2) {
                iR += ((y2) w3Var).r();
            }
        }
        return iR;
    }

    public <T> boolean c(T message) {
        return j(message).isInitialized(message);
    }

    public <T> void d(T message) {
        j(message).makeImmutable(message);
    }

    public <T> void e(T message, t3 reader) throws IOException {
        f(message, reader, v0.d());
    }

    public <T> void f(T message, t3 reader, v0 extensionRegistry) throws IOException {
        j(message).b(message, reader, extensionRegistry);
    }

    public w3<?> g(Class<?> messageType, w3<?> schema) {
        t1.e(messageType, "messageType");
        t1.e(schema, "schema");
        return this.f10187b.putIfAbsent(messageType, schema);
    }

    @x
    public w3<?> h(Class<?> messageType, w3<?> schema) {
        t1.e(messageType, "messageType");
        t1.e(schema, "schema");
        return this.f10187b.put(messageType, schema);
    }

    public <T> w3<T> i(Class<T> cls) {
        t1.e(cls, "messageType");
        w3<T> w3VarCreateSchema = (w3) this.f10187b.get(cls);
        if (w3VarCreateSchema == null) {
            w3VarCreateSchema = this.f10186a.createSchema(cls);
            w3<T> w3Var = (w3<T>) g(cls, w3VarCreateSchema);
            if (w3Var != null) {
                return w3Var;
            }
        }
        return w3VarCreateSchema;
    }

    public <T> w3<T> j(T message) {
        return i(message.getClass());
    }

    public <T> void k(T message, h5 writer) throws IOException {
        j(message).a(message, writer);
    }
}
