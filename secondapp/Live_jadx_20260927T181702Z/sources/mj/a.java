package mj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@d
public abstract class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f107525a = new Object[0];

    public static boolean b(Object arg, Class<?> proxyClass) {
        if (proxyClass.isInstance(arg)) {
            return true;
        }
        return Proxy.isProxyClass(arg.getClass()) && Arrays.equals(arg.getClass().getInterfaces(), proxyClass.getInterfaces());
    }

    @zq.a
    public abstract Object a(Object proxy, Method method, Object[] args) throws Throwable;

    public boolean equals(@zq.a Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @zq.a
    public final Object invoke(Object proxy, Method method, @zq.a Object[] args) throws Throwable {
        if (args == null) {
            args = f107525a;
        }
        if (args.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (args.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (args.length == 0 && method.getName().equals("toString")) ? toString() : a(proxy, method, args);
        }
        Object obj = args[0];
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (proxy == obj) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(b(obj, proxy.getClass()) && equals(Proxy.getInvocationHandler(obj)));
    }

    public String toString() {
        return super.toString();
    }
}
