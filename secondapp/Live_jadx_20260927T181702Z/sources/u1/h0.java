package u1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f137542a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f137543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f137544c;

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean a(int i10) {
            try {
                synchronized (f137542a) {
                    try {
                        if (!f137544c) {
                            f137544c = true;
                            f137543b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Method method = f137543b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class b {
        public static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    public static boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 24 ? b.a(i10) : a.a(i10);
    }
}
