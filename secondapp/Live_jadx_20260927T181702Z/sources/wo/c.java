package wo;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f143498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f143499b;

        public a(Constructor constructor, Class cls) {
            this.f143498a = constructor;
            this.f143499b = cls;
        }

        @Override // wo.c
        public T b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f143498a.newInstance(null);
        }

        public String toString() {
            return this.f143499b.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f143500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f143501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f143502c;

        public b(Method method, Object obj, Class cls) {
            this.f143500a = method;
            this.f143501b = obj;
            this.f143502c = cls;
        }

        @Override // wo.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f143500a.invoke(this.f143501b, this.f143502c);
        }

        public String toString() {
            return this.f143502c.getName();
        }
    }

    /* JADX INFO: renamed from: wo.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C1509c extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f143503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f143504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f143505c;

        public C1509c(Method method, Class cls, int i10) {
            this.f143503a = method;
            this.f143504b = cls;
            this.f143505c = i10;
        }

        @Override // wo.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f143503a.invoke(null, this.f143504b, Integer.valueOf(this.f143505c));
        }

        public String toString() {
            return this.f143504b.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f143506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f143507b;

        public d(Method method, Class cls) {
            this.f143506a = method;
            this.f143507b = cls;
        }

        @Override // wo.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f143506a.invoke(null, this.f143507b, Object.class);
        }

        public String toString() {
            return this.f143507b.getName();
        }
    }

    public static <T> c<T> a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return new a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new C1509c(declaredMethod2, cls, iIntValue);
                    } catch (Exception unused3) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused5) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new d(declaredMethod3, cls);
                } catch (InvocationTargetException e10) {
                    throw xo.c.x(e10);
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }

    public abstract T b() throws IllegalAccessException, InstantiationException, InvocationTargetException;
}
