package mj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@d
public final class l {
    public static String a(Class<?> clazz) {
        return b(clazz.getName());
    }

    public static String b(String classFullName) {
        int iLastIndexOf = classFullName.lastIndexOf(46);
        return iLastIndexOf < 0 ? "" : classFullName.substring(0, iLastIndexOf);
    }

    public static void c(Class<?>... classes) {
        for (Class<?> cls : classes) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static <T> T d(Class<T> interfaceType, InvocationHandler handler) {
        l0.E(handler);
        l0.u(interfaceType.isInterface(), "%s is not an interface", interfaceType);
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }
}
