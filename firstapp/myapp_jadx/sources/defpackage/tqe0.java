package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tqe0 {
    public static final String b = jgt.g("SystemJobInfoConverter");
    public final ComponentName a;

    public tqe0(Context context, dqe0 dqe0Var) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(owj0 owj0Var, int i) {
        int i2;
        String str;
        lxa lxaVar = owj0Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", owj0Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", owj0Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", owj0Var.d());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = lxaVar.c;
        Set<lxa.a> set = lxaVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = lxaVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = lxaVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            sox soxVar = lxaVar.a;
            if (i3 < 30 || soxVar != sox.f) {
                int iOrdinal = soxVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4 || i3 < 26) {
                                jgt.e().a(b, "API version too low. Cannot convert network type value " + soxVar);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(owj0Var.m, owj0Var.l == nt1.b ? 0 : 1);
        }
        long jMax = Math.max(owj0Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!owj0Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (lxa.a aVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.a, aVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(lxaVar.g);
            extras.setTriggerContentMaxDelay(lxaVar.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(lxaVar.e);
            extras.setRequiresStorageNotLow(lxaVar.f);
        }
        Object[] objArr = owj0Var.k > 0;
        boolean z3 = jMax > 0;
        if (i4 >= 31 && owj0Var.q && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = owj0Var.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
