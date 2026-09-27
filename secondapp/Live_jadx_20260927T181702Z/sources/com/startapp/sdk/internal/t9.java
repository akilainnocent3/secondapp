package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9 f75545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8 f75546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f75547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b4 f75548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib f75549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x9 f75550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c4 f75551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f75552h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f75553i = new AtomicLong();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k9 f75554j = new k9(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l9 f75555k = new l9(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m9 f75556l = new m9(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n9 f75557m = new n9(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s9 f75558n = new s9(this);

    public t9(h9 h9Var, k8 k8Var, ThreadPoolExecutor threadPoolExecutor, b4 b4Var, ib ibVar, x9 x9Var, c4 c4Var) {
        this.f75545a = h9Var;
        this.f75546b = k8Var;
        this.f75547c = threadPoolExecutor;
        this.f75548d = b4Var;
        this.f75549e = ibVar;
        this.f75550f = x9Var;
        this.f75551g = c4Var;
    }

    public final void a() {
        if (this.f75553i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            h9 h9Var = this.f75545a;
            m9 m9Var = this.f75556l;
            synchronized (h9Var) {
                h9Var.f74945c.add(m9Var);
            }
            ((f6) this.f75549e.a()).a(this.f75554j);
            ((f6) this.f75549e.a()).a();
            k8 k8Var = this.f75546b;
            k8Var.f75082a.post(new r9(this));
        }
    }

    public final void b(d9 d9Var) {
        g9 g9VarA = a(d9Var.f74672a);
        long jUptimeMillis = (this.f75553i.get() + g9VarA.f74869f) - SystemClock.uptimeMillis();
        if (jUptimeMillis > 0) {
            a(jUptimeMillis);
            return;
        }
        h9 h9Var = this.f75545a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h9Var.getClass();
        long j10 = d9Var.f74673b;
        h9.a(j10, jCurrentTimeMillis);
        SQLiteDatabase sQLiteDatabaseA = h9Var.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            int iA = h9.a(sQLiteDatabaseA, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(iA + 1));
            sQLiteDatabaseA.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            n9 n9Var = this.f75557m;
            Runnable runnable = (Runnable) this.f75550f.a(d9Var, g9VarA, n9Var);
            if (runnable != null) {
                this.f75547c.execute(runnable);
            } else if (n9Var != null) {
                n9Var.a(d9Var, 0);
            }
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }

    public final g9 a(e9 e9Var) {
        g9 g9Var;
        Map mapB;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f75552h) {
            try {
                Pair pair = (Pair) this.f75552h.get(e9Var.f74734a);
                g9Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (g9) pair.first;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g9Var != null) {
            return g9Var;
        }
        this.f75551g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH != null && (mapB = analyticsConfigH.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) mapB.get(e9Var.f74734a)) != null) {
            g9Var = new g9(e9Var.f74735b, analyticsCategoryConfig);
        }
        if (g9Var == null) {
            g9Var = e9Var.f74735b;
        }
        synchronized (this.f75552h) {
            this.f75552h.put(e9Var.f74734a, new Pair(g9Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return g9Var;
    }

    public final void b() {
        this.f75546b.f75082a.removeCallbacks(this.f75555k);
        if (!((f6) this.f75549e.a()).b()) {
            this.f75551g.getClass();
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            a(analyticsConfigH != null ? Math.max(300000L, si.f(analyticsConfigH.f())) : 300000L);
        } else {
            int iMax = Math.max(1, ((Integer) this.f75548d.a()).intValue());
            this.f75551g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            try {
                this.f75545a.a(this.f75558n, analyticsConfigH2 != null ? Math.max(1, analyticsConfigH2.g()) : 1, iMax);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(d9 d9Var) {
        this.f75551g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH == null || analyticsConfigH.k()) {
            return;
        }
        g9 g9VarA = a(d9Var.f74672a);
        if (((Random) si.f75517d.a()).nextDouble() >= g9VarA.f74864a) {
            return;
        }
        if (g9VarA.f74867d) {
            k8 k8Var = this.f75546b;
            k8Var.f75082a.post(new p9(this, d9Var, g9VarA));
        } else if (((f6) this.f75549e.a()).b()) {
            long jUptimeMillis = (this.f75553i.get() + g9VarA.f74869f) - SystemClock.uptimeMillis();
            if (jUptimeMillis > 0) {
                k8 k8Var2 = this.f75546b;
                k8Var2.f75082a.postDelayed(new q9(this, d9Var, g9VarA), jUptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f75550f.a(d9Var, g9VarA, null);
                if (runnable != null) {
                    this.f75547c.execute(runnable);
                }
            }
        }
    }

    public final void a(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f75546b.f75082a.postDelayed(this.f75555k, j10);
    }

    public final void a(d9 d9Var, int i10, long j10) {
        if (i10 == 1) {
            h9 h9Var = this.f75545a;
            h9Var.getClass();
            long j11 = d9Var.f74673b;
            h9.a(j11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j10));
            h9Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
            a(0L);
            return;
        }
        this.f75551g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        int iMax = analyticsConfigH != null ? Math.max(1, analyticsConfigH.g()) : 1;
        h9 h9Var2 = this.f75545a;
        h9Var2.getClass();
        long j12 = d9Var.f74673b;
        h9.a(j12, j10);
        SQLiteDatabase sQLiteDatabaseA = h9Var2.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            if (h9.a(sQLiteDatabaseA, j12) >= iMax) {
                sQLiteDatabaseA.delete("events", "rowid = ?", new String[]{String.valueOf(j12)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j10));
                sQLiteDatabaseA.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j12)});
            }
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            this.f75551g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            a(analyticsConfigH2 != null ? Math.max(1000L, analyticsConfigH2.h()) : 1000L);
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }
}
