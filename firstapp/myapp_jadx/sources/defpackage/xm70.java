package defpackage;

import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xm70 {
    public static final String a = jgt.g("Schedulers");

    public static void a(pwj0 pwj0Var, dqe0 dqe0Var, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pwj0Var.c(jCurrentTimeMillis, ((owj0) it.next()).a);
            }
        }
    }

    public static void b(a aVar, WorkDatabase workDatabase, List<rm70> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        pwj0 pwj0VarC = workDatabase.C();
        workDatabase.c();
        try {
            ArrayList arrayListV = pwj0VarC.v();
            a(pwj0VarC, aVar.d, arrayListV);
            ArrayList arrayListX = pwj0VarC.x();
            a(pwj0VarC, aVar.d, arrayListX);
            arrayListX.addAll(arrayListV);
            ArrayList arrayListO = pwj0VarC.o();
            workDatabase.v();
            workDatabase.r();
            if (arrayListX.size() > 0) {
                owj0[] owj0VarArr = (owj0[]) arrayListX.toArray(new owj0[arrayListX.size()]);
                for (rm70 rm70Var : list) {
                    if (rm70Var.e()) {
                        rm70Var.c(owj0VarArr);
                    }
                }
            }
            if (arrayListO.size() > 0) {
                owj0[] owj0VarArr2 = (owj0[]) arrayListO.toArray(new owj0[arrayListO.size()]);
                for (rm70 rm70Var2 : list) {
                    if (!rm70Var2.e()) {
                        rm70Var2.c(owj0VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.r();
            throw th;
        }
    }
}
