package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class yy20 {
    public static final String l = jgt.g("Processor");
    public final Context b;
    public final a c;
    public final vvj0 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public yy20(Context context, a aVar, vvj0 vvj0Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = aVar;
        this.d = vvj0Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, ayj0 ayj0Var, int i) {
        String str2 = l;
        if (ayj0Var == null) {
            jgt.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        ayj0Var.l.t(new xxj0(i));
        jgt.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(wtg wtgVar) {
        synchronized (this.k) {
            this.j.add(wtgVar);
        }
    }

    public final ayj0 b(String str) {
        ayj0 ayj0Var = (ayj0) this.f.remove(str);
        boolean z = ayj0Var != null;
        if (!z) {
            ayj0Var = (ayj0) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = iqe0.y;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            jgt.e().d(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ayj0Var;
    }

    public final ayj0 c(String str) {
        ayj0 ayj0Var = (ayj0) this.f.get(str);
        return ayj0Var == null ? (ayj0) this.g.get(str) : ayj0Var;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            z = c(str) != null;
        }
        return z;
    }

    public final void f(wtg wtgVar) {
        synchronized (this.k) {
            this.j.remove(wtgVar);
        }
    }

    public final boolean g(iwd0 iwd0Var, WorkerParameters.a aVar) {
        final ivj0 ivj0Var = iwd0Var.a;
        final String str = ivj0Var.a;
        final ArrayList arrayList = new ArrayList();
        owj0 owj0Var = (owj0) this.e.u(new x1j(new Callable() { // from class: vy20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.a.e;
                lxj0 lxj0VarD = workDatabase.D();
                String str2 = str;
                arrayList.addAll(lxj0VarD.a(str2));
                return workDatabase.C().j(str2);
            }
        }, 1));
        if (owj0Var == null) {
            jgt.e().h(l, "Didn't find WorkSpec for id " + ivj0Var);
            this.d.d.execute(new Runnable() { // from class: xy20
                @Override // java.lang.Runnable
                public final void run() {
                    yy20 yy20Var = this.a;
                    ivj0 ivj0Var2 = ivj0Var;
                    synchronized (yy20Var.k) {
                        try {
                            ArrayList arrayList2 = yy20Var.j;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList2.get(i);
                                i++;
                                ((wtg) obj).a(ivj0Var2, false);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((iwd0) set.iterator().next()).a.b == ivj0Var.b) {
                        set.add(iwd0Var);
                        jgt.e().a(l, "Work " + ivj0Var + " is already enqueued for processing");
                    } else {
                        this.d.d.execute(new Runnable() { // from class: xy20
                            @Override // java.lang.Runnable
                            public final void run() {
                                yy20 yy20Var = this.a;
                                ivj0 ivj0Var2 = ivj0Var;
                                synchronized (yy20Var.k) {
                                    try {
                                        ArrayList arrayList2 = yy20Var.j;
                                        int size = arrayList2.size();
                                        int i = 0;
                                        while (i < size) {
                                            Object obj = arrayList2.get(i);
                                            i++;
                                            ((wtg) obj).a(ivj0Var2, false);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    }
                    return false;
                }
                if (owj0Var.t != ivj0Var.b) {
                    this.d.d.execute(new Runnable() { // from class: xy20
                        @Override // java.lang.Runnable
                        public final void run() {
                            yy20 yy20Var = this.a;
                            ivj0 ivj0Var2 = ivj0Var;
                            synchronized (yy20Var.k) {
                                try {
                                    ArrayList arrayList2 = yy20Var.j;
                                    int size = arrayList2.size();
                                    int i = 0;
                                    while (i < size) {
                                        Object obj = arrayList2.get(i);
                                        i++;
                                        ((wtg) obj).a(ivj0Var2, false);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                    return false;
                }
                final ayj0 ayj0Var = new ayj0(new ayj0.a(this.b, this.c, this.d, this, this.e, owj0Var, arrayList));
                final nv5.d dVarA = wis.a(ayj0Var.d.b.plus(i9p.a()), new cyj0(ayj0Var, null));
                dVarA.b.k(new Runnable() { // from class: wy20
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zBooleanValue;
                        yy20 yy20Var = this.a;
                        nv5.d dVar = dVarA;
                        ayj0 ayj0Var2 = ayj0Var;
                        try {
                            zBooleanValue = ((Boolean) dVar.b.get()).booleanValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            zBooleanValue = true;
                        }
                        synchronized (yy20Var.k) {
                            try {
                                ivj0 ivj0VarA = jxj0.a(ayj0Var2.a);
                                String str2 = ivj0VarA.a;
                                if (yy20Var.c(str2) == ayj0Var2) {
                                    yy20Var.b(str2);
                                }
                                jgt.e().a(yy20.l, yy20.class.getSimpleName() + " " + str2 + " executed; reschedule = " + zBooleanValue);
                                ArrayList arrayList2 = yy20Var.j;
                                int size = arrayList2.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    ((wtg) obj).a(ivj0VarA, zBooleanValue);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, this.d.d);
                this.g.put(str, ayj0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(iwd0Var);
                this.h.put(str, hashSet);
                jgt.e().a(l, yy20.class.getSimpleName() + ": processing " + ivj0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
