package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1", f = "MultiLevelRoundBar.kt", l = {590, 591, 593, 595, 596, 598, 606, 612, 662, 665, 673}, m = "invokeSuspend", v = 1)
public final class sdw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<Boolean> A;
    public final /* synthetic */ ytw<Boolean> B;
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ wd0<Float, ij0> f;
    public final /* synthetic */ wd0<Float, ij0> i;
    public final /* synthetic */ wd0<Float, ij0> v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Function0<Unit> y;
    public final /* synthetic */ ytw<Boolean> z;

    @c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1$1", f = "MultiLevelRoundBar.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ wd0<Float, ij0> e;
        public final /* synthetic */ ytw<Boolean> f;

        /* JADX INFO: renamed from: sdw$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1$1$1", f = "MultiLevelRoundBar.kt", l = {616, 621}, m = "invokeSuspend", v = 1)
        public static final class C1091a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1091a(wd0<Float, ij0> wd0Var, v1b<? super C1091a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1091a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1091a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
            
                if (defpackage.wd0.a(r13.b, r1, r2, null, null, r13, 12) == r7) goto L15;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    y5b r7 = defpackage.y5b.a
                    int r0 = r13.a
                    r8 = 6
                    r9 = 0
                    r10 = 300(0x12c, float:4.2E-43)
                    r11 = 2
                    r1 = 1
                    r12 = 0
                    if (r0 == 0) goto L1f
                    if (r0 == r1) goto L1b
                    if (r0 != r11) goto L15
                    defpackage.uj50.b(r14)
                    goto L5a
                L15:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r0)
                    return r12
                L1b:
                    defpackage.uj50.b(r14)
                    goto L3f
                L1f:
                    defpackage.uj50.b(r14)
                    java.lang.Float r0 = new java.lang.Float
                    r2 = 1067030938(0x3f99999a, float:1.2)
                    r0.<init>(r2)
                    gzg0 r2 = defpackage.yi0.e(r10, r9, r12, r8)
                    r13.a = r1
                    r1 = r0
                    wd0<java.lang.Float, ij0> r0 = r13.b
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r5 = r13
                    java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 != r7) goto L3f
                    goto L59
                L3f:
                    java.lang.Float r1 = new java.lang.Float
                    r0 = 1065353216(0x3f800000, float:1.0)
                    r1.<init>(r0)
                    gzg0 r2 = defpackage.yi0.e(r10, r9, r12, r8)
                    r13.a = r11
                    wd0<java.lang.Float, ij0> r0 = r13.b
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r5 = r13
                    java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 != r7) goto L5a
                L59:
                    return r7
                L5a:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sdw.a.C1091a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1$1$2", f = "MultiLevelRoundBar.kt", l = {629}, m = "invokeSuspend", v = 1)
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

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(300, 0, null, 6);
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

        @c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1$1$3", f = "MultiLevelRoundBar.kt", l = {636, 637, 639, 647}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ wd0<Float, ij0> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = wd0Var2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0072  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
            
                if (defpackage.wd0.a(r12.c, r1, r2, null, null, r12, 12) == r7) goto L25;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    y5b r7 = defpackage.y5b.a
                    int r0 = r12.a
                    r8 = 0
                    r9 = 1065353216(0x3f800000, float:1.0)
                    r10 = 4
                    r1 = 3
                    r2 = 1
                    r11 = 0
                    r3 = 2
                    if (r0 == 0) goto L2d
                    if (r0 == r2) goto L29
                    if (r0 == r3) goto L25
                    if (r0 == r1) goto L21
                    if (r0 != r10) goto L1b
                    defpackage.uj50.b(r13)
                    goto L8e
                L1b:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r0)
                    return r11
                L21:
                    defpackage.uj50.b(r13)
                    goto L72
                L25:
                    defpackage.uj50.b(r13)
                    goto L51
                L29:
                    defpackage.uj50.b(r13)
                    goto L40
                L2d:
                    defpackage.uj50.b(r13)
                    java.lang.Float r0 = new java.lang.Float
                    r0.<init>(r9)
                    r12.a = r2
                    wd0<java.lang.Float, ij0> r2 = r12.b
                    java.lang.Object r0 = r2.f(r12, r0)
                    if (r0 != r7) goto L40
                    goto L8d
                L40:
                    java.lang.Float r0 = new java.lang.Float
                    r2 = 0
                    r0.<init>(r2)
                    r12.a = r3
                    wd0<java.lang.Float, ij0> r2 = r12.c
                    java.lang.Object r0 = r2.f(r12, r0)
                    if (r0 != r7) goto L51
                    goto L8d
                L51:
                    java.lang.Float r0 = new java.lang.Float
                    r2 = 1067030938(0x3f99999a, float:1.2)
                    r0.<init>(r2)
                    r2 = 300(0x12c, float:4.2E-43)
                    f4c r4 = defpackage.vkf.e
                    gzg0 r2 = defpackage.yi0.e(r2, r8, r4, r3)
                    r12.a = r1
                    r1 = r0
                    wd0<java.lang.Float, ij0> r0 = r12.c
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r5 = r12
                    java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 != r7) goto L72
                    goto L8d
                L72:
                    java.lang.Float r1 = new java.lang.Float
                    r1.<init>(r9)
                    r0 = 150(0x96, float:2.1E-43)
                    r2 = 6
                    gzg0 r2 = defpackage.yi0.e(r0, r8, r11, r2)
                    r12.a = r10
                    wd0<java.lang.Float, ij0> r0 = r12.c
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r5 = r12
                    java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 != r7) goto L8e
                L8d:
                    return r7
                L8e:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sdw.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarKt$MultiLevelRoundBarUnlockOverlay$1$1$1$4", f = "MultiLevelRoundBar.kt", l = {657}, m = "invokeSuspend", v = 1)
        public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ytw<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ytw<Boolean> ytwVar, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                ytw<Boolean> ytwVar = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = tdw.c;
                    ytwVar.setValue(Boolean.TRUE);
                    this.a = 1;
                    if (hkd.b(700L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                int i3 = tdw.c;
                ytwVar.setValue(Boolean.FALSE);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, wd0<Float, ij0> wd0Var4, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
            this.d = wd0Var3;
            this.e = wd0Var4;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new C1091a(this.b, null), 3);
            ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            ej5.c(v5bVar, null, null, new c(this.d, this.e, null), 3);
            return ej5.c(v5bVar, null, null, new d(this.f, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdw(int i, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, wd0<Float, ij0> wd0Var4, wd0<Float, ij0> wd0Var5, wd0<Float, ij0> wd0Var6, boolean z, Function0<Unit> function0, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, v1b<? super sdw> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = wd0Var;
        this.d = wd0Var2;
        this.e = wd0Var3;
        this.f = wd0Var4;
        this.i = wd0Var5;
        this.v = wd0Var6;
        this.w = z;
        this.y = function0;
        this.z = ytwVar;
        this.A = ytwVar2;
        this.B = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sdw(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sdw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137 A[PHI: r11
      0x0137: PHI (r11v2 sdw) = (r11v1 sdw), (r11v3 sdw) binds: [B:51:0x0134, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0141, code lost:
    
        if (defpackage.hkd.b(300, r11) == r0) goto L55;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
