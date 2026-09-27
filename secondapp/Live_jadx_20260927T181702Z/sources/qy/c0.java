package qy;

import android.annotation.TargetApi;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @TargetApi(24)
    @IgnoreJRERequirement
    public static final class a extends c0 {
        @Override // qy.c0
        public Object b(Method method, Class<?> cls, Object obj, @zq.h Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return r.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // qy.c0
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @IgnoreJRERequirement
    public static class b extends c0 {
        @Override // qy.c0
        public String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // qy.c0
        public Object b(Method method, Class<?> cls, Object obj, @zq.h Object[] objArr) throws Throwable {
            return r.a(method, cls, obj, objArr);
        }

        @Override // qy.c0
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    @zq.h
    public Object b(Method method, Class<?> cls, Object obj, @zq.h Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
