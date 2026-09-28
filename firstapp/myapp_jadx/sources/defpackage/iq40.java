package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes8.dex */
public class iq40 {

    public static final class a extends iq40 {
        @Override // defpackage.iq40
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return led.a(method, cls, obj, objArr);
            }
            zkh.a("Calling default methods on API 24 and 25 is not supported");
            return null;
        }

        @Override // defpackage.iq40
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public static class b extends iq40 {
        @Override // defpackage.iq40
        public final String a(int i, Method method) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.a(i, method);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // defpackage.iq40
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return led.a(method, cls, obj, objArr);
        }

        @Override // defpackage.iq40
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
