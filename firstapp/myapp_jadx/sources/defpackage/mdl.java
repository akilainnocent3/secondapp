package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.sporty.android.core.model.watchdog.HangWatchdogConfigData;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class mdl implements rdd {
    public final rdd0 a;
    public final mpe0 b;
    public final mpe0 c;
    public final mpe0 d;
    public volatile HangWatchdogConfigData e;
    public volatile ScheduledFuture<?> f;
    public volatile long i;
    public volatile boolean v;
    public volatile boolean w;
    public final long y;
    public final a z;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (mdl.this.v) {
                return;
            }
            mdl.this.i = SystemClock.elapsedRealtime();
            ((Handler) mdl.this.c.getValue()).postDelayed(this, mdl.this.e.getPollIntervalMs());
        }
    }

    public mdl(rdd0 rdd0Var, a1k a1kVar) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = hwr.b(new idl());
        this.c = hwr.b(new jdl());
        this.d = hwr.b(new kdl());
        this.e = HangWatchdogConfigData.INSTANCE.getDEFAULT();
        this.y = SystemClock.elapsedRealtime();
        this.z = new a();
    }

    public final void a(HangWatchdogConfigData hangWatchdogConfigData) {
        hangWatchdogConfigData.getClass();
        this.e = HangWatchdogConfigData.INSTANCE.sanitized(hangWatchdogConfigData);
        this.a.a(new sdl((String) this.b.getValue()), k00.d);
        ix20.w.f.a(this);
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        this.v = false;
        if (this.w) {
            return;
        }
        this.i = SystemClock.elapsedRealtime();
        ((Handler) this.c.getValue()).removeCallbacks(this.z);
        ((Handler) this.c.getValue()).post(this.z);
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        try {
            scheduledFutureScheduleWithFixedDelay = ((ScheduledExecutorService) this.d.getValue()).scheduleWithFixedDelay(new xjg(this, 1), this.e.getPollIntervalMs(), this.e.getPollIntervalMs(), TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
            scheduledFutureScheduleWithFixedDelay = null;
        }
        this.f = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        this.v = true;
        ((Handler) this.c.getValue()).removeCallbacks(this.z);
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
