package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1", f = "LNRefreshProgressBar.kt", l = {84, 85, 86, 91, 104, 105, 106, 114, 127, 128, 129, 130}, m = "invokeSuspend", v = 2)
public final class j6r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ ytw<Boolean> f;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$1", f = "LNRefreshProgressBar.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;

        /* JADX INFO: renamed from: j6r$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$1$1", f = "LNRefreshProgressBar.kt", l = {93}, m = "invokeSuspend", v = 2)
        public static final class C0710a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0710a(wd0<Float, ij0> wd0Var, v1b<? super C0710a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0710a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0710a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(350, 0, xkf.a, 2);
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

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$1$2", f = "LNRefreshProgressBar.kt", l = {96}, m = "invokeSuspend", v = 2)
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
                    gzg0 gzg0VarE = yi0.e(350, 0, xkf.a, 2);
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

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$1$3", f = "LNRefreshProgressBar.kt", l = {99}, m = "invokeSuspend", v = 2)
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
                    Float f = new Float(1.0f);
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
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new C0710a(this.c, null), 3);
            ej5.c(v5bVar, null, null, new b(this.d, null), 3);
            wd0<Float, ij0> wd0Var = this.b;
            if (wd0Var.d().floatValue() < 1.0f) {
                ej5.c(v5bVar, null, null, new c(wd0Var, null), 3);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$2", f = "LNRefreshProgressBar.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$2$1", f = "LNRefreshProgressBar.kt", l = {107}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
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
                    Float f = new Float(1.0f);
                    hpp<Float> hppVar = k6r.b;
                    this.a = 1;
                    if (wd0.a(this.b, f, hppVar, null, null, this, 12) == y5bVar) {
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

        /* JADX INFO: renamed from: j6r$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$2$2", f = "LNRefreshProgressBar.kt", l = {108}, m = "invokeSuspend", v = 2)
        public static final class C0711b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0711b(wd0<Float, ij0> wd0Var, v1b<? super C0711b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0711b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0711b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(1.0f);
                    hpp<Float> hppVar = k6r.c;
                    this.a = 1;
                    if (wd0.a(this.b, f, hppVar, null, null, this, 12) == y5bVar) {
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
        public b(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new a(this.b, null), 3);
            return ej5.c(v5bVar, null, null, new C0711b(this.c, null), 3);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$3", f = "LNRefreshProgressBar.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$3$1", f = "LNRefreshProgressBar.kt", l = {116}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
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
                    Float f = new Float(1.0f);
                    gzg0 gzg0VarE = yi0.e(350, 0, xkf.a, 2);
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

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$3$2", f = "LNRefreshProgressBar.kt", l = {119}, m = "invokeSuspend", v = 2)
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
                    gzg0 gzg0VarE = yi0.e(350, 0, xkf.a, 2);
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

        /* JADX INFO: renamed from: j6r$c$c, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNRefreshProgressBarKt$LNRefreshProgressBar$1$1$3$3", f = "LNRefreshProgressBar.kt", l = {122}, m = "invokeSuspend", v = 2)
        public static final class C0712c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0712c(wd0<Float, ij0> wd0Var, v1b<? super C0712c> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0712c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0712c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(1.0f);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
            this.d = wd0Var3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, this.c, this.d, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new a(this.c, null), 3);
            ej5.c(v5bVar, null, null, new b(this.d, null), 3);
            wd0<Float, ij0> wd0Var = this.b;
            if (wd0Var.d().floatValue() < 1.0f) {
                ej5.c(v5bVar, null, null, new C0712c(wd0Var, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6r(boolean z, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, ytw<Boolean> ytwVar, v1b<? super j6r> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = wd0Var2;
        this.e = wd0Var3;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j6r(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j6r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:38:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
