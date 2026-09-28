package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1", f = "SNBMapper.kt", l = {123}, m = "invokeSuspend", v = 2)
public final class jo60 extends tje0 implements Function2<ez20<? super xsq.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ssq c;
    public final /* synthetic */ mo60 d;
    public final /* synthetic */ lyh<zxq.h> e;
    public final /* synthetic */ qxp f;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$1", f = "SNBMapper.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<zxq.h> b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ ssq d;
        public final /* synthetic */ mo60 e;
        public final /* synthetic */ qxp f;

        /* JADX INFO: renamed from: jo60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$1$1", f = "SNBMapper.kt", l = {87}, m = "invokeSuspend", v = 2)
        public static final class C0730a extends tje0 implements Function2<zxq.h, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ wwd0 c;
            public final /* synthetic */ ssq d;
            public final /* synthetic */ mo60 e;
            public final /* synthetic */ qxp f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0730a(wwd0 wwd0Var, ssq ssqVar, mo60 mo60Var, qxp qxpVar, v1b v1bVar) {
                super(2, v1bVar);
                this.c = wwd0Var;
                this.d = ssqVar;
                this.e = mo60Var;
                this.f = qxpVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0730a c0730a = new C0730a(this.c, this.d, this.e, this.f, v1bVar);
                c0730a.b = obj;
                return c0730a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(zxq.h hVar, v1b<? super Unit> v1bVar) {
                return ((C0730a) create(hVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                List listF;
                Object value3;
                List listF2;
                Object value4;
                String str = this.d.a;
                zxq.h hVar = (zxq.h) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    boolean z = hVar instanceof zxq.j.b;
                    wwd0 wwd0Var = this.c;
                    if (z) {
                        n1a0 n1a0Var = n1a0.c;
                        this.b = null;
                        this.a = 1;
                        wwd0Var.setValue(n1a0Var);
                        if (Unit.a == y5bVar) {
                            return y5bVar;
                        }
                    } else if (hVar instanceof zxq.j.a) {
                        s4r.a aVar = ((zxq.j.a) hVar).a;
                        if (Intrinsics.g(aVar.b, str) && aVar.c == atq.SNB) {
                            qcn<Integer> qcnVar = aVar.f;
                            qcnVar.getClass();
                            do {
                                value4 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value4, a4h.f(CollectionsKt.q0(qcnVar))));
                        }
                    } else if (hVar instanceof zxq.i) {
                        if (!Intrinsics.g(((zxq.i) hVar).getMarketId(), str) || !(hVar instanceof ho60)) {
                            return Unit.a;
                        }
                        ho60 ho60Var = (ho60) hVar;
                        if (ho60Var instanceof ho60.a) {
                            int i2 = ((ho60.a) hVar).b;
                            do {
                                value3 = wwd0Var.getValue();
                                listF2 = (qcn) value3;
                                if (!listF2.contains(Integer.valueOf(i2))) {
                                    ArrayList arrayList = new ArrayList(listF2);
                                    arrayList.add(Integer.valueOf(i2));
                                    o48.u(arrayList);
                                    listF2 = a4h.f(arrayList);
                                }
                            } while (!wwd0Var.g(value3, listF2));
                        } else if (ho60Var instanceof ho60.c) {
                            int i3 = ((ho60.c) hVar).b;
                            do {
                                value2 = wwd0Var.getValue();
                                listF = (qcn) value2;
                                if (listF.contains(Integer.valueOf(i3))) {
                                    ArrayList arrayList2 = new ArrayList(listF);
                                    arrayList2.remove(Integer.valueOf(i3));
                                    listF = a4h.f(arrayList2);
                                }
                            } while (!wwd0Var.g(value2, listF));
                        } else {
                            if (!(ho60Var instanceof ho60.b)) {
                                uhc.a();
                                return null;
                            }
                            r4r r4rVar = this.e.a;
                            qcn<ixp> qcnVar2 = this.f.b;
                            r4rVar.getClass();
                            qcnVar2.getClass();
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, jxq.b(qcnVar2, r4rVar, 0)));
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
        public a(lyh lyhVar, wwd0 wwd0Var, ssq ssqVar, mo60 mo60Var, qxp qxpVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = wwd0Var;
            this.d = ssqVar;
            this.e = mo60Var;
            this.f = qxpVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
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
                C0730a c0730a = new C0730a(this.c, this.d, this.e, this.f, null);
                this.a = 1;
                if (kzh.b(this.b, c0730a, this) == y5bVar) {
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

    public static final class b implements lyh<dqh0.a> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ ssq b;
        public final /* synthetic */ mo60 c;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$1", f = "SNBMapper.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: jo60$b$b, reason: collision with other inner class name */
        public static final class C0731b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ ssq b;

            /* JADX INFO: renamed from: jo60$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$1$2", f = "SNBMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return C0731b.this.emit(null, this);
                }
            }

            public C0731b(myh myhVar, ssq ssqVar, mo60 mo60Var) {
                this.a = myhVar;
                this.b = ssqVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                ssq ssqVar;
                yxq next;
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
                    qcn qcnVar = (qcn) obj;
                    ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                    Iterator<E> it = qcnVar.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ssqVar = this.b;
                        if (!zHasNext) {
                            break;
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        String str = ssqVar.a;
                        arrayList.add(new kxq.e(iIntValue, null, qcnVar.contains(Integer.valueOf(iIntValue)) ? new ho60.c(str, iIntValue) : new ho60.a(str, iIntValue)));
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    qcn<yxq> qcnVar2 = ssqVar.g;
                    int size = qcnVar.size();
                    qcnVar2.getClass();
                    Iterator<yxq> it2 = qcnVar2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (next.e != size);
                    yxq yxqVar = next;
                    dqh0.a aVar2 = new dqh0.a(uf00VarF, yxqVar != null ? yxqVar.b : null);
                    aVar.b = 1;
                    if (this.a.emit(aVar2, aVar) == y5bVar) {
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

        public b(wwd0 wwd0Var, ssq ssqVar, mo60 mo60Var) {
            this.a = wwd0Var;
            this.b = ssqVar;
            this.c = mo60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super dqh0.a> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            C0731b c0731b = new C0731b(myhVar, this.b, this.c);
            aVar.b = 1;
            this.a.collect(c0731b, aVar);
            return y5bVar;
        }
    }

    public static final class c implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$2", f = "SNBMapper.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$2$2", f = "SNBMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
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
                    Boolean boolValueOf = Boolean.valueOf(!((qcn) obj).isEmpty());
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public c(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public static final class d implements lyh<Boolean> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$3", f = "SNBMapper.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.market.snb.SNBMapper$getMarketSelectionFlow$1$invokeSuspend$$inlined$map$3$2", f = "SNBMapper.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
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
                    Boolean boolValueOf = Boolean.valueOf(((dqh0.b) obj).getOutcomeId() != null);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public d(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.a.collect(bVar, aVar) == y5bVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public jo60(ssq ssqVar, mo60 mo60Var, lyh<? extends zxq.h> lyhVar, qxp qxpVar, v1b<? super jo60> v1bVar) {
        super(2, v1bVar);
        this.c = ssqVar;
        this.d = mo60Var;
        this.e = lyhVar;
        this.f = qxpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jo60 jo60Var = new jo60(this.c, this.d, this.e, this.f, v1bVar);
        jo60Var.b = obj;
        return jo60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super xsq.a> ez20Var, v1b<? super Unit> v1bVar) {
        return ((jo60) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0VarA = xwd0.a(n1a0.c);
            ssq ssqVar = this.c;
            mo60 mo60Var = this.d;
            b bVar = new b(wwd0VarA, ssqVar, mo60Var);
            dqh0.c cVar = new dqh0.c(0);
            kwd0 kwd0Var = q490.a.a;
            v340 v340VarE = e1i.e(bVar, ez20Var, kwd0Var, cVar);
            c cVar2 = new c(wwd0VarA);
            Boolean bool = Boolean.FALSE;
            v340 v340VarE2 = e1i.e(cVar2, ez20Var, kwd0Var, bool);
            v340 v340VarE3 = e1i.e(new d(v340VarE), ez20Var, kwd0Var, bool);
            ej5.c(ez20Var, null, null, new a(this.e, wwd0VarA, ssqVar, mo60Var, this.f, null), 3);
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
