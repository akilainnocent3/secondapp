package androidx.work.impl.workers;

import androidx.work.d;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fxa;
import defpackage.ib5;
import defpackage.jgt;
import defpackage.jvd0;
import defpackage.nv5;
import defpackage.ouj0;
import defpackage.owj0;
import defpackage.qis;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.xis;
import defpackage.y5b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", l = {134}, m = "invokeSuspend")
public final class a extends tje0 implements Function2<v5b, v1b<? super d.a>, Object> {
    public qis a;
    public jvd0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d e;
    public final /* synthetic */ ouj0 f;
    public final /* synthetic */ owj0 i;

    /* JADX INFO: renamed from: androidx.work.impl.workers.a$a, reason: collision with other inner class name */
    @c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", l = {129}, m = "invokeSuspend")
    public static final class C0079a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ouj0 b;
        public final /* synthetic */ owj0 c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ qis<d.a> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0079a(ouj0 ouj0Var, owj0 owj0Var, AtomicInteger atomicInteger, qis<d.a> qisVar, v1b<? super C0079a> v1bVar) {
            super(2, v1bVar);
            this.b = ouj0Var;
            this.c = owj0Var;
            this.d = atomicInteger;
            this.e = qisVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new C0079a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C0079a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = fxa.a(this.b, this.c, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.d.set(((Number) obj).intValue());
            this.e.cancel(true);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ouj0 ouj0Var, owj0 owj0Var, v1b<? super a> v1bVar) {
        super(2, v1bVar);
        this.e = dVar;
        this.f = ouj0Var;
        this.i = owj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a aVar = new a(this.e, this.f, this.i, v1bVar);
        aVar.d = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super d.a> v1bVar) {
        return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c9p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c9p] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        qis qisVar;
        y5b y5bVar = y5b.a;
        ?? r1 = this.c;
        d dVar = this.e;
        boolean z = true;
        try {
            try {
                if (r1 == 0) {
                    uj50.b(obj);
                    v5b v5bVar = (v5b) this.d;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    nv5.d dVarB = dVar.b();
                    jvd0 jvd0VarC = ej5.c(v5bVar, null, null, new C0079a(this.f, this.i, atomicInteger2, dVarB, null), 3);
                    try {
                        this.d = atomicInteger2;
                        this.a = dVarB;
                        this.b = jvd0VarC;
                        this.c = 1;
                        obj = xis.a(dVarB, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                        atomicInteger = atomicInteger2;
                        qisVar = dVarB;
                        r1 = jvd0VarC;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        atomicInteger = atomicInteger2;
                        qisVar = dVarB;
                        String str = fxa.a;
                        jgt.e().b(str, "Delegated worker " + dVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = false;
                        }
                        if (qisVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    if (r1 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jvd0 jvd0Var = this.b;
                    qisVar = this.a;
                    atomicInteger = (AtomicInteger) this.d;
                    try {
                        uj50.b(obj);
                        r1 = jvd0Var;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        String str2 = fxa.a;
                        jgt.e().b(str2, "Delegated worker " + dVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = false;
                        }
                        if (qisVar.isCancelled() || !z) {
                            throw cancellationException;
                        }
                        throw new ConstraintTrackingWorker.a(atomicInteger.get());
                    }
                }
                d.a aVar = (d.a) obj;
                r1.cancel(null);
                return aVar;
            } catch (Throwable th) {
                r1.cancel(null);
                throw th;
            }
        } catch (Throwable th2) {
            String str3 = fxa.a;
            jgt.e().b(str3, "Delegated worker " + dVar.getClass() + " threw exception in startWork.", th2);
            throw th2;
        }
    }
}
