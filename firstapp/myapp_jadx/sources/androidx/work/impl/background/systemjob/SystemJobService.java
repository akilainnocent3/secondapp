package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import defpackage.ib5;
import defpackage.ivj0;
import defpackage.iwd0;
import defpackage.jgt;
import defpackage.jwd0;
import defpackage.qvj0;
import defpackage.rzk;
import defpackage.svj0;
import defpackage.tug;
import defpackage.wtg;
import defpackage.yy20;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements wtg {
    public static final String e = jgt.g("SystemJobService");
    public svj0 a;
    public final HashMap b = new HashMap();
    public final jwd0 c = new jwd0();
    public qvj0 d;

    public static class a {
        public static void a(JobParameters jobParameters) {
            jobParameters.getNetwork();
        }
    }

    public static class b {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.e;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ib5.a(tug.a("Cannot invoke ", str, " on a background thread"));
    }

    public static ivj0 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ivj0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.wtg
    public final void a(ivj0 ivj0Var, boolean z) {
        b("onExecuted");
        jgt.e().a(e, ivj0Var.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(ivj0Var);
        this.c.a(ivj0Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            svj0 svj0VarC = svj0.c(getApplicationContext());
            this.a = svj0VarC;
            yy20 yy20Var = svj0VarC.f;
            this.d = new qvj0(yy20Var, svj0VarC.d);
            yy20Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                jgt.e().h(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                rzk.b("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        svj0 svj0Var = this.a;
        if (svj0Var != null) {
            svj0Var.f.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        svj0 svj0Var = this.a;
        String str = e;
        if (svj0Var == null) {
            jgt.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        ivj0 ivj0VarC = c(jobParameters);
        if (ivj0VarC == null) {
            jgt.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(ivj0VarC)) {
            jgt.e().a(str, "Job is already being executed by SystemJobService: " + ivj0VarC);
            return false;
        }
        jgt.e().a(str, "onStartJob for " + ivj0VarC);
        map.put(ivj0VarC, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(jobParameters);
        }
        this.d.b(this.c.c(ivj0VarC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        b("onStopJob");
        if (this.a == null) {
            jgt.e().a(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        ivj0 ivj0VarC = c(jobParameters);
        if (ivj0VarC == null) {
            jgt.e().c(e, "WorkSpec id not found!");
            return false;
        }
        jgt.e().a(e, "onStopJob for " + ivj0VarC);
        this.b.remove(ivj0VarC);
        iwd0 iwd0VarA = this.c.a(ivj0VarC);
        if (iwd0VarA != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? b.a(jobParameters) : -512;
            qvj0 qvj0Var = this.d;
            qvj0Var.getClass();
            qvj0Var.a(iwd0VarA, iA);
        }
        yy20 yy20Var = this.a.f;
        String str = ivj0VarC.a;
        synchronized (yy20Var.k) {
            zContains = yy20Var.i.contains(str);
        }
        return !zContains;
    }
}
