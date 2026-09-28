package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vqe0 implements rm70 {
    public static final String e = jgt.g("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final tqe0 c;
    public final WorkDatabase d;

    public vqe0(Context context, WorkDatabase workDatabase, a aVar) {
        JobScheduler jobSchedulerB = l9p.b(context);
        tqe0 tqe0Var = new tqe0(context, aVar.d);
        this.a = context;
        this.b = jobSchedulerB;
        this.c = tqe0Var;
        this.d = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            jgt.e().d(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = l9p.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static ivj0 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ivj0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.rm70
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler);
        int i = 0;
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListD.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                ivj0 ivj0VarF = f(jobInfo);
                if (ivj0VarF != null && str.equals(ivj0VarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            a(jobScheduler, ((Integer) obj2).intValue());
        }
        this.d.z().g(str);
    }

    @Override // defpackage.rm70
    public final void c(owj0... owj0VarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.d;
        final w6n w6nVar = new w6n(workDatabase);
        for (owj0 owj0Var : owj0VarArr) {
            workDatabase.c();
            try {
                pwj0 pwj0VarC = workDatabase.C();
                String str = owj0Var.a;
                owj0 owj0VarJ = pwj0VarC.j(str);
                String str2 = e;
                if (owj0VarJ == null) {
                    jgt.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.v();
                } else if (owj0VarJ.b != jvj0.a) {
                    jgt.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.v();
                } else {
                    ivj0 ivj0VarA = jxj0.a(owj0Var);
                    kqe0 kqe0VarD = workDatabase.z().d(ivj0VarA);
                    if (kqe0VarD != null) {
                        iIntValue = kqe0VarD.c;
                    } else {
                        WorkDatabase workDatabase2 = w6nVar.a;
                        Callable callable = new Callable() { // from class: v6n
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = w6nVar.a;
                                Long lA = workDatabase3.y().a("next_job_scheduler_id");
                                int i = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase3.y().b(new ym20("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                                    workDatabase3.y().b(new ym20("next_job_scheduler_id", 1L));
                                } else {
                                    i = iLongValue;
                                }
                                return Integer.valueOf(i);
                            }
                        };
                        workDatabase2.getClass();
                        Object objU = workDatabase2.u(new x1j(callable, 1));
                        objU.getClass();
                        iIntValue = ((Number) objU).intValue();
                    }
                    if (kqe0VarD == null) {
                        workDatabase.z().e(new kqe0(ivj0VarA.a, ivj0VarA.b, iIntValue));
                    }
                    g(owj0Var, iIntValue);
                    workDatabase.v();
                }
                workDatabase.r();
            } catch (Throwable th) {
                workDatabase.r();
                throw th;
            }
        }
    }

    @Override // defpackage.rm70
    public final boolean e() {
        return true;
    }

    public final void g(owj0 owj0Var, int i) {
        JobInfo jobInfoA = this.c.a(owj0Var, i);
        jgt jgtVarE = jgt.e();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = owj0Var.a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String string = sb.toString();
        String str2 = e;
        jgtVarE.a(str2, string);
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                jgt.e().h(str2, "Unable to schedule work ID " + str);
                if (owj0Var.q && owj0Var.r == x7z.a) {
                    owj0Var.q = false;
                    jgt.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(owj0Var, i);
                }
            }
        } catch (IllegalStateException e2) {
            String str3 = l9p.a;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = this.d.C().g().size();
            Context context = this.a;
            String strA0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler jobSchedulerB = l9p.b(context);
                List<JobInfo> listA = l9p.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListD = d(context, jobSchedulerB);
                    int size2 = arrayListD != null ? listA.size() - arrayListD.size() : 0;
                    String strA = size2 == 0 ? null : m58.a(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListD2 = d(context, (JobScheduler) systemService);
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strA0 = CollectionsKt.a0(ay0.v(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strA, size3 != 0 ? m58.a(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, l9p.b(context));
                if (arrayListD3 != null) {
                    strA0 = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            String strA2 = zk1.a(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", uqe0.a(i3, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strA0, ".\nThere are "));
            jgt.e().c(str2, strA2);
            rzk.b(strA2, e2);
        } catch (Throwable th) {
            jgt.e().d(str2, "Unable to schedule " + owj0Var, th);
        }
    }
}
