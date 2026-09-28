package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class svj0 extends rvj0 {
    public static svj0 k;
    public static svj0 l;
    public static final Object m;
    public final Context a;
    public final a b;
    public final WorkDatabase c;
    public final p5f0 d;
    public final List<rm70> e;
    public final yy20 f;
    public final xn20 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final vjg0 j;

    static {
        jgt.g("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public svj0(Context context, final a aVar, p5f0 p5f0Var, final WorkDatabase workDatabase, final List<rm70> list, yy20 yy20Var, vjg0 vjg0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            ib5.a("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        jgt.a aVar2 = new jgt.a(aVar.h);
        synchronized (jgt.a) {
            try {
                if (jgt.b == null) {
                    jgt.b = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = p5f0Var;
        this.c = workDatabase;
        this.f = yy20Var;
        this.j = vjg0Var;
        this.b = aVar;
        this.e = list;
        k5b k5bVarB = p5f0Var.b();
        k5bVarB.getClass();
        j1b j1bVarA = w5b.a(k5bVarB);
        this.g = new xn20(workDatabase);
        final xd80 xd80VarC = p5f0Var.c();
        String str = xm70.a;
        yy20Var.a(new wtg() { // from class: um70
            @Override // defpackage.wtg
            public final void a(final ivj0 ivj0Var, boolean z) {
                final List list2 = list;
                final a aVar3 = aVar;
                final WorkDatabase workDatabase2 = workDatabase;
                xd80VarC.execute(new Runnable() { // from class: vm70
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((rm70) it.next()).b(ivj0Var.a);
                        }
                        xm70.b(aVar3, workDatabase2, list3);
                    }
                });
            }
        });
        p5f0Var.d(new ForceStopRunnable(applicationContext, this));
        String str2 = rdh0.a;
        if (ay20.a(applicationContext, aVar)) {
            kzh.d(new g1i(uzh.b(ozh.b(new b0i(workDatabase.C().q(), new pdh0(4, null)), -1, 2)), new qdh0(applicationContext, null)), j1bVarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static svj0 c(Context context) {
        svj0 svj0VarC;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        svj0VarC = k;
                        if (svj0VarC == null) {
                            svj0VarC = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return svj0VarC;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (svj0VarC == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, ((a.b) applicationContext).b());
            svj0VarC = c(applicationContext);
        }
        return svj0VarC;
    }

    public static void d(Context context, a aVar) {
        synchronized (m) {
            try {
                svj0 svj0Var = k;
                if (svj0Var != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (svj0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    svj0 svj0VarA = l;
                    if (svj0VarA == null) {
                        svj0VarA = uvj0.a(applicationContext, aVar);
                        l = svj0VarA;
                    }
                    k = svj0VarA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rvj0
    public final s1z a(List<? extends jwj0> list) {
        if (!list.isEmpty()) {
            return new ruj0(this, null, lvg.b, list).X();
        }
        hb5.a("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final s1z b(String str, wd00 wd00Var) {
        return new ruj0(this, str, lvg.b, Collections.singletonList(wd00Var)).X();
    }

    public final void e() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        eqa eqaVar = this.b.i;
        x4g x4gVar = new x4g(this, 3);
        boolean zB = sig0.b();
        if (zB) {
            try {
                Trace.beginSection(sig0.d("ReschedulingWork"));
            } finally {
                if (zB) {
                    Trace.endSection();
                }
            }
        }
        x4gVar.invoke();
    }
}
