package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketStateFlow$1", f = "PBCMapper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ykz extends tje0 implements Function2<ez20<? super zsq>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ lyh<ssq> b;
    public final /* synthetic */ lyh<dqh0> c;
    public final /* synthetic */ ssq d;
    public final /* synthetic */ lyh<qxp> e;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketStateFlow$1$1", f = "PBCMapper.kt", l = {144}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ v340 c;
        public final /* synthetic */ lyh<qxp> d;
        public final /* synthetic */ ssq e;
        public final /* synthetic */ ez20<zsq> f;

        /* JADX INFO: renamed from: ykz$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketStateFlow$1$1$1", f = "PBCMapper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1351a extends tje0 implements gaj<dqh0.e, qxp, v1b<? super zsq.b>, Object> {
            public /* synthetic */ dqh0.e a;
            public /* synthetic */ qxp b;
            public final /* synthetic */ ssq c;
            public final /* synthetic */ v5b d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1351a(ssq ssqVar, v5b v5bVar, v1b<? super C1351a> v1bVar) {
                super(3, v1bVar);
                this.c = ssqVar;
                this.d = v5bVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(dqh0.e eVar, qxp qxpVar, v1b<? super zsq.b> v1bVar) {
                C1351a c1351a = new C1351a(this.c, this.d, v1bVar);
                c1351a.a = eVar;
                c1351a.b = qxpVar;
                return c1351a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object bVar;
                dqh0.e eVar = this.a;
                qxp qxpVar = this.b;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ssq ssqVar = this.c;
                String str = ssqVar.a;
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
                    String str2 = null;
                    if (bVar instanceof zi50.b) {
                        bVar = null;
                    }
                    rkd0 rkd0Var = (rkd0) bVar;
                    BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
                    String strA = bigDecimal != null ? ukd0.a(2, bigDecimal, true, true) : "0.00";
                    n4q n4qVar = qxpVar.e.get(new ysq(str, yxqVar.b));
                    qcn<j58> qcnVar2 = n4qVar != null ? n4qVar.b : null;
                    String str3 = yxqVar.a;
                    String strConcat = strA.concat("x");
                    if (eVar != null) {
                        str2 = eVar.b;
                    }
                    arrayList.add(new xxq(qcnVar2, str3, strConcat, Intrinsics.g(str2, yxqVar.b), yxqVar.b));
                }
                return new zsq.b(ssqVar.b, str, ssqVar.c, a4h.f(arrayList));
            }
        }

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketStateFlow$1$1$2", f = "PBCMapper.kt", l = {145}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<zsq.b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ez20<zsq> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ez20<? super zsq> ez20Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.c = ez20Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(this.c, v1bVar);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zsq.b bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                zsq.b bVar = (zsq.b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.b = null;
                    this.a = 1;
                    if (this.c.j(this, bVar) == y5bVar) {
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
        public a(v340 v340Var, lyh lyhVar, ssq ssqVar, ez20 ez20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = v340Var;
            this.d = lyhVar;
            this.e = ssqVar;
            this.f = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
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
                n1i n1iVar = new n1i(this.c, this.d, new C1351a(this.e, v5bVar, null));
                b bVar = new b(this.f, null);
                this.b = null;
                this.a = 1;
                if (kzh.b(n1iVar, bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.pbc.PBCMapper$getMarketStateFlow$1$marketUserSelected$1", f = "PBCMapper.kt", l = {}, m = "invokeSuspend", v = 2)
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
    public ykz(lyh<ssq> lyhVar, lyh<? extends dqh0> lyhVar2, ssq ssqVar, lyh<qxp> lyhVar3, v1b<? super ykz> v1bVar) {
        super(2, v1bVar);
        this.b = lyhVar;
        this.c = lyhVar2;
        this.d = ssqVar;
        this.e = lyhVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ykz ykzVar = new ykz(this.b, this.c, this.d, this.e, v1bVar);
        ykzVar.a = obj;
        return ykzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super zsq> ez20Var, v1b<? super Unit> v1bVar) {
        return ((ykz) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ssq ssqVar = this.d;
        ej5.c(ez20Var, null, null, new a(e1i.e(new n1i(this.b, this.c, new b(ssqVar, null)), ez20Var, q490.a.a, new dqh0.e(0)), this.e, ssqVar, ez20Var, null), 3);
        return Unit.a;
    }
}
