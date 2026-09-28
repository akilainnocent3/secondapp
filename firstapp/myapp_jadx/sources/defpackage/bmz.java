package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1", f = "PSOMapper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bmz extends tje0 implements Function2<ez20<? super zsq>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ lyh<ssq> b;
    public final /* synthetic */ lyh<dqh0> c;
    public final /* synthetic */ ssq d;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1$1", f = "PSOMapper.kt", l = {136}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ v340 c;
        public final /* synthetic */ ssq d;
        public final /* synthetic */ ez20<zsq> e;

        /* JADX INFO: renamed from: bmz$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1$1$2", f = "PSOMapper.kt", l = {137}, m = "invokeSuspend", v = 2)
        public static final class C0131a extends tje0 implements Function2<zsq.c, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ez20<zsq> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0131a(ez20<? super zsq> ez20Var, v1b<? super C0131a> v1bVar) {
                super(2, v1bVar);
                this.c = ez20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0131a c0131a = new C0131a(this.c, v1bVar);
                c0131a.b = obj;
                return c0131a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zsq.c cVar, v1b<? super Unit> v1bVar) {
                return ((C0131a) create(cVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                zsq.c cVar = (zsq.c) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.b = null;
                    this.a = 1;
                    if (this.c.j(this, cVar) == y5bVar) {
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

        public static final class b implements lyh<zsq.c> {
            public final /* synthetic */ v340 a;
            public final /* synthetic */ ssq b;
            public final /* synthetic */ v5b c;

            /* JADX INFO: renamed from: bmz$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1$1$invokeSuspend$$inlined$map$1", f = "PSOMapper.kt", l = {109}, m = "collect", v = 2)
            public static final class C0132a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0132a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: bmz$a$b$b, reason: collision with other inner class name */
            public static final class C0133b<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ ssq b;
                public final /* synthetic */ v5b c;

                /* JADX INFO: renamed from: bmz$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1$1$invokeSuspend$$inlined$map$1$2", f = "PSOMapper.kt", l = {50}, m = "emit", v = 2)
                public static final class C0134a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0134a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0133b.this.emit(null, this);
                    }
                }

                public C0133b(myh myhVar, ssq ssqVar, v5b v5bVar) {
                    this.a = myhVar;
                    this.b = ssqVar;
                    this.c = v5bVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0134a c0134a;
                    Object bVar;
                    if (v1bVar instanceof C0134a) {
                        c0134a = (C0134a) v1bVar;
                        int i = c0134a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0134a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0134a = new C0134a(v1bVar);
                        }
                    } else {
                        c0134a = new C0134a(v1bVar);
                    }
                    Object obj2 = c0134a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0134a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        dqh0.e eVar = (dqh0.e) obj;
                        ssq ssqVar = this.b;
                        qcn<yxq> qcnVar = ssqVar.g;
                        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                        for (yxq yxqVar : qcnVar) {
                            try {
                                zi50.a aVar = zi50.b;
                                bVar = new rkd0(new BigDecimal(yxqVar.c));
                            } catch (Throwable th) {
                                zi50.a aVar2 = zi50.b;
                                bVar = new zi50.b(th);
                            }
                            if (bVar instanceof zi50.b) {
                                bVar = null;
                            }
                            rkd0 rkd0Var = (rkd0) bVar;
                            BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
                            arrayList.add(new xxq(null, yxqVar.a, (bigDecimal != null ? ukd0.a(2, bigDecimal, true, true) : "0.00").concat("x"), Intrinsics.g(eVar != null ? eVar.b : null, yxqVar.b), yxqVar.b));
                        }
                        zsq.c cVar = new zsq.c(ssqVar.b, ssqVar.a, ssqVar.c, a4h.f(arrayList));
                        c0134a.b = 1;
                        if (this.a.emit(cVar, c0134a) == y5bVar) {
                            return y5bVar;
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

            public b(v340 v340Var, ssq ssqVar, v5b v5bVar) {
                this.a = v340Var;
                this.b = ssqVar;
                this.c = v5bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.lyh
            public final Object collect(myh<? super zsq.c> myhVar, v1b v1bVar) {
                C0132a c0132a;
                if (v1bVar instanceof C0132a) {
                    c0132a = (C0132a) v1bVar;
                    int i = c0132a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0132a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0132a = new C0132a(v1bVar);
                    }
                } else {
                    c0132a = new C0132a(v1bVar);
                }
                Object obj = c0132a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0132a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0133b c0133b = new C0133b(myhVar, this.b, this.c);
                    c0132a.b = 1;
                    if (this.a.a.collect(c0133b, c0132a) == y5bVar) {
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
        public a(v340 v340Var, ssq ssqVar, ez20 ez20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = v340Var;
            this.d = ssqVar;
            this.e = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b bVar = new b(this.c, this.d, v5bVar);
                C0131a c0131a = new C0131a(this.e, null);
                this.b = null;
                this.a = 1;
                if (kzh.b(bVar, c0131a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pso.PSOMapper$getMarketStateFlow$1$marketUserSelected$1", f = "PSOMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<ssq, dqh0, v1b<? super dqh0.e>, Object> {
        public /* synthetic */ ssq a;
        public /* synthetic */ dqh0 b;
        public final /* synthetic */ ssq c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ssq ssqVar, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.c = ssqVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(ssq ssqVar, dqh0 dqh0Var, v1b<? super dqh0.e> v1bVar) {
            b bVar = new b(this.c, v1bVar);
            bVar.a = ssqVar;
            bVar.b = dqh0Var;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ssq ssqVar = this.a;
            dqh0 dqh0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!this.c.equals(ssqVar)) {
                return null;
            }
            if (!(dqh0Var instanceof dqh0.e)) {
                dqh0Var = null;
            }
            dqh0.e eVar = (dqh0.e) dqh0Var;
            return eVar == null ? new dqh0.e(0) : eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bmz(lyh<ssq> lyhVar, lyh<? extends dqh0> lyhVar2, ssq ssqVar, v1b<? super bmz> v1bVar) {
        super(2, v1bVar);
        this.b = lyhVar;
        this.c = lyhVar2;
        this.d = ssqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bmz bmzVar = new bmz(this.b, this.c, this.d, v1bVar);
        bmzVar.a = obj;
        return bmzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super zsq> ez20Var, v1b<? super Unit> v1bVar) {
        return ((bmz) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ssq ssqVar = this.d;
        ej5.c(ez20Var, null, null, new a(e1i.e(new n1i(this.b, this.c, new b(ssqVar, null)), ez20Var, q490.a.a, new dqh0.e(0)), ssqVar, ez20Var, null), 3);
        return Unit.a;
    }
}
