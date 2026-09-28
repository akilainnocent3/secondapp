package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cj {
    public mjj0.g a;
    public o82.a b;
    public g1i c;
    public v340 d;
    public wwd0 e;
    public lyh<? extends xhj0> f;
    public v340 g;
    public v340 h;
    public v340 i;
    public y300.a j;
    public et7 k;
    public final wwd0 l = xwd0.a(new dj(null, null, null, null, 127));
    public final wwd0 m = xwd0.a(new ej(0));
    public final wwd0 n = xwd0.a(new ijf0((String) null, 0, 7));
    public final wwd0 o;
    public final mpe0 p;
    public final wwd0 q;
    public final mpe0 r;
    public final mpe0 s;
    public final bj t;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.AddNewAccountUiManagerImpl$addNewAccountReducer$1$2", f = "AddNewAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<Boolean, c330, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ c330 b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, c330 c330Var, v1b<? super Unit> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = cj.this.new a(v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = c330Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z = this.a;
            c330 c330VarA = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (c330VarA instanceof c330.a) {
                c330VarA = c330.a.a((c330.a) c330VarA, z, null, 2);
            }
            wwd0 wwd0Var = cj.this.m;
            do {
                value = wwd0Var.getValue();
                ((ej) value).getClass();
                c330VarA.getClass();
            } while (!wwd0Var.g(value, new ej(c330VarA)));
            return Unit.a;
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ cj b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.AddNewAccountUiManagerImpl$addNewAccountReducer$lambda$0$$inlined$combine$1", f = "AddNewAccountUiManager.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: cj$b$b, reason: collision with other inner class name */
        public static final class C0170b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public C0170b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.AddNewAccountUiManagerImpl$addNewAccountReducer$lambda$0$$inlined$combine$1$3", f = "AddNewAccountUiManager.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ cj d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(cj cjVar, v1b v1bVar) {
                super(3, v1bVar);
                this.d = cjVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(this.d, v1bVar);
                cVar.b = myhVar;
                cVar.c = objArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    boolean z = false;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    List list = (List) obj2;
                    jw1 jw1Var = (jw1) objArr[1];
                    Object obj3 = objArr[2];
                    obj3.getClass();
                    ijf0 ijf0Var = (ijf0) obj3;
                    Object obj4 = objArr[3];
                    obj4.getClass();
                    xhj0 xhj0Var = (xhj0) obj4;
                    Object obj5 = objArr[4];
                    obj5.getClass();
                    BigDecimal bigDecimal = (BigDecimal) obj5;
                    Object obj6 = objArr[5];
                    obj6.getClass();
                    xyx xyxVar = (xyx) obj6;
                    PayHintData payHintData = (PayHintData) objArr[6];
                    Object obj7 = objArr[7];
                    obj7.getClass();
                    mij0 mij0Var = (mij0) obj7;
                    if (jw1Var != null && jw1Var.f) {
                        z = true;
                    }
                    wwd0 wwd0Var = this.d.l;
                    while (true) {
                        Object value = wwd0Var.getValue();
                        bx bxVar = ((dj) value).c;
                        String str = xyxVar.a;
                        boolean z2 = z;
                        int i2 = xyxVar.b;
                        jw1 jw1Var2 = jw1Var;
                        List list2 = list;
                        ijf0 ijf0Var2 = new ijf0(str, vlf0.a(i2, i2), 4);
                        bxVar.getClass();
                        bx bxVar2 = new bx(ijf0Var2, xhj0Var, bigDecimal);
                        xyx xyxVar2 = xyxVar;
                        BigDecimal bigDecimal2 = bigDecimal;
                        if (wwd0Var.g(value, new dj(jw1Var2, list2, bxVar2, ijf0Var, !z2, payHintData, mij0Var))) {
                            break;
                        }
                        bigDecimal = bigDecimal2;
                        xyxVar = xyxVar2;
                        z = z2;
                        list = list2;
                        jw1Var = jw1Var2;
                    }
                    Unit unit = Unit.a;
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(unit, this) == y5bVar) {
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

        public b(lyh[] lyhVarArr, cj cjVar) {
            this.a = lyhVarArr;
            this.b = cjVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
                lyh[] lyhVarArr = this.a;
                C0170b c0170b = new C0170b(lyhVarArr);
                c cVar = new c(this.b, null);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, c0170b, lyhVarArr) == y5bVar) {
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

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.AddNewAccountUiManagerImpl$bankSelectListStateFlow$2$1", f = "AddNewAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<List<? extends jw1>, jw1, v1b<? super List<? extends aoe0.a>>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ jw1 b;

        @Override // defpackage.gaj
        public final Object invoke(List<? extends jw1> list, jw1 jw1Var, v1b<? super List<? extends aoe0.a>> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.a = list;
            cVar.b = jw1Var;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            jw1 jw1Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(coe0.a((jw1) it.next(), jw1Var != null ? new Integer(jw1Var.a) : null));
            }
            return arrayList;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.AddNewAccountUiManagerImpl$withdrawableNewAccountStateFlow$2$1", f = "AddNewAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements iaj<jw1, ijf0, xhj0, v1b<? super Boolean>, Object> {
        public /* synthetic */ jw1 a;
        public /* synthetic */ ijf0 b;
        public /* synthetic */ xhj0 c;

        public d(v1b<? super d> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(jw1 jw1Var, ijf0 ijf0Var, xhj0 xhj0Var, v1b<? super Boolean> v1bVar) {
            d dVar = cj.this.new d(v1bVar);
            dVar.a = jw1Var;
            dVar.b = ijf0Var;
            dVar.c = xhj0Var;
            return dVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0048  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            jw1 jw1Var = this.a;
            ijf0 ijf0Var = this.b;
            xhj0 xhj0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (jw1Var != null) {
                cj cjVar = cj.this;
                y300.a aVar = cjVar.j;
                if (aVar == null) {
                    Intrinsics.n("payMethod");
                    throw null;
                }
                int i = y300.a.C1320a.a[aVar.a.ordinal()] != 1 ? 1 : 9;
                y300.a aVar2 = cjVar.j;
                if (aVar2 == null) {
                    Intrinsics.n("payMethod");
                    throw null;
                }
                int iN = aVar2.n();
                int length = ijf0Var.a.b.length();
                z = i <= length && length <= iN && (xhj0Var instanceof xhj0.i);
            }
            return Boolean.valueOf(z);
        }
    }

    public cj(final ygk ygkVar) {
        int i = 0;
        wwd0 wwd0VarA = xwd0.a(null);
        this.o = wwd0VarA;
        this.p = hwr.b(new dm90(this, 2));
        this.q = wwd0VarA;
        this.r = hwr.b(new zi(this, i));
        this.s = hwr.b(new Function0() { // from class: aj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                cj cjVar = this;
                wwd0 wwd0Var = cjVar.o;
                v340 v340Var = cjVar.g;
                if (v340Var == null) {
                    Intrinsics.n("nameConfirmStatusStateFlow");
                    throw null;
                }
                mjj0.g gVar = cjVar.a;
                if (gVar == null) {
                    Intrinsics.n("showSportyPinHintFlow");
                    throw null;
                }
                et7 et7Var = cjVar.k;
                if (et7Var != null) {
                    return ygkVar.a(wwd0Var, v340Var, gVar, et7Var);
                }
                Intrinsics.n("scope");
                throw null;
            }
        });
        this.t = new bj(this, i);
    }
}
