package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class z950 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final lug0<ktb> h;
    public final coy i;
    public int j;
    public long k;

    public final class a implements Runnable {
        public final ztb a;
        public final TaskCompletionSource<ztb> b;

        public a(ztb ztbVar, TaskCompletionSource<ztb> taskCompletionSource) {
            this.a = ztbVar;
            this.b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TaskCompletionSource<ztb> taskCompletionSource = this.b;
            z950 z950Var = z950.this;
            ztb ztbVar = this.a;
            z950Var.b(ztbVar, taskCompletionSource);
            z950Var.i.b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(z950Var.b, z950Var.a()) * (60000.0d / z950Var.a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + ztbVar.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public z950(lug0<ktb> lug0Var, aj80 aj80Var, coy coyVar) {
        double d = aj80Var.d;
        double d2 = aj80Var.e;
        long j = ((long) aj80Var.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = lug0Var;
        this.i = coyVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final ztb ztbVar, final TaskCompletionSource<ztb> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + ztbVar.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        ((rug0) this.h).a(new ei1(ztbVar.a(), kw20.c, null), new fvg0() { // from class: x950
            @Override // defpackage.fvg0
            public final void a(Exception exc) throws Throwable {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final z950 z950Var = this.a;
                    new Thread(new Runnable() { // from class: y950
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                lug0<ktb> lug0Var = z950Var.h;
                                kw20 kw20Var = kw20.c;
                                if (lug0Var instanceof rug0) {
                                    dvg0.a().d.a(((rug0) lug0Var).a.d(kw20Var), 1);
                                } else {
                                    String strC = tgt.c("ForcedSender");
                                    if (Log.isLoggable(strC, 5)) {
                                        Log.w(strC, String.format("Expected instance of `TransportImpl`, got `%s`.", lug0Var));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    ExecutorService executorService = vrh0.a;
                    boolean z3 = false;
                    try {
                        long jNanoTime = 2000000000;
                        long jNanoTime2 = System.nanoTime() + 2000000000;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                jNanoTime = jNanoTime2 - System.nanoTime();
                                z3 = true;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.trySetResult(ztbVar);
            }
        });
    }
}
