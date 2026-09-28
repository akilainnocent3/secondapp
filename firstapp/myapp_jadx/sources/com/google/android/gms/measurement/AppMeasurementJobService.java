package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import defpackage.hm20;
import defpackage.iol0;
import defpackage.l9c;
import defpackage.nyk0;
import defpackage.okl0;
import defpackage.p1l0;
import defpackage.skl0;
import defpackage.wkl0;
import defpackage.y4l0;
import defpackage.zkl0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementJobService extends JobService implements skl0 {
    public zkl0 a;

    @Override // defpackage.skl0
    public final void a(Intent intent) {
    }

    @Override // defpackage.skl0
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final zkl0 c() {
        zkl0 zkl0Var = this.a;
        if (zkl0Var != null) {
            return zkl0Var;
        }
        zkl0 zkl0Var2 = new zkl0(this);
        this.a = zkl0Var2;
        return zkl0Var2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", c().a.getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", c().a.getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.skl0
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final zkl0 zkl0VarC = c();
        Service service = zkl0VarC.a;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", UccrWswQGaIj.rkYD.concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            hm20.h(string);
            iol0 iol0VarC = iol0.C(service);
            final y4l0 y4l0VarA = iol0VarC.a();
            l9c l9cVar = iol0VarC.l.c;
            y4l0VarA.n.b(string, "Local AppMeasurementJobService called. action");
            iol0VarC.b().p(new okl0(zkl0VarC, iol0VarC, new Runnable() { // from class: ukl0
                @Override // java.lang.Runnable
                public final void run() {
                    y4l0VarA.n.a("AppMeasurementJobService processed last upload request.");
                    ((skl0) zkl0VarC.a).b(jobParameters);
                }
            }));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            hm20.h(string);
            p1l0 p1l0VarE = p1l0.e(service, null);
            wkl0 wkl0Var = new wkl0(zkl0VarC, jobParameters);
            p1l0VarE.getClass();
            p1l0VarE.c(new nyk0(p1l0VarE, wkl0Var));
            return true;
        }
        return true;
    }
}
