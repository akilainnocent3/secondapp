package u1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f137546a = "TraceCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f137547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f137548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f137549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f137550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f137551f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class a {
        @k.t
        public static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        @k.t
        public static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        @k.t
        public static boolean c() {
            return Trace.isEnabled();
        }

        @k.t
        public static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f137547b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f137548c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f137549d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f137550e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f137551f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i(f137546a, "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(str, i10);
            return;
        }
        try {
            f137549d.invoke(null, Long.valueOf(f137547b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f137546a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void c(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(str, i10);
            return;
        }
        try {
            f137550e.invoke(null, Long.valueOf(f137547b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f137546a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f137548c.invoke(null, Long.valueOf(f137547b))).booleanValue();
        } catch (Exception unused) {
            Log.v(f137546a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(str, i10);
            return;
        }
        try {
            f137551f.invoke(null, Long.valueOf(f137547b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f137546a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
