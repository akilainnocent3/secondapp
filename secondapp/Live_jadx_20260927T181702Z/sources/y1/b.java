package y1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.t;
import k.t0;
import k.x0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f145870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f145871b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class a {
        @x0("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @Nullable
        @t
        public static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    /* JADX INFO: renamed from: y1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class C1536b {
        @x0("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @Nullable
        @t
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static class c {
        @t
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @Nullable
    @x0("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    public static String a(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1536b.a(telephonyManager);
        }
        int iB = b(telephonyManager);
        return (iB == Integer.MAX_VALUE || iB == -1) ? telephonyManager.getDeviceId() : a.a(telephonyManager, y1.a.a(iB));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f145871b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f145871b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f145871b.invoke(telephonyManager, null);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
