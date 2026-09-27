package gm;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f87170a = c();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f87171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f87172c;

        public a(Method method, Object obj) {
            this.f87171b = method;
            this.f87172c = obj;
        }

        @Override // gm.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            return (T) this.f87171b.invoke(this.f87172c, cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f87173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f87174c;

        public b(Method method, int i10) {
            this.f87173b = method;
            this.f87174c = i10;
        }

        @Override // gm.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            return (T) this.f87173b.invoke(null, cls, Integer.valueOf(this.f87174c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Method f87175b;

        public c(Method method) {
            this.f87175b = method;
        }

        @Override // gm.l0
        public <T> T d(Class<T> cls) throws Exception {
            l0.b(cls);
            return (T) this.f87175b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends l0 {
        @Override // gm.l0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    public static l0 c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T d(Class<T> cls) throws Exception;
}
