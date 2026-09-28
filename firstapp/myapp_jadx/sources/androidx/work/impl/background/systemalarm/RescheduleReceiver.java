package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jgt;
import defpackage.svj0;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = jgt.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jgt.e().a(a, "Received intent " + intent);
        try {
            svj0 svj0VarC = svj0.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            svj0VarC.getClass();
            synchronized (svj0.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = svj0VarC.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    svj0VarC.i = pendingResultGoAsync;
                    if (svj0VarC.h) {
                        pendingResultGoAsync.finish();
                        svj0VarC.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            jgt.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
