package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.UserCertConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.components.ChopperAnimationKt$ChopperAnimation$1$1$1", f = "ChopperAnimation.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46, 48, 80}, m = "invokeSuspend", v = 1)
public final class jn7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ ytw<Boolean> e;

    @c0d(c = "com.sportygames.multilevel.sportycar.components.ChopperAnimationKt$ChopperAnimation$1$1$1$1", f = "ChopperAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;

        /* JADX INFO: renamed from: jn7$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.multilevel.sportycar.components.ChopperAnimationKt$ChopperAnimation$1$1$1$1$1", f = "ChopperAnimation.kt", l = {50}, m = "invokeSuspend", v = 1)
        public static final class C0728a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0728a(wd0<Float, ij0> wd0Var, v1b<? super C0728a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0728a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0728a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(1.0f);
                    gzg0 gzg0VarE = yi0.e(UserCertConstants.REQUEST_CODE_CONFIRM_NAME, 0, xkf.d, 2);
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

        @c0d(c = "com.sportygames.multilevel.sportycar.components.ChopperAnimationKt$ChopperAnimation$1$1$1$1$2", f = "ChopperAnimation.kt", l = {60}, m = "invokeSuspend", v = 1)
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
                    Float f = new Float(0.1f);
                    gzg0 gzg0VarE = yi0.e(UserCertConstants.REQUEST_CODE_CONFIRM_NAME, 0, xkf.d, 2);
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

        @c0d(c = "com.sportygames.multilevel.sportycar.components.ChopperAnimationKt$ChopperAnimation$1$1$1$1$3", f = "ChopperAnimation.kt", l = {70}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wd0<Float, ij0> wd0Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(UserCertConstants.REQUEST_CODE_CONFIRM_NAME, 1200, null, 4);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
            this.d = wd0Var3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, v1bVar);
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
            ej5.c(v5bVar, null, null, new C0728a(this.b, null), 3);
            ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            return ej5.c(v5bVar, null, null, new c(this.d, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn7(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, ytw<Boolean> ytwVar, v1b<? super jn7> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = wd0Var2;
        this.d = wd0Var3;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jn7(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((jn7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (defpackage.hkd.b(3000, r13) == r0) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007f -> B:32:0x0082). Please report as a decompilation issue!!! */
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
            wd0<java.lang.Float, ij0> r3 = r13.d
            wd0<java.lang.Float, ij0> r4 = r13.c
            wd0<java.lang.Float, ij0> r5 = r13.b
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 == r10) goto L32
            if (r1 == r9) goto L2e
            if (r1 == r8) goto L2a
            if (r1 == r7) goto L26
            if (r1 != r6) goto L20
            defpackage.uj50.b(r14)
            goto L82
        L20:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r2
        L26:
            defpackage.uj50.b(r14)
            goto L77
        L2a:
            defpackage.uj50.b(r14)
            goto L69
        L2e:
            defpackage.uj50.b(r14)
            goto L59
        L32:
            defpackage.uj50.b(r14)
            goto L48
        L36:
            defpackage.uj50.b(r14)
        L39:
            java.lang.Float r14 = new java.lang.Float
            r1 = 0
            r14.<init>(r1)
            r13.a = r10
            java.lang.Object r14 = r5.f(r13, r14)
            if (r14 != r0) goto L48
            goto L81
        L48:
            java.lang.Float r14 = new java.lang.Float
            r1 = 1068708659(0x3fb33333, float:1.4)
            r14.<init>(r1)
            r13.a = r9
            java.lang.Object r14 = r4.f(r13, r14)
            if (r14 != r0) goto L59
            goto L81
        L59:
            java.lang.Float r14 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r1)
            r13.a = r8
            java.lang.Object r14 = r3.f(r13, r14)
            if (r14 != r0) goto L69
            goto L81
        L69:
            jn7$a r14 = new jn7$a
            r14.<init>(r5, r4, r3, r2)
            r13.a = r7
            java.lang.Object r14 = defpackage.w5b.d(r14, r13)
            if (r14 != r0) goto L77
            goto L81
        L77:
            r13.a = r6
            r11 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r14 = defpackage.hkd.b(r11, r13)
            if (r14 != r0) goto L82
        L81:
            return r0
        L82:
            ytw<java.lang.Boolean> r14 = r13.e
            java.lang.Object r1 = r14.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r14.setValue(r1)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
