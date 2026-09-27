package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class zf implements ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f75989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f75990b;

    public zf(SchedulerService schedulerService, JobParameters jobParameters) {
        this.f75990b = schedulerService;
        this.f75989a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.ya
    public final void a() {
        this.f75990b.jobFinished(this.f75989a, false);
    }
}
