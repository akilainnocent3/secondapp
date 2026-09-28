package defpackage;

import androidx.compose.runtime.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ndt {
    public static final d<ibs> a;

    static {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            ClassLoader classLoader = ibs.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof d) {
                        bVar = (d) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof fae)) {
                    i++;
                }
                bVar = null;
                break;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar3 = zi50.b;
        d<ibs> qyd0Var = (d) (bVar instanceof zi50.b ? null : bVar);
        if (qyd0Var == null) {
            qyd0Var = new qyd0(new mdt());
        }
        a = qyd0Var;
    }
}
