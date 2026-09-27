package y1;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.t;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(22)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f145869a;

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class C1535a {
        @t
        public static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            return C1535a.a(i10);
        }
        try {
            if (f145869a == null) {
                Class cls = Integer.TYPE;
                if (i11 >= 26) {
                    f145869a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", cls);
                } else {
                    f145869a = SubscriptionManager.class.getDeclaredMethod("getSlotId", cls);
                }
                f145869a.setAccessible(true);
            }
            Integer num = (Integer) f145869a.invoke(null, Integer.valueOf(i10));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
