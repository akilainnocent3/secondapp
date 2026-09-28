package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import defpackage.axa;
import defpackage.bjb0;
import defpackage.bxa;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fxa;
import defpackage.gf8;
import defpackage.ib5;
import defpackage.jgt;
import defpackage.k5b;
import defpackage.ouj0;
import defpackage.owj0;
import defpackage.pwj0;
import defpackage.svj0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vjg0;
import defpackage.vvj0;
import defpackage.w5b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zwa;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    public static final class a extends CancellationException {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    @c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", l = {58}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super d.a>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ConstraintTrackingWorker.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super d.a> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objE = ConstraintTrackingWorker.this.e(this);
                return objE == y5bVar ? y5bVar : objE;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(v1b<? super d.a> v1bVar) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return ej5.d(gf8.a(executorService), new b(null), v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(d dVar, ouj0 ouj0Var, owj0 owj0Var, x1b x1bVar) {
        zwa zwaVar;
        if (x1bVar instanceof zwa) {
            zwaVar = (zwa) x1bVar;
            int i = zwaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwaVar.c = i - Integer.MIN_VALUE;
            } else {
                zwaVar = new zwa(this, x1bVar);
            }
        } else {
            zwaVar = new zwa(this, x1bVar);
        }
        Object objD = zwaVar.a;
        y5b y5bVar = y5b.a;
        int i2 = zwaVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            androidx.work.impl.workers.a aVar = new androidx.work.impl.workers.a(dVar, ouj0Var, owj0Var, null);
            zwaVar.c = 1;
            objD = w5b.d(aVar, zwaVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        objD.getClass();
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object e(x1b x1bVar) {
        axa axaVar;
        d dVar;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        int i;
        ConstraintTrackingWorker constraintTrackingWorker = this;
        WorkerParameters workerParameters = constraintTrackingWorker.g;
        if (x1bVar instanceof axa) {
            axaVar = (axa) x1bVar;
            int i2 = axaVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axaVar.e = i2 - Integer.MIN_VALUE;
            } else {
                axaVar = new axa(constraintTrackingWorker, x1bVar);
            }
        } else {
            axaVar = new axa(constraintTrackingWorker, x1bVar);
        }
        axa axaVar2 = axaVar;
        Object objD = axaVar2.c;
        y5b y5bVar = y5b.a;
        int i3 = axaVar2.e;
        if (i3 != 0) {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d dVar2 = axaVar2.b;
            ConstraintTrackingWorker constraintTrackingWorker2 = axaVar2.a;
            try {
                uj50.b(objD);
                dVar = dVar2;
                constraintTrackingWorker = constraintTrackingWorker2;
                return (d.a) objD;
            } catch (CancellationException e) {
                e = e;
                dVar = dVar2;
                constraintTrackingWorker = constraintTrackingWorker2;
                atomicInteger = constraintTrackingWorker.c;
                atomicInteger2 = constraintTrackingWorker.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof a)) {
                            ib5.a("Unreachable");
                            return null;
                        }
                        i = ((a) e).a;
                    }
                    dVar.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof a)) {
                            ib5.a("Unreachable");
                            return null;
                        }
                        i = ((a) e).a;
                    }
                    dVar.c.compareAndSet(-256, i);
                }
                if (e instanceof a) {
                    return new d.a.b();
                }
                throw e;
            }
        }
        uj50.b(objD);
        WorkerParameters workerParameters2 = constraintTrackingWorker.b;
        c cVar = workerParameters2.b;
        cVar.getClass();
        Object obj = cVar.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            jgt.e().c(fxa.a, "No worker to delegate to.");
            return new d.a.C0078a();
        }
        Context context = constraintTrackingWorker.a;
        svj0 svj0VarC = svj0.c(context);
        svj0VarC.getClass();
        pwj0 pwj0VarC = svj0VarC.c.C();
        String string = workerParameters2.a.toString();
        string.getClass();
        owj0 owj0VarJ = pwj0VarC.j(string);
        if (owj0VarJ == null) {
            return new d.a.C0078a();
        }
        vjg0 vjg0Var = svj0VarC.j;
        vjg0Var.getClass();
        ouj0 ouj0Var = new ouj0(vjg0Var);
        if (!ouj0Var.a(owj0VarJ)) {
            String str2 = fxa.a;
            jgt.e().a(str2, "Constraints not met for delegate " + str + ". Requesting retry.");
            return new d.a.b();
        }
        jgt.e().a(fxa.a, "Constraints met for delegate ".concat(str));
        try {
            bjb0 bjb0Var = workerParameters2.f;
            context.getClass();
            d dVarI = bjb0Var.I(context, str, workerParameters);
            vvj0.a aVar = workerParameters.e.d;
            aVar.getClass();
            try {
                k5b k5bVarA = gf8.a(aVar);
                dVar = dVarI;
                try {
                    bxa bxaVar = new bxa(constraintTrackingWorker, dVar, ouj0Var, owj0VarJ, null);
                    axaVar2.a = constraintTrackingWorker;
                    axaVar2.b = dVar;
                    axaVar2.e = 1;
                    objD = ej5.d(k5bVarA, bxaVar, axaVar2);
                    if (objD == y5bVar) {
                        return y5bVar;
                    }
                    return (d.a) objD;
                } catch (CancellationException e2) {
                    e = e2;
                    atomicInteger = constraintTrackingWorker.c;
                    atomicInteger2 = constraintTrackingWorker.c;
                    if (atomicInteger.get() == -256 || (e instanceof a)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            i = -512;
                        } else if (atomicInteger2.get() != -256) {
                            i = atomicInteger2.get();
                        } else {
                            if (!(e instanceof a)) {
                                ib5.a("Unreachable");
                                return null;
                            }
                            i = ((a) e).a;
                        }
                        dVar.c.compareAndSet(-256, i);
                    }
                    if (e instanceof a) {
                        return new d.a.b();
                    }
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
                dVar = dVarI;
                atomicInteger = constraintTrackingWorker.c;
                atomicInteger2 = constraintTrackingWorker.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof a)) {
                            ib5.a("Unreachable");
                            return null;
                        }
                        i = ((a) e).a;
                    }
                    dVar.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger2.get() != -256) {
                        i = atomicInteger2.get();
                    } else {
                        if (!(e instanceof a)) {
                            ib5.a("Unreachable");
                            return null;
                        }
                        i = ((a) e).a;
                    }
                    dVar.c.compareAndSet(-256, i);
                }
                if (e instanceof a) {
                    return new d.a.b();
                }
                throw e;
            }
        } catch (Throwable unused) {
            jgt.e().a(fxa.a, "No worker to delegate to.");
            svj0VarC.b.getClass();
            return new d.a.C0078a();
        }
    }
}
