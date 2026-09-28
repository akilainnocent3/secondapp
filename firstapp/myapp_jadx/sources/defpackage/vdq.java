package defpackage;

import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vdq {
    public static final /* synthetic */ int j = 0;
    public final wdq a;
    public final xq00 b;
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;
    public final b f;
    public final k1i g;
    public final ku90<String> h;
    public final t340 i;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$selectedGift$1", f = "LNGiftManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<String, qcn<? extends ocq>, v1b<? super ocq>, Object> {
        public /* synthetic */ String a;
        public /* synthetic */ qcn b;

        @Override // defpackage.gaj
        public final Object invoke(String str, qcn<? extends ocq> qcnVar, v1b<? super ocq> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = str;
            aVar.b = qcnVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            String str = this.a;
            qcn qcnVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qcn qcnVar2 = str != null ? qcnVar : null;
            if (qcnVar2 != null) {
                Iterator<E> it = qcnVar2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((ocq) next).a, str));
                ocq ocqVar = (ocq) next;
                if (ocqVar != null) {
                    return ocqVar;
                }
            }
            if (qcnVar != null) {
                return (ocq) CollectionsKt.firstOrNull(qcnVar);
            }
            return null;
        }
    }

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$special$$inlined$map$1", f = "LNGiftManager.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: vdq$b$b, reason: collision with other inner class name */
        public static final class C1211b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: vdq$b$b$a */
            @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$special$$inlined$map$1$2", f = "LNGiftManager.kt", l = {50}, m = "emit", v = 2)
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
                    return C1211b.this.emit(null, this);
                }
            }

            public C1211b(myh myhVar) {
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
                    Boolean boolValueOf = Boolean.valueOf(((avq) obj).f);
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                C1211b c1211b = new C1211b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1211b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager$userSelected$1", f = "LNGiftManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<ocq, Boolean, rkd0, v1b<? super jfq>, Object> {
        public /* synthetic */ ocq a;
        public /* synthetic */ boolean b;
        public /* synthetic */ BigDecimal c;

        @Override // defpackage.iaj
        public final Object d(ocq ocqVar, Boolean bool, rkd0 rkd0Var, v1b<? super jfq> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            BigDecimal bigDecimal = rkd0Var.a;
            c cVar = new c(4, v1bVar);
            cVar.a = ocqVar;
            cVar.b = zBooleanValue;
            cVar.c = bigDecimal;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ocq ocqVar = this.a;
            boolean z = this.b;
            BigDecimal bigDecimal = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (ocqVar == null) {
                return null;
            }
            BigDecimal bigDecimal2 = ocqVar.e;
            bigDecimal.getClass();
            if (bigDecimal2.compareTo(bigDecimal) < 0) {
                bigDecimal = bigDecimal2;
            }
            return new jfq(z, bigDecimal, ocqVar);
        }
    }

    static {
        ohp<Object>[] ohpVarArr = xq00.c;
    }

    public vdq(wdq wdqVar, i6u i6uVar, xq00 xq00Var) {
        wdqVar.getClass();
        i6uVar.getClass();
        xq00Var.getClass();
        this.a = wdqVar;
        this.b = xq00Var;
        wwd0 wwd0VarA = xwd0.a(null);
        this.c = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.d = wwd0VarA2;
        rkd0.Companion.getClass();
        wwd0 wwd0VarA3 = xwd0.a(new rkd0(rkd0.b));
        this.e = wwd0VarA3;
        this.f = new b(i6uVar.f.d);
        ts5 ts5Var = wdqVar.c;
        this.g = r1i.a(new n1i(wwd0VarA, r0i.f(new yzh(new at5(ts5Var.a()), new bt5(3, null)), new zs5(ts5Var, null)), new a(3, null)), wwd0VarA2, wwd0VarA3, new c(4, null));
        ku90<String> ku90Var = new ku90<>();
        this.h = ku90Var;
        this.i = e1i.a(ku90Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        sdq sdqVar;
        if (x1bVar instanceof sdq) {
            sdqVar = (sdq) x1bVar;
            int i = sdqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdqVar.c = i - Integer.MIN_VALUE;
            } else {
                sdqVar = new sdq(this, x1bVar);
            }
        } else {
            sdqVar = new sdq(this, x1bVar);
        }
        Object obj = sdqVar.a;
        y5b y5bVar = y5b.a;
        int i2 = sdqVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            tdq tdqVar = new tdq(this, null);
            sdqVar.c = 1;
            if (w5b.d(tdqVar, sdqVar) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(BigDecimal bigDecimal, x1b x1bVar) {
        udq udqVar;
        ocq ocqVar;
        if (x1bVar instanceof udq) {
            udqVar = (udq) x1bVar;
            int i = udqVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                udqVar.e = i - Integer.MIN_VALUE;
            } else {
                udqVar = new udq(this, x1bVar);
            }
        } else {
            udqVar = new udq(this, x1bVar);
        }
        Object obj = udqVar.c;
        y5b y5bVar = y5b.a;
        int i2 = udqVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            qcn qcnVar = (qcn) this.a.c.c.getValue();
            ocqVar = qcnVar != null ? (ocq) CollectionsKt.firstOrNull(qcnVar) : null;
            wwd0 wwd0Var = this.c;
            if (ocqVar != null) {
                String str = ocqVar.a;
                udqVar.a = bigDecimal;
                udqVar.b = ocqVar;
                udqVar.e = 1;
                wwd0Var.setValue(str);
                if (Unit.a != y5bVar) {
                }
            } else {
                udqVar.a = null;
                udqVar.b = null;
                udqVar.e = 3;
                wwd0Var.setValue(null);
                Unit unit = Unit.a;
                if (unit != y5bVar) {
                    return unit;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            if (i2 == 3) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ocq ocqVar2 = udqVar.b;
        BigDecimal bigDecimal2 = udqVar.a;
        uj50.b(obj);
        ocqVar = ocqVar2;
        bigDecimal = bigDecimal2;
        BigDecimal bigDecimal3 = ocqVar.e;
        bigDecimal.getClass();
        if (bigDecimal.compareTo(bigDecimal3) >= 0) {
            bigDecimal = bigDecimal3;
        }
        rkd0 rkd0Var = new rkd0(bigDecimal);
        udqVar.a = null;
        udqVar.b = null;
        udqVar.e = 2;
        this.e.k(null, rkd0Var);
        Unit unit2 = Unit.a;
        return unit2 == y5bVar ? y5bVar : unit2;
    }

    public final void c(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.e.k(null, new rkd0(bigDecimal));
    }
}
