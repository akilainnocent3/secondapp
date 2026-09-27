package com.startapp.sdk.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class bb implements yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobScheduler f74592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f74593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74594c;

    public bb(Context context, Class cls) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            throw new IllegalStateException();
        }
        this.f74592a = jobScheduler;
        this.f74593b = new ComponentName(context, (Class<?>) cls);
        this.f74594c = p0.a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j10) {
        JobInfo.Builder builder = new JobInfo.Builder(Math.abs(Arrays.hashCode(deVar.f74692a)), this.f74593b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", deVar.f74693b.toString());
        persistableBundle.putStringArray("extraKeyTags", deVar.f74692a);
        builder.setExtras(persistableBundle);
        JobRequest$Network jobRequest$Network = deVar.f74694c;
        if (jobRequest$Network != null) {
            builder.setRequiredNetworkType(jobRequest$Network == JobRequest$Network.UNMETERED ? 2 : jobRequest$Network == JobRequest$Network.ANY ? 1 : 0);
        }
        if (this.f74594c) {
            builder.setPersisted(true);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return this.f74592a.schedule(builder.setPeriodic(j10, JobInfo.getMinFlexMillis()).build()) == 1;
            } catch (Throwable unused) {
            }
        } else {
            ArrayList<JobInfo> arrayListA = a();
            if (arrayListA == null) {
                return false;
            }
            for (JobInfo jobInfo : arrayListA) {
                if (jobInfo.getId() == Math.abs(Arrays.hashCode(deVar.f74692a)) && jobInfo.getIntervalMillis() == j10) {
                    return false;
                }
            }
            try {
                return this.f74592a.schedule(builder.setPeriodic(j10).build()) == 1;
            } catch (Throwable unused2) {
            }
        }
    }

    public final ArrayList a() {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = this.f74592a.getAllPendingJobs();
        } catch (Throwable unused) {
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        for (JobInfo jobInfo : allPendingJobs) {
            if (this.f74593b.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(int i10) {
        ArrayList arrayListA = a();
        if (arrayListA == null) {
            return false;
        }
        try {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == i10) {
                    this.f74592a.cancel(i10);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
