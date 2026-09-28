package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bs {
    public static final String a = jgt.g("Alarms");

    public static void a(Context context, ivj0 ivj0Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = k88.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        k88.d(intent, ivj0Var);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        jgt.e().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + ivj0Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, ivj0 ivj0Var, long j) {
        lqe0 lqe0VarZ = workDatabase.z();
        kqe0 kqe0VarD = lqe0VarZ.d(ivj0Var);
        if (kqe0VarD != null) {
            int i = kqe0VarD.c;
            a(context, ivj0Var, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = k88.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            k88.d(intent, ivj0Var);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        final w6n w6nVar = new w6n(workDatabase);
        Object objU = workDatabase.u(new x1j(new Callable() { // from class: u6n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase2 = w6nVar.a;
                Long lA = workDatabase2.y().a("next_alarm_manager_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase2.y().b(new ym20("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            }
        }, 1));
        objU.getClass();
        int iIntValue = ((Number) objU).intValue();
        lqe0VarZ.e(new kqe0(ivj0Var.a, ivj0Var.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = k88.f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        k88.d(intent2, ivj0Var);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
