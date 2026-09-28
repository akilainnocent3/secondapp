package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.deposit.FirstDepositState;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lakj0;", "Lo82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class akj0 extends o82 {
    public static final int O0;
    public final v340 A0;
    public final v340 B0;
    public final h C0;
    public final v340 D0;
    public final mpe0 E0;
    public final wwd0 F0;
    public final wwd0 G0;
    public final wwd0 H0;
    public final v340 I0;
    public final v340 J0;
    public final wwd0 K0;
    public final List<lyh<lk50<Object>>> L0;
    public boolean M0;
    public final wjj0 N0;
    public final pi80 h0;
    public final vh7 i0;
    public final xqj0 j0;
    public final d100 k0;
    public final sr10 l0;
    public final lyz m0;
    public final psm n0;
    public final uqm o0;
    public final cj7 p0;
    public final phj0 q0;
    public final y300.a r0;
    public final wwd0 s0;
    public final wwd0 t0;
    public final v340 u0;
    public final wwd0 v0;
    public final g1i w0;
    public final wwd0 x0;
    public final v340 y0;
    public final wwd0 z0;

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements kaj<List<? extends AssetData.AccountsBean>, ut60, AssetData.AccountsBean, jw1, WithdrawAlertHintStatus, v1b<? super Unit>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ ut60 b;
        public /* synthetic */ AssetData.AccountsBean c;
        public /* synthetic */ jw1 d;
        public /* synthetic */ WithdrawAlertHintStatus e;

        public a(v1b<? super a> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(List<? extends AssetData.AccountsBean> list, ut60 ut60Var, AssetData.AccountsBean accountsBean, jw1 jw1Var, WithdrawAlertHintStatus withdrawAlertHintStatus, v1b<? super Unit> v1bVar) {
            a aVar = akj0.this.new a(v1bVar);
            aVar.a = list;
            aVar.b = ut60Var;
            aVar.c = accountsBean;
            aVar.d = jw1Var;
            aVar.e = withdrawAlertHintStatus;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object value;
            boolean z;
            boolean z2;
            boolean z3;
            List list = this.a;
            Object obj2 = this.b;
            AssetData.AccountsBean accountsBean = this.c;
            jw1 jw1Var = this.d;
            WithdrawAlertHintStatus withdrawAlertHintStatus = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            akj0 akj0Var = akj0.this;
            if (!akj0Var.r0.p()) {
                obj2 = ut60.b.a;
            }
            int size = list.size();
            boolean z4 = size == 0;
            boolean z5 = obj2 instanceof ut60.a;
            boolean z6 = z5 && size >= ((ut60.a) obj2).a;
            boolean z7 = z5 && ((ut60.a) obj2).a == 1;
            boolean zG = accountsBean != null ? Intrinsics.g(accountsBean.isDisabled(), Boolean.TRUE) : false;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((AssetData.AccountsBean) next).isDisabled(), Boolean.FALSE));
            boolean z8 = next != null;
            boolean z9 = jw1Var != null && jw1Var.f;
            wwd0 wwd0Var = akj0Var.K0;
            do {
                value = wwd0Var.getValue();
                rij0 rij0Var = (rij0) value;
                z = (z6 && z7) ? false : true;
                z2 = ((z6 && z7) || zG || z9) ? false : true;
                z3 = !z4 && (!z7 || zG);
                rij0Var.getClass();
                withdrawAlertHintStatus.getClass();
            } while (!wwd0Var.g(value, new rij0(z, z2, z3, !zG, zG, !z6, z8, withdrawAlertHintStatus)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$savedAssetsStateFlow$2$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<lk50<? extends AssetData>, lk50<? extends List<? extends jw1>>, v1b<? super lk50<? extends AssetData>>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ lk50 b;

        @Override // defpackage.gaj
        public final Object invoke(lk50<? extends AssetData> lk50Var, lk50<? extends List<? extends jw1>> lk50Var2, v1b<? super lk50<? extends AssetData>> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = lk50Var;
            bVar.b = lk50Var2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            lk50 lk50Var = this.a;
            lk50 lk50Var2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50.c cVar = lk50Var2 instanceof lk50.c ? (lk50.c) lk50Var2 : null;
            if (cVar == null || (obj2 = (List) cVar.a) == null) {
                obj2 = m2g.a;
            }
            return bm50.l(lk50Var, new bab(obj2, 1));
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$savedAssetsStateFlow$2$3", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends List<? extends AssetData.AccountsBean>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = akj0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends AssetData.AccountsBean>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list;
            Object next;
            String strA;
            Object value;
            Object next2;
            akj0 akj0Var = akj0.this;
            wwd0 wwd0Var = akj0Var.x0;
            wwd0 wwd0Var2 = akj0Var.v0;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (cVar == null || (list = (List) cVar.a) == null) {
                return Unit.a;
            }
            AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) wwd0Var2.getValue();
            if (accountsBean != null && !list.contains(accountsBean)) {
                akj0Var.L1();
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((AssetData.AccountsBean) next).isDefault(), Boolean.TRUE));
            AssetData.AccountsBean accountsBean2 = (AssetData.AccountsBean) next;
            if (accountsBean2 == null) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.g(((AssetData.AccountsBean) next2).isDisabled(), Boolean.FALSE));
                accountsBean2 = (AssetData.AccountsBean) next2;
                if (accountsBean2 == null) {
                    accountsBean2 = (AssetData.AccountsBean) CollectionsKt.firstOrNull(list);
                }
            }
            if (accountsBean2 != null) {
                wwd0 wwd0Var3 = akj0Var.F0;
                if (wwd0Var.getValue() == null && ((CharSequence) wwd0Var3.getValue()).length() == 0) {
                    jw1 jw1VarA = kw1.a(accountsBean2);
                    wwd0Var.getClass();
                    wwd0Var.k(null, jw1VarA);
                    String accountNumber = accountsBean2.getAccountNumber();
                    if (accountNumber == null || (strA = fu5.a("\\d(?=\\d{4})", accountNumber, "*")) == null) {
                        strA = "--";
                    }
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, strA);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, accountsBean2);
                    wwd0 wwd0Var4 = akj0Var.z0;
                    do {
                        value = wwd0Var4.getValue();
                    } while (!wwd0Var4.g(value, gw1.a((gw1) value, accountsBean2.getAccountType(), false)));
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$selectedBankStateFlow$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<jw1, AssetData.AccountsBean, v1b<? super jw1>, Object> {
        public /* synthetic */ jw1 a;
        public /* synthetic */ AssetData.AccountsBean b;

        @Override // defpackage.gaj
        public final Object invoke(jw1 jw1Var, AssetData.AccountsBean accountsBean, v1b<? super jw1> v1bVar) {
            d dVar = new d(3, v1bVar);
            dVar.a = jw1Var;
            dVar.b = accountsBean;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jw1 jw1Var = this.a;
            AssetData.AccountsBean accountsBean = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (jw1Var == null) {
                return null;
            }
            boolean zG = accountsBean != null ? Intrinsics.g(accountsBean.isDisabled(), Boolean.TRUE) : false;
            int i = jw1Var.a;
            String str = jw1Var.b;
            String str2 = jw1Var.c;
            String str3 = jw1Var.d;
            boolean z = jw1Var.f;
            Boolean bool = jw1Var.g;
            Integer num = jw1Var.h;
            boolean z2 = jw1Var.i;
            boolean z3 = jw1Var.j;
            String str4 = jw1Var.k;
            str4.getClass();
            return new jw1(i, str, str2, str3, zG, z, bool, num, z2, z3, str4);
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$selectedSavedAssetFlow$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<AssetData.AccountsBean, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = akj0.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetData.AccountsBean accountsBean, v1b<? super Unit> v1bVar) {
            return ((e) create(accountsBean, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String strA;
            Object value;
            AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (accountsBean != null) {
                int i = kw1.a(accountsBean).a;
                akj0 akj0Var = akj0.this;
                akj0Var.T1(i);
                wwd0 wwd0Var = akj0Var.F0;
                String accountNumber = accountsBean.getAccountNumber();
                if (accountNumber == null || (strA = fu5.a("\\d(?=\\d{4})", accountNumber, "*")) == null) {
                    strA = "--";
                }
                wwd0Var.getClass();
                wwd0Var.k(null, strA);
                akj0Var.H0.setValue(accountsBean.getAccountName());
                wwd0 wwd0Var2 = akj0Var.z0;
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, gw1.a((gw1) value, accountsBean.getAccountType(), false)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$shouldShowFirstDepositMaskStateFlow$2", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = akj0.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
            return ((f) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.b) {
                return Unit.a;
            }
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (!(cVar != null ? ((Boolean) cVar.a).booleanValue() : false)) {
                int i = akj0.O0;
                akj0 akj0Var = akj0.this;
                ej5.c(o8i0.d(akj0Var), null, null, new hkj0(akj0Var, null), 3);
            }
            return Unit.a;
        }
    }

    public static final class g implements lyh<String> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$3", f = "WithdrawBankViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return g.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$3$2", f = "WithdrawBankViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    String phone = ((AccountInfo) obj).getPhone();
                    aVar.b = 1;
                    if (this.a.emit(phone, aVar) == y5bVar) {
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

        public g(vl50 vl50Var) {
            this.a = vl50Var;
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class h implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$4", f = "WithdrawBankViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return h.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$4$2", f = "WithdrawBankViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    gw1 gw1Var = (gw1) obj;
                    String str = gw1Var.a;
                    Boolean boolValueOf = Boolean.valueOf(!(str == null || str.equals("NotKnown")) || gw1Var.b);
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

        public h(wwd0 wwd0Var) {
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

    public static final class i implements lyh<Integer> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ akj0 b;

        @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$5", f = "WithdrawBankViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return i.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ akj0 b;

            @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$5$2", f = "WithdrawBankViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, akj0 akj0Var) {
                this.a = myhVar;
                this.b = akj0Var;
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
                    Integer num = new Integer(((AssetData.AccountsBean) obj) != null ? akj0.O0 : this.b.r0.e());
                    aVar.b = 1;
                    if (this.a.emit(num, aVar) == y5bVar) {
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

        public i(wwd0 wwd0Var, akj0 akj0Var) {
            this.a = wwd0Var;
            this.b = akj0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) throws Throwable {
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
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public static final class j implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$6", f = "WithdrawBankViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return j.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$special$$inlined$map$6$2", f = "WithdrawBankViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    Boolean boolValueOf = Boolean.valueOf(!((FirstDepositState) obj).getAfterFirstDeposit());
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

        public j(vl50 vl50Var) {
            this.a = vl50Var;
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$switchPaymentItemStateListFlow$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements gaj<List<? extends jw1>, jw1, v1b<? super List<? extends aoe0.a>>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ jw1 b;

        @Override // defpackage.gaj
        public final Object invoke(List<? extends jw1> list, jw1 jw1Var, v1b<? super List<? extends aoe0.a>> v1bVar) {
            k kVar = new k(3, v1bVar);
            kVar.a = list;
            kVar.b = jw1Var;
            return kVar.invokeSuspend(Unit.a);
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

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$withdrawAlertConfigFlow$1", f = "WithdrawBankViewModel.kt", l = {335}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<jw1, v1b<? super WithdrawAlertHintStatus>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = akj0.this.new l(v1bVar);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jw1 jw1Var, v1b<? super WithdrawAlertHintStatus> v1bVar) {
            return ((l) create(jw1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jw1 jw1Var = (jw1) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                phj0 phj0Var = akj0.this.q0;
                if (phj0Var == null || jw1Var == null) {
                    return null;
                }
                String str = jw1Var.c;
                String str2 = jw1Var.b;
                at.a aVar = new at.a(str2 != null ? new iw1.a(str2) : null, str);
                this.b = null;
                this.a = 1;
                obj = phj0Var.c(aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return (WithdrawAlertHintStatus) obj;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$withdrawMainPageAlertConfigFlow$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements gaj<WithdrawAlertHintStatus, PayHintData, v1b<? super WithdrawAlertHintStatus>, Object> {
        public /* synthetic */ WithdrawAlertHintStatus a;
        public /* synthetic */ PayHintData b;

        @Override // defpackage.gaj
        public final Object invoke(WithdrawAlertHintStatus withdrawAlertHintStatus, PayHintData payHintData, v1b<? super WithdrawAlertHintStatus> v1bVar) {
            m mVar = new m(3, v1bVar);
            mVar.a = withdrawAlertHintStatus;
            mVar.b = payHintData;
            return mVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            WithdrawAlertHintStatus withdrawAlertHintStatus = this.a;
            PayHintData payHintData = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = payHintData != null ? payHintData.alert : null;
            return (str == null || str.length() == 0) ? withdrawAlertHintStatus : WithdrawAlertHintStatus.Gone.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$withdrawableStateFlow$1", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements jaj<jw1, String, xhj0, gw1, v1b<? super Boolean>, Object> {
        public /* synthetic */ jw1 a;
        public /* synthetic */ String b;
        public /* synthetic */ xhj0 c;
        public /* synthetic */ gw1 d;

        public n(v1b<? super n> v1bVar) {
            super(5, v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y300.a aVar = akj0.this.r0;
            jw1 jw1Var = this.a;
            String str = this.b;
            xhj0 xhj0Var = this.c;
            gw1 gw1Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (jw1Var == null) {
                return Boolean.FALSE;
            }
            int i = y300.a.C1320a.a[aVar.a.ordinal()] == 1 ? 9 : 1;
            int iN = aVar.n();
            int length = str.length();
            if (i > length || length > iN) {
                return Boolean.FALSE;
            }
            if (xhj0Var instanceof xhj0.i) {
                return (aVar.a == CountryCodeName.SOUTH_AFRICA && gw1Var.a == null && gw1Var.b) ? Boolean.FALSE : Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        @Override // defpackage.jaj
        public final Object l(jw1 jw1Var, String str, xhj0 xhj0Var, gw1 gw1Var, v1b<? super Boolean> v1bVar) {
            n nVar = akj0.this.new n(v1bVar);
            nVar.a = jw1Var;
            nVar.b = str;
            nVar.c = xhj0Var;
            nVar.d = gw1Var;
            return nVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawBankViewModel$withdrawableStateFlow$2", f = "WithdrawBankViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public o(v1b<? super o> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o oVar = akj0.this.new o(v1bVar);
            oVar.a = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((o) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = akj0.this.s0;
            if (wwd0Var.getValue() instanceof c330.a) {
                bkj0.a(z, null, wwd0Var, null);
            }
            return Unit.a;
        }
    }

    static {
        c100 c100Var = c100.e;
        O0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v25, types: [wjj0] */
    public akj0(uyx uyxVar, juh0 juh0Var, pi80 pi80Var, vh7 vh7Var, xqj0 xqj0Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, cj7 cj7Var, shj0 shj0Var, phj0 phj0Var) {
        super(uyxVar, juh0Var, uy0Var, sr10Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, shj0Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        this.h0 = pi80Var;
        this.i0 = vh7Var;
        this.j0 = xqj0Var;
        this.k0 = d100Var;
        this.l0 = sr10Var;
        this.m0 = lyzVar;
        this.n0 = psmVar;
        this.o0 = uqmVar;
        this.p0 = cj7Var;
        this.q0 = phj0Var;
        y300.a aVar = new y300.a(psmVar.getCountryCode());
        this.r0 = aVar;
        wwd0 wwd0VarA = zjj0.a(null, false);
        this.s0 = wwd0VarA;
        this.t0 = wwd0VarA;
        pu0.b bVar = pu0.b.a;
        bm50.f(lyzVar.i0(bVar));
        wl50 wl50VarS1 = S1(sr10Var.k(bVar, N1()));
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(wl50VarS1, et7VarD, kwd0Var, bVar2);
        this.u0 = v340VarE;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.v0 = wwd0VarA2;
        this.w0 = new g1i(wwd0VarA2, new e(null));
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.x0 = wwd0VarA3;
        v340 v340VarE2 = e1i.e(new n1i(wwd0VarA3, wwd0VarA2, new d(3, null)), o8i0.d(this), kwd0Var, null);
        this.y0 = v340VarE2;
        wwd0 wwd0VarA4 = xwd0.a(gw1.d);
        this.z0 = wwd0VarA4;
        v340 v340VarB = e1i.b(wwd0VarA4);
        this.A0 = v340VarB;
        this.B0 = e1i.e(new g(bm50.f(lyzVar.a(new pu0.a(0)))), o8i0.d(this), kwd0Var, null);
        this.C0 = new h(wwd0VarA4);
        this.D0 = e1i.e(new i(wwd0VarA2, this), o8i0.d(this), kwd0Var, 0);
        this.E0 = hwr.b(new v9b(this, 4));
        wwd0 wwd0VarA5 = xwd0.a("");
        this.F0 = wwd0VarA5;
        this.G0 = wwd0VarA5;
        this.H0 = xwd0.a(null);
        g1i g1iVar = new g1i(r1i.b(v340VarE2, wwd0VarA5, H1(), v340VarB, new n(null)), new o(null));
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        this.I0 = e1i.e(g1iVar, et7VarD2, kwd0Var, bool);
        g1i g1iVar2 = new g1i(aVar.o() ? bm50.a(uzh.b(new j(bm50.f(sr10Var.b(bVar))))) : new gzh(new lk50.c(bool)), new f(null));
        et7 et7VarD3 = o8i0.d(this);
        lwd0 lwd0Var = q490.a.b;
        v340 v340VarE3 = e1i.e(g1iVar2, et7VarD3, lwd0Var, bVar2);
        WithdrawAlertHintStatus.Gone gone = WithdrawAlertHintStatus.Gone.a;
        v340 v340VarE4 = e1i.e(new f1i(nb4.b(wwd0VarA3, gone, new l(null))), o8i0.d(this), lwd0Var, gone);
        this.J0 = v340VarE4;
        v340 v340VarE5 = e1i.e(new n1i(v340VarE4, this.O, new m(3, null)), o8i0.d(this), lwd0Var, gone);
        this.K0 = xwd0.a(rij0.i);
        kzh.d(r1i.c(bm50.f(O1()), bm50.f(d100Var.G()), wwd0VarA2, wwd0VarA3, v340VarE5, new a(null)), o8i0.d(this));
        e1i.e(new n1i(bm50.f(v340VarE), v340VarE2, new k(3, null)), o8i0.d(this), kwd0Var, m2g.a);
        this.L0 = kotlin.collections.b.k(v340VarE, O1(), this.P, sr10Var.j0(bVar), v340VarE3, d100Var.a(bVar));
        this.N0 = new iaj() { // from class: wjj0
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String strA;
                String strA2;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Integer num = (Integer) obj4;
                int i2 = akj0.O0;
                m8h0Var.getClass();
                akj0 akj0Var = this.a;
                ku90<spg0> ku90Var = akj0Var.v;
                log0 log0Var = log0.b;
                psm psmVar2 = akj0Var.n0;
                String strF = psmVar2.f();
                BigDecimal bigDecimal = akj0Var.S.c;
                Object value = akj0Var.f0.a.getValue();
                value.getClass();
                BigDecimal bigDecimal2 = (BigDecimal) value;
                v340 v340Var = akj0Var.y0;
                jw1 jw1Var = (jw1) v340Var.a.getValue();
                String str2 = jw1Var != null ? jw1Var.c : null;
                jw1 jw1Var2 = (jw1) v340Var.a.getValue();
                String str3 = jw1Var2 != null ? jw1Var2.d : null;
                String str4 = (String) akj0Var.F0.getValue();
                if (str4 == null || (strA = fu5.a("\\d(?=\\d{4})", str4, "*")) == null) {
                    strA = "--";
                }
                String str5 = (String) akj0Var.H0.getValue();
                vpg0.c(ku90Var, new TxSuccessParams.Bank(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, str2, str3, strA, (str5 == null || (strA2 = fu5.a("(?<=\\d{4})\\d", str5, "*")) == null) ? "--" : strA2, num, psmVar2.getCountryCode() != CountryCodeName.SOUTH_AFRICA));
                b.b(akj0Var.f);
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.L0;
    }

    @Override // defpackage.k72
    public final /* bridge */ /* synthetic */ y200 B1() {
        return this.r0;
    }

    @Override // defpackage.k72
    public List<c9p> E1() {
        return kotlin.collections.b.k(ej5.c(o8i0.d(this), null, null, new ekj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new fkj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new ikj0(this, null), 3), R1());
    }

    @Override // defpackage.o82
    public final uwd0<Integer> G1() {
        return this.D0;
    }

    @Override // defpackage.o82
    public jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new kkj0(this, null), 3);
    }

    public void L1() {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        this.v0.setValue(null);
        this.x0.setValue(null);
        wwd0 wwd0Var3 = this.F0;
        wwd0Var3.getClass();
        wwd0Var3.k(null, "");
        do {
            wwd0Var = this.U;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, wne0.a((wne0) value, m2g.a, false, false, 14)));
        do {
            wwd0Var2 = this.z0;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, gw1.a((gw1) value2, null, true)));
    }

    public int M1() {
        return ((Number) this.D0.a.getValue()).intValue();
    }

    public String N1() {
        int i2 = y300.a.C1320a.a[new y300.a(this.n0.getCountryCode()).a.ordinal()];
        if (i2 == 1) {
            return "GTBank-gateway-GhIPSS";
        }
        if (i2 != 3) {
            return null;
        }
        c100 c100Var = c100.e;
        return String.valueOf(26003);
    }

    public final uwd0<lk50<List<AssetData.AccountsBean>>> O1() {
        return (uwd0) this.E0.getValue();
    }

    public final WithdrawRequest P1() {
        String str;
        jw1 jw1Var = (jw1) this.y0.a.getValue();
        if (jw1Var == null || (str = jw1Var.b) == null) {
            return null;
        }
        AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.v0.getValue();
        boolean zG = Intrinsics.g(z1(), i41.d.a);
        BigDecimal bigDecimalC = p54.c(this.S.c);
        int iM1 = M1();
        Integer numValueOf = accountsBean != null ? Integer.valueOf(accountsBean.getId()) : null;
        String strQ1 = Q1();
        gw1 gw1Var = (gw1) this.z0.getValue();
        gw1Var.getClass();
        String str2 = gw1Var.a;
        if (Intrinsics.g(str2, "Cheque/Current")) {
            str2 = "Current";
        }
        String str3 = str2;
        String strF = this.n0.f();
        BigDecimal bigDecimal = (BigDecimal) this.f0.a.getValue();
        return new WithdrawRequest(zG ? 1 : 0, bigDecimalC, iM1, null, null, strF, bigDecimal != null ? p54.c(bigDecimal) : null, numValueOf, str, null, strQ1, str3, null, null, null, null, null, null, null, null, null, null, 4190744, null);
    }

    public final String Q1() {
        jw1 jw1Var = (jw1) this.y0.a.getValue();
        if (jw1Var == null || !jw1Var.f) {
            if (this.v0.getValue() == null) {
                return (String) this.F0.getValue();
            }
            return null;
        }
        String str = (String) this.B0.a.getValue();
        if (str == null) {
            return null;
        }
        itf0.a.a("isEasyAccount but userPhoneNumber is null", new Object[0]);
        return str;
    }

    public final jvd0 R1() {
        return ej5.c(o8i0.d(this), null, null, new gkj0(this, null), 3);
    }

    public wl50 S1(lyh lyhVar) {
        lyhVar.getClass();
        return new wl50(lyhVar, new yjj0());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void T1(int i2) {
        Iterator it;
        Object next;
        AssetData.AccountsBean accountsBean;
        jw1 jw1VarA;
        AssetData.AccountsBean accountsBean2;
        Object next2;
        Object value = this.u0.a.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        List list = cVar != null ? (List) cVar.a : null;
        lk50<List<AssetData.AccountsBean>> value2 = O1().getValue();
        lk50.c cVar2 = value2 instanceof lk50.c ? (lk50.c) value2 : null;
        List list2 = cVar2 != null ? (List) cVar2.a : null;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((jw1) next2).a != i2);
            jw1VarA = (jw1) next2;
            if (jw1VarA == null) {
                if (list2 != null) {
                    return;
                }
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((AssetData.AccountsBean) next).getBankId() != i2);
                accountsBean = (AssetData.AccountsBean) next;
                if (accountsBean != null) {
                    return;
                } else {
                    jw1VarA = kw1.a(accountsBean);
                }
            }
        } else {
            if (list2 != null) {
                return;
            }
            it = list2.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AssetData.AccountsBean) next).getBankId() != i2);
            accountsBean = (AssetData.AccountsBean) next;
            if (accountsBean != null) {
                return;
            } else {
                jw1VarA = kw1.a(accountsBean);
            }
        }
        wwd0 wwd0Var = this.v0;
        if (wwd0Var.getValue() != null && (((accountsBean2 = (AssetData.AccountsBean) wwd0Var.getValue()) == null || accountsBean2.getBankId() != i2) && wwd0Var.getValue() != null)) {
            L1();
        }
        boolean z = jw1VarA.f;
        wwd0 wwd0Var2 = this.x0;
        wwd0 wwd0Var3 = this.F0;
        if (z) {
            String str = (String) this.B0.a.getValue();
            if (str != null) {
                String strA = fu5.a("\\d(?=\\d{4})", str, "*");
                if (strA == null) {
                    strA = "--";
                }
                wwd0Var3.getClass();
                wwd0Var3.k(null, strA);
            }
        } else {
            jw1 jw1Var = (jw1) wwd0Var2.getValue();
            if (jw1Var == null || jw1Var.a != jw1VarA.a) {
                wwd0Var3.getClass();
                wwd0Var3.k(null, "");
            }
        }
        wwd0Var2.getClass();
        wwd0Var2.k(null, jw1VarA);
    }
}
