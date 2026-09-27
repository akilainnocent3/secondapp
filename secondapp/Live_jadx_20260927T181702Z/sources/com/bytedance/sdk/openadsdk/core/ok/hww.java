package com.bytedance.sdk.openadsdk.core.ok;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.settings.vhb;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static volatile hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static volatile long f36609sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile boolean f36610tq;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Handler f36612hv;
    private final Queue<C0355hww> vy = new LinkedList();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final vhb f36611hu = bs.vy();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ok.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0355hww {
        private final long hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final String f36613tq;

        private C0355hww(long j10, String str) {
            this.hww = j10;
            this.f36613tq = str;
        }
    }

    private hww() {
    }

    private synchronized boolean tq(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iHwp = this.f36611hu.hwp();
        long jOxu = this.f36611hu.oxu();
        if (this.vy.size() <= 0 || this.vy.size() < iHwp) {
            this.vy.offer(new C0355hww(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.vy.peek().hww);
            if (jAbs <= jOxu) {
                tq(jOxu - jAbs);
                return true;
            }
            this.vy.poll();
            this.vy.offer(new C0355hww(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String sd() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0355hww c0355hww : this.vy) {
                if (map.containsKey(c0355hww.f36613tq)) {
                    map.put(c0355hww.f36613tq, Integer.valueOf(((Integer) map.get(c0355hww.f36613tq)).intValue() + 1));
                } else {
                    map.put(c0355hww.f36613tq, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    public static hww hww() {
        if (hww == null) {
            synchronized (hww.class) {
                try {
                    if (hww == null) {
                        hww = new hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public synchronized boolean hww(String str) {
        try {
            if (tq(str)) {
                hww(true);
                hww(f36609sd);
            } else {
                hww(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36610tq;
    }

    private synchronized void hww(long j10) {
        try {
            if (this.f36612hv == null) {
                this.f36612hv = new Handler(Looper.getMainLooper());
            }
            this.f36612hv.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ok.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    hww.this.hww(false);
                }
            }, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean tq() {
        return f36610tq;
    }

    private synchronized void tq(long j10) {
        f36609sd = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hww(boolean z10) {
        f36610tq = z10;
    }
}
