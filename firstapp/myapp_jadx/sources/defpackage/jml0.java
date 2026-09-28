package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class jml0 extends vml0 {
    public final AlarmManager d;
    public hml0 e;
    public Integer f;

    public jml0(iol0 iol0Var) {
        super(iol0Var);
        this.d = (AlarmManager) this.a.a.getSystemService("alarm");
    }

    @Override // defpackage.vml0
    public final void j() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = this.a.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), lvk0.a));
        }
        l();
    }

    public final void k() {
        h();
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = k8l0Var.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), lvk0.a));
        }
        hml0 hml0Var = this.e;
        if (hml0Var == null) {
            hml0Var = new hml0(this, this.b.l);
            this.e = hml0Var;
        }
        hml0Var.c();
        l();
    }

    public final void l() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }

    public final int m() {
        Integer numValueOf = this.f;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(AnalyticsEvent.BI_TRACKING_KIND_MEASUREMENT.concat(String.valueOf(this.a.a.getPackageName())).hashCode());
            this.f = numValueOf;
        }
        return numValueOf.intValue();
    }
}
