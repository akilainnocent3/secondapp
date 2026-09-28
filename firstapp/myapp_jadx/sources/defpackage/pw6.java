package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class pw6<I, O> extends dbj<O> implements Runnable {
    public wz0<? super I, ? extends O> c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public qis<? extends I> f;
    public volatile qis<? extends O> i;

    public class a implements Runnable {
        public final /* synthetic */ qis a;

        public a(qis qisVar) {
            this.a = qisVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    pw6 pw6Var = pw6.this;
                    Object objB = obj.b(this.a);
                    nv5.a<V> aVar = pw6Var.b;
                    if (aVar != 0) {
                        aVar.b((V) objB);
                    }
                } catch (CancellationException unused) {
                    pw6.this.cancel(false);
                } catch (ExecutionException e) {
                    pw6 pw6Var2 = pw6.this;
                    Throwable cause = e.getCause();
                    nv5.a<V> aVar2 = pw6Var2.b;
                    if (aVar2 != 0) {
                        aVar2.d(cause);
                    }
                }
            } finally {
                pw6.this.i = null;
            }
        }
    }

    public pw6(wz0<? super I, ? extends O> wz0Var, qis<? extends I> qisVar) {
        this.c = wz0Var;
        qisVar.getClass();
        this.f = qisVar;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dbj, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        qis<? extends I> qisVar = this.f;
        if (qisVar != null) {
            qisVar.cancel(z);
        }
        qis<? extends O> qisVar2 = this.i;
        if (qisVar2 != null) {
            qisVar2.cancel(z);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.dbj, java.util.concurrent.Future
    public final O get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            qis<? extends I> qisVar = this.f;
            if (qisVar != null) {
                long jNanoTime = System.nanoTime();
                qisVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            qis<? extends O> qisVar2 = this.i;
            if (qisVar2 != null) {
                qisVar2.get(j, timeUnit);
            }
        }
        return (O) this.a.get(j, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qis<? extends I>, wz0<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [dbj, pw6, pw6<I, O>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [pw6] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dbj] */
    /* JADX WARN: Type inference failed for: r4v4, types: [pw6] */
    /* JADX WARN: Type inference failed for: r4v6, types: [dbj] */
    /* JADX WARN: Type inference failed for: r4v7, types: [dbj] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
            qis<? extends I> r1 = r4.f     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38 java.util.concurrent.ExecutionException -> L47 java.util.concurrent.CancellationException -> L54
            java.lang.Object r1 = defpackage.obj.b(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38 java.util.concurrent.ExecutionException -> L47 java.util.concurrent.CancellationException -> L54
            wz0<? super I, ? extends O> r2 = r4.c     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            qis r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r4.i = r1     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            qis<V> r2 = r4.a     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            boolean r2 = r2.isCancelled()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            if (r2 == 0) goto L3a
            java.util.concurrent.LinkedBlockingQueue r2 = r4.d     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            java.lang.Object r2 = b(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r4.i = r0     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
        L28:
            r4.c = r0
            r4.f = r0
            java.util.concurrent.CountDownLatch r4 = r4.e
            r4.countDown()
            return
        L32:
            r1 = move-exception
            goto L7f
        L34:
            r1 = move-exception
            goto L59
        L36:
            r1 = move-exception
            goto L6a
        L38:
            r1 = move-exception
            goto L72
        L3a:
            pw6$a r2 = new pw6$a     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            nqe r3 = defpackage.nqe.a()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            r1.k(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L47:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            nv5$a<V> r2 = r4.b     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            if (r2 == 0) goto L28
            r2.d(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L54:
            r1 = 0
            r4.cancel(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Error -> L34 java.lang.Exception -> L36 java.lang.reflect.UndeclaredThrowableException -> L38
            goto L28
        L59:
            nv5$a<V> r2 = r4.b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L60
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
        L60:
            r4.c = r0
            r4.f = r0
            java.util.concurrent.CountDownLatch r4 = r4.e
            r4.countDown()
            goto L7e
        L6a:
            nv5$a<V> r2 = r4.b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L60
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
            goto L60
        L72:
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L32
            nv5$a<V> r2 = r4.b     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L60
            r2.d(r1)     // Catch: java.lang.Throwable -> L32
            goto L60
        L7e:
            return
        L7f:
            r4.c = r0
            r4.f = r0
            java.util.concurrent.CountDownLatch r4 = r4.e
            r4.countDown()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw6.run():void");
    }

    @Override // defpackage.dbj, java.util.concurrent.Future
    public final O get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            qis<? extends I> qisVar = this.f;
            if (qisVar != null) {
                qisVar.get();
            }
            this.e.await();
            qis<? extends O> qisVar2 = this.i;
            if (qisVar2 != null) {
                qisVar2.get();
            }
        }
        return (O) this.a.get();
    }
}
