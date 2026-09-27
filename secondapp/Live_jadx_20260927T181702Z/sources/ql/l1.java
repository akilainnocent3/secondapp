package ql;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class l1 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f122467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f122468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f122469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Queue<a> f122470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public i1 f122471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k.a0("this")
    public boolean f122472g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f122473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f122474b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f122473a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f122473a.getAction() + " finishing.");
            aVar.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: ql.j1
                @Override // java.lang.Runnable
                public final void run() {
                    l1.a.b(this.f122446b);
                }
            }, 20L, TimeUnit.SECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: ql.k1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void d() {
            this.f122474b.trySetResult(null);
        }

        public Task<Void> e() {
            return this.f122474b.getTask();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public l1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @k.a0("this")
    public final void n() {
        while (!this.f122470e.isEmpty()) {
            this.f122470e.poll().d();
        }
    }

    public final synchronized void o() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f122470e.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                i1 i1Var = this.f122471f;
                if (i1Var == null || !i1Var.isBinderAlive()) {
                    q();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f122471f.b(this.f122470e.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f122472g = false;
            if (iBinder instanceof i1) {
                this.f122471f = (i1) iBinder;
                o();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            n();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        o();
    }

    @qj.a
    public synchronized Task<Void> p(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f122469d);
            this.f122470e.add(aVar);
            o();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    @k.a0("this")
    public final void q() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f122472g);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f122472g) {
            return;
        }
        this.f122472g = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f122467b, this.f122468c, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f122472g = false;
        n();
    }

    @k.h1
    public l1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f122470e = new ArrayDeque();
        this.f122472g = false;
        Context applicationContext = context.getApplicationContext();
        this.f122467b = applicationContext;
        this.f122468c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f122469d = scheduledExecutorService;
    }
}
