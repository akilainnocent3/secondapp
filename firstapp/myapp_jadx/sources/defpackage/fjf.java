package defpackage;

import android.content.ComponentCallbacks2;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class fjf {
    public static Object a(hp0 hp0Var, Class cls) {
        ComponentCallbacks2 componentCallbacks2A = p1b.a(hp0Var);
        z7b.c(componentCallbacks2A instanceof j1k, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", componentCallbacks2A.getClass());
        i1k<?> i1kVarComponentManager = ((j1k) componentCallbacks2A).componentManager();
        if (!(i1kVarComponentManager instanceof adf0)) {
            return jm2.a(componentCallbacks2A, cls);
        }
        boolean z = false;
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().equals(ejf.class)) {
                z = true;
                break;
            }
        }
        z7b.c(z, "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
        return cls.cast(((adf0) i1kVarComponentManager).x0());
    }

    public static final xtv b(String str) {
        Object next;
        uag uagVar = xtv.e;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (!Intrinsics.g(((xtv) next).name(), str));
        xtv xtvVar = (xtv) next;
        return xtvVar == null ? xtv.c : xtvVar;
    }
}
