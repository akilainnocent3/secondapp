package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.twilio.voice.EventKeys;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public final class f9p implements mwj0 {
    public final Context a;
    public final erg b;
    public final sm70 c;

    public f9p(Context context, erg ergVar, sm70 sm70Var) {
        this.a = context;
        this.b = ergVar;
        this.c = sm70Var;
    }

    @Override // defpackage.mwj0
    public final void a(oug0 oug0Var, int i) {
        b(oug0Var, i, false);
    }

    @Override // defpackage.mwj0
    public final void b(oug0 oug0Var, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oug0Var.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(nw20.a(oug0Var.c())).array());
        if (oug0Var.b() != null) {
            adler32.update(oug0Var.b());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    tgt.a(oug0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        long jP0 = this.b.P0(oug0Var);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        kw20 kw20VarC = oug0Var.c();
        sm70 sm70Var = this.c;
        builder.setMinimumLatency(sm70Var.b(kw20VarC, jP0, i));
        Set<sm70.b> setB = sm70Var.c().get(kw20VarC).b();
        if (setB.contains(sm70.b.a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(sm70.b.c)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(sm70.b.b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", oug0Var.a());
        persistableBundle.putInt(EventKeys.PRIORITY, nw20.a(oug0Var.c()));
        if (oug0Var.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oug0Var.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {oug0Var, Integer.valueOf(value), Long.valueOf(sm70Var.b(oug0Var.c(), jP0, i)), Long.valueOf(jP0), Integer.valueOf(i)};
        String strC = tgt.c("JobInfoScheduler");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
