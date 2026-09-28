package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.simulate.SportySimBadgeHelper$shouldNotifySimBadge$1", f = "SportySimBadgeHelper.kt", l = {32, 35}, m = "invokeSuspend", v = 2)
public final class f9d0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g9d0 b;
    public final /* synthetic */ Function1<Boolean, Unit> c;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.simulate.SportySimBadgeHelper$shouldNotifySimBadge$1$1", f = "SportySimBadgeHelper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<Boolean, Unit> a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = function1;
            this.b = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(Boolean.valueOf(this.b));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f9d0(g9d0 g9d0Var, Function1<? super Boolean, Unit> function1, v1b<? super f9d0> v1bVar) {
        super(2, v1bVar);
        this.b = g9d0Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f9d0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f9d0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (defpackage.ej5.d(r7, r1, r6) == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            g9d0 r4 = r6.b
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L5b
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L2f
        L1d:
            defpackage.uj50.b(r7)
            m2l r7 = r4.b
            r6.a = r5
            zed r7 = r7.a
            java.lang.String r1 = "PREF_KEY_BADGE_ENABLE"
            java.lang.Object r7 = r7.getBoolean(r1, r5, r6)
            if (r7 != r0) goto L2f
            goto L5a
        L2f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.sportybet.plugin.realsports.data.sim.SimShareData r1 = com.sportybet.plugin.realsports.data.sim.SimShareData.INSTANCE
            boolean r1 = r1.isSimulatedActive()
            if (r1 == 0) goto L48
            uqm r1 = r4.a
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L48
            if (r7 == 0) goto L48
            goto L49
        L48:
            r5 = 0
        L49:
            k5b r7 = r4.d
            f9d0$a r1 = new f9d0$a
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r4 = r6.c
            r1.<init>(r4, r5, r2)
            r6.a = r3
            java.lang.Object r6 = defpackage.ej5.d(r7, r1, r6)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
