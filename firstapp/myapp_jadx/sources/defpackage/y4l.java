package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class y4l implements Handler.Callback {
    public static final Status E = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status F = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object G = new Object();
    public static y4l H;
    public final ljk0 C;
    public volatile boolean D;
    public TelemetryData c;
    public yik0 d;
    public final Context e;
    public final v4l f;
    public final pik0 i;
    public long a = 10000;
    public boolean b = false;
    public final AtomicInteger v = new AtomicInteger(1);
    public final AtomicInteger w = new AtomicInteger(0);
    public final ConcurrentHashMap y = new ConcurrentHashMap(5, 0.75f, 1);
    public ufk0 z = null;
    public final tx0 A = new tx0(0);
    public final tx0 B = new tx0(0);

    public y4l(Context context, Looper looper, v4l v4lVar) {
        this.D = true;
        this.e = context;
        ljk0 ljk0Var = new ljk0(looper, this);
        Looper.getMainLooper();
        this.C = ljk0Var;
        this.f = v4lVar;
        this.i = new pik0(v4lVar);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = the.d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(bl10.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            the.d = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.D = false;
        }
        ljk0Var.sendMessage(ljk0Var.obtainMessage(6));
    }

    public static Status d(qn0 qn0Var, ConnectionResult connectionResult) {
        return new Status(17, lx5.a("API: ", qn0Var.b.b, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), connectionResult.c, connectionResult);
    }

    @ResultIgnorabilityUnspecified
    public static y4l g(Context context) {
        y4l y4lVar;
        HandlerThread handlerThread;
        synchronized (G) {
            y4lVar = H;
            if (y4lVar == null) {
                synchronized (y3l.a) {
                    try {
                        handlerThread = y3l.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            y3l.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = y3l.c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                y4l y4lVar2 = new y4l(context.getApplicationContext(), handlerThread.getLooper(), v4l.d);
                H = y4lVar2;
                y4lVar = y4lVar2;
            }
        }
        return y4lVar;
    }

    public final void a(ufk0 ufk0Var) {
        synchronized (G) {
            try {
                if (this.z != ufk0Var) {
                    this.z = ufk0Var;
                    this.A.clear();
                }
                this.A.addAll(ufk0Var.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = gw50.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int i = this.i.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(ConnectionResult connectionResult, int i) {
        v4l v4lVar = this.f;
        v4lVar.getClass();
        Context context = this.e;
        if (!bon.a(context)) {
            int i2 = connectionResult.b;
            PendingIntent activity = connectionResult.c;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = v4lVar.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                v4lVar.g(context, i2, PendingIntent.getActivity(context, 0, intent, fjk0.a | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final kgk0 e(u4l u4lVar) {
        qn0 qn0Var = u4lVar.e;
        ConcurrentHashMap concurrentHashMap = this.y;
        kgk0 kgk0Var = (kgk0) concurrentHashMap.get(qn0Var);
        if (kgk0Var == null) {
            kgk0Var = new kgk0(this, u4lVar);
            concurrentHashMap.put(qn0Var, kgk0Var);
        }
        if (kgk0Var.b.f()) {
            this.B.add(qn0Var);
        }
        kgk0Var.n();
        return kgk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void f(TaskCompletionSource taskCompletionSource, int i, u4l u4lVar) {
        zgk0 zgk0Var;
        y4l y4lVar;
        if (i != 0) {
            qn0 qn0Var = u4lVar.e;
            if (b()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = gw50.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        kgk0 kgk0Var = (kgk0) this.y.get(qn0Var);
                        if (kgk0Var != null) {
                            Object obj = kgk0Var.b;
                            if (obj instanceof r12) {
                                r12 r12Var = (r12) obj;
                                if (r12Var.v == null || r12Var.c()) {
                                    z = z2;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = zgk0.a(kgk0Var, r12Var, i);
                                    if (connectionTelemetryConfigurationA != null) {
                                        kgk0Var.p++;
                                        z = connectionTelemetryConfigurationA.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    zgk0Var = null;
                    y4lVar = this;
                }
                y4lVar = this;
                zgk0Var = new zgk0(y4lVar, i, qn0Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                zgk0Var = null;
                y4lVar = this;
            }
            if (zgk0Var != null) {
                Task task = taskCompletionSource.getTask();
                final ljk0 ljk0Var = y4lVar.C;
                ljk0Var.getClass();
                task.addOnCompleteListener(new Executor() { // from class: egk0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        ljk0Var.post(runnable);
                    }
                }, zgk0Var);
            }
        }
    }

    public final void h(ConnectionResult connectionResult, int i) {
        if (c(connectionResult, i)) {
            return;
        }
        ljk0 ljk0Var = this.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x0311  */
    /* JADX WARN: Code duplicated, block: B:156:0x031b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 kgk0, still in use, count: 2, list:
          (r2v7 kgk0) from 0x02e3: IGET (r2v7 kgk0) A[WRAPPED] (LINE:740) kgk0.k int
          (r2v7 kgk0) from 0x02e9: PHI (r2 I:??) = (r2v4 kgk0), (r2v7 kgk0) binds: [B:148:0x02e8, B:202:0x02e9] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4l.handleMessage(android.os.Message):boolean");
    }
}
