package defpackage;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class zlv {
    public static final p80 f = p80.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue<u80> b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public zlv() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue<>();
        this.c = runtime;
    }

    public final synchronized void a(long j, final Timer timer) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new Runnable() { // from class: xlv
                @Override // java.lang.Runnable
                public final void run() {
                    Timer timer2 = timer;
                    zlv zlvVar = this.a;
                    u80 u80VarB = zlvVar.b(timer2);
                    if (u80VarB != null) {
                        zlvVar.b.add(u80VarB);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final u80 b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jA = timer.a() + timer.a;
        u80.b bVarH = u80.h();
        bVarH.g(jA);
        Runtime runtime = this.c;
        bVarH.h(xrh0.b((d16.a(5) * (runtime.totalMemory() - runtime.freeMemory())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        return bVarH.build();
    }
}
