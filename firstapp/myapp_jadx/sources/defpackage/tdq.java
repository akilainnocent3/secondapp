package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2", f = "LNGiftManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tdq extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ vdq b;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$1", f = "LNGiftManager.kt", l = {100}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vdq b;

        /* JADX INFO: renamed from: tdq$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$1$1", f = "LNGiftManager.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
        public static final class C1126a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ vdq c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1126a(vdq vdqVar, v1b<? super C1126a> v1bVar) {
                super(2, v1bVar);
                this.c = vdqVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1126a c1126a = new C1126a(this.c, v1bVar);
                c1126a.b = obj;
                return c1126a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                return ((C1126a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    if (str != null) {
                        wwd0 wwd0Var = this.c.d;
                        Boolean bool = Boolean.TRUE;
                        this.b = null;
                        this.a = 1;
                        wwd0Var.k(null, bool);
                        if (Unit.a == y5bVar) {
                            return y5bVar;
                        }
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
        public a(vdq vdqVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = vdqVar;
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
                vdq vdqVar = this.b;
                wwd0 wwd0Var = vdqVar.c;
                C1126a c1126a = new C1126a(vdqVar, null);
                this.a = 1;
                if (kzh.b(wwd0Var, c1126a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$2", f = "LNGiftManager.kt", l = {108}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vdq b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$2$2", f = "LNGiftManager.kt", l = {109}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ vdq b;

            /* JADX INFO: renamed from: tdq$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$2$2$1", f = "LNGiftManager.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C1127a extends tje0 implements gaj<myh<? super qcn<? extends ocq>>, Throwable, v1b<? super Unit>, Object> {
                @Override // defpackage.gaj
                public final Object invoke(myh<? super qcn<? extends ocq>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                    return new C1127a(3, v1bVar).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vdq vdqVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = vdqVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    yzh yzhVar = new yzh(this.b.a.c.e(), new C1127a(3, null));
                    this.a = 1;
                    if (kzh.a(yzhVar, this) == y5bVar) {
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

        /* JADX INFO: renamed from: tdq$b$b, reason: collision with other inner class name */
        public static final class C1128b implements lyh<String> {
            public final /* synthetic */ zed.e0 a;

            /* JADX INFO: renamed from: tdq$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$2$invokeSuspend$$inlined$filter$1", f = "LNGiftManager.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1128b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: tdq$b$b$b, reason: collision with other inner class name */
            public static final class C1129b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: tdq$b$b$b$a */
                @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$2$invokeSuspend$$inlined$filter$1$2", f = "LNGiftManager.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C1129b.this.emit(null, this);
                    }
                }

                public C1129b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        String str = (String) obj;
                        if (str != null && StringsKt.M(str, "\"type\":\"Gift\"", false)) {
                            aVar.b = 1;
                            if (this.a.emit(obj, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public C1128b(zed.e0 e0Var) {
                this.a = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C1129b c1129b = new C1129b(myhVar);
                    aVar.b = 1;
                    if (this.a.collect(c1129b, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vdq vdqVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = vdqVar;
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
                vdq vdqVar = this.b;
                xq00 xq00Var = vdqVar.b;
                xq00Var.getClass();
                C1128b c1128b = new C1128b((zed.e0) xq00Var.a.getStringByFlow("popup_queue"));
                a aVar = new a(vdqVar, null);
                this.a = 1;
                if (kzh.b(c1128b, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$init$2$3", f = "LNGiftManager.kt", l = {113, 114}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ vdq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vdq vdqVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = vdqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (kotlin.Unit.a == r0) goto L20;
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
                vdq r3 = r6.b
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 != r4) goto L13
                defpackage.uj50.b(r7)
                goto L45
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L2b
            L1d:
                defpackage.uj50.b(r7)
                vdq$b r7 = r3.f
                r6.a = r5
                java.lang.Object r7 = defpackage.s0i.c(r7, r6)
                if (r7 != r0) goto L2b
                goto L44
            L2b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                if (r7 == 0) goto L34
                boolean r7 = r7.booleanValue()
                goto L35
            L34:
                r7 = 0
            L35:
                if (r7 == 0) goto L45
                wwd0 r7 = r3.d
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r6.a = r4
                r7.k(r2, r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tdq.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdq(vdq vdqVar, v1b<? super tdq> v1bVar) {
        super(2, v1bVar);
        this.b = vdqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tdq tdqVar = new tdq(this.b, v1bVar);
        tdqVar.a = obj;
        return tdqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((tdq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        vdq vdqVar = this.b;
        ej5.c(v5bVar, null, null, new a(vdqVar, null), 3);
        ej5.c(v5bVar, null, null, new b(vdqVar, null), 3);
        return ej5.c(v5bVar, null, null, new c(vdqVar, null), 3);
    }
}
