package qy;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @zq.h
    public static Constructor<MethodHandles.Lookup> f123220a;

    @zq.h
    @IgnoreJRERequirement
    public static Object a(Method method, Class<?> cls, Object obj, @zq.h Object[] objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> declaredConstructor = f123220a;
        if (declaredConstructor == null) {
            declaredConstructor = m.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f123220a = declaredConstructor;
        }
        return n.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
