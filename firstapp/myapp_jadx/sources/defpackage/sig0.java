package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class sig0 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            gqm.a(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return tig0.c();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            a("isTagEnabled", e2);
            return false;
        }
    }

    public static void c(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            tig0.d(i, d(str));
            return;
        }
        String strD = d(str);
        try {
            Method method = e;
            if (method == null) {
                method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                e = method;
            }
            method.invoke(null, Long.valueOf(a), strD, Integer.valueOf(i));
        } catch (Exception e2) {
            a("traceCounter", e2);
        }
    }

    public static String d(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
