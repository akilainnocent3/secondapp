package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class upe0 implements wtg {
    public static final String z = jgt.g("SystemAlarmDispatcher");
    public final Context a;
    public final p5f0 b;
    public final pxj0 c;
    public final yy20 d;
    public final svj0 e;
    public final k88 f;
    public final ArrayList i;
    public Intent v;
    public SystemAlarmService w;
    public final ovj0 y;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            vvj0.a aVarA;
            c cVar;
            synchronized (upe0.this.i) {
                upe0 upe0Var = upe0.this;
                upe0Var.v = (Intent) upe0Var.i.get(0);
            }
            Intent intent = upe0.this.v;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = upe0.this.v.getIntExtra("KEY_START_ID", 0);
                jgt jgtVarE = jgt.e();
                String str = upe0.z;
                jgtVarE.a(str, "Processing command " + upe0.this.v + ", " + intExtra);
                PowerManager.WakeLock wakeLockA = ywi0.a(upe0.this.a, action + " (" + intExtra + ")");
                try {
                    jgt.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.acquire();
                    upe0 upe0Var2 = upe0.this;
                    upe0Var2.f.b(intExtra, upe0Var2, upe0Var2.v);
                    jgt.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    aVarA = upe0.this.b.a();
                    cVar = new c(upe0.this);
                } catch (Throwable th) {
                    try {
                        jgt jgtVarE2 = jgt.e();
                        String str2 = upe0.z;
                        jgtVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        jgt.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        aVarA = upe0.this.b.a();
                        cVar = new c(upe0.this);
                    } catch (Throwable th2) {
                        jgt.e().a(upe0.z, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        upe0.this.b.a().execute(new c(upe0.this));
                        throw th2;
                    }
                }
                aVarA.execute(cVar);
            }
        }
    }

    public static class b implements Runnable {
        public final upe0 a;
        public final Intent b;
        public final int c;

        public b(int i, upe0 upe0Var, Intent intent) {
            this.a = upe0Var;
            this.b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b(this.b, this.c);
        }
    }

    public static class c implements Runnable {
        public final upe0 a;

        public c(upe0 upe0Var) {
            this.a = upe0Var;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0089 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x0094, B:31:0x0088, B:32:0x0089, B:34:0x0091, B:39:0x0098, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0091 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x0094, B:31:0x0088, B:32:0x0089, B:34:0x0091, B:39:0x0098, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            upe0 upe0Var = this.a;
            jgt jgtVarE = jgt.e();
            String str = upe0.z;
            jgtVarE.a(str, "Checking if commands are complete.");
            upe0.c();
            synchronized (upe0Var.i) {
                try {
                    if (upe0Var.v != null) {
                        jgt.e().a(str, "Removing command " + upe0Var.v);
                        if (!((Intent) upe0Var.i.remove(0)).equals(upe0Var.v)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        upe0Var.v = null;
                    }
                    xd80 xd80VarC = upe0Var.b.c();
                    k88 k88Var = upe0Var.f;
                    synchronized (k88Var.c) {
                        zIsEmpty = k88Var.b.isEmpty();
                    }
                    if (zIsEmpty && upe0Var.i.isEmpty()) {
                        synchronized (xd80VarC.d) {
                            zIsEmpty2 = xd80VarC.a.isEmpty();
                        }
                        if (zIsEmpty2) {
                            jgt.e().a(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = upe0Var.w;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!upe0Var.i.isEmpty()) {
                            upe0Var.d();
                        }
                    } else if (!upe0Var.i.isEmpty()) {
                        upe0Var.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public upe0(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.a = applicationContext;
        qpe0 qpe0Var = new qpe0(new jwd0());
        svj0 svj0VarC = svj0.c(systemAlarmService);
        this.e = svj0VarC;
        this.f = new k88(applicationContext, svj0VarC.b.d, qpe0Var);
        this.c = new pxj0(svj0VarC.b.g);
        yy20 yy20Var = svj0VarC.f;
        this.d = yy20Var;
        p5f0 p5f0Var = svj0VarC.d;
        this.b = p5f0Var;
        this.y = new qvj0(yy20Var, p5f0Var);
        yy20Var.a(this);
        this.i = new ArrayList();
        this.v = null;
    }

    @Override // defpackage.wtg
    public final void a(ivj0 ivj0Var, boolean z2) {
        vvj0.a aVarA = this.b.a();
        String str = k88.f;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        k88.d(intent, ivj0Var);
        aVarA.execute(new b(0, this, intent));
    }

    public final void b(Intent intent, int i) {
        jgt jgtVarE = jgt.e();
        String str = z;
        jgtVarE.a(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            jgt.e().h(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.i) {
                try {
                    ArrayList arrayList = this.i;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.i) {
            try {
                boolean zIsEmpty = this.i.isEmpty();
                this.i.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = ywi0.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.d.d(new a());
        } finally {
            wakeLockA.release();
        }
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ib5.a(UccrWswQGaIj.fdlUvbQZsW);
    }
}
