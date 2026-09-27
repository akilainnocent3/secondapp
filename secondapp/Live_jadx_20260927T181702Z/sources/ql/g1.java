package ql;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f122429a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f122430b = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f122431c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("WakeLockHolder.syncObject")
    public static WakeLock f122432d;

    @qj.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void b(Intent intent, long j10) {
        synchronized (f122431c) {
            try {
                if (f122432d != null) {
                    i(intent, true);
                    f122432d.acquire(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k.a0("WakeLockHolder.syncObject")
    public static void c(Context context) {
        if (f122432d == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f122432d = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    public static void d(@NonNull Intent intent) {
        synchronized (f122431c) {
            try {
                if (f122432d != null && f(intent)) {
                    i(intent, false);
                    f122432d.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @qj.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void e(Context context) {
        synchronized (f122431c) {
            c(context);
        }
    }

    @k.h1
    public static boolean f(@NonNull Intent intent) {
        return intent.getBooleanExtra(f122429a, false);
    }

    @qj.u(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    public static void g() {
        synchronized (f122431c) {
            f122432d = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static void h(Context context, l1 l1Var, final Intent intent) {
        synchronized (f122431c) {
            try {
                c(context);
                boolean zF = f(intent);
                i(intent, true);
                if (!zF) {
                    f122432d.acquire(f122430b);
                }
                l1Var.p(intent).addOnCompleteListener(new OnCompleteListener() { // from class: ql.f1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        g1.d(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(@NonNull Intent intent, boolean z10) {
        intent.putExtra(f122429a, z10);
    }

    public static ComponentName j(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f122431c) {
            try {
                c(context);
                boolean zF = f(intent);
                i(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zF) {
                    f122432d.acquire(f122430b);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
