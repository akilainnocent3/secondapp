package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class rbh {
    public static final Object c = new Object();
    public static cuj0 d;
    public final Context a;
    public final liv b = new liv();

    public rbh(Context context) {
        this.a = context;
    }

    public static Task<Integer> a(Context context, final Intent intent, boolean z) {
        cuj0 cuj0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                cuj0Var = d;
                if (cuj0Var == null) {
                    cuj0Var = new cuj0(context);
                    d = cuj0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return cuj0Var.b(intent).continueWith(new liv(), new qbh());
        }
        if (ff80.a().c(context)) {
            synchronized (wwi0.a) {
                try {
                    wwi0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        wwi0.b.a();
                    }
                    cuj0Var.b(intent).addOnCompleteListener(new OnCompleteListener() { // from class: vwi0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            wwi0.b(intent);
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            cuj0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zA = bl10.a();
        final Context context = this.a;
        boolean z = zA && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        Callable callable = new Callable() { // from class: nbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                String str3;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                ff80 ff80VarA = ff80.a();
                ff80VarA.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ff80VarA.d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (ff80VarA) {
                    try {
                        str = ff80VarA.a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    str3 = context2.getPackageName() + serviceInfo.name;
                                    ff80VarA.a = str3;
                                } else {
                                    str3 = serviceInfo.name;
                                    ff80VarA.a = str3;
                                }
                                str = str3;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (ff80VarA.c(context2)) {
                        componentNameStartService = wwi0.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        liv livVar = this.b;
        return Tasks.call(livVar, callable).continueWithTask(livVar, new Continuation() { // from class: obh
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (bl10.a() && ((Integer) task.getResult()).intValue() == 402) ? rbh.a(context, intent, z2).continueWith(new liv(), new pbh()) : task;
            }
        });
    }
}
