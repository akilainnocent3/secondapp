package eh;

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
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f80968a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80969b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80970c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80971d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80972e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k.a0("lock")
    public static int f80974g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @k.a0("lock")
    public static boolean f80975h = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f80973f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @k.a0("lock")
    public static b f80976i = b.f80977a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f80977a = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements b {
            @Override // eh.h0.b
            public void a(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // eh.h0.b
            public void b(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // eh.h0.b
            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // eh.h0.b
            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void d(String str, String str2);

        void w(String str, String str2);
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
        synchronized (f80973f) {
            try {
                if (f80974g == 0) {
                    f80976i.d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void c(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        b(str, a(str2, th2));
    }

    @ky.d
    public static void d(@k.a1(max = 23) String str, String str2) {
        synchronized (f80973f) {
            try {
                if (f80974g <= 3) {
                    f80976i.a(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void e(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        d(str, a(str2, th2));
    }

    @ky.d
    public static int f() {
        int i10;
        synchronized (f80973f) {
            i10 = f80974g;
        }
        return i10;
    }

    @Nullable
    @ky.d
    public static String g(@Nullable Throwable th2) {
        synchronized (f80973f) {
            try {
                if (th2 == null) {
                    return null;
                }
                if (j(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f80975h) {
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
        synchronized (f80973f) {
            try {
                if (f80974g <= 1) {
                    f80976i.b(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void i(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        h(str, a(str2, th2));
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
        synchronized (f80973f) {
            f80974g = i10;
        }
    }

    public static void l(boolean z10) {
        synchronized (f80973f) {
            f80975h = z10;
        }
    }

    public static void m(b bVar) {
        synchronized (f80973f) {
            f80976i = bVar;
        }
    }

    @ky.d
    public static void n(@k.a1(max = 23) String str, String str2) {
        synchronized (f80973f) {
            try {
                if (f80974g <= 2) {
                    f80976i.w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ky.d
    public static void o(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        n(str, a(str2, th2));
    }
}
