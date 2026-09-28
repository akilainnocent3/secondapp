package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes4.dex */
public final class agl0 extends j3l0 {
    public JobScheduler c;

    @Override // defpackage.j3l0
    public final boolean j() {
        return true;
    }

    public final void k(long j) {
        h();
        g();
        JobScheduler jobScheduler = this.c;
        k8l0 k8l0Var = this.a;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(k8l0Var.a.getPackageName())).hashCode()) != null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iL = l();
        if (iL != 2) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.n.b(fl40.d(iL), "[sgtm] Not eligible for Scion upload");
            return;
        }
        y4l0 y4l0Var3 = k8l0Var.f;
        k8l0.m(y4l0Var3);
        y4l0Var3.n.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(k8l0Var.a.getPackageName())).hashCode(), new ComponentName(k8l0Var.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.c;
        hm20.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        y4l0 y4l0Var4 = k8l0Var.f;
        k8l0.m(y4l0Var4);
        y4l0Var4.n.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int l() {
        h();
        g();
        if (this.c == null) {
            return 7;
        }
        k8l0 k8l0Var = this.a;
        Boolean boolS = k8l0Var.d.s("google_analytics_sgtm_upload_enabled");
        if (!(boolS == null ? false : boolS.booleanValue())) {
            return 8;
        }
        if (k8l0Var.q().j < 119000) {
            return 6;
        }
        if (yol0.z(k8l0Var.a)) {
            return !k8l0Var.o().n() ? 5 : 2;
        }
        return 3;
    }
}
