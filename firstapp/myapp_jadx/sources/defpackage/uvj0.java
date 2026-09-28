package defpackage;

import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class uvj0 {
    /* JADX WARN: Type inference failed for: r6v1, types: [suj0] */
    public static final svj0 a(Context context, a aVar) {
        lv50.a aVarA;
        context.getClass();
        aVar.getClass();
        vvj0 vvj0Var = new vvj0(aVar.c);
        final Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        xd80 xd80Var = vvj0Var.a;
        xd80Var.getClass();
        dqe0 dqe0Var = aVar.d;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            aVarA = new lv50.a(applicationContext, WorkDatabase.class, null);
            aVarA.i = true;
        } else {
            aVarA = dv50.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarA.h = new wfe0.c() { // from class: suj0
                @Override // wfe0.c
                public final wfe0 a(wfe0.b bVar) {
                    String str = bVar.b;
                    wfe0.a aVar2 = bVar.c;
                    aVar2.getClass();
                    if (str != null && str.length() != 0) {
                        return new szi(applicationContext, str, aVar2, true, true);
                    }
                    hb5.a("Must set a non-null database name to a configuration that uses the no backup directory.");
                    return null;
                }
            };
        }
        aVarA.f = xd80Var;
        aVarA.d.add(new qq7(dqe0Var));
        aVarA.a(aqv.c);
        aVarA.a(new nb50(applicationContext, 2, 3));
        aVarA.a(bqv.c);
        aVarA.a(cqv.c);
        aVarA.a(new nb50(applicationContext, 5, 6));
        aVarA.a(dqv.c);
        aVarA.a(eqv.c);
        aVarA.a(fqv.c);
        aVarA.a(new wvj0(applicationContext));
        aVarA.a(new nb50(applicationContext, 10, 11));
        aVarA.a(wpv.c);
        aVarA.a(xpv.c);
        aVarA.a(ypv.c);
        aVarA.a(zpv.c);
        aVarA.a(new nb50(applicationContext, 21, 22));
        aVarA.c();
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        vjg0 vjg0Var = new vjg0(applicationContext2, vvj0Var);
        yy20 yy20Var = new yy20(context.getApplicationContext(), aVar, vvj0Var, workDatabase);
        tvj0 tvj0Var = tvj0.a;
        tvj0Var.getClass();
        return new svj0(context.getApplicationContext(), aVar, vvj0Var, workDatabase, tvj0Var.f(context, aVar, vvj0Var, workDatabase, vjg0Var, yy20Var), yy20Var, vjg0Var);
    }
}
