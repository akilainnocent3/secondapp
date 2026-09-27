package com.startapp.sdk.jobs;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.internal.u5;
import com.startapp.sdk.internal.zf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"SpecifyJobSchedulerIdRange"})
public class SchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ExecutorService f76005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f76006b = new a(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f76005a = Executors.newSingleThreadExecutor(new u5("scheduler"));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f76005a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f76005a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f76006b.a(this, extras.getStringArray("extraKeyTags"), new zf(this, jobParameters), bundle);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
