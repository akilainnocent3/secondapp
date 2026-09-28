package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.twilio.voice.EventKeys;
import defpackage.bmh0;
import defpackage.bmy;
import defpackage.dvg0;
import defpackage.kw20;
import defpackage.ml1;
import defpackage.nw20;
import defpackage.rlh0;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(EventKeys.PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        dvg0.b(getApplicationContext());
        if (string == null) {
            bmy.a("Null backendName");
            return false;
        }
        kw20 kw20VarB = nw20.b(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        bmh0 bmh0Var = dvg0.a().d;
        bmh0Var.e.execute(new rlh0(bmh0Var, new ml1(string, bArrDecode, kw20VarB), i2, new Runnable() { // from class: g9p
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = JobInfoSchedulerService.a;
                this.a.jobFinished(jobParameters, false);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
