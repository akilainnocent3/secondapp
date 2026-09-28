package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ov90 implements wxo {
    public final tuw a = uuw.a();
    public final s11 b = new s11();
    public final or60 c = new or60(new a(2, null));

    @c0d(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    public ov90(String str) {
    }

    @Override // defpackage.wxo
    public final Object a(rrc rrcVar) {
        return new Integer(this.b.a.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wxo
    public final Object b(Function2 function2, x1b x1bVar) throws Throwable {
        nv90 nv90Var;
        tuw tuwVar;
        boolean z;
        Throwable th;
        if (x1bVar instanceof nv90) {
            nv90Var = (nv90) x1bVar;
            int i = nv90Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nv90Var.e = i - Integer.MIN_VALUE;
            } else {
                nv90Var = new nv90(this, x1bVar);
            }
        } else {
            nv90Var = new nv90(this, x1bVar);
        }
        Object obj = nv90Var.c;
        y5b y5bVar = y5b.a;
        int i2 = nv90Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = nv90Var.b;
            tuwVar = nv90Var.a;
            try {
                uj50.b(obj);
                if (z) {
                    tuwVar.f(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    tuwVar.f(null);
                }
                throw th;
            }
        }
        uj50.b(obj);
        tuw tuwVar2 = this.a;
        boolean zG = tuwVar2.g();
        try {
            Boolean boolValueOf = Boolean.valueOf(zG);
            nv90Var.a = tuwVar2;
            nv90Var.b = zG;
            nv90Var.e = 1;
            Object objInvoke = function2.invoke(boolValueOf, nv90Var);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
            tuwVar = tuwVar2;
            z = zG;
            obj = objInvoke;
            if (z) {
                tuwVar.f(null);
            }
            return obj;
        } catch (Throwable th3) {
            tuwVar = tuwVar2;
            z = zG;
            th = th3;
            if (z) {
                tuwVar.f(null);
            }
            throw th;
        }
    }

    @Override // defpackage.wxo
    public final lyh<Unit> c() {
        return this.c;
    }

    @Override // defpackage.wxo
    public final Object d(x1b x1bVar) {
        return new Integer(this.b.a.get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ov90] */
    /* JADX WARN: Type inference failed for: r6v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.wxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.jvm.functions.Function1 r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mv90
            if (r0 == 0) goto L13
            r0 = r8
            mv90 r0 = (defpackage.mv90) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            mv90 r0 = new mv90
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.a
            quw r6 = (defpackage.quw) r6
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L37:
            tuw r6 = r0.b
            java.lang.Object r7 = r0.a
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            defpackage.uj50.b(r8)
            goto L53
        L41:
            defpackage.uj50.b(r8)
            r0.a = r7
            tuw r6 = r6.a
            r0.b = r6
            r0.e = r4
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L53
            goto L5f
        L53:
            r0.a = r6     // Catch: java.lang.Throwable -> L2f
            r0.b = r5     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            r6.f(r5)
            return r8
        L64:
            r6.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov90.e(kotlin.jvm.functions.Function1, x1b):java.lang.Object");
    }
}
