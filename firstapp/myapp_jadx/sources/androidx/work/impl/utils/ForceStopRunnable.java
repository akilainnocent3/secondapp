package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import defpackage.ay20;
import defpackage.cwj0;
import defpackage.dqe0;
import defpackage.fww;
import defpackage.ivj0;
import defpackage.jgt;
import defpackage.jvj0;
import defpackage.l9p;
import defpackage.owj0;
import defpackage.pwj0;
import defpackage.svj0;
import defpackage.tuj0;
import defpackage.vqe0;
import defpackage.xm70;
import defpackage.xn20;
import defpackage.ym20;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final String e = jgt.g("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final svj0 b;
    public final xn20 c;
    public int d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = jgt.g("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((jgt.a) jgt.e()).c <= 2) {
                Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, svj0 svj0Var) {
        this.a = context.getApplicationContext();
        this.b = svj0Var;
        this.c = svj0Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    public final void a() {
        boolean z;
        xn20 xn20Var = this.c;
        svj0 svj0Var = this.b;
        a aVar = svj0Var.b;
        xn20 xn20Var2 = svj0Var.g;
        WorkDatabase workDatabase = svj0Var.c;
        String str = vqe0.e;
        Context context = this.a;
        JobScheduler jobSchedulerB = l9p.b(context);
        ArrayList arrayListD = vqe0.d(context, jobSchedulerB);
        ArrayList arrayListC = workDatabase.z().c();
        HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
        if (arrayListD != null && !arrayListD.isEmpty()) {
            int size = arrayListD.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                ivj0 ivj0VarF = vqe0.f(jobInfo);
                if (ivj0VarF != null) {
                    hashSet.add(ivj0VarF.a);
                } else {
                    vqe0.a(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        int size2 = arrayListC.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            Object obj2 = arrayListC.get(i2);
            i2++;
            if (!hashSet.contains((String) obj2)) {
                jgt.e().a(vqe0.e, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (z) {
            workDatabase.c();
            try {
                pwj0 pwj0VarC = workDatabase.C();
                int size3 = arrayListC.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayListC.get(i3);
                    i3++;
                    pwj0VarC.c(-1L, (String) obj3);
                }
                workDatabase.v();
                workDatabase.r();
            } catch (Throwable th) {
                workDatabase.r();
                throw th;
            }
        }
        pwj0 pwj0VarC2 = workDatabase.C();
        cwj0 cwj0VarB = workDatabase.B();
        workDatabase.c();
        try {
            ArrayList arrayListT = pwj0VarC2.t();
            boolean zIsEmpty = arrayListT.isEmpty();
            if (!zIsEmpty) {
                int size4 = arrayListT.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj4 = arrayListT.get(i4);
                    jvj0 jvj0Var = jvj0.a;
                    String str2 = ((owj0) obj4).a;
                    pwj0VarC2.e(jvj0Var, str2);
                    pwj0VarC2.u(-512, str2);
                    pwj0VarC2.c(-1L, str2);
                    cwj0VarB = cwj0VarB;
                }
            }
            cwj0VarB.b();
            workDatabase.v();
            workDatabase.r();
            boolean z2 = !zIsEmpty || z;
            Long lA = xn20Var2.a.y().a("reschedule_needed");
            String str3 = e;
            if (lA != null && lA.longValue() == 1) {
                jgt.e().a(str3, "Rescheduling Workers.");
                svj0Var.f();
                xn20Var2.getClass();
                xn20Var2.a.y().b(new ym20("reschedule_needed", 0L));
                return;
            }
            try {
                int i5 = Build.VERSION.SDK_INT;
                int i6 = i5 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                if (i5 < 30) {
                    if (broadcast == null) {
                        c(context);
                        jgt.e().a(str3, "Application was force-stopped, rescheduling.");
                        svj0Var.f();
                        dqe0 dqe0Var = aVar.d;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        xn20Var.getClass();
                        xn20Var.a.y().b(new ym20("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z2) {
                        jgt.e().a(str3, "Found unfinished work, scheduling it.");
                        xm70.b(aVar, workDatabase, svj0Var.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = xn20Var.a.y().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i7);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                            jgt.e().a(str3, "Application was force-stopped, rescheduling.");
                            svj0Var.f();
                            dqe0 dqe0Var2 = aVar.d;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            xn20Var.getClass();
                            xn20Var.a.y().b(new ym20("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z2) {
                    jgt.e().a(str3, "Found unfinished work, scheduling it.");
                    xm70.b(aVar, workDatabase, svj0Var.e);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                if (((jgt.a) jgt.e()).c <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e3) {
                e = e3;
                if (((jgt.a) jgt.e()).c <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase.r();
            throw th2;
        }
    }

    public final boolean b() {
        a aVar = this.b.b;
        aVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (zIsEmpty) {
            jgt.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = ay20.a(this.a, aVar);
        jgt.e().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        String str = e;
        svj0 svj0Var = this.b;
        a aVar = svj0Var.b;
        try {
            if (!b()) {
                svj0Var.e();
                return;
            }
            while (true) {
                try {
                    tuj0.a(context);
                    jgt.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        svj0Var.e();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str2 = fww.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            jgt.e().d(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            aVar.getClass();
                            throw illegalStateException;
                        }
                        jgt.e().b(str, "Retrying after " + (((long) i) * 300), e2);
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    jgt.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    aVar.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            svj0Var.e();
            throw th;
        }
    }
}
