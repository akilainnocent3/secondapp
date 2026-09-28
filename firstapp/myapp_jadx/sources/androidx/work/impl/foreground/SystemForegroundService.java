package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.eqa;
import defpackage.hqe0;
import defpackage.iqe0;
import defpackage.jgt;
import defpackage.pbs;
import defpackage.svj0;
import defpackage.ub6;
import defpackage.xd80;
import defpackage.z1z;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends pbs {
    public static final String e = jgt.g("SystemFgService");
    public boolean b;
    public iqe0 c;
    public NotificationManager d;

    public static class a {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            systemForegroundService.startForeground(i, notification, i2);
        }
    }

    public static class b {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            try {
                systemForegroundService.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                jgt jgtVarE = jgt.e();
                String str = SystemForegroundService.e;
                if (((jgt.a) jgtVarE).c <= 5) {
                    Log.w(str, "Unable to start foreground service", e);
                }
            } catch (SecurityException e2) {
                jgt jgtVarE2 = jgt.e();
                String str2 = SystemForegroundService.e;
                if (((jgt.a) jgtVarE2).c <= 5) {
                    Log.w(str2, "Unable to start foreground service", e2);
                }
            }
        }
    }

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        iqe0 iqe0Var = new iqe0(getApplicationContext());
        this.c = iqe0Var;
        if (iqe0Var.w != null) {
            jgt.e().c(iqe0.y, "A callback already exists.");
        } else {
            iqe0Var.w = this;
        }
    }

    @Override // defpackage.pbs, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.pbs, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        String str = e;
        if (z) {
            jgt.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        iqe0 iqe0Var = this.c;
        iqe0Var.getClass();
        String str2 = iqe0.y;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            jgt.e().f(str2, "Started foreground service " + intent);
            iqe0Var.b.d(new hqe0(iqe0Var, intent.getStringExtra("KEY_WORKSPEC_ID")));
            iqe0Var.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            iqe0Var.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            jgt.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = iqe0Var.w;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            jgt.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        jgt.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        svj0 svj0Var = iqe0Var.a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        svj0Var.getClass();
        uuidFromString.getClass();
        eqa eqaVar = svj0Var.b.i;
        xd80 xd80VarC = svj0Var.d.c();
        xd80VarC.getClass();
        z1z.a(eqaVar, "CancelWorkById", xd80VarC, new ub6(svj0Var, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i2);
    }
}
