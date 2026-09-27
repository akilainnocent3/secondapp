package com.bytedance.sdk.component.ok;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.weu;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import fw.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static AtomicInteger f34955sd = new AtomicInteger(0);
    public static final String[] hww = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final String[] f34956tq = {"tt_pangle", "bd_tracker"};
    private static int vy = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static int f34954hv = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public String f34957sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public String f34958tq;
        public String vy;

        public hww(String str, int i10, String str2, String str3) {
            this.f34957sd = str;
            this.hww = i10;
            this.vy = str2;
            this.f34958tq = str3;
        }

        public void hww(int i10) {
            this.hww = i10;
        }

        public String toString() {
            return "ThreadModel{times=" + this.hww + ", name='" + this.f34958tq + "', lastStackStack='" + this.f34957sd + '\'' + b.f85383j;
        }

        public int hww() {
            return this.hww;
        }
    }

    public static void hww() {
        try {
            tq();
        } catch (Throwable unused) {
        }
    }

    private static void tq() {
        int i10;
        sd sdVarVgm = hu.vgm();
        if (sdVarVgm == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = f34955sd.addAndGet(1);
        int i12 = hu.f34912sd;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zHww = weu.hww();
        int size = allStackTraces.size();
        if (size > f34954hv) {
            f34954hv = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb2 = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
            if (zHww) {
                sb2.append("Thread Name is : " + key.getName());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            int length = value.length;
            String str = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zHww) {
                    sb2.append(string + IOUtils.LINE_SEPARATOR_UNIX);
                }
                if (TextUtils.isEmpty(str) && (hww(string, hww) || hww(key.getName(), f34956tq))) {
                    i13++;
                    str = string;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zHww) {
                if (TextUtils.isEmpty(str)) {
                    i10 = i17;
                } else {
                    String str2 = str + "&" + key.getName();
                    hww hwwVar = (hww) map.get(str2);
                    if (hwwVar != null) {
                        hwwVar.hww(hwwVar.hww() + 1);
                        i10 = i17;
                    } else {
                        String string2 = sb2.toString();
                        String name = key.getName();
                        i10 = i17;
                        hwwVar = new hww(str2, i10, string2, name);
                    }
                    map.put(str2, hwwVar);
                }
                if (!TextUtils.isEmpty(sb2.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb2.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > vy) {
            vy = i13;
        }
        if (zHww) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i13 + ", SDK Max threads=" + vy + ", Application threads = " + size + ", Application max threads = " + f34954hv);
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((hww) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        sdVarVgm.hww(new com.bytedance.sdk.component.ok.tq.hww(i13, vy, size, f34954hv));
    }

    private static boolean hww(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
