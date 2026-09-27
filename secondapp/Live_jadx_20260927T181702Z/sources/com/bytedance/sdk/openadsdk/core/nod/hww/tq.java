package com.bytedance.sdk.openadsdk.core.nod.hww;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.appcompat.widget.c;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4235d4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    private static volatile tq hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final ArrayList<String> f36495tq = new ArrayList<>();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final AtomicBoolean f36494sd = new AtomicBoolean(false);
    private long vy = System.currentTimeMillis();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f36491hv = 0;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f36490hu = 0;
    private String vgm = "";

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f36492ok = "";

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f36493rs = "";
    private boolean nod = false;
    private boolean vhb = false;

    public static tq hww(Application application) {
        if (hww == null) {
            synchronized (tq.class) {
                try {
                    if (hww == null) {
                        tq tqVar = new tq();
                        hww = tqVar;
                        tqVar.nod = hww((Context) application);
                        hww.vhb = hww(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        hww.hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public void tq(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f36495tq.contains(localClassName)) {
            this.f36495tq.remove(localClassName);
        }
        if (this.f36495tq.size() == 0) {
            this.vy = System.currentTimeMillis();
            this.f36494sd.set(true);
            this.f36492ok = localClassName;
        }
    }

    private static int hww(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean hww(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void hww(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f36495tq.size() == 0) {
            this.vgm = localClassName;
            this.f36491hv = System.currentTimeMillis();
            this.f36490hu = System.currentTimeMillis() - this.vy;
            this.f36494sd.set(false);
        }
        if (!this.f36495tq.contains(localClassName)) {
            this.f36495tq.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.f36493rs = localClassName;
    }

    private void hww() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z10 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C4235d4.i.f61417h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField(c.f6970r);
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f36495tq.contains(localClassName)) {
                            this.f36495tq.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.f36494sd;
                if (this.f36495tq.size() > 0) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String hww(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.f36491hv;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.f36494sd.get() && this.vhb) {
            i11 |= 2;
        }
        if (!this.f36494sd.get() && this.f36490hu >= 5000 && j11 < 1000) {
            i11 = this.f36492ok.equals(this.f36493rs) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.f36490hu).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.f36494sd).put("alert", this.vhb).put(NotificationCompat.CATEGORY_SYSTEM, this.nod).put("actsize", this.f36495tq.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.tq.sd()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.vgm = "";
        this.f36490hu = 0L;
        this.f36491hv = 0L;
        this.vy = System.currentTimeMillis();
        return string;
    }
}
