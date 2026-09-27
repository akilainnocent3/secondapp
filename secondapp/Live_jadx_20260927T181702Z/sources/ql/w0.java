package ql;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public class w0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f122512e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @KeepForSdk
    public static final int f122513f = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f122514g = 404;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f122515h = 401;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f122516i = 402;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f122517j = 403;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f122518k = "com.google.firebase.MESSAGING_EVENT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f122519l = "wrapped_intent";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f122520m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static w0 f122521n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @k.a0("this")
    public String f122522a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f122523b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f122524c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<Intent> f122525d = new ArrayDeque();

    public static synchronized w0 b() {
        try {
            if (f122521n == null) {
                f122521n = new w0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f122521n;
    }

    @k.h1
    public static void g(w0 w0Var) {
        f122521n = w0Var;
    }

    public final int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strF);
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = g1.j(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    @k.j0
    public Intent c() {
        return this.f122525d.poll();
    }

    public boolean d(Context context) {
        if (this.f122524c == null) {
            this.f122524c = Boolean.valueOf(context.checkCallingOrSelfPermission(com.bumptech.glide.manager.e.f31484b) == 0);
        }
        if (!this.f122523b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f122524c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f122523b == null) {
            this.f122523b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f122523b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f122523b.booleanValue();
    }

    @Nullable
    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f122522a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(fe.F)) {
                        this.f122522a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f122522a = serviceInfo.name;
                    }
                    return this.f122522a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + to.c.userBaseDel + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @k.j0
    public int h(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f122525d.offer(intent);
        Intent intent2 = new Intent(f122518k);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
