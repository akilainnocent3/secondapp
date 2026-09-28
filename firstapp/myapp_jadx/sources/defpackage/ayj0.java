package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class ayj0 {
    public final owj0 a;
    public final Context b;
    public final String c;
    public final vvj0 d;
    public final androidx.work.a e;
    public final yy20 f;
    public final WorkDatabase g;
    public final pwj0 h;
    public final umd i;
    public final ArrayList j;
    public final String k;
    public final e9p l;

    public static final class a {
        public final androidx.work.a a;
        public final vvj0 b;
        public final yy20 c;
        public final WorkDatabase d;
        public final owj0 e;
        public final ArrayList f;
        public final Context g;

        public a(Context context, androidx.work.a aVar, vvj0 vvj0Var, yy20 yy20Var, WorkDatabase workDatabase, owj0 owj0Var, ArrayList arrayList) {
            context.getClass();
            aVar.getClass();
            this.a = aVar;
            this.b = vvj0Var;
            this.c = yy20Var;
            this.d = workDatabase;
            this.e = owj0Var;
            this.f = arrayList;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.g = applicationContext;
            new WorkerParameters.a();
        }
    }

    public ayj0(a aVar) {
        owj0 owj0Var = aVar.e;
        this.a = owj0Var;
        this.b = aVar.g;
        String str = owj0Var.a;
        this.c = str;
        this.d = aVar.b;
        androidx.work.a aVar2 = aVar.a;
        this.e = aVar2;
        dqe0 dqe0Var = aVar2.d;
        this.f = aVar.c;
        WorkDatabase workDatabase = aVar.d;
        this.g = workDatabase;
        this.h = workDatabase.C();
        this.i = workDatabase.x();
        ArrayList arrayList = aVar.f;
        this.j = arrayList;
        this.k = uf80.a(he.a("Work [ id=", str, ", tags={ "), CollectionsKt.a0(arrayList, ",", null, null, null, 62), " } ]");
        this.l = i9p.a();
    }

    public final void a(int i) {
        pwj0 pwj0Var = this.h;
        jvj0 jvj0Var = jvj0.a;
        String str = this.c;
        pwj0Var.e(jvj0Var, str);
        pwj0Var.r(System.currentTimeMillis(), str);
        pwj0Var.f(this.a.v, str);
        pwj0Var.c(-1L, str);
        pwj0Var.u(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        pwj0 pwj0Var = this.h;
        String str = this.c;
        pwj0Var.r(jCurrentTimeMillis, str);
        pwj0Var.e(jvj0.a, str);
        pwj0Var.w(str);
        pwj0Var.f(this.a.v, str);
        pwj0Var.b(str);
        pwj0Var.c(-1L, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(x1b x1bVar) {
        dyj0 dyj0Var;
        yln ylnVar;
        c cVarA;
        final ayj0 ayj0Var = this;
        owj0 owj0Var = ayj0Var.a;
        String str = owj0Var.c;
        String str2 = owj0Var.d;
        if (x1bVar instanceof dyj0) {
            dyj0Var = (dyj0) x1bVar;
            int i = dyj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyj0Var.d = i - Integer.MIN_VALUE;
            } else {
                dyj0Var = new dyj0(ayj0Var, x1bVar);
            }
        } else {
            dyj0Var = new dyj0(ayj0Var, x1bVar);
        }
        Object objD = dyj0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = dyj0Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                androidx.work.a aVar = ayj0Var.e;
                eqa eqaVar = aVar.i;
                bjb0 bjb0Var = aVar.e;
                boolean zB = sig0.b();
                String str3 = owj0Var.x;
                if (zB && str3 != null) {
                    int iHashCode = owj0Var.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        tig0.a(iHashCode, sig0.d(str3));
                    } else {
                        String strD = sig0.d(str3);
                        try {
                            Method method = sig0.c;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                sig0.c = method;
                            }
                            method.invoke(null, Long.valueOf(sig0.a), strD, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            sig0.a("asyncTraceBegin", e);
                        }
                    }
                }
                x1j x1jVar = new x1j(new Callable() { // from class: yxj0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        owj0 owj0Var2 = this.a.a;
                        String str4 = owj0Var2.c;
                        jvj0 jvj0Var = owj0Var2.b;
                        jvj0 jvj0Var2 = jvj0.a;
                        if (jvj0Var != jvj0Var2) {
                            String str5 = gyj0.a;
                            jgt.e().a(str5, str4 + " is not in ENQUEUED state. Nothing more to do");
                            return Boolean.TRUE;
                        }
                        if ((!owj0Var2.d() && (owj0Var2.b != jvj0Var2 || owj0Var2.k <= 0)) || System.currentTimeMillis() >= owj0Var2.a()) {
                            return Boolean.FALSE;
                        }
                        jgt.e().a(gyj0.a, "Delaying execution for " + str4 + " because it is being executed before schedule.");
                        return Boolean.TRUE;
                    }
                }, 1);
                WorkDatabase workDatabase = ayj0Var.g;
                Boolean bool = (Boolean) workDatabase.u(x1jVar);
                bool.getClass();
                if (bool.booleanValue()) {
                    return new b.c((Object) null);
                }
                boolean zD = owj0Var.d();
                String str4 = ayj0Var.c;
                if (zD) {
                    cVarA = owj0Var.e;
                } else {
                    aVar.f.getClass();
                    str2.getClass();
                    String str5 = zln.a;
                    try {
                        Object objNewInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        ylnVar = (yln) objNewInstance;
                    } catch (Exception e2) {
                        jgt.e().d(zln.a, "Trouble instantiating ".concat(str2), e2);
                        ylnVar = null;
                    }
                    if (ylnVar == null) {
                        String str6 = gyj0.a;
                        jgt.e().c(str6, "Could not create Input Merger " + str2);
                        return new b.a(0);
                    }
                    cVarA = ylnVar.a(CollectionsKt.i0(ayj0Var.h.m(str4), kotlin.collections.a.c(owj0Var.e)));
                }
                UUID uuidFromString = UUID.fromString(str4);
                ExecutorService executorService = aVar.a;
                pfd pfdVar = aVar.b;
                yy20 yy20Var = ayj0Var.f;
                vvj0 vvj0Var = ayj0Var.d;
                hvj0 hvj0Var = new hvj0(workDatabase, yy20Var, vvj0Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                workerParameters.b = cVarA;
                new HashSet(ayj0Var.j);
                workerParameters.c = executorService;
                workerParameters.d = pfdVar;
                workerParameters.e = vvj0Var;
                workerParameters.f = bjb0Var;
                try {
                    d dVarI = bjb0Var.I(ayj0Var.b, str, workerParameters);
                    dVarI.d = true;
                    CoroutineContext.Element element = dyj0Var.getContext().get(c9p.b.a);
                    element.getClass();
                    c9p c9pVar = (c9p) element;
                    c9pVar.invokeOnCompletion(new eyj0(dVarI, zB, str3, ayj0Var));
                    Object objU = workDatabase.u(new x1j(new Callable() { // from class: zxj0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z;
                            ayj0 ayj0Var2 = this.a;
                            pwj0 pwj0Var = ayj0Var2.h;
                            String str7 = ayj0Var2.c;
                            if (pwj0Var.i(str7) == jvj0.a) {
                                pwj0Var.e(jvj0.b, str7);
                                pwj0Var.y(str7);
                                pwj0Var.u(-256, str7);
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    }, 1));
                    objU.getClass();
                    if (!((Boolean) objU).booleanValue()) {
                        return new b.c((Object) null);
                    }
                    Object obj = null;
                    if (c9pVar.isCancelled()) {
                        return new b.c(obj);
                    }
                    vvj0.a aVar2 = vvj0Var.d;
                    aVar2.getClass();
                    k5b k5bVarA = gf8.a(aVar2);
                    fyj0 fyj0Var = new fyj0(ayj0Var, dVarI, hvj0Var, null);
                    dyj0Var.a = ayj0Var;
                    dyj0Var.d = 1;
                    objD = ej5.d(k5bVarA, fyj0Var, dyj0Var);
                    if (objD == y5bVar) {
                        return y5bVar;
                    }
                } catch (Throwable unused) {
                    String str7 = gyj0.a;
                    jgt.e().c(str7, "Could not create Worker " + str);
                    return new b.a(0);
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ayj0Var = dyj0Var.a;
                uj50.b(objD);
            }
            d.a aVar3 = (d.a) objD;
            aVar3.getClass();
            return new b.C0105b(aVar3);
        } catch (CancellationException e3) {
            String str8 = gyj0.a;
            jgt jgtVarE = jgt.e();
            String strConcat = ayj0Var.k.concat(" was cancelled");
            if (((jgt.a) jgtVarE).c <= 4) {
                Log.i(str8, strConcat, e3);
            }
            throw e3;
        } catch (Throwable th) {
            jgt.e().d(gyj0.a, ayj0Var.k.concat(" failed because it threw an exception/error"), th);
            ayj0Var.e.getClass();
            return new b.a(0);
        }
    }

    public final void d(d.a aVar) {
        aVar.getClass();
        String str = this.c;
        ArrayList arrayListL = kotlin.collections.b.l(str);
        while (true) {
            boolean zIsEmpty = arrayListL.isEmpty();
            pwj0 pwj0Var = this.h;
            if (zIsEmpty) {
                c cVar = ((d.a.C0078a) aVar).a;
                cVar.getClass();
                pwj0Var.f(this.a.v, str);
                pwj0Var.s(str, cVar);
                return;
            }
            String str2 = (String) p48.C(arrayListL);
            if (pwj0Var.i(str2) != jvj0.f) {
                pwj0Var.e(jvj0.d, str2);
            }
            arrayListL.addAll(this.i.a(str2));
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final d.a a = new d.a.C0078a();

            public a(int i) {
            }
        }

        /* JADX INFO: renamed from: ayj0$b$b, reason: collision with other inner class name */
        public static final class C0105b extends b {
            public final d.a a;

            public C0105b(d.a aVar) {
                aVar.getClass();
                this.a = aVar;
            }
        }

        public static final class c extends b {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public /* synthetic */ c(Object obj) {
                this(-256);
            }
        }
    }
}
