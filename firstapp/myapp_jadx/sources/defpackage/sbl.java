package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$rememberHammerCelebration$1$1", f = "HammerBox.kt", l = {291, 292, 293}, m = "invokeSuspend", v = 1)
public final class sbl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ wd0<Float, ij0> d;

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$rememberHammerCelebration$1$1$1", f = "HammerBox.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX INFO: renamed from: sbl$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$rememberHammerCelebration$1$1$1$1", f = "HammerBox.kt", l = {295, 302}, m = "invokeSuspend", v = 1)
        public static final class C1090a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1090a(wd0<Float, ij0> wd0Var, v1b<? super C1090a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1090a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1090a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (defpackage.wd0.a(r11.b, r7, r8, null, null, r11, 12) == r0) goto L15;
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
                    int r1 = r13.a
                    r2 = 0
                    r3 = 200(0xc8, float:2.8E-43)
                    r4 = 1
                    r5 = 2
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1a
                    if (r1 != r5) goto L13
                    defpackage.uj50.b(r14)
                    goto L5c
                L13:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r13)
                    r13 = 0
                    return r13
                L1a:
                    defpackage.uj50.b(r14)
                    r11 = r13
                    goto L40
                L1f:
                    defpackage.uj50.b(r14)
                    java.lang.Float r7 = new java.lang.Float
                    r14 = 1067030938(0x3f99999a, float:1.2)
                    r7.<init>(r14)
                    f4c r14 = defpackage.tbl.a
                    gzg0 r8 = defpackage.yi0.e(r3, r2, r14, r5)
                    r13.a = r4
                    wd0<java.lang.Float, ij0> r6 = r13.b
                    r9 = 0
                    r10 = 0
                    r12 = 12
                    r11 = r13
                    java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
                    if (r13 != r0) goto L40
                    goto L5b
                L40:
                    java.lang.Float r7 = new java.lang.Float
                    r13 = 1065353216(0x3f800000, float:1.0)
                    r7.<init>(r13)
                    f4c r13 = defpackage.tbl.a
                    gzg0 r8 = defpackage.yi0.e(r3, r2, r13, r5)
                    r11.a = r5
                    wd0<java.lang.Float, ij0> r6 = r11.b
                    r9 = 0
                    r10 = 0
                    r12 = 12
                    java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
                    if (r13 != r0) goto L5c
                L5b:
                    return r0
                L5c:
                    kotlin.Unit r13 = kotlin.Unit.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: sbl.a.C1090a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$rememberHammerCelebration$1$1$1$2", f = "HammerBox.kt", l = {311, 315}, m = "invokeSuspend", v = 1)
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

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
            
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
                    r10 = 200(0xc8, float:2.8E-43)
                    r11 = 2
                    r1 = 1
                    r12 = 0
                    if (r0 == 0) goto L1f
                    if (r0 == r1) goto L1b
                    if (r0 != r11) goto L15
                    defpackage.uj50.b(r14)
                    goto L58
                L15:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r0)
                    return r12
                L1b:
                    defpackage.uj50.b(r14)
                    goto L3e
                L1f:
                    defpackage.uj50.b(r14)
                    java.lang.Float r0 = new java.lang.Float
                    r2 = 1065353216(0x3f800000, float:1.0)
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
                    if (r0 != r7) goto L3e
                    goto L57
                L3e:
                    java.lang.Float r1 = new java.lang.Float
                    r0 = 0
                    r1.<init>(r0)
                    gzg0 r2 = defpackage.yi0.e(r10, r9, r12, r8)
                    r13.a = r11
                    wd0<java.lang.Float, ij0> r0 = r13.b
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r5 = r13
                    java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 != r7) goto L58
                L57:
                    return r7
                L58:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sbl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
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
            ej5.c(v5bVar, null, null, new C1090a(this.b, null), 3);
            ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbl(Long l, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super sbl> v1bVar) {
        super(2, v1bVar);
        this.b = l;
        this.c = wd0Var;
        this.d = wd0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sbl(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sbl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (defpackage.w5b.d(r9, r8) == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            wd0<java.lang.Float, ij0> r3 = r8.d
            wd0<java.lang.Float, ij0> r4 = r8.c
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L22
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L18
            defpackage.uj50.b(r9)
            goto L5d
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1e:
            defpackage.uj50.b(r9)
            goto L4f
        L22:
            defpackage.uj50.b(r9)
            goto L40
        L26:
            defpackage.uj50.b(r9)
            java.lang.Long r9 = r8.b
            if (r9 != 0) goto L30
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L30:
            java.lang.Float r9 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r1)
            r8.a = r7
            java.lang.Object r9 = r4.f(r8, r9)
            if (r9 != r0) goto L40
            goto L5c
        L40:
            java.lang.Float r9 = new java.lang.Float
            r1 = 0
            r9.<init>(r1)
            r8.a = r6
            java.lang.Object r9 = r3.f(r8, r9)
            if (r9 != r0) goto L4f
            goto L5c
        L4f:
            sbl$a r9 = new sbl$a
            r9.<init>(r4, r3, r2)
            r8.a = r5
            java.lang.Object r8 = defpackage.w5b.d(r9, r8)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
