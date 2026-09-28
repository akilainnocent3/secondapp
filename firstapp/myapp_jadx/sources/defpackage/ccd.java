package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes8.dex */
public final class ccd {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.CompletionException");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }

    public static Throwable a(Throwable th) {
        Class<?> cls;
        if (th.getCause() != null) {
            return ((th instanceof ExecutionException) || ((cls = a) != null && cls.isInstance(th)) || (th instanceof InvocationTargetException) || (th instanceof UndeclaredThrowableException)) ? a(th.getCause()) : th;
        }
        return th;
    }
}
