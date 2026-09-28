package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.component.animation.kickvisual.KickVisualContentKt$KickAnimatedContent$1$1", f = "KickVisualContent.kt", l = {127, 136, 144}, m = "invokeSuspend", v = 2)
public final class gqp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public b850 a;
    public int b;
    public final /* synthetic */ ub00 c;
    public final /* synthetic */ fmt d;
    public final /* synthetic */ fmt e;
    public final /* synthetic */ fmt f;
    public final /* synthetic */ Function0<Unit> i;
    public final /* synthetic */ ytw<b850> v;
    public final /* synthetic */ ytw<wpp> w;

    @c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.component.animation.kickvisual.KickVisualContentKt$KickAnimatedContent$1$1$1", f = "KickVisualContent.kt", l = {128}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ ub00 b;

        /* JADX INFO: renamed from: gqp$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.component.animation.kickvisual.KickVisualContentKt$KickAnimatedContent$1$1$1$2", f = "KickVisualContent.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0607a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
            public /* synthetic */ boolean a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0607a c0607a = new C0607a(2, v1bVar);
                c0607a.a = ((Boolean) obj).booleanValue();
                return c0607a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0607a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ub00 ub00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ub00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            final ub00 ub00Var = this.b;
            or60 or60VarC = n95.c(new Function0() { // from class: fqp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ub00 ub00Var2 = ub00Var;
                    return Boolean.valueOf((ub00Var2.a.getValue() == null || ub00Var2.b.getValue() == null || ub00Var2.c.getValue() == null || ub00Var2.d.getValue() == null || ub00Var2.e.getValue() == null) ? false : true);
                }
            });
            C0607a c0607a = new C0607a(2, null);
            this.a = 1;
            Object objB = s0i.b(or60VarC, c0607a, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqp(ub00 ub00Var, fmt fmtVar, fmt fmtVar2, fmt fmtVar3, Function0<Unit> function0, ytw<b850> ytwVar, ytw<wpp> ytwVar2, v1b<? super gqp> v1bVar) {
        super(2, v1bVar);
        this.c = ub00Var;
        this.d = fmtVar;
        this.e = fmtVar2;
        this.f = fmtVar3;
        this.i = function0;
        this.v = ytwVar;
        this.w = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gqp(this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gqp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[Catch: txf0 -> 0x00bd, TryCatch #0 {txf0 -> 0x00bd, blocks: (B:7:0x001a, B:31:0x00b4, B:12:0x0027, B:25:0x007b, B:28:0x00af, B:13:0x002b, B:19:0x0042, B:22:0x0076, B:16:0x0032), top: B:36:0x0012 }] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r13 == r0) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.b
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r13.i
            fmt r3 = r13.e
            fmt r4 = r13.d
            r5 = 0
            ub00 r6 = r13.c
            r7 = 3
            r8 = 2
            r9 = 1
            ytw<wpp> r10 = r13.w
            if (r1 == 0) goto L2f
            if (r1 == r9) goto L2b
            if (r1 == r8) goto L25
            if (r1 != r7) goto L1f
            defpackage.uj50.b(r14)     // Catch: defpackage.txf0 -> Lbd
            goto Lb4
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r5
        L25:
            b850 r1 = r13.a
            defpackage.uj50.b(r14)     // Catch: defpackage.txf0 -> Lbd
            goto L7b
        L2b:
            defpackage.uj50.b(r14)     // Catch: defpackage.txf0 -> Lbd
            goto L42
        L2f:
            defpackage.uj50.b(r14)
            gqp$a r14 = new gqp$a     // Catch: defpackage.txf0 -> Lbd
            r14.<init>(r6, r5)     // Catch: defpackage.txf0 -> Lbd
            r13.b = r9     // Catch: defpackage.txf0 -> Lbd
            r11 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r14 = defpackage.vxf0.b(r11, r14, r13)     // Catch: defpackage.txf0 -> Lbd
            if (r14 != r0) goto L42
            goto Lb3
        L42:
            b850 r1 = defpackage.iqp.f(r6)     // Catch: defpackage.txf0 -> Lbd
            ytw<b850> r14 = r13.v     // Catch: defpackage.txf0 -> Lbd
            r14.setValue(r1)     // Catch: defpackage.txf0 -> Lbd
            wpp r14 = defpackage.wpp.b     // Catch: defpackage.txf0 -> Lbd
            r10.setValue(r14)     // Catch: defpackage.txf0 -> Lbd
            xmt r14 = r1.a     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair r6 = new kotlin.Pair     // Catch: defpackage.txf0 -> Lbd
            r6.<init>(r4, r14)     // Catch: defpackage.txf0 -> Lbd
            xmt r14 = r1.c     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair r9 = new kotlin.Pair     // Catch: defpackage.txf0 -> Lbd
            r9.<init>(r3, r14)     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair[] r14 = new kotlin.Pair[]{r6, r9}     // Catch: defpackage.txf0 -> Lbd
            java.util.List r14 = kotlin.collections.b.k(r14)     // Catch: defpackage.txf0 -> Lbd
            r13.a = r1     // Catch: defpackage.txf0 -> Lbd
            r13.b = r8     // Catch: defpackage.txf0 -> Lbd
            hqp r6 = new hqp     // Catch: defpackage.txf0 -> Lbd
            r6.<init>(r14, r5)     // Catch: defpackage.txf0 -> Lbd
            java.lang.Object r14 = defpackage.w5b.d(r6, r13)     // Catch: defpackage.txf0 -> Lbd
            if (r14 != r0) goto L76
            goto L78
        L76:
            kotlin.Unit r14 = kotlin.Unit.a     // Catch: defpackage.txf0 -> Lbd
        L78:
            if (r14 != r0) goto L7b
            goto Lb3
        L7b:
            wpp r14 = defpackage.wpp.c     // Catch: defpackage.txf0 -> Lbd
            r10.setValue(r14)     // Catch: defpackage.txf0 -> Lbd
            xmt r14 = r1.b     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair r6 = new kotlin.Pair     // Catch: defpackage.txf0 -> Lbd
            r6.<init>(r4, r14)     // Catch: defpackage.txf0 -> Lbd
            fmt r14 = r13.f     // Catch: defpackage.txf0 -> Lbd
            xmt r4 = r1.e     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair r8 = new kotlin.Pair     // Catch: defpackage.txf0 -> Lbd
            r8.<init>(r14, r4)     // Catch: defpackage.txf0 -> Lbd
            xmt r14 = r1.d     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair r1 = new kotlin.Pair     // Catch: defpackage.txf0 -> Lbd
            r1.<init>(r3, r14)     // Catch: defpackage.txf0 -> Lbd
            kotlin.Pair[] r14 = new kotlin.Pair[]{r6, r8, r1}     // Catch: defpackage.txf0 -> Lbd
            java.util.List r14 = kotlin.collections.b.k(r14)     // Catch: defpackage.txf0 -> Lbd
            r13.a = r5     // Catch: defpackage.txf0 -> Lbd
            r13.b = r7     // Catch: defpackage.txf0 -> Lbd
            hqp r1 = new hqp     // Catch: defpackage.txf0 -> Lbd
            r1.<init>(r14, r5)     // Catch: defpackage.txf0 -> Lbd
            java.lang.Object r13 = defpackage.w5b.d(r1, r13)     // Catch: defpackage.txf0 -> Lbd
            if (r13 != r0) goto Laf
            goto Lb1
        Laf:
            kotlin.Unit r13 = kotlin.Unit.a     // Catch: defpackage.txf0 -> Lbd
        Lb1:
            if (r13 != r0) goto Lb4
        Lb3:
            return r0
        Lb4:
            wpp r13 = defpackage.wpp.d     // Catch: defpackage.txf0 -> Lbd
            r10.setValue(r13)     // Catch: defpackage.txf0 -> Lbd
            r2.invoke()     // Catch: defpackage.txf0 -> Lbd
            goto Lc0
        Lbd:
            r2.invoke()
        Lc0:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
