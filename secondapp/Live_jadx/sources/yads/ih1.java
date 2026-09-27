package yads;

import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ih1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f150631a = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        synchronized (f150631a) {
            try {
                if (th2 != null) {
                    Throwable cause = th2;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th2).trim().replace("\t", ew.b0.f81731a);
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f150631a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f150631a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (f150631a) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        b(str, a(str2, illegalArgumentException));
    }

    public static void a(String str, String str2) {
        synchronized (f150631a) {
            Log.d(str, str2);
        }
    }

    public static void a(RuntimeException runtimeException) {
        d("StreamVolumeManager", a("Error registering stream volume receiver", runtimeException));
    }
}
