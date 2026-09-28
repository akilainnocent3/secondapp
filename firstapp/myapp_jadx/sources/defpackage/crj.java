package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$rememberPigBonusReact$1$1", f = "GameplaySpine.kt", l = {219, 220, 221}, m = "invokeSuspend", v = 1)
public final class crj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ wd0<Float, ij0> d;

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$rememberPigBonusReact$1$1$1", f = "GameplaySpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX INFO: renamed from: crj$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$rememberPigBonusReact$1$1$1$1", f = "GameplaySpine.kt", l = {223, 230, 231}, m = "invokeSuspend", v = 1)
        public static final class C0458a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0458a(wd0<Float, ij0> wd0Var, v1b<? super C0458a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0458a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0458a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
            
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
                    r2 = 0
                    r3 = 250(0xfa, float:3.5E-43)
                    r4 = 3
                    r5 = 1
                    r6 = 2
                    if (r1 == 0) goto L27
                    if (r1 == r5) goto L22
                    if (r1 == r6) goto L1d
                    if (r1 != r4) goto L16
                    defpackage.uj50.b(r15)
                    goto L6f
                L16:
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r14)
                    r14 = 0
                    return r14
                L1d:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L53
                L22:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L48
                L27:
                    defpackage.uj50.b(r15)
                    java.lang.Float r8 = new java.lang.Float
                    r15 = 1065772646(0x3f866666, float:1.05)
                    r8.<init>(r15)
                    f4c r15 = defpackage.brj.a
                    gzg0 r9 = defpackage.yi0.e(r3, r2, r15, r6)
                    r14.a = r5
                    wd0<java.lang.Float, ij0> r7 = r14.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    r12 = r14
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L48
                    goto L6e
                L48:
                    r12.a = r6
                    r14 = 250(0xfa, double:1.235E-321)
                    java.lang.Object r14 = defpackage.hkd.b(r14, r12)
                    if (r14 != r0) goto L53
                    goto L6e
                L53:
                    java.lang.Float r8 = new java.lang.Float
                    r14 = 1065353216(0x3f800000, float:1.0)
                    r8.<init>(r14)
                    f4c r14 = defpackage.brj.a
                    gzg0 r9 = defpackage.yi0.e(r3, r2, r14, r6)
                    r12.a = r4
                    wd0<java.lang.Float, ij0> r7 = r12.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L6f
                L6e:
                    return r0
                L6f:
                    kotlin.Unit r14 = kotlin.Unit.a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: crj.a.C0458a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplaySpineKt$rememberPigBonusReact$1$1$1$2", f = "GameplaySpine.kt", l = {240, 247, 248}, m = "invokeSuspend", v = 1)
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

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
            
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
                    r2 = 0
                    r3 = 250(0xfa, float:3.5E-43)
                    r4 = 3
                    r5 = 1
                    r6 = 2
                    if (r1 == 0) goto L27
                    if (r1 == r5) goto L22
                    if (r1 == r6) goto L1d
                    if (r1 != r4) goto L16
                    defpackage.uj50.b(r15)
                    goto L6e
                L16:
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r14)
                    r14 = 0
                    return r14
                L1d:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L52
                L22:
                    defpackage.uj50.b(r15)
                    r12 = r14
                    goto L47
                L27:
                    defpackage.uj50.b(r15)
                    java.lang.Float r8 = new java.lang.Float
                    r15 = 1073741824(0x40000000, float:2.0)
                    r8.<init>(r15)
                    f4c r15 = defpackage.brj.a
                    gzg0 r9 = defpackage.yi0.e(r3, r2, r15, r6)
                    r14.a = r5
                    wd0<java.lang.Float, ij0> r7 = r14.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    r12 = r14
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L47
                    goto L6d
                L47:
                    r12.a = r6
                    r14 = 250(0xfa, double:1.235E-321)
                    java.lang.Object r14 = defpackage.hkd.b(r14, r12)
                    if (r14 != r0) goto L52
                    goto L6d
                L52:
                    java.lang.Float r8 = new java.lang.Float
                    r14 = 1065353216(0x3f800000, float:1.0)
                    r8.<init>(r14)
                    f4c r14 = defpackage.brj.a
                    gzg0 r9 = defpackage.yi0.e(r3, r2, r14, r6)
                    r12.a = r4
                    wd0<java.lang.Float, ij0> r7 = r12.b
                    r10 = 0
                    r11 = 0
                    r13 = 12
                    java.lang.Object r14 = defpackage.wd0.a(r7, r8, r9, r10, r11, r12, r13)
                    if (r14 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r14 = kotlin.Unit.a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: crj.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
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
            ej5.c(v5bVar, null, null, new C0458a(this.b, null), 3);
            ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crj(Long l, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super crj> v1bVar) {
        super(2, v1bVar);
        this.b = l;
        this.c = wd0Var;
        this.d = wd0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new crj(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((crj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (defpackage.w5b.d(r10, r9) == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 0
            wd0<java.lang.Float, ij0> r3 = r9.d
            r4 = 1065353216(0x3f800000, float:1.0)
            wd0<java.lang.Float, ij0> r5 = r9.c
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L28
            if (r1 == r8) goto L24
            if (r1 == r7) goto L20
            if (r1 != r6) goto L1a
            defpackage.uj50.b(r10)
            goto L5c
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L20:
            defpackage.uj50.b(r10)
            goto L4e
        L24:
            defpackage.uj50.b(r10)
            goto L40
        L28:
            defpackage.uj50.b(r10)
            java.lang.Long r10 = r9.b
            if (r10 != 0) goto L32
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L32:
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r4)
            r9.a = r8
            java.lang.Object r10 = r5.f(r9, r10)
            if (r10 != r0) goto L40
            goto L5b
        L40:
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r4)
            r9.a = r7
            java.lang.Object r10 = r3.f(r9, r10)
            if (r10 != r0) goto L4e
            goto L5b
        L4e:
            crj$a r10 = new crj$a
            r10.<init>(r5, r3, r2)
            r9.a = r6
            java.lang.Object r9 = defpackage.w5b.d(r10, r9)
            if (r9 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
