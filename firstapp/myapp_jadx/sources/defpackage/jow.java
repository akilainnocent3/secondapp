package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1", f = "MultiplierComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jow extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ isw A;
    public final /* synthetic */ ytw<Boolean> B;
    public final /* synthetic */ isw C;
    public final /* synthetic */ ytw<Boolean> D;
    public final /* synthetic */ ytw<c9p> E;
    public final /* synthetic */ ytw<c9p> F;
    public final /* synthetic */ inj G;
    public /* synthetic */ Object a;
    public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> b;
    public final /* synthetic */ String c;
    public final /* synthetic */ v5b d;
    public final /* synthetic */ cwb e;
    public final /* synthetic */ wd0<Float, ij0> f;
    public final /* synthetic */ float i;
    public final /* synthetic */ float v;
    public final /* synthetic */ js1 w;
    public final /* synthetic */ wd0<Float, ij0> y;
    public final /* synthetic */ ytw<Boolean> z;

    @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$2", f = "MultiplierComponent.kt", l = {286}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ cwb b;
        public final /* synthetic */ isw c;
        public final /* synthetic */ isw d;
        public final /* synthetic */ ytw<Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cwb cwbVar, isw iswVar, isw iswVar2, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = cwbVar;
            this.c = iswVar;
            this.d = iswVar2;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
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
                if (hkd.b(800L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            float fJ = this.c.j();
            isw iswVar = this.d;
            iswVar.A(fJ);
            cwb cwbVar = this.b;
            ((x5a0) cwbVar.f).setValue(new Float(iswVar.j()));
            Boolean bool = Boolean.TRUE;
            ytw<Boolean> ytwVar = this.e;
            ytwVar.setValue(bool);
            ytw<Boolean> ytwVar2 = cwbVar.e;
            Boolean value = ytwVar.getValue();
            value.booleanValue();
            ((x5a0) ytwVar2).setValue(value);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$3", f = "MultiplierComponent.kt", l = {303, 334, 335, 343, 346, 347}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int A;
        public int B;
        public long C;
        public long D;
        public int E;
        public final /* synthetic */ wd0<Float, ij0> F;
        public final /* synthetic */ float G;
        public final /* synthetic */ float H;
        public final /* synthetic */ js1 I;
        public final /* synthetic */ wd0<Float, ij0> J;
        public final /* synthetic */ com.esotericsoftware.spine.android.b K;
        public final /* synthetic */ ytw<Boolean> L;
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float i;
        public float v;
        public float w;
        public float y;
        public float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, float f, float f2, js1 js1Var, wd0<Float, ij0> wd0Var2, com.esotericsoftware.spine.android.b bVar, ytw<Boolean> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.F = wd0Var;
            this.G = f;
            this.H = f2;
            this.I = js1Var;
            this.J = wd0Var2;
            this.K = bVar;
            this.L = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.F, this.G, this.H, this.I, this.J, this.K, this.L, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x019c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0200  */
        /* JADX WARN: Code duplicated, block: B:24:0x0203  */
        /* JADX WARN: Code duplicated, block: B:27:0x0259  */
        /* JADX WARN: Code duplicated, block: B:28:0x025c  */
        /* JADX WARN: Code duplicated, block: B:30:0x027b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0298  */
        /* JADX WARN: Code duplicated, block: B:36:0x02a9  */
        /* JADX WARN: Code duplicated, block: B:39:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x02e0 -> B:40:0x02ed). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instruction units count: 872
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jow.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$4", f = "MultiplierComponent.kt", l = {371, 372}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, float f2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = wd0Var2;
            this.e = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r4.d.f(r4, r5) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r4.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r5)
                goto L42
            L10:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r4)
                r4 = 0
                return r4
            L17:
                defpackage.uj50.b(r5)
                goto L30
            L1b:
                defpackage.uj50.b(r5)
                java.lang.Float r5 = new java.lang.Float
                float r1 = r4.c
                r5.<init>(r1)
                r4.a = r3
                wd0<java.lang.Float, ij0> r1 = r4.b
                java.lang.Object r5 = r1.f(r4, r5)
                if (r5 != r0) goto L30
                goto L41
            L30:
                java.lang.Float r5 = new java.lang.Float
                float r1 = r4.e
                r5.<init>(r1)
                r4.a = r2
                wd0<java.lang.Float, ij0> r1 = r4.d
                java.lang.Object r4 = r1.f(r4, r5)
                if (r4 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: jow.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6", f = "MultiplierComponent.kt", l = {401, 402, 425, 440}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ js1 A;
        public final /* synthetic */ float B;
        public final /* synthetic */ wd0<Float, ij0> C;
        public final /* synthetic */ wd0<Float, ij0> D;
        public final /* synthetic */ com.esotericsoftware.spine.android.b E;
        public final /* synthetic */ inj F;
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float i;
        public float v;
        public float w;
        public int y;
        public final /* synthetic */ float z;

        @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$2", f = "MultiplierComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ float c;
            public final /* synthetic */ wd0<Float, ij0> d;
            public final /* synthetic */ float e;

            /* JADX INFO: renamed from: jow$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$2$1", f = "MultiplierComponent.kt", l = {427}, m = "invokeSuspend", v = 1)
            public static final class C0732a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;
                public final /* synthetic */ float c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0732a(wd0<Float, ij0> wd0Var, float f, v1b<? super C0732a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                    this.c = f;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0732a(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0732a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(this.c);
                        gzg0 gzg0VarE = yi0.e(800, 0, xkf.d, 2);
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

            @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$2$2", f = "MultiplierComponent.kt", l = {433}, m = "invokeSuspend", v = 1)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;
                public final /* synthetic */ float c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(wd0<Float, ij0> wd0Var, float f, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                    this.c = f;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.b, this.c, v1bVar);
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
                        Float f = new Float(this.c);
                        gzg0 gzg0VarE = yi0.e(800, 0, vkf.c, 2);
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
            public a(wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, float f2, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = f;
                this.d = wd0Var2;
                this.e = f2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, this.c, this.d, this.e, v1bVar);
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
                ej5.c(v5bVar, null, null, new C0732a(this.b, this.c, null), 3);
                return ej5.c(v5bVar, null, null, new b(this.d, this.e, null), 3);
            }
        }

        @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$3", f = "MultiplierComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ float c;
            public final /* synthetic */ wd0<Float, ij0> d;
            public final /* synthetic */ float e;
            public final /* synthetic */ float f;
            public final /* synthetic */ js1 i;

            @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$3$1", f = "MultiplierComponent.kt", l = {442}, m = "invokeSuspend", v = 1)
            public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;
                public final /* synthetic */ float c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(wd0<Float, ij0> wd0Var, float f, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                    this.c = f;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new a(this.b, this.c, v1bVar);
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
                        Float f = new Float(this.c);
                        gzg0 gzg0VarE = yi0.e(800, 0, xkf.a, 2);
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

            /* JADX INFO: renamed from: jow$d$b$b, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$3$2", f = "MultiplierComponent.kt", l = {448}, m = "invokeSuspend", v = 1)
            public static final class C0733b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;
                public final /* synthetic */ float c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0733b(wd0<Float, ij0> wd0Var, float f, v1b<? super C0733b> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                    this.c = f;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0733b(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0733b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(this.c);
                        gzg0 gzg0VarE = yi0.e(800, 0, xkf.a, 2);
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

            @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$6$3$3", f = "MultiplierComponent.kt", l = {454, 455}, m = "invokeSuspend", v = 1)
            public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;
                public final /* synthetic */ float c;
                public final /* synthetic */ js1 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(wd0<Float, ij0> wd0Var, float f, js1 js1Var, v1b<? super c> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                    this.c = f;
                    this.d = js1Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new c(this.b, this.c, this.d, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                
                    if (defpackage.wd0.a(r11.b, r5, r6, null, null, r11, 12) == r0) goto L15;
                 */
                @Override // defpackage.pz1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                    /*
                        r11 = this;
                        y5b r0 = defpackage.y5b.a
                        int r1 = r11.a
                        r2 = 1
                        r3 = 2
                        if (r1 == 0) goto L1b
                        if (r1 == r2) goto L17
                        if (r1 != r3) goto L10
                        defpackage.uj50.b(r12)
                        goto L4b
                    L10:
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r11)
                        r11 = 0
                        return r11
                    L17:
                        defpackage.uj50.b(r12)
                        goto L29
                    L1b:
                        defpackage.uj50.b(r12)
                        r11.a = r2
                        r1 = 650(0x28a, double:3.21E-321)
                        java.lang.Object r12 = defpackage.hkd.b(r1, r11)
                        if (r12 != r0) goto L29
                        goto L4a
                    L29:
                        java.lang.Float r5 = new java.lang.Float
                        float r12 = r11.c
                        r5.<init>(r12)
                        js1 r12 = r11.d
                        int r12 = r12.G
                        r1 = 0
                        wkf r2 = defpackage.xkf.d
                        gzg0 r6 = defpackage.yi0.e(r12, r1, r2, r3)
                        r11.a = r3
                        wd0<java.lang.Float, ij0> r4 = r11.b
                        r7 = 0
                        r8 = 0
                        r10 = 12
                        r9 = r11
                        java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
                        if (r11 != r0) goto L4b
                    L4a:
                        return r0
                    L4b:
                        kotlin.Unit r11 = kotlin.Unit.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: jow.d.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wd0<Float, ij0> wd0Var, float f, wd0<Float, ij0> wd0Var2, float f2, float f3, js1 js1Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = f;
                this.d = wd0Var2;
                this.e = f2;
                this.f = f3;
                this.i = js1Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ej5.c(v5bVar, null, null, new a(this.b, this.c, null), 3);
                float f = this.e;
                wd0<Float, ij0> wd0Var = this.d;
                ej5.c(v5bVar, null, null, new C0733b(wd0Var, f, null), 3);
                ej5.c(v5bVar, null, null, new c(wd0Var, this.f, this.i, null), 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f, js1 js1Var, float f2, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, com.esotericsoftware.spine.android.b bVar, inj injVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.z = f;
            this.A = js1Var;
            this.B = f2;
            this.C = wd0Var;
            this.D = wd0Var2;
            this.E = bVar;
            this.F = injVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.z, this.A, this.B, this.C, this.D, this.E, this.F, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x009d  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00af  */
        /* JADX WARN: Code duplicated, block: B:36:0x0115  */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
        
            if (defpackage.w5b.d(r15, r24) == r1) goto L39;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jow.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.crazyrider.components.MultiplierComponentKt$CrazyRiderBackground$4$1$resetState$1$1", f = "MultiplierComponent.kt", l = {268, 269}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r5.c.f(r5, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 != r3) goto L11
                defpackage.uj50.b(r6)
                goto L3f
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L18:
                defpackage.uj50.b(r6)
                goto L2f
            L1c:
                defpackage.uj50.b(r6)
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r2)
                r5.a = r4
                wd0<java.lang.Float, ij0> r1 = r5.b
                java.lang.Object r6 = r1.f(r5, r6)
                if (r6 != r0) goto L2f
                goto L3e
            L2f:
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r2)
                r5.a = r3
                wd0<java.lang.Float, ij0> r1 = r5.c
                java.lang.Object r5 = r1.f(r5, r6)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: jow.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jow(ytw<com.esotericsoftware.spine.android.b> ytwVar, String str, v5b v5bVar, cwb cwbVar, wd0<Float, ij0> wd0Var, float f, float f2, js1 js1Var, wd0<Float, ij0> wd0Var2, ytw<Boolean> ytwVar2, isw iswVar, ytw<Boolean> ytwVar3, isw iswVar2, ytw<Boolean> ytwVar4, ytw<c9p> ytwVar5, ytw<c9p> ytwVar6, inj injVar, v1b<? super jow> v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
        this.c = str;
        this.d = v5bVar;
        this.e = cwbVar;
        this.f = wd0Var;
        this.i = f;
        this.v = f2;
        this.w = js1Var;
        this.y = wd0Var2;
        this.z = ytwVar2;
        this.A = iswVar;
        this.B = ytwVar3;
        this.C = iswVar2;
        this.D = ytwVar4;
        this.E = ytwVar5;
        this.F = ytwVar6;
        this.G = injVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jow jowVar = new jow(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
        jowVar.a = obj;
        return jowVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jow) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lh0 lh0Var;
        final v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        com.esotericsoftware.spine.android.b value = this.b.getValue();
        if (value == null) {
            return Unit.a;
        }
        final cwb cwbVar = this.e;
        final ytw<Boolean> ytwVar = this.z;
        final isw iswVar = this.A;
        final ytw<Boolean> ytwVar2 = this.B;
        final isw iswVar2 = this.C;
        final ytw<Boolean> ytwVar3 = this.D;
        final ytw<c9p> ytwVar4 = this.E;
        final ytw<c9p> ytwVar5 = this.F;
        final wd0<Float, ij0> wd0Var = this.y;
        final wd0<Float, ij0> wd0Var2 = this.f;
        Function0 function0 = new Function0() { // from class: iow
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Boolean bool = Boolean.FALSE;
                ytwVar.setValue(bool);
                iswVar.A(0.0f);
                cwb cwbVar2 = cwbVar;
                ((x5a0) cwbVar2.d).setValue(Float.valueOf(0.0f));
                ytwVar2.setValue(bool);
                ((x5a0) cwbVar2.e).setValue(bool);
                isw iswVar3 = iswVar2;
                iswVar3.A(0.0f);
                ((x5a0) cwbVar2.f).setValue(Float.valueOf(iswVar3.j()));
                ytwVar3.setValue(bool);
                c9p c9pVar = (c9p) ytwVar4.getValue();
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) null);
                }
                c9p c9pVar2 = (c9p) ytwVar5.getValue();
                if (c9pVar2 != null) {
                    c9pVar2.cancel((CancellationException) null);
                }
                return ej5.c(v5bVar, null, null, new jow.e(wd0Var, wd0Var2, null), 3);
            }
        };
        String str = this.c;
        int iHashCode = str.hashCode();
        inj injVar = this.G;
        String str2 = null;
        cwb cwbVar2 = this.e;
        isw iswVar3 = this.A;
        switch (iHashCode) {
            case -1111393803:
                if (str.equals("ROUND_PRE_START")) {
                    function0.invoke();
                    ytwVar.setValue(Boolean.TRUE);
                    ej5.c(v5bVar, null, null, new a(this.e, this.A, this.C, this.B, null), 3);
                    value.a().m(0, "2.ride", false);
                    ytw<c9p> ytwVar6 = this.E;
                    c9p value2 = ytwVar6.getValue();
                    if (value2 != null) {
                        value2.cancel((CancellationException) null);
                    }
                    ytwVar6.setValue(ej5.c(this.d, null, null, new b(this.y, this.i, this.v, this.w, this.f, value, this.D, null), 3));
                }
                break;
            case 2896988:
                if (str.equals("ROUND_WAITING")) {
                    function0.invoke();
                    value.a().m(0, "1. Start idel", false);
                }
                break;
            case 1599022634:
                if (str.equals("ROUND_END_WAIT")) {
                    ytwVar.setValue(Boolean.FALSE);
                    if (iswVar3.j() > -1000.0f) {
                        iswVar3.A(-20000.0f);
                        ((x5a0) cwbVar2.d).setValue(new Float(iswVar3.j()));
                    }
                    this.F.setValue(ej5.c(v5bVar, null, null, new d(this.v, this.w, this.i, this.f, this.y, value, injVar, null), 3));
                }
                break;
            case 1862985098:
                if (str.equals("ROUND_ONGOING")) {
                    if (iswVar3.j() > -100.0f) {
                        iswVar3.A(-10000.0f);
                        ((x5a0) cwbVar2.d).setValue(new Float(iswVar3.j()));
                    }
                    ytw<Boolean> ytwVar7 = this.D;
                    boolean zBooleanValue = ytwVar7.getValue().booleanValue();
                    wd0<Float, ij0> wd0Var3 = this.f;
                    if (zBooleanValue && wd0Var3.d().floatValue() == 0.0f) {
                        ytwVar7.setValue(Boolean.FALSE);
                    }
                    ytw<Boolean> ytwVar8 = this.B;
                    if (!ytwVar8.getValue().booleanValue()) {
                        ytwVar8.setValue(Boolean.TRUE);
                    }
                    ytw<Boolean> ytwVar9 = cwbVar2.e;
                    Boolean value3 = ytwVar8.getValue();
                    value3.getClass();
                    ((x5a0) ytwVar9).setValue(value3);
                    ytwVar.setValue(Boolean.TRUE);
                    if (!ytwVar7.getValue().booleanValue()) {
                        float f = this.i * 0.08f;
                        float f2 = (-this.v) * this.w.A;
                        if (this.y.d().floatValue() != f || wd0Var3.d().floatValue() != f2) {
                            ej5.c(v5bVar, null, null, new c(this.y, f, this.f, f2, null), 3);
                        }
                    }
                    String str3 = (injVar == inj.a || injVar == inj.b) ? "3. Fly" : "3. Fly with headlight";
                    zi0.e eVarJ = value.a().j();
                    if (eVarJ != null && (lh0Var = eVarJ.a) != null) {
                        str2 = lh0Var.a;
                    }
                    if (!Intrinsics.g(str2, str3)) {
                        value.a().m(0, str3, true);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
