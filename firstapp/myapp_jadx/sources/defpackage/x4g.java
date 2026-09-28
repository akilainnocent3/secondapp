package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequestsDatabase_Impl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x4g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new v4g((EncryptedRequestsDatabase_Impl) obj);
            case 1:
                ((y6p) obj).invoke(mvk.a.a);
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(b.c.a.a);
                return Unit.a;
            default:
                svj0 svj0Var = (svj0) obj;
                WorkDatabase workDatabase = svj0Var.c;
                Context context = svj0Var.a;
                String str = vqe0.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    l9p.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListD = vqe0.d(context, jobScheduler);
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    int size = arrayListD.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayListD.get(i2);
                        i2++;
                        vqe0.a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                workDatabase.C().n();
                xm70.b(svj0Var.b, workDatabase, svj0Var.e);
                return Unit.a;
        }
    }
}
