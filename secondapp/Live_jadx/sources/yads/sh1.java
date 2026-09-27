package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sh1 {
    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
                applicationInfo = null;
            }
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str) || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj;
        } catch (Throwable unused2) {
            boolean z11 = ad1.f146762a;
            return null;
        }
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, th1.f155902e.f155909b);
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, th1.f155907j.f155909b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean a(Context context) {
        return (Boolean) a(context, th1.f155901d.f155909b);
    }
}
