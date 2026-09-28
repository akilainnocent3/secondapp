package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class fie {
    public static Double a;
    public static String b;

    public static String a() {
        String str = b;
        if (str != null && str.length() != 0) {
            return b;
        }
        String property = System.getProperty("http.agent");
        String strConcat = property != null ? property.concat("-") : "";
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str2 = strConcat + (sportyGamesManager != null ? Long.valueOf(sportyGamesManager.getVersionCode()) : null);
        b = str2;
        return str2;
    }

    public static double b(Context context) {
        context.getClass();
        Double d = a;
        if (d != null) {
            return d.doubleValue();
        }
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        double dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
        a = Double.valueOf(dRint);
        return dRint;
    }
}
