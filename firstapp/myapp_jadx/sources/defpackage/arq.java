package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class arq {
    public final drq a;
    public final mgb0 b;
    public final AtomicBoolean c;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNLoginBinder$bind$1", f = "LNLoginBinder.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ arq b;
        public final /* synthetic */ fq0 c;

        /* JADX INFO: renamed from: arq$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNLoginBinder$bind$1$2", f = "LNLoginBinder.kt", l = {65, 46}, m = "invokeSuspend", v = 2)
        public static final class C0092a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ fq0 b;
            public final /* synthetic */ arq c;

            /* JADX INFO: renamed from: arq$a$a$a, reason: collision with other inner class name */
            public static final class C0093a implements Function0<Unit> {
                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0092a(fq0 fq0Var, v1b v1bVar, arq arqVar) {
                super(2, v1bVar);
                this.b = fq0Var;
                this.c = arqVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0092a(this.b, v1bVar, this.c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0092a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x005b  */
            /* JADX WARN: Code duplicated, block: B:24:0x0075  */
            /* JADX WARN: Code duplicated, block: B:25:0x0080  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
            
                if (r13.ensureLogin(r4, r12) == r2) goto L31;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    arq r0 = r12.c
                    drq r1 = r0.a
                    y5b r2 = defpackage.y5b.a
                    int r3 = r12.a
                    fq0 r4 = r12.b
                    r5 = 2
                    r6 = 1
                    r7 = 0
                    if (r3 == 0) goto L25
                    if (r3 == r6) goto L21
                    if (r3 != r5) goto L1b
                    defpackage.uj50.b(r13)     // Catch: java.lang.Throwable -> L18
                    goto L9d
                L18:
                    r12 = move-exception
                    goto La7
                L1b:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r12)
                    return r7
                L21:
                    defpackage.uj50.b(r13)
                    goto L92
                L25:
                    defpackage.uj50.b(r13)
                    s9s r13 = r4.getLifecycle()
                    s9s$b r3 = s9s.b.d
                    pfd r8 = defpackage.fse.a
                    wcl r8 = defpackage.gku.a
                    vcl r8 = r8.h0()
                    kotlin.coroutines.CoroutineContext r9 = r12.getContext()
                    boolean r9 = r8.f0(r9)
                    if (r9 != 0) goto L5b
                    s9s$b r10 = r13.b()
                    s9s$b r11 = s9s.b.a
                    if (r10 == r11) goto L55
                    s9s$b r10 = r13.b()
                    int r3 = r10.compareTo(r3)
                    if (r3 < 0) goto L5b
                    kotlin.Unit r13 = kotlin.Unit.a
                    goto L92
                L55:
                    oas r12 = new oas
                    r12.<init>(r7)
                    throw r12
                L5b:
                    arq$a$a$a r3 = new arq$a$a$a
                    r3.<init>()
                    r12.a = r6
                    bc6 r10 = new bc6
                    v1b r11 = defpackage.yzo.b(r12)
                    r10.<init>(r6, r11)
                    r10.q()
                    xgj0 r6 = new xgj0
                    r6.<init>(r13, r10, r3)
                    if (r9 == 0) goto L80
                    kotlin.coroutines.e r3 = kotlin.coroutines.e.a
                    ugj0 r9 = new ugj0
                    r9.<init>(r13, r6)
                    r8.d0(r3, r9)
                    goto L83
                L80:
                    r13.a(r6)
                L83:
                    wgj0 r3 = new wgj0
                    r3.<init>(r8, r13, r6)
                    r10.t(r3)
                    java.lang.Object r13 = r10.o()
                    if (r13 != r2) goto L92
                    goto L9c
                L92:
                    mgb0 r13 = r0.b     // Catch: java.lang.Throwable -> L18
                    r12.a = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r12 = r13.ensureLogin(r4, r12)     // Catch: java.lang.Throwable -> L18
                    if (r12 != r2) goto L9d
                L9c:
                    return r2
                L9d:
                    wwd0 r12 = r1.c
                    java.lang.Boolean r13 = java.lang.Boolean.FALSE
                    r12.k(r7, r13)
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                La7:
                    wwd0 r13 = r1.c
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r13.k(r7, r0)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: arq.a.C0092a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class b implements lyh<Boolean> {
            public final /* synthetic */ v340 a;

            /* JADX INFO: renamed from: arq$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNLoginBinder$bind$1$invokeSuspend$$inlined$filter$1", f = "LNLoginBinder.kt", l = {109}, m = "collect", v = 2)
            public static final class C0094a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0094a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: arq$a$b$b, reason: collision with other inner class name */
            public static final class C0095b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: arq$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNLoginBinder$bind$1$invokeSuspend$$inlined$filter$1$2", f = "LNLoginBinder.kt", l = {50}, m = "emit", v = 2)
                public static final class C0096a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0096a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0095b.this.emit(null, this);
                    }
                }

                public C0095b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0096a c0096a;
                    if (v1bVar instanceof C0096a) {
                        c0096a = (C0096a) v1bVar;
                        int i = c0096a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0096a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0096a = new C0096a(v1bVar);
                        }
                    } else {
                        c0096a = new C0096a(v1bVar);
                    }
                    Object obj2 = c0096a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0096a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (((Boolean) obj).booleanValue()) {
                            c0096a.b = 1;
                            if (this.a.emit(obj, c0096a) == y5bVar) {
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

            public b(v340 v340Var) {
                this.a = v340Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
                C0094a c0094a;
                if (v1bVar instanceof C0094a) {
                    c0094a = (C0094a) v1bVar;
                    int i = c0094a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0094a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0094a = new C0094a(v1bVar);
                    }
                } else {
                    c0094a = new C0094a(v1bVar);
                }
                Object obj = c0094a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0094a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0095b c0095b = new C0095b(myhVar);
                    c0094a.b = 1;
                    if (this.a.a.collect(c0095b, c0094a) == y5bVar) {
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
        public a(fq0 fq0Var, v1b v1bVar, arq arqVar) {
            super(2, v1bVar);
            this.b = arqVar;
            this.c = fq0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
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
                arq arqVar = this.b;
                b bVar = new b(arqVar.a.d);
                C0092a c0092a = new C0092a(this.c, null, arqVar);
                this.a = 1;
                if (kzh.b(bVar, c0092a, this) == y5bVar) {
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

    public arq(drq drqVar, mgb0 mgb0Var) {
        drqVar.getClass();
        mgb0Var.getClass();
        this.a = drqVar;
        this.b = mgb0Var;
        this.c = new AtomicBoolean(false);
    }

    public final void a(fq0 fq0Var) {
        if (this.c.compareAndSet(false, true)) {
            ej5.c(ebs.a(fq0Var.getLifecycle()), null, null, new a(fq0Var, null, this), 3);
        }
    }
}
