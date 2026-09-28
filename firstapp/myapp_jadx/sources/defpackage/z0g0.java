package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
public final class z0g0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b1g0 b;
    public final /* synthetic */ a1g0 c;
    public final /* synthetic */ huw d;

    @c0d(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a1g0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1g0 a1g0Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = a1g0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.invoke(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0g0(b1g0 b1g0Var, a1g0 a1g0Var, huw huwVar, v1b v1bVar) {
        super(1, v1bVar);
        this.b = b1g0Var;
        this.c = a1g0Var;
        this.d = huwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new z0g0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((z0g0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (defpackage.vxf0.b(1500, r8, r7) == r0) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            huw r3 = r7.d
            r4 = 2
            r5 = 1
            b1g0 r6 = r7.b
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L11
            if (r1 != r4) goto L17
        L11:
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L15
            goto L3f
        L15:
            r7 = move-exception
            goto L49
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1d:
            defpackage.uj50.b(r8)
            boolean r8 = r6.a     // Catch: java.lang.Throwable -> L15
            a1g0 r1 = r7.c
            if (r8 == 0) goto L2f
            r7.a = r5     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = r1.invoke(r7)     // Catch: java.lang.Throwable -> L15
            if (r7 != r0) goto L3f
            goto L3e
        L2f:
            z0g0$a r8 = new z0g0$a     // Catch: java.lang.Throwable -> L15
            r8.<init>(r1, r2)     // Catch: java.lang.Throwable -> L15
            r7.a = r4     // Catch: java.lang.Throwable -> L15
            r1 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r7 = defpackage.vxf0.b(r1, r8, r7)     // Catch: java.lang.Throwable -> L15
            if (r7 != r0) goto L3f
        L3e:
            return r0
        L3f:
            huw r7 = defpackage.huw.c
            if (r3 == r7) goto L46
            r6.a()
        L46:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L49:
            huw r8 = defpackage.huw.c
            if (r3 == r8) goto L50
            r6.a()
        L50:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
