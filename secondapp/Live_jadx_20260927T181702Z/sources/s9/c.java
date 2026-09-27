package s9;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f129728a = "Trace";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f129729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f129730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f129731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f129732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f129733f;

    @SuppressLint({"NewApi"})
    public static void a(@NonNull String str, int i10) {
        try {
            if (f129731d == null) {
                e.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        try {
            if (f129731d == null) {
                f129731d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f129731d.invoke(null, Long.valueOf(f129729b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(@NonNull String str) {
        d.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@NonNull String str, int i10) {
        try {
            if (f129732e == null) {
                e.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    public static void e(@NonNull String str, int i10) {
        try {
            if (f129732e == null) {
                f129732e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f129732e.invoke(null, Long.valueOf(f129729b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        d.b();
    }

    public static void g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f129728a, "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f129730c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    public static boolean i() {
        try {
            if (f129730c == null) {
                f129729b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f129730c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f129730c.invoke(null, Long.valueOf(f129729b))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@NonNull String str, int i10) {
        try {
            if (f129733f == null) {
                e.c(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i10);
    }

    public static void k(@NonNull String str, int i10) {
        try {
            if (f129733f == null) {
                f129733f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f129733f.invoke(null, Long.valueOf(f129729b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }
}
