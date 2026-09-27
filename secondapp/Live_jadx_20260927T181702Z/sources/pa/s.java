package pa;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.WeakHashMap;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120567a = androidx.work.r.f("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f120568b = new WeakHashMap<>();

    public static void a() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f120568b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.r.c().h(f120567a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(@NonNull Context context, @NonNull String tag) {
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f120568b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str);
        }
        return wakeLockNewWakeLock;
    }
}
