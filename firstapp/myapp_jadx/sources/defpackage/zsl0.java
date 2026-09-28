package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zsl0 {
    public static zsl0 e;
    public final Context a;
    public final ScheduledExecutorService b;
    public mnl0 c = new mnl0(this);
    public int d = 1;

    public zsl0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized zsl0 a(Context context) {
        zsl0 zsl0Var;
        zsl0Var = e;
        if (zsl0Var == null) {
            zsl0Var = new zsl0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new tex("MessengerIpcClient"))));
            e = zsl0Var;
        }
        return zsl0Var;
    }

    public final synchronized Task b(csl0 csl0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(csl0Var.toString()));
            }
            if (!this.c.d(csl0Var)) {
                mnl0 mnl0Var = new mnl0(this);
                this.c = mnl0Var;
                mnl0Var.d(csl0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return csl0Var.b.getTask();
    }
}
