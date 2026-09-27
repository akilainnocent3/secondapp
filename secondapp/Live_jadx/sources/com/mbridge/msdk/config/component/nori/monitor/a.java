package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.C4235d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f65603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f65605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f65606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f65607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f65608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f65609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f65612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f65613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f65614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f65615m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f65616n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f65617o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f65618p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f65619q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f65620r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f65621s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f65622t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f65623u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f65624v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f65625w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f65626x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f65627y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f65628z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f65603a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f65603a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f65603a) {
            return;
        }
        this.f65609g = (System.nanoTime() - this.f65619q) / 1000000;
    }

    public void e() {
        if (this.f65603a) {
            return;
        }
        this.f65619q = System.nanoTime();
    }

    public void h() {
        if (this.f65603a) {
            return;
        }
        this.f65608f = (System.nanoTime() - this.f65617o) / 1000000;
    }

    public void i() {
        if (this.f65603a) {
            return;
        }
        this.f65617o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f65603a));
        map2.put("retryCount", Integer.valueOf(this.f65604b));
        map2.put("requestBodySize", Long.valueOf(this.f65605c));
        map2.put("responseBodySize", Long.valueOf(this.f65606d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f65607e));
        map3.put("dnsTime", Long.valueOf(this.f65608f));
        map3.put("connectionTime", Long.valueOf(this.f65609g));
        map3.put("requestTime", Long.valueOf(this.f65610h));
        map3.put("serverTime", Long.valueOf(this.f65611i));
        map3.put("responseTime", Long.valueOf(this.f65612j));
        map3.put("queueTime", Long.valueOf(this.f65613k));
        map3.put("parsingTime", Long.valueOf(this.f65614l));
        map.put("timingInfo", map3);
        map.put(C4235d4.j.f61469h0, this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f65603a) {
            return;
        }
        this.f65607e = (System.nanoTime() - this.f65615m) / 1000000;
    }

    public void l() {
        if (this.f65603a) {
            return;
        }
        this.f65613k = (System.nanoTime() - this.f65615m) / 1000000;
    }

    public void m() {
        if (this.f65603a) {
            return;
        }
        this.f65615m = System.nanoTime();
    }

    public void n() {
        if (this.f65603a) {
            return;
        }
        this.f65625w = System.nanoTime();
    }

    public void o() {
        if (this.f65603a) {
            return;
        }
        this.f65624v = System.nanoTime();
    }

    public void p() {
        if (this.f65603a) {
            return;
        }
        this.f65623u = System.nanoTime();
    }

    public void q() {
        if (this.f65603a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f65603a) {
            return;
        }
        this.f65628z = System.nanoTime();
    }

    public void s() {
        if (this.f65603a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f65627y = jNanoTime;
        this.f65611i = (jNanoTime - this.f65626x) / 1000000;
    }

    public void t() {
        if (this.f65603a) {
            return;
        }
        this.f65621s = System.nanoTime();
    }

    public void u() {
        if (this.f65603a) {
            return;
        }
        this.f65620r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f65603a) {
            return;
        }
        this.f65612j = (System.nanoTime() - this.f65627y) / 1000000;
        this.f65606d = j10;
    }

    public void a(boolean z10) {
        this.f65603a = z10;
        if (z10) {
            this.f65604b++;
        }
    }

    public void a(long j10) {
        if (this.f65603a) {
            return;
        }
        this.f65610h = (System.nanoTime() - this.f65623u) / 1000000;
        this.f65605c = j10;
    }

    public void a() {
        if (this.f65603a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f65603a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iV = m0.v();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iV));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }

    public void d() {
    }

    public void f() {
    }

    public void g() {
    }
}
