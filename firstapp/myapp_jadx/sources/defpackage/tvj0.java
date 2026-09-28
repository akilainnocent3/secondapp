package defpackage;

import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tvj0 extends saj implements kaj<Context, a, p5f0, WorkDatabase, vjg0, yy20, List<? extends rm70>> {
    public static final tvj0 a = new tvj0(6, uvj0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.kaj
    public final List<? extends rm70> f(Context context, a aVar, p5f0 p5f0Var, WorkDatabase workDatabase, vjg0 vjg0Var, yy20 yy20Var) {
        Context context2 = context;
        a aVar2 = aVar;
        p5f0 p5f0Var2 = p5f0Var;
        WorkDatabase workDatabase2 = workDatabase;
        vjg0 vjg0Var2 = vjg0Var;
        yy20 yy20Var2 = yy20Var;
        context2.getClass();
        aVar2.getClass();
        p5f0Var2.getClass();
        workDatabase2.getClass();
        vjg0Var2.getClass();
        String str = xm70.a;
        vqe0 vqe0Var = new vqe0(context2, workDatabase2, aVar2);
        imz.a(context2, SystemJobService.class, true);
        jgt.e().a(xm70.a, "Created SystemJobScheduler and enabled SystemJobService");
        return b.k(vqe0Var, new o7l(context2, aVar2, vjg0Var2, yy20Var2, new qvj0(yy20Var2, p5f0Var2), p5f0Var2));
    }
}
