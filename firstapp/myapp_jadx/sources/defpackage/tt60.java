package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.PayHintData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tt60 {
    public mjj0.g a;
    public o82.a b;
    public g1i c;
    public v340 d;
    public wwd0 e;
    public lyh<? extends xhj0> f;
    public v340 g;
    public v340 h;
    public wwd0 i;
    public y300.a j;
    public et7 k;
    public final wwd0 l;
    public final wwd0 m;
    public final wwd0 n;
    public final f o;
    public final mpe0 p;
    public final mpe0 q;
    public final mpe0 r;
    public final mpe0 s;
    public final wyt t;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;
        public final /* synthetic */ tt60 b;

        /* JADX INFO: renamed from: tt60$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$manageAccountEnabledStateFlow_delegate$lambda$0$$inlined$map$1", f = "SavedAssetUiManager.kt", l = {109}, m = "collect", v = 2)
        public static final class C1148a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1148a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ tt60 b;

            /* JADX INFO: renamed from: tt60$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$manageAccountEnabledStateFlow_delegate$lambda$0$$inlined$map$1$2", f = "SavedAssetUiManager.kt", l = {50}, m = "emit", v = 2)
            public static final class C1149a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1149a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, tt60 tt60Var) {
                this.a = myhVar;
                this.b = tt60Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1149a c1149a;
                if (v1bVar instanceof C1149a) {
                    c1149a = (C1149a) v1bVar;
                    int i = c1149a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1149a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1149a = new C1149a(v1bVar);
                    }
                } else {
                    c1149a = new C1149a(v1bVar);
                }
                Object obj2 = c1149a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1149a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object obj3 = (ut60) obj;
                    y300.a aVar = this.b.j;
                    if (aVar == null) {
                        Intrinsics.n("payMethod");
                        throw null;
                    }
                    if (!aVar.p()) {
                        obj3 = ut60.b.a;
                    }
                    Boolean boolValueOf = Boolean.valueOf(!(obj3 instanceof ut60.a) || ((ut60.a) obj3).a > 1);
                    c1149a.b = 1;
                    if (this.a.emit(boolValueOf, c1149a) == y5bVar) {
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

        public a(vl50 vl50Var, tt60 tt60Var) {
            this.a = vl50Var;
            this.b = tt60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C1148a c1148a;
            if (v1bVar instanceof C1148a) {
                c1148a = (C1148a) v1bVar;
                int i = c1148a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1148a.b = i - Integer.MIN_VALUE;
                } else {
                    c1148a = new C1148a(v1bVar);
                }
            } else {
                c1148a = new C1148a(v1bVar);
            }
            Object obj = c1148a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1148a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1148a.b = 1;
                if (this.a.collect(bVar, c1148a) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$savedAssetsListUiStateFlow$2$1", f = "SavedAssetUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<List<? extends AssetData.AccountsBean>, AssetData.AccountsBean, v1b<? super List<? extends aoe0.b>>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ AssetData.AccountsBean b;

        @Override // defpackage.gaj
        public final Object invoke(List<? extends AssetData.AccountsBean> list, AssetData.AccountsBean accountsBean, v1b<? super List<? extends aoe0.b>> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = list;
            bVar.b = accountsBean;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            AssetData.AccountsBean accountsBean = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(coe0.b((AssetData.AccountsBean) it.next(), accountsBean));
            }
            return arrayList;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$savedAssetsReducer$1$2", f = "SavedAssetUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<Boolean, c330, tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ c330 b;
        public /* synthetic */ tzs c;
        public final /* synthetic */ tt60 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, tt60 tt60Var) {
            super(4, v1bVar);
            this.d = tt60Var;
        }

        @Override // defpackage.iaj
        public final Object d(Boolean bool, c330 c330Var, tzs tzsVar, v1b<? super Unit> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            c cVar = new c(v1bVar, this.d);
            cVar.a = zBooleanValue;
            cVar.b = c330Var;
            cVar.c = tzsVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z = this.a;
            c330 c330VarA = this.b;
            tzs tzsVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (c330VarA instanceof c330.a) {
                c330VarA = c330.a.a((c330.a) c330VarA, z, null, 2);
            }
            wwd0 wwd0Var = this.d.m;
            do {
                value = wwd0Var.getValue();
                ((tu60) value).getClass();
                c330VarA.getClass();
                tzsVar.getClass();
            } while (!wwd0Var.g(value, new tu60(c330VarA, tzsVar)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$savedAssetsReducer$1$3", f = "SavedAssetUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<List<? extends AssetData.AccountsBean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ tt60 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, tt60 tt60Var) {
            super(2, v1bVar);
            this.b = tt60Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(v1bVar, this.b);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends AssetData.AccountsBean> list, v1b<? super Unit> v1bVar) {
            return ((d) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object obj2;
            Object next;
            AssetData.AccountsBean accountsBean;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.n;
            do {
                value = wwd0Var.getValue();
                Iterator it = list.iterator();
                do {
                    obj2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((AssetData.AccountsBean) next).isDefault(), Boolean.TRUE));
                accountsBean = (AssetData.AccountsBean) next;
                if (accountsBean == null) {
                    for (Object obj3 : list) {
                        if (Intrinsics.g(((AssetData.AccountsBean) obj3).isDisabled(), Boolean.FALSE)) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    accountsBean = (AssetData.AccountsBean) obj2;
                }
            } while (!wwd0Var.g(value, accountsBean));
            return Unit.a;
        }
    }

    public static final class e implements lyh<Unit> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ tt60 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$savedAssetsReducer$lambda$0$$inlined$combine$1", f = "SavedAssetUiManager.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$savedAssetsReducer$lambda$0$$inlined$combine$1$3", f = "SavedAssetUiManager.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ tt60 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v1b v1bVar, tt60 tt60Var) {
                super(3, v1bVar);
                this.d = tt60Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(v1bVar, this.d);
                cVar.b = myhVar;
                cVar.c = objArr;
                return cVar.invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object next;
                y5b y5bVar = y5b.a;
                int i = this.a;
                List list = null;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    List list2 = (List) obj3;
                    Object obj4 = objArr[1];
                    obj4.getClass();
                    xhj0 xhj0Var = (xhj0) obj4;
                    Object obj5 = objArr[2];
                    obj5.getClass();
                    BigDecimal bigDecimal = (BigDecimal) obj5;
                    Object obj6 = objArr[3];
                    obj6.getClass();
                    xyx xyxVar = (xyx) obj6;
                    int i2 = 4;
                    PayHintData payHintData = (PayHintData) objArr[4];
                    Object obj7 = objArr[5];
                    obj7.getClass();
                    mij0 mij0Var = (mij0) obj7;
                    Object obj8 = objArr[6];
                    obj8.getClass();
                    boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                    wwd0 wwd0Var = this.d.l;
                    while (true) {
                        Object value = wwd0Var.getValue();
                        bx bxVar = ((su60) value).c;
                        List list3 = !list2.isEmpty() ? list2 : list;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = list;
                                    break;
                                }
                                next = it.next();
                            } while (!((aoe0.b) next).f);
                            obj2 = (aoe0.b) next;
                        } else {
                            obj2 = list;
                        }
                        String str = xyxVar.a;
                        List list4 = list2;
                        int i3 = xyxVar.b;
                        ijf0 ijf0Var = new ijf0(str, vlf0.a(i3, i3), i2);
                        bxVar.getClass();
                        bx bxVar2 = new bx(ijf0Var, xhj0Var, bigDecimal);
                        int i4 = i2;
                        list2 = list4;
                        if (wwd0Var.g(value, new su60(list2, obj2, bxVar2, payHintData, mij0Var, zBooleanValue))) {
                            break;
                        }
                        i2 = i4;
                        list = null;
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

        public e(lyh[] lyhVarArr, tt60 tt60Var) {
            this.a = lyhVarArr;
            this.b = tt60Var;
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
                b bVar = new b(lyhVarArr);
                c cVar = new c(null, this.b);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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

    public static final class f implements lyh<jw1> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$special$$inlined$map$1", f = "SavedAssetUiManager.kt", l = {109}, m = "collect", v = 2)
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
                return f.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$special$$inlined$map$1$2", f = "SavedAssetUiManager.kt", l = {50}, m = "emit", v = 2)
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
                    AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) obj;
                    jw1 jw1VarA = accountsBean != null ? kw1.a(accountsBean) : null;
                    aVar.b = 1;
                    if (this.a.emit(jw1VarA, aVar) == y5bVar) {
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

        public f(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super jw1> myhVar, v1b v1bVar) throws Throwable {
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.SavedAssetUiManagerImpl$withdrawableSavedAssetsStateFlow$2$1", f = "SavedAssetUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements gaj<List<? extends aoe0.b>, xhj0, v1b<? super Boolean>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ xhj0 b;

        @Override // defpackage.gaj
        public final Object invoke(List<? extends aoe0.b> list, xhj0 xhj0Var, v1b<? super Boolean> v1bVar) {
            g gVar = new g(3, v1bVar);
            gVar.a = list;
            gVar.b = xhj0Var;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            List list = this.a;
            xhj0 xhj0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((aoe0.b) it.next()).f) {
                        z = xhj0Var instanceof xhj0.i;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public tt60(final ygk ygkVar, d100 d100Var) {
        d100Var.getClass();
        this.l = xwd0.a(new su60(null, null, null, null, 63));
        this.m = xwd0.a(new tu60((c330.a) null, 3));
        wwd0 wwd0VarA = xwd0.a(null);
        this.n = wwd0VarA;
        this.o = new f(wwd0VarA);
        int i = 1;
        this.p = hwr.b(new x3b(this, i));
        this.q = hwr.b(new z3b(this, 2));
        this.r = hwr.b(new Function0() { // from class: st60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                tt60 tt60Var = this;
                tt60.f fVar = tt60Var.o;
                v340 v340Var = tt60Var.g;
                if (v340Var == null) {
                    Intrinsics.n("nameConfirmStatusStateFlow");
                    throw null;
                }
                mjj0.g gVar = tt60Var.a;
                if (gVar == null) {
                    Intrinsics.n("showSportyPinHintFlow");
                    throw null;
                }
                et7 et7Var = tt60Var.k;
                if (et7Var != null) {
                    return ygkVar.a(fVar, v340Var, gVar, et7Var);
                }
                Intrinsics.n("scope");
                throw null;
            }
        });
        this.s = hwr.b(new gjy(i, d100Var, this));
        this.t = new wyt(this, i);
    }
}
