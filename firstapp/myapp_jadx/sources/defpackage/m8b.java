package defpackage;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class m8b {
    public static final p80 g = p80.d();
    public static final long h = 1000000;
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue<n8b> a = new ConcurrentLinkedQueue<>();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, final Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new Runnable() { // from class: k8b
                @Override // java.lang.Runnable
                public final void run() {
                    Timer timer2 = timer;
                    m8b m8bVar = this.a;
                    n8b n8bVarB = m8bVar.b(timer2);
                    if (n8bVarB != null) {
                        m8bVar.a.add(n8bVarB);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final n8b b(Timer timer) {
        long j = this.d;
        p80 p80Var = g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long jA = timer.a() + timer.a;
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                n8b.b bVarH = n8b.h();
                bVarH.g(jA);
                double d = (j4 + j5) / j;
                long j6 = h;
                bVarH.h(Math.round(d * j6));
                bVarH.i(Math.round(((j2 + j3) / j) * j6));
                n8b n8bVarBuild = bVarH.build();
                bufferedReader.close();
                return n8bVarBuild;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            p80Var.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            p80Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            p80Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            p80Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
