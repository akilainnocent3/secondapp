package gm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87160a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f87161b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.f87161b = method;
            }

            @Override // gm.i0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f87161b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: gm.i0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0853b extends b {
            public C0853b() {
                super();
            }

            @Override // gm.i0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (z.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0853b();
            }
            f87160a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f87160a.a(accessibleObject, obj);
    }

    public static com.google.gson.v.e b(List<com.google.gson.v> list, Class<?> cls) {
        Iterator<com.google.gson.v> it = list.iterator();
        while (it.hasNext()) {
            com.google.gson.v.e eVarA = it.next().a(cls);
            if (eVarA != com.google.gson.v.e.INDECISIVE) {
                return eVarA;
            }
        }
        return com.google.gson.v.e.ALLOW;
    }

    public static boolean c(Class<?> cls) {
        return d(cls.getName());
    }

    public static boolean d(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || g(str);
    }

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        return d(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean f(Class<?> cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }
}
