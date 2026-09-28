package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1", f = "SNMBAMapper.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class xo60 extends tje0 implements Function2<ez20<? super xsq.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ssq c;
    public final /* synthetic */ wo60 d;
    public final /* synthetic */ lyh<zxq.h> e;
    public final /* synthetic */ qxp f;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1$1", f = "SNMBAMapper.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<zxq.h> b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ wwd0 d;
        public final /* synthetic */ ssq e;
        public final /* synthetic */ qxp f;
        public final /* synthetic */ wo60 i;

        /* JADX INFO: renamed from: xo60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1$1$1", f = "SNMBAMapper.kt", l = {106, 107}, m = "invokeSuspend", v = 2)
        public static final class C1302a extends tje0 implements Function2<zxq.h, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ wwd0 c;
            public final /* synthetic */ wwd0 d;
            public final /* synthetic */ ssq e;
            public final /* synthetic */ qxp f;
            public final /* synthetic */ wo60 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1302a(wwd0 wwd0Var, wwd0 wwd0Var2, ssq ssqVar, qxp qxpVar, wo60 wo60Var, v1b v1bVar) {
                super(2, v1bVar);
                this.c = wwd0Var;
                this.d = wwd0Var2;
                this.e = ssqVar;
                this.f = qxpVar;
                this.i = wo60Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1302a c1302a = new C1302a(this.c, this.d, this.e, this.f, this.i, v1bVar);
                c1302a.b = obj;
                return c1302a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zxq.h hVar, v1b<? super Unit> v1bVar) {
                return ((C1302a) create(hVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
            
                if (kotlin.Unit.a == r2) goto L17;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xo60.a.C1302a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, wwd0 wwd0Var, wwd0 wwd0Var2, ssq ssqVar, qxp qxpVar, wo60 wo60Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = wwd0Var;
            this.d = wwd0Var2;
            this.e = ssqVar;
            this.f = qxpVar;
            this.i = wo60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
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
                C1302a c1302a = new C1302a(this.c, this.d, this.e, this.f, this.i, null);
                this.a = 1;
                if (kzh.b(this.b, c1302a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1$displayBetPanel$1", f = "SNMBAMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<qcn<? extends Integer>, qcn<? extends Integer>, v1b<? super Boolean>, Object> {
        public /* synthetic */ qcn a;
        public /* synthetic */ qcn b;

        @Override // defpackage.gaj
        public final Object invoke(qcn<? extends Integer> qcnVar, qcn<? extends Integer> qcnVar2, v1b<? super Boolean> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = qcnVar;
            bVar.b = qcnVar2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qcn qcnVar = this.a;
            qcn qcnVar2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf((qcnVar.isEmpty() && qcnVar2.isEmpty()) ? false : true);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1$marketAllowBet$1", f = "SNMBAMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<qcn<? extends Integer>, qcn<? extends Integer>, dqh0.b, v1b<? super Boolean>, Object> {
        public /* synthetic */ qcn a;
        public /* synthetic */ qcn b;
        public /* synthetic */ dqh0.b c;
        public final /* synthetic */ ssq d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ssq ssqVar, v1b<? super c> v1bVar) {
            super(4, v1bVar);
            this.d = ssqVar;
        }

        @Override // defpackage.iaj
        public final Object d(qcn<? extends Integer> qcnVar, qcn<? extends Integer> qcnVar2, dqh0.b bVar, v1b<? super Boolean> v1bVar) {
            c cVar = new c(this.d, v1bVar);
            cVar.a = qcnVar;
            cVar.b = qcnVar2;
            cVar.c = bVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qcn qcnVar = this.a;
            qcn qcnVar2 = this.b;
            dqh0.b bVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = this.d.e;
            int size = qcnVar.size();
            return Boolean.valueOf(1 <= size && size <= i && !qcnVar2.isEmpty() && bVar.getOutcomeId() != null);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snmba.SNMBAMapper$getMarketSelectionFlow$1$userSelectedState$1", f = "SNMBAMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<qcn<? extends Integer>, qcn<? extends Integer>, v1b<? super dqh0.d>, Object> {
        public /* synthetic */ qcn a;
        public /* synthetic */ qcn b;
        public final /* synthetic */ ssq c;
        public final /* synthetic */ wo60 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, ssq ssqVar, wo60 wo60Var) {
            super(3, v1bVar);
            this.c = ssqVar;
            this.d = wo60Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(qcn<? extends Integer> qcnVar, qcn<? extends Integer> qcnVar2, v1b<? super dqh0.d> v1bVar) {
            d dVar = new d(v1bVar, this.c, this.d);
            dVar.a = qcnVar;
            dVar.b = qcnVar2;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yxq next;
            qcn qcnVar = this.a;
            qcn qcnVar2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ssq ssqVar = this.c;
            String str = ssqVar.a;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            Iterator<E> it = qcnVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                arrayList.add(new kxq.e(iIntValue, null, qcnVar.contains(Integer.valueOf(iIntValue)) ? new uo60.e(str, iIntValue) : new uo60.b(str, iIntValue)));
            }
            uf00 uf00VarF = a4h.f(arrayList);
            ArrayList arrayList2 = new ArrayList(l48.r(qcnVar2, 10));
            Iterator<E> it2 = qcnVar2.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                arrayList2.add(new kxq.e(iIntValue2, null, qcnVar2.contains(Integer.valueOf(iIntValue2)) ? new uo60.d(str, iIntValue2) : new uo60.a(str, iIntValue2)));
            }
            uf00 uf00VarF2 = a4h.f(arrayList2);
            qcn<yxq> qcnVar3 = ssqVar.g;
            int size = qcnVar.size();
            qcnVar3.getClass();
            Iterator<yxq> it3 = qcnVar3.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (next.e != size);
            yxq yxqVar = next;
            return new dqh0.d(uf00VarF, uf00VarF2, yxqVar != null ? yxqVar.b : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xo60(ssq ssqVar, wo60 wo60Var, lyh<? extends zxq.h> lyhVar, qxp qxpVar, v1b<? super xo60> v1bVar) {
        super(2, v1bVar);
        this.c = ssqVar;
        this.d = wo60Var;
        this.e = lyhVar;
        this.f = qxpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xo60 xo60Var = new xo60(this.c, this.d, this.e, this.f, v1bVar);
        xo60Var.b = obj;
        return xo60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super xsq.a> ez20Var, v1b<? super Unit> v1bVar) {
        return ((xo60) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n1a0 n1a0Var = n1a0.c;
            wwd0 wwd0VarA = xwd0.a(n1a0Var);
            wwd0 wwd0VarA2 = xwd0.a(n1a0Var);
            ssq ssqVar = this.c;
            wo60 wo60Var = this.d;
            n1i n1iVar = new n1i(wwd0VarA, wwd0VarA2, new d(null, ssqVar, wo60Var));
            dqh0.c cVar = new dqh0.c(0);
            kwd0 kwd0Var = q490.a.a;
            v340 v340VarE = e1i.e(n1iVar, ez20Var, kwd0Var, cVar);
            n1i n1iVar2 = new n1i(wwd0VarA, wwd0VarA2, new b(3, null));
            Boolean bool = Boolean.FALSE;
            v340 v340VarE2 = e1i.e(n1iVar2, ez20Var, kwd0Var, bool);
            v340 v340VarE3 = e1i.e(r1i.a(wwd0VarA, wwd0VarA2, v340VarE, new c(ssqVar, null)), ez20Var, kwd0Var, bool);
            ej5.c(ez20Var, null, null, new a(this.e, wwd0VarA, wwd0VarA2, ssqVar, this.f, wo60Var, null), 3);
            xsq.a aVar = new xsq.a(v340VarE2, v340VarE3, v340VarE);
            this.b = null;
            this.a = 1;
            if (ez20Var.j(this, aVar) == y5bVar) {
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
