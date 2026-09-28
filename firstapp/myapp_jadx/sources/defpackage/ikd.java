package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ikd implements Runnable {
    public final /* synthetic */ kkd a;

    public /* synthetic */ ikd(kkd kkdVar) {
        this.a = kkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kkd kkdVar = this.a;
        int i = kkdVar.b;
        Executor executor = kkdVar.w;
        Context context = kkdVar.a;
        String str = kkd.D;
        upe0 upe0Var = kkdVar.d;
        ivj0 ivj0Var = kkdVar.c;
        String str2 = ivj0Var.a;
        if (kkdVar.i >= 2) {
            jgt.e().a(str, "Already stopped work for " + str2);
            return;
        }
        kkdVar.i = 2;
        jgt.e().a(str, "Stopping work for WorkSpec " + str2);
        String str3 = k88.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        k88.d(intent, ivj0Var);
        executor.execute(new upe0.b(i, upe0Var, intent));
        if (!upe0Var.d.e(ivj0Var.a)) {
            jgt.e().a(str, "Processor does not have WorkSpec " + str2 + ". No need to reschedule");
            return;
        }
        jgt.e().a(str, "WorkSpec " + str2 + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        k88.d(intent2, ivj0Var);
        executor.execute(new upe0.b(i, upe0Var, intent2));
    }
}
