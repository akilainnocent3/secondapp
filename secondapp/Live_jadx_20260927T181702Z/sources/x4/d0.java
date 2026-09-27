package x4;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f144255a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f144256b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144257c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144258d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144259e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k.a0("lock")
    public static int f144261g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @k.a0("lock")
    public static boolean f144262h = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f144260f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @k.a0("lock")
    public static b f144263i = b.f144264a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f144264a = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements b {
            @Override // x4.d0.b
            public void a(String str, String str2, @Nullable Throwable th2) {
                Log.d(str, d0.a(str2, th2));
            }

            @Override // x4.d0.b
            public void b(String str, String str2, @Nullable Throwable th2) {
                Log.i(str, d0.a(str2, th2));
            }

            @Override // x4.d0.b
            public void e(String str, String str2, @Nullable Throwable th2) {
                Log.e(str, d0.a(str2, th2));
            }

            @Override // x4.d0.b
            public void w(String str, String str2, @Nullable Throwable th2) {
                Log.w(str, d0.a(str2, th2));
            }
        }

        void a(String str, String str2, @Nullable Throwable th2);

        void b(String str, String str2, @Nullable Throwable th2);

        void e(String str, String str2, @Nullable Throwable th2);

        void w(String str, String str2, @Nullable Throwable th2);
    }

    @ky.d
    public static String a(String str, @Nullable Throwable th2) {
        String strG = g(th2);
        if (TextUtils.isEmpty(strG)) {
            return str;
        }
        return str + "\n  " + strG.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ") + '\n';
    }

    @ky.d
    public static void b(@k.a1(max = 23) String str, String str2) {
        synchronized (f144260f) {
            try {
                if (f144261g == 0) {
                    f144263i.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void c(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (f144260f) {
            try {
                if (f144261g == 0) {
                    f144263i.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @ky.d
    public static void d(@k.a1(max = 23) String str, String str2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 3) {
                    f144263i.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void e(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 3) {
                    f144263i.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @ky.d
    public static int f() {
        int i10;
        synchronized (f144260f) {
            i10 = f144261g;
        }
        return i10;
    }

    @Nullable
    @ky.d
    public static String g(@Nullable Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f144260f) {
            try {
                if (j(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f144262h) {
                    return Log.getStackTraceString(th2).trim().replace("\t", ew.b0.f81731a);
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @ky.d
    public static void h(@k.a1(max = 23) String str, String str2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 1) {
                    f144263i.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void i(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 1) {
                    f144263i.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @ky.d
    public static boolean j(@Nullable Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void k(int i10) {
        synchronized (f144260f) {
            f144261g = i10;
        }
    }

    public static void l(boolean z10) {
        synchronized (f144260f) {
            f144262h = z10;
        }
    }

    public static void m(b bVar) {
        synchronized (f144260f) {
            f144263i = bVar;
        }
    }

    @ky.d
    public static void n(@k.a1(max = 23) String str, String str2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 2) {
                    f144263i.w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void o(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (f144260f) {
            try {
                if (f144261g <= 2) {
                    f144263i.w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
