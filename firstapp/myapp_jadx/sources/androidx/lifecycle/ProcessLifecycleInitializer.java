package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.ix20;
import defpackage.jx20;
import defpackage.m2g;
import defpackage.pas;
import defpackage.s9s;
import defpackage.yr0;
import defpackage.zhn;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lzhn;", "Libs;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements zhn<ibs> {
    @Override // defpackage.zhn
    public final ibs create(Context context) {
        context.getClass();
        yr0 yr0VarC = yr0.c(context);
        yr0VarC.getClass();
        if (!yr0VarC.b.contains(ProcessLifecycleInitializer.class)) {
            ib5.a("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!pas.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new pas.a());
        }
        ix20 ix20Var = ix20.w;
        ix20Var.getClass();
        ix20Var.e = new Handler();
        ix20Var.f.g(s9s.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new jx20(ix20Var));
        return ix20Var;
    }

    @Override // defpackage.zhn
    public final List<Class<? extends zhn<?>>> dependencies() {
        return m2g.a;
    }
}
