package defpackage;

import android.app.job.JobParameters;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wkl0 implements Runnable {
    public final /* synthetic */ zkl0 a;
    public final /* synthetic */ JobParameters b;

    public /* synthetic */ wkl0(zkl0 zkl0Var, JobParameters jobParameters) {
        this.a = zkl0Var;
        this.b = jobParameters;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((skl0) this.a.a).b(this.b);
    }
}
