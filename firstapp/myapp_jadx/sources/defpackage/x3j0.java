package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$ImageCardWithContent$1$1", f = "WelcomeRewardScreen.kt", l = {1058, 1059, 1061, 1062}, m = "invokeSuspend", v = 2)
public final class x3j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long i;

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$ImageCardWithContent$1$1$1", f = "WelcomeRewardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX INFO: renamed from: x3j0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$ImageCardWithContent$1$1$1$1", f = "WelcomeRewardScreen.kt", l = {1064}, m = "invokeSuspend", v = 2)
        public static final class C1273a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1273a(wd0<Float, ij0> wd0Var, v1b<? super C1273a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1273a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1273a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(320, 0, c1j0.a, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$ImageCardWithContent$1$1$1$2", f = "WelcomeRewardScreen.kt", l = {1073, 1080, 1087}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wd0<Float, ij0> wd0Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
            
                if (defpackage.wd0.a(r12.b, r8, r9, null, null, r12, 12) == r0) goto L20;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r14.a
                    r2 = 110(0x6e, float:1.54E-43)
                    r3 = 3
                    r4 = 1
                    r5 = 0
                    r6 = 2
                    if (r1 == 0) goto L28
                    if (r1 == r4) goto L23
                    if (r1 == r6) goto L1e
                    if (r1 != r3) goto L17
                    defpackage.uj50.b(r15)
                    goto L84
                L17:
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r14)
                    r14 = 0
                    return r14
                L1e:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L68
                L23:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L4b
                L28:
                    defpackage.uj50.b(r15)
                    java.lang.Float r8 = new java.lang.Float
                    r15 = 1065604874(0x3f83d70a, float:1.03)
                    r8.<init>(r15)
                    r15 = 150(0x96, float:2.1E-43)
                    f4c r1 = defpackage.c1j0.a
                    gzg0 r9 = defpackage.yi0.e(r15, r5, r1, r6)
                    r14.a = r4
                    wd0<java.lang.Float, ij0> r7 = r14.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    r12 = r14
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L4b
                    goto L83
                L4b:
                    java.lang.Float r8 = new java.lang.Float
                    r14 = 1065185444(0x3f7d70a4, float:0.99)
                    r8.<init>(r14)
                    f4c r14 = defpackage.c1j0.a
                    gzg0 r9 = defpackage.yi0.e(r2, r5, r14, r6)
                    r12.a = r6
                    wd0<java.lang.Float, ij0> r7 = r12.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L68
                    goto L83
                L68:
                    java.lang.Float r8 = new java.lang.Float
                    r14 = 1065353216(0x3f800000, float:1.0)
                    r8.<init>(r14)
                    f4c r14 = defpackage.c1j0.a
                    gzg0 r9 = defpackage.yi0.e(r2, r5, r14, r6)
                    r12.a = r3
                    wd0<java.lang.Float, ij0> r7 = r12.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L84
                L83:
                    return r0
                L84:
                    kotlin.Unit r14 = kotlin.Unit.a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: x3j0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new C1273a(this.b, null), 3);
            ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3j0(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, boolean z, boolean z2, boolean z3, long j, v1b<? super x3j0> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = wd0Var2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.i = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x3j0(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x3j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (defpackage.w5b.d(r13, r12) == r0) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r12.a
            r2 = 0
            boolean r3 = r12.e
            boolean r4 = r12.d
            wd0<java.lang.Float, ij0> r5 = r12.c
            r6 = 1065353216(0x3f800000, float:1.0)
            wd0<java.lang.Float, ij0> r7 = r12.b
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L33
            if (r1 == r11) goto L2f
            if (r1 == r10) goto L2b
            if (r1 == r9) goto L27
            if (r1 != r8) goto L21
            defpackage.uj50.b(r13)
            goto L78
        L21:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r2
        L27:
            defpackage.uj50.b(r13)
            goto L6a
        L2b:
            defpackage.uj50.b(r13)
            goto L57
        L2f:
            defpackage.uj50.b(r13)
            goto L44
        L33:
            defpackage.uj50.b(r13)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r6)
            r12.a = r11
            java.lang.Object r13 = r7.f(r12, r13)
            if (r13 != r0) goto L44
            goto L77
        L44:
            if (r4 == 0) goto L49
            if (r3 != 0) goto L49
            r6 = 0
        L49:
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r6)
            r12.a = r10
            java.lang.Object r13 = r5.f(r12, r13)
            if (r13 != r0) goto L57
            goto L77
        L57:
            if (r4 == 0) goto L78
            if (r3 == 0) goto L78
            boolean r13 = r12.f
            if (r13 == 0) goto L78
            r12.a = r9
            long r3 = r12.i
            java.lang.Object r13 = defpackage.hkd.b(r3, r12)
            if (r13 != r0) goto L6a
            goto L77
        L6a:
            x3j0$a r13 = new x3j0$a
            r13.<init>(r5, r7, r2)
            r12.a = r8
            java.lang.Object r12 = defpackage.w5b.d(r13, r12)
            if (r12 != r0) goto L78
        L77:
            return r0
        L78:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
