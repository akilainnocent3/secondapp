package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import defpackage.dqe0;
import defpackage.jgt;
import defpackage.lqe0;
import defpackage.lxj0;
import defpackage.pie;
import defpackage.pwj0;
import defpackage.svj0;
import defpackage.yvj0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a.c c() {
        svj0 svj0VarC = svj0.c(this.a);
        svj0VarC.getClass();
        WorkDatabase workDatabase = svj0VarC.c;
        workDatabase.getClass();
        pwj0 pwj0VarC = workDatabase.C();
        yvj0 yvj0VarA = workDatabase.A();
        lxj0 lxj0VarD = workDatabase.D();
        lqe0 lqe0VarZ = workDatabase.z();
        dqe0 dqe0Var = svj0VarC.b.d;
        ArrayList arrayListD = pwj0VarC.d(System.currentTimeMillis() - 86400000);
        ArrayList arrayListT = pwj0VarC.t();
        ArrayList arrayListO = pwj0VarC.o();
        if (!arrayListD.isEmpty()) {
            jgt jgtVarE = jgt.e();
            String str = pie.a;
            jgtVarE.f(str, "Recently completed work:\n\n");
            jgt.e().f(str, pie.a(yvj0VarA, lxj0VarD, lqe0VarZ, arrayListD));
        }
        if (!arrayListT.isEmpty()) {
            jgt jgtVarE2 = jgt.e();
            String str2 = pie.a;
            jgtVarE2.f(str2, "Running work:\n\n");
            jgt.e().f(str2, pie.a(yvj0VarA, lxj0VarD, lqe0VarZ, arrayListT));
        }
        if (!arrayListO.isEmpty()) {
            jgt jgtVarE3 = jgt.e();
            String str3 = pie.a;
            jgtVarE3.f(str3, "Enqueued work:\n\n");
            jgt.e().f(str3, pie.a(yvj0VarA, lxj0VarD, lqe0VarZ, arrayListO));
        }
        return new d.a.c();
    }
}
