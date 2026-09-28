package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lej10;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class ej10 {

    public static final class a {
        public static final a a = new a();
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (Intrinsics.g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    parameterTypes.getClass();
                    if (Intrinsics.g(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            b = method2;
            for (Method method3 : methods) {
                if (Intrinsics.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> b(Throwable th) {
        Object objInvoke;
        th.getClass();
        Method method = a.c;
        if (method == null || (objInvoke = method.invoke(th, null)) == null) {
            return m2g.a;
        }
        List<Throwable> listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}
