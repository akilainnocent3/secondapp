package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.FirstDepositState;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0002¨\u0006\u0003"}, d2 = {"Lmjj0;", "Lo82;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mjj0 extends o82 {
    public static final /* synthetic */ int H0 = 0;
    public final ku90<qij0> A0;
    public String B0;
    public final v340 C0;
    public final List<lyh<lk50<Object>>> D0;
    public boolean E0;
    public final v340 F0;
    public final ljj0 G0;
    public final psm h0;
    public final mgb0 i0;
    public final xqj0 j0;
    public final cj7 k0;
    public final vh7 l0;
    public final pi80 m0;
    public final sr10 n0;
    public final d100 o0;
    public final lyz p0;
    public final tt60 q0;
    public final cj r0;
    public final xmu s0;
    public final int t0;
    public final y300.a u0;
    public final wwd0 v0;
    public final v340 w0;
    public final wwd0 x0;
    public final v340 y0;
    public final v340 z0;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$1", f = "WithdrawBankV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<qij0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = mjj0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qij0 qij0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(qij0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jw1 jw1Var;
            Object value;
            Object value2;
            ijf0 ijf0Var;
            Object next;
            Object value3;
            Object value4;
            Object value5;
            qij0 qij0Var = (qij0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = qij0Var instanceof yi;
            mjj0 mjj0Var = mjj0.this;
            Object obj2 = null;
            if (z) {
                yi yiVar = (yi) qij0Var;
                cj cjVar = mjj0Var.r0;
                wwd0 wwd0Var = cjVar.o;
                wwd0 wwd0Var2 = cjVar.n;
                if (yiVar instanceof yi.a) {
                    ijf0 ijf0Var2 = ((yi.a) yiVar).a;
                    if (jm2.b(ijf0Var2)) {
                        int length = ijf0Var2.a.b.length();
                        y300.a aVar = cjVar.j;
                        if (aVar == null) {
                            Intrinsics.n("payMethod");
                            throw null;
                        }
                        if (length <= aVar.n()) {
                            do {
                                value5 = wwd0Var2.getValue();
                            } while (!wwd0Var2.g(value5, ijf0Var2));
                        }
                    }
                } else if (yiVar.equals(yi.c.a)) {
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, new ijf0((String) null, 0L, 7)));
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, null));
                } else {
                    if (!(yiVar instanceof yi.b)) {
                        uhc.a();
                        return null;
                    }
                    int i = ((yi.b) yiVar).a;
                    v340 v340Var = cjVar.h;
                    if (v340Var == null) {
                        Intrinsics.n("supportBanksStateFlow");
                        throw null;
                    }
                    Object value6 = v340Var.a.getValue();
                    lk50.c cVar = value6 instanceof lk50.c ? (lk50.c) value6 : null;
                    List list = cVar != null ? (List) cVar.a : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((jw1) next).a != i);
                        jw1Var = (jw1) next;
                        if (jw1Var == null) {
                            itf0.a.d(pe4.b(i, "Bank with bankId ", " not found in support banks list."), new Object[0]);
                            jw1Var = null;
                        }
                    } else {
                        itf0.a.d(pe4.b(i, "Bank with bankId ", " not found in support banks list."), new Object[0]);
                        jw1Var = null;
                    }
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, jw1Var));
                    do {
                        value2 = wwd0Var2.getValue();
                        if (jw1Var == null || !jw1Var.f) {
                            ijf0Var = new ijf0((String) null, 0L, 7);
                        } else {
                            v340 v340Var2 = cjVar.i;
                            if (v340Var2 == null) {
                                Intrinsics.n("userPhoneNumberFlow");
                                throw null;
                            }
                            String str = (String) v340Var2.a.getValue();
                            if (str == null) {
                                str = "";
                            }
                            ijf0Var = new ijf0(str, 0L, 6);
                        }
                    } while (!wwd0Var2.g(value2, ijf0Var));
                }
            } else if (qij0Var instanceof ru60) {
                ru60 ru60Var = (ru60) qij0Var;
                tt60 tt60Var = mjj0Var.q0;
                tt60Var.getClass();
                if (!(ru60Var instanceof ru60.a)) {
                    uhc.a();
                    return null;
                }
                Object obj3 = ((ru60.a) ru60Var).a;
                v340 v340Var3 = tt60Var.h;
                if (v340Var3 == null) {
                    Intrinsics.n("savedAssetsStateFlow");
                    throw null;
                }
                Object value7 = v340Var3.a.getValue();
                lk50.c cVar2 = value7 instanceof lk50.c ? (lk50.c) value7 : null;
                List list2 = cVar2 != null ? (List) cVar2.a : null;
                if (list2 != null) {
                    for (Object obj4 : list2) {
                        int id = ((AssetData.AccountsBean) obj4).getId();
                        if ((obj3 instanceof Integer) && id == ((Number) obj3).intValue()) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    obj2 = (AssetData.AccountsBean) obj2;
                }
                tt60Var.n.setValue(obj2);
            } else if (qij0Var instanceof tmu) {
                tmu tmuVar = (tmu) qij0Var;
                xmu xmuVar = mjj0Var.s0;
                xmuVar.getClass();
                if (tmuVar instanceof tmu.e) {
                    et7 et7Var = xmuVar.h;
                    if (et7Var == null) {
                        Intrinsics.n("scope");
                        throw null;
                    }
                    ej5.c(et7Var, null, null, new ymu(xmuVar, tmuVar, null), 3);
                } else if (tmuVar instanceof tmu.b) {
                    v340 v340Var4 = xmuVar.c;
                    if (v340Var4 == null) {
                        Intrinsics.n("savedAssetsListUiStateFlow");
                        throw null;
                    }
                    List list3 = (List) v340Var4.a.getValue();
                    if (list3.isEmpty()) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        wwd0 wwd0Var3 = xmuVar.k;
                        wwd0Var3.getClass();
                        wwd0Var3.k(null, list3);
                    }
                    Unit unit = Unit.a;
                } else if (tmuVar instanceof tmu.c) {
                    et7 et7Var2 = xmuVar.h;
                    if (et7Var2 == null) {
                        Intrinsics.n("scope");
                        throw null;
                    }
                    ej5.c(et7Var2, null, null, new zmu(null, xmuVar), 3);
                } else if (tmuVar instanceof tmu.d) {
                    et7 et7Var3 = xmuVar.h;
                    if (et7Var3 == null) {
                        Intrinsics.n("scope");
                        throw null;
                    }
                    ej5.c(et7Var3, null, null, new anu(xmuVar, tmuVar, null), 3);
                } else {
                    if (!(tmuVar instanceof tmu.a)) {
                        uhc.a();
                        return null;
                    }
                    et7 et7Var4 = xmuVar.h;
                    if (et7Var4 == null) {
                        Intrinsics.n("scope");
                        throw null;
                    }
                    ej5.c(et7Var4, null, null, new bnu(xmuVar, tmuVar, null), 3);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$2", f = "WithdrawBankV2ViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v600, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = mjj0.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v600 v600Var, v1b<? super Unit> v1bVar) {
            return ((b) create(v600Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v600 v600Var = (v600) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.b = null;
                this.a = 1;
                if (mjj0.this.O1(v600Var, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$_selectedBankStateFlow$1", f = "WithdrawBankV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<Boolean, jw1, jw1, v1b<? super jw1>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ jw1 b;
        public /* synthetic */ jw1 c;

        @Override // defpackage.iaj
        public final Object d(Boolean bool, jw1 jw1Var, jw1 jw1Var2, v1b<? super jw1> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            c cVar = new c(4, v1bVar);
            cVar.a = zBooleanValue;
            cVar.b = jw1Var;
            cVar.c = jw1Var2;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            jw1 jw1Var = this.b;
            jw1 jw1Var2 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return z ? jw1Var2 : jw1Var;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$clickNext$1", f = "WithdrawBankV2ViewModel.kt", l = {439, 447, 455, 486}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public String a;
        public mjj0 b;
        public int c;
        public int d;
        public /* synthetic */ Object e;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = mjj0.this.new d(v1bVar);
            dVar.e = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0200  */
        /* JADX WARN: Code duplicated, block: B:104:0x0208  */
        /* JADX WARN: Code duplicated, block: B:106:0x0217  */
        /* JADX WARN: Code duplicated, block: B:108:0x0226  */
        /* JADX WARN: Code duplicated, block: B:109:0x0229  */
        /* JADX WARN: Code duplicated, block: B:111:0x022d  */
        /* JADX WARN: Code duplicated, block: B:112:0x0230  */
        /* JADX WARN: Code duplicated, block: B:115:0x023c  */
        /* JADX WARN: Code duplicated, block: B:119:0x0244  */
        /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:51:0x00de A[Catch: all -> 0x0040, Exception -> 0x0043, TRY_ENTER, TryCatch #1 {Exception -> 0x0043, blocks: (B:12:0x0039, B:54:0x00f4, B:56:0x00fc, B:51:0x00de), top: B:126:0x001b, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f4 A[Catch: all -> 0x0040, Exception -> 0x0043, PHI: r0 r8
          0x00f4: PHI (r0v35 java.lang.Object) = (r0v32 java.lang.Object), (r0v39 java.lang.Object) binds: [B:52:0x00f1, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x00f4: PHI (r8v23 int) = (r8v22 int), (r8v26 int) binds: [B:52:0x00f1, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x0043, blocks: (B:12:0x0039, B:54:0x00f4, B:56:0x00fc, B:51:0x00de), top: B:126:0x001b, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00fc A[Catch: all -> 0x0040, Exception -> 0x0043, TRY_LEAVE, TryCatch #1 {Exception -> 0x0043, blocks: (B:12:0x0039, B:54:0x00f4, B:56:0x00fc, B:51:0x00de), top: B:126:0x001b, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0110 A[PHI: r8
          0x0110: PHI (r8v2 int) = (r8v3 int), (r8v22 int) binds: [B:59:0x0102, B:50:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:66:0x0124  */
        /* JADX WARN: Code duplicated, block: B:68:0x012a  */
        /* JADX WARN: Code duplicated, block: B:70:0x0141  */
        /* JADX WARN: Code duplicated, block: B:73:0x015d  */
        /* JADX WARN: Code duplicated, block: B:76:0x016a  */
        /* JADX WARN: Code duplicated, block: B:78:0x0187  */
        /* JADX WARN: Code duplicated, block: B:79:0x0191  */
        /* JADX WARN: Code duplicated, block: B:81:0x019d  */
        /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:91:0x01be  */
        /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            aoe0.b bVar;
            String str2;
            String str3;
            Object objP;
            mjj0 mjj0Var;
            aoe0.b bVar2;
            BigDecimal bigDecimal;
            jw1 jw1Var;
            String str4;
            WithdrawAlertHintStatus withdrawAlertHintStatus;
            String str5;
            String str6;
            jw1 jw1Var2;
            String str7;
            String str8;
            lk50 lk50Var;
            Object objA;
            Object objI1;
            WithdrawRequest withdrawRequestM1;
            y300.a aVar;
            Object objA2;
            mjj0 mjj0Var2 = mjj0.this;
            ku90<m480> ku90Var = mjj0Var2.y;
            v340 v340Var = mjj0Var2.F0;
            cj cjVar = mjj0Var2.r0;
            tt60 tt60Var = mjj0Var2.q0;
            wwd0 wwd0Var = mjj0Var2.x0;
            y5b y5bVar = y5b.a;
            int i = this.d;
            String str9 = null;
            try {
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        c330 c330Var = mjj0Var2.P1() ? ((ej) cjVar.m.getValue()).a : ((tu60) tt60Var.m.getValue()).a;
                        if (!(c330Var instanceof c330.a) || !((c330.a) c330Var).a) {
                            return Unit.a;
                        }
                        jw1 jw1Var3 = (jw1) v340Var.a.getValue();
                        if (jw1Var3 == null) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q("WithdrawBankV2ViewModel");
                            aVar2.a("no selected bank, return", new Object[0]);
                            return Unit.a;
                        }
                        i = jw1Var3.a;
                        vh7 vh7Var = mjj0Var2.l0;
                        ku90<com.sporty.android.common.uievent.a> ku90Var2 = mjj0Var2.f;
                        this.e = null;
                        this.c = i;
                        this.d = 1;
                        objA = vh7Var.a(ku90Var2, ku90Var, this);
                        if (objA != y5bVar) {
                        }
                        return y5bVar;
                    }
                    if (i == 1) {
                        i = this.c;
                        uj50.b(obj);
                        objA = obj;
                    } else {
                        if (i == 2) {
                            i = this.c;
                            uj50.b(obj);
                            objI1 = obj;
                            if (!((Boolean) objI1).booleanValue()) {
                                return Unit.a;
                            }
                            withdrawRequestM1 = mjj0Var2.M1();
                            if (withdrawRequestM1 == null) {
                                return Unit.a;
                            }
                            aVar = mjj0Var2.u0;
                            aVar.getClass();
                            if (kotlin.collections.a.c(CountryCodeName.NIGERIA).contains(aVar.a)) {
                                str = ((dj) cjVar.l.getValue()).d.a.b;
                                if (mjj0Var2.P1()) {
                                    bVar = ((su60) tt60Var.l.getValue()).b;
                                    if (bVar != null) {
                                        str2 = str;
                                        str3 = bVar.e;
                                    } else {
                                        str2 = str;
                                        str3 = null;
                                    }
                                } else {
                                    if (str.length() == 0) {
                                        com.sporty.android.common.uievent.b.e(mjj0Var2.f, null, null, vch0.b, null, null, null, null, 507);
                                        return Unit.a;
                                    }
                                    wwd0Var.setValue(c330.b.a);
                                    g1i g1iVarD = mjj0Var2.n0.D(i, str);
                                    this.e = null;
                                    this.a = str;
                                    this.b = mjj0Var2;
                                    this.c = i;
                                    this.d = 4;
                                    objP = bm50.p(g1iVarD, this);
                                    if (objP != y5bVar) {
                                        str2 = str;
                                        mjj0Var = mjj0Var2;
                                    }
                                }
                                if (str3 != null) {
                                    mjj0Var2.B0 = str3;
                                } else {
                                    str3 = null;
                                }
                                if (mjj0Var2.P1()) {
                                    str9 = str2;
                                } else {
                                    bVar2 = ((su60) tt60Var.l.getValue()).b;
                                    if (bVar2 != null) {
                                        str9 = bVar2.d;
                                    }
                                }
                                ku90<kqj0> ku90Var3 = mjj0Var2.d0;
                                bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                                if (bigDecimal == null) {
                                    bigDecimal = BigDecimal.ZERO;
                                }
                                BigDecimal bigDecimal2 = bigDecimal;
                                bigDecimal2.getClass();
                                BigDecimal bigDecimal3 = mjj0Var2.S.c;
                                BigDecimal bigDecimal4 = BigDecimal.ZERO;
                                bigDecimal4.getClass();
                                Object value = mjj0Var2.f0.a.getValue();
                                value.getClass();
                                BigDecimal bigDecimal5 = (BigDecimal) value;
                                jw1Var = (jw1) v340Var.a.getValue();
                                if (jw1Var != null) {
                                    str4 = "--";
                                } else {
                                    str4 = "--";
                                }
                                if (mjj0Var2.P1()) {
                                    withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                                } else {
                                    withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                                }
                                WithdrawAlertHintStatus withdrawAlertHintStatus2 = withdrawAlertHintStatus;
                                if (str9 == null) {
                                    str5 = "--";
                                } else {
                                    str5 = str9;
                                }
                                if (str3 == null) {
                                    str6 = "--";
                                } else {
                                    str6 = str3;
                                }
                                jw1Var2 = (jw1) v340Var.a.getValue();
                                if (jw1Var2 != null) {
                                    str7 = "";
                                } else {
                                    str7 = "";
                                }
                                lqj0.b(ku90Var3, new WithdrawConfirmation.Bank(bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str4, str5, str6, withdrawAlertHintStatus2, str7));
                                return Unit.a;
                            }
                            wwd0Var.setValue(c330.b.a);
                            cj7 cj7Var = mjj0Var2.k0;
                            ku90<spg0> ku90Var4 = mjj0Var2.v;
                            this.e = null;
                            this.c = i;
                            this.d = 3;
                            objA2 = cj7Var.a(withdrawRequestM1, ku90Var4, ku90Var, this);
                            if (objA2 == y5bVar) {
                                if (!((Boolean) objA2).booleanValue()) {
                                    Unit unit = Unit.a;
                                    bkj0.a(true, null, wwd0Var, null);
                                    return unit;
                                }
                                bkj0.a(true, null, wwd0Var, null);
                                str = ((dj) cjVar.l.getValue()).d.a.b;
                                if (mjj0Var2.P1()) {
                                    bVar = ((su60) tt60Var.l.getValue()).b;
                                    if (bVar != null) {
                                        str2 = str;
                                        str3 = bVar.e;
                                    } else {
                                        str2 = str;
                                        str3 = null;
                                    }
                                } else {
                                    if (str.length() == 0) {
                                        com.sporty.android.common.uievent.b.e(mjj0Var2.f, null, null, vch0.b, null, null, null, null, 507);
                                        return Unit.a;
                                    }
                                    wwd0Var.setValue(c330.b.a);
                                    g1i g1iVarD2 = mjj0Var2.n0.D(i, str);
                                    this.e = null;
                                    this.a = str;
                                    this.b = mjj0Var2;
                                    this.c = i;
                                    this.d = 4;
                                    objP = bm50.p(g1iVarD2, this);
                                    if (objP != y5bVar) {
                                        str2 = str;
                                        mjj0Var = mjj0Var2;
                                    }
                                }
                                if (str3 != null) {
                                    mjj0Var2.B0 = str3;
                                } else {
                                    str3 = null;
                                }
                                if (mjj0Var2.P1()) {
                                    str9 = str2;
                                } else {
                                    bVar2 = ((su60) tt60Var.l.getValue()).b;
                                    if (bVar2 != null) {
                                        str9 = bVar2.d;
                                    }
                                }
                                ku90<kqj0> ku90Var5 = mjj0Var2.d0;
                                bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                                if (bigDecimal == null) {
                                    bigDecimal = BigDecimal.ZERO;
                                }
                                BigDecimal bigDecimal6 = bigDecimal;
                                bigDecimal6.getClass();
                                BigDecimal bigDecimal7 = mjj0Var2.S.c;
                                BigDecimal bigDecimal8 = BigDecimal.ZERO;
                                bigDecimal8.getClass();
                                Object value2 = mjj0Var2.f0.a.getValue();
                                value2.getClass();
                                BigDecimal bigDecimal9 = (BigDecimal) value2;
                                jw1Var = (jw1) v340Var.a.getValue();
                                if (jw1Var != null) {
                                    str4 = "--";
                                } else {
                                    str4 = "--";
                                }
                                if (mjj0Var2.P1()) {
                                    withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                                } else {
                                    withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                                }
                                WithdrawAlertHintStatus withdrawAlertHintStatus3 = withdrawAlertHintStatus;
                                if (str9 == null) {
                                    str5 = "--";
                                } else {
                                    str5 = str9;
                                }
                                if (str3 == null) {
                                    str6 = "--";
                                } else {
                                    str6 = str3;
                                }
                                jw1Var2 = (jw1) v340Var.a.getValue();
                                if (jw1Var2 != null) {
                                    str7 = "";
                                } else {
                                    str7 = "";
                                }
                                lqj0.b(ku90Var5, new WithdrawConfirmation.Bank(bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, str4, str5, str6, withdrawAlertHintStatus3, str7));
                                return Unit.a;
                            }
                            return y5bVar;
                        }
                        if (i == 3) {
                            i = this.c;
                            uj50.b(obj);
                            objA2 = obj;
                            if (!((Boolean) objA2).booleanValue()) {
                                Unit unit2 = Unit.a;
                                bkj0.a(true, null, wwd0Var, null);
                                return unit2;
                            }
                            bkj0.a(true, null, wwd0Var, null);
                            str = ((dj) cjVar.l.getValue()).d.a.b;
                            if (mjj0Var2.P1()) {
                                if (str.length() == 0) {
                                    com.sporty.android.common.uievent.b.e(mjj0Var2.f, null, null, vch0.b, null, null, null, null, 507);
                                    return Unit.a;
                                }
                                wwd0Var.setValue(c330.b.a);
                                g1i g1iVarD3 = mjj0Var2.n0.D(i, str);
                                this.e = null;
                                this.a = str;
                                this.b = mjj0Var2;
                                this.c = i;
                                this.d = 4;
                                objP = bm50.p(g1iVarD3, this);
                                if (objP != y5bVar) {
                                    str2 = str;
                                    mjj0Var = mjj0Var2;
                                }
                                return y5bVar;
                            }
                            bVar = ((su60) tt60Var.l.getValue()).b;
                            if (bVar != null) {
                                str2 = str;
                                str3 = bVar.e;
                            } else {
                                str2 = str;
                                str3 = null;
                            }
                            if (str3 != null) {
                                mjj0Var2.B0 = str3;
                            } else {
                                str3 = null;
                            }
                            if (mjj0Var2.P1()) {
                                str9 = str2;
                            } else {
                                bVar2 = ((su60) tt60Var.l.getValue()).b;
                                if (bVar2 != null) {
                                    str9 = bVar2.d;
                                }
                            }
                            ku90<kqj0> ku90Var6 = mjj0Var2.d0;
                            bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                            if (bigDecimal == null) {
                                bigDecimal = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal10 = bigDecimal;
                            bigDecimal10.getClass();
                            BigDecimal bigDecimal11 = mjj0Var2.S.c;
                            BigDecimal bigDecimal12 = BigDecimal.ZERO;
                            bigDecimal12.getClass();
                            Object value3 = mjj0Var2.f0.a.getValue();
                            value3.getClass();
                            BigDecimal bigDecimal13 = (BigDecimal) value3;
                            jw1Var = (jw1) v340Var.a.getValue();
                            if (jw1Var != null || (str8 = jw1Var.c) == null) {
                                str4 = "--";
                            } else {
                                str4 = str8;
                            }
                            if (mjj0Var2.P1()) {
                                withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                            } else {
                                withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                            }
                            WithdrawAlertHintStatus withdrawAlertHintStatus4 = withdrawAlertHintStatus;
                            if (str9 == null) {
                                str5 = "--";
                            } else {
                                str5 = str9;
                            }
                            if (str3 == null) {
                                str6 = "--";
                            } else {
                                str6 = str3;
                            }
                            jw1Var2 = (jw1) v340Var.a.getValue();
                            if (jw1Var2 != null || (str7 = jw1Var2.d) == null) {
                                str7 = "";
                            }
                            lqj0.b(ku90Var6, new WithdrawConfirmation.Bank(bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, str4, str5, str6, withdrawAlertHintStatus4, str7));
                            return Unit.a;
                        }
                        if (i != 4) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mjj0Var = this.b;
                        String str10 = this.a;
                        uj50.b(obj);
                        str2 = str10;
                        objP = obj;
                    }
                    lk50Var = (lk50) objP;
                    bkj0.a(true, null, mjj0Var.x0, null);
                    if (lk50Var instanceof lk50.a) {
                        com.sporty.android.common.uievent.b.e(mjj0Var.f, null, null, ppf0.a(((lk50.a) lk50Var).a), null, null, null, null, 507);
                        return Unit.a;
                    }
                    lk50Var.getClass();
                    str3 = (String) ((lk50.c) lk50Var).a;
                    if (str3 != null) {
                        mjj0Var2.B0 = str3;
                    } else {
                        str3 = null;
                    }
                    if (mjj0Var2.P1()) {
                        str9 = str2;
                    } else {
                        bVar2 = ((su60) tt60Var.l.getValue()).b;
                        if (bVar2 != null) {
                            str9 = bVar2.d;
                        }
                    }
                    ku90<kqj0> ku90Var7 = mjj0Var2.d0;
                    bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    BigDecimal bigDecimal14 = bigDecimal;
                    bigDecimal14.getClass();
                    BigDecimal bigDecimal15 = mjj0Var2.S.c;
                    BigDecimal bigDecimal16 = BigDecimal.ZERO;
                    bigDecimal16.getClass();
                    Object value4 = mjj0Var2.f0.a.getValue();
                    value4.getClass();
                    BigDecimal bigDecimal17 = (BigDecimal) value4;
                    jw1Var = (jw1) v340Var.a.getValue();
                    if (jw1Var != null) {
                        str4 = "--";
                    } else {
                        str4 = "--";
                    }
                    if (mjj0Var2.P1()) {
                        withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                    } else {
                        withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                    }
                    WithdrawAlertHintStatus withdrawAlertHintStatus5 = withdrawAlertHintStatus;
                    if (str9 == null) {
                        str5 = "--";
                    } else {
                        str5 = str9;
                    }
                    if (str3 == null) {
                        str6 = "--";
                    } else {
                        str6 = str3;
                    }
                    jw1Var2 = (jw1) v340Var.a.getValue();
                    if (jw1Var2 != null) {
                        str7 = "";
                    } else {
                        str7 = "";
                    }
                    lqj0.b(ku90Var7, new WithdrawConfirmation.Bank(bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, str4, str5, str6, withdrawAlertHintStatus5, str7));
                    return Unit.a;
                    if (!((Boolean) objA).booleanValue()) {
                        return Unit.a;
                    }
                    this.e = null;
                    this.c = i;
                    this.d = 2;
                    objI1 = mjj0Var2.I1(this);
                    if (objI1 != y5bVar) {
                        if (!((Boolean) objI1).booleanValue()) {
                            return Unit.a;
                        }
                        withdrawRequestM1 = mjj0Var2.M1();
                        if (withdrawRequestM1 == null) {
                            return Unit.a;
                        }
                        aVar = mjj0Var2.u0;
                        aVar.getClass();
                        if (kotlin.collections.a.c(CountryCodeName.NIGERIA).contains(aVar.a)) {
                            str = ((dj) cjVar.l.getValue()).d.a.b;
                            if (mjj0Var2.P1()) {
                                bVar = ((su60) tt60Var.l.getValue()).b;
                                if (bVar != null) {
                                    str2 = str;
                                    str3 = bVar.e;
                                } else {
                                    str2 = str;
                                    str3 = null;
                                }
                            } else {
                                if (str.length() == 0) {
                                    com.sporty.android.common.uievent.b.e(mjj0Var2.f, null, null, vch0.b, null, null, null, null, 507);
                                    return Unit.a;
                                }
                                wwd0Var.setValue(c330.b.a);
                                g1i g1iVarD4 = mjj0Var2.n0.D(i, str);
                                this.e = null;
                                this.a = str;
                                this.b = mjj0Var2;
                                this.c = i;
                                this.d = 4;
                                objP = bm50.p(g1iVarD4, this);
                                if (objP != y5bVar) {
                                    str2 = str;
                                    mjj0Var = mjj0Var2;
                                    lk50Var = (lk50) objP;
                                    bkj0.a(true, null, mjj0Var.x0, null);
                                    if (lk50Var instanceof lk50.a) {
                                        com.sporty.android.common.uievent.b.e(mjj0Var.f, null, null, ppf0.a(((lk50.a) lk50Var).a), null, null, null, null, 507);
                                        return Unit.a;
                                    }
                                    lk50Var.getClass();
                                    str3 = (String) ((lk50.c) lk50Var).a;
                                }
                            }
                            if (str3 != null) {
                                mjj0Var2.B0 = str3;
                            } else {
                                str3 = null;
                            }
                            if (mjj0Var2.P1()) {
                                str9 = str2;
                            } else {
                                bVar2 = ((su60) tt60Var.l.getValue()).b;
                                if (bVar2 != null) {
                                    str9 = bVar2.d;
                                }
                            }
                            ku90<kqj0> ku90Var8 = mjj0Var2.d0;
                            bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                            if (bigDecimal == null) {
                                bigDecimal = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal18 = bigDecimal;
                            bigDecimal18.getClass();
                            BigDecimal bigDecimal19 = mjj0Var2.S.c;
                            BigDecimal bigDecimal110 = BigDecimal.ZERO;
                            bigDecimal110.getClass();
                            Object value5 = mjj0Var2.f0.a.getValue();
                            value5.getClass();
                            BigDecimal bigDecimal111 = (BigDecimal) value5;
                            jw1Var = (jw1) v340Var.a.getValue();
                            if (jw1Var != null) {
                                str4 = "--";
                            } else {
                                str4 = "--";
                            }
                            if (mjj0Var2.P1()) {
                                withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                            } else {
                                withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                            }
                            WithdrawAlertHintStatus withdrawAlertHintStatus6 = withdrawAlertHintStatus;
                            if (str9 == null) {
                                str5 = "--";
                            } else {
                                str5 = str9;
                            }
                            if (str3 == null) {
                                str6 = "--";
                            } else {
                                str6 = str3;
                            }
                            jw1Var2 = (jw1) v340Var.a.getValue();
                            if (jw1Var2 != null) {
                                str7 = "";
                            } else {
                                str7 = "";
                            }
                            lqj0.b(ku90Var8, new WithdrawConfirmation.Bank(bigDecimal18, bigDecimal19, bigDecimal110, bigDecimal111, str4, str5, str6, withdrawAlertHintStatus6, str7));
                            return Unit.a;
                        }
                        wwd0Var.setValue(c330.b.a);
                        cj7 cj7Var2 = mjj0Var2.k0;
                        ku90<spg0> ku90Var9 = mjj0Var2.v;
                        this.e = null;
                        this.c = i;
                        this.d = 3;
                        objA2 = cj7Var2.a(withdrawRequestM1, ku90Var9, ku90Var, this);
                        if (objA2 == y5bVar) {
                            if (!((Boolean) objA2).booleanValue()) {
                                Unit unit3 = Unit.a;
                                bkj0.a(true, null, wwd0Var, null);
                                return unit3;
                            }
                            bkj0.a(true, null, wwd0Var, null);
                            str = ((dj) cjVar.l.getValue()).d.a.b;
                            if (mjj0Var2.P1()) {
                                bVar = ((su60) tt60Var.l.getValue()).b;
                                if (bVar != null) {
                                    str2 = str;
                                    str3 = bVar.e;
                                } else {
                                    str2 = str;
                                    str3 = null;
                                }
                            } else {
                                if (str.length() == 0) {
                                    com.sporty.android.common.uievent.b.e(mjj0Var2.f, null, null, vch0.b, null, null, null, null, 507);
                                    return Unit.a;
                                }
                                wwd0Var.setValue(c330.b.a);
                                g1i g1iVarD5 = mjj0Var2.n0.D(i, str);
                                this.e = null;
                                this.a = str;
                                this.b = mjj0Var2;
                                this.c = i;
                                this.d = 4;
                                objP = bm50.p(g1iVarD5, this);
                                if (objP != y5bVar) {
                                    str2 = str;
                                    mjj0Var = mjj0Var2;
                                    lk50Var = (lk50) objP;
                                    bkj0.a(true, null, mjj0Var.x0, null);
                                    if (lk50Var instanceof lk50.a) {
                                        com.sporty.android.common.uievent.b.e(mjj0Var.f, null, null, ppf0.a(((lk50.a) lk50Var).a), null, null, null, null, 507);
                                        return Unit.a;
                                    }
                                    lk50Var.getClass();
                                    str3 = (String) ((lk50.c) lk50Var).a;
                                }
                            }
                            if (str3 != null) {
                                mjj0Var2.B0 = str3;
                            } else {
                                str3 = null;
                            }
                            if (mjj0Var2.P1()) {
                                str9 = str2;
                            } else {
                                bVar2 = ((su60) tt60Var.l.getValue()).b;
                                if (bVar2 != null) {
                                    str9 = bVar2.d;
                                }
                            }
                            ku90<kqj0> ku90Var10 = mjj0Var2.d0;
                            bigDecimal = (BigDecimal) mjj0Var2.Q.a.getValue();
                            if (bigDecimal == null) {
                                bigDecimal = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal112 = bigDecimal;
                            bigDecimal112.getClass();
                            BigDecimal bigDecimal113 = mjj0Var2.S.c;
                            BigDecimal bigDecimal114 = BigDecimal.ZERO;
                            bigDecimal114.getClass();
                            Object value6 = mjj0Var2.f0.a.getValue();
                            value6.getClass();
                            BigDecimal bigDecimal115 = (BigDecimal) value6;
                            jw1Var = (jw1) v340Var.a.getValue();
                            if (jw1Var != null) {
                                str4 = "--";
                            } else {
                                str4 = "--";
                            }
                            if (mjj0Var2.P1()) {
                                withdrawAlertHintStatus = ((dj) cjVar.l.getValue()).g.a;
                            } else {
                                withdrawAlertHintStatus = ((su60) tt60Var.l.getValue()).e.a;
                            }
                            WithdrawAlertHintStatus withdrawAlertHintStatus7 = withdrawAlertHintStatus;
                            if (str9 == null) {
                                str5 = "--";
                            } else {
                                str5 = str9;
                            }
                            if (str3 == null) {
                                str6 = "--";
                            } else {
                                str6 = str3;
                            }
                            jw1Var2 = (jw1) v340Var.a.getValue();
                            if (jw1Var2 != null) {
                                str7 = "";
                            } else {
                                str7 = "";
                            }
                            lqj0.b(ku90Var10, new WithdrawConfirmation.Bank(bigDecimal112, bigDecimal113, bigDecimal114, bigDecimal115, str4, str5, str6, withdrawAlertHintStatus7, str7));
                            return Unit.a;
                        }
                    }
                    return y5bVar;
                } catch (Exception e) {
                    itf0.a.e(e);
                }
            } catch (Throwable th) {
                bkj0.a(true, null, wwd0Var, null);
                throw th;
            }
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$savedAssetsStateFlow$1", f = "WithdrawBankV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<lk50<? extends AssetData>, lk50<? extends List<? extends jw1>>, v1b<? super lk50<? extends AssetData>>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ lk50 b;

        @Override // defpackage.gaj
        public final Object invoke(lk50<? extends AssetData> lk50Var, lk50<? extends List<? extends jw1>> lk50Var2, v1b<? super lk50<? extends AssetData>> v1bVar) {
            e eVar = new e(3, v1bVar);
            eVar.a = lk50Var;
            eVar.b = lk50Var2;
            return eVar.invokeSuspend(Unit.a);
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
            return bm50.l(lk50Var, new s9b(obj2, 2));
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$shouldShowFirstDepositMaskStateFlow$2", f = "WithdrawBankV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = mjj0.this.new f(v1bVar);
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
                mjj0 mjj0Var = mjj0.this;
                ej5.c(o8i0.d(mjj0Var), null, null, new rjj0(mjj0Var, null), 3);
            }
            return Unit.a;
        }
    }

    public static final class g implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;
        public final /* synthetic */ mjj0 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$1", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ mjj0 b;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$1$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, mjj0 mjj0Var) {
                this.a = myhVar;
                this.b = mjj0Var;
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
                    Boolean boolValueOf = Boolean.valueOf(this.b.u0.q() && ((WithdrawalPinStatusInfo) obj).getSportyPinStatus() == SportyPinStatus.Disabled);
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

        public g(vl50 vl50Var, mjj0 mjj0Var) {
            this.a = vl50Var;
            this.b = mjj0Var;
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
                b bVar = new b(myhVar, this.b);
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

    public static final class h implements lyh<Integer> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ mjj0 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$2", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ mjj0 b;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$2$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, mjj0 mjj0Var) {
                this.a = myhVar;
                this.b = mjj0Var;
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
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    mjj0 mjj0Var = this.b;
                    Integer num = new Integer(zBooleanValue ? mjj0Var.u0.e() : mjj0Var.t0);
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

        public h(wwd0 wwd0Var, mjj0 mjj0Var) {
            this.a = wwd0Var;
            this.b = mjj0Var;
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

    public static final class i implements lyh<String> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$3", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$3$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    AccountInfo accountInfo = (AccountInfo) obj;
                    String phone = accountInfo != null ? accountInfo.getPhone() : null;
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

        public i(lyh lyhVar) {
            this.a = lyhVar;
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

    public static final class j implements lyh<List<? extends aoe0.b>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$4", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$4$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    List<aoe0.b> list = ((su60) obj).a;
                    aVar.b = 1;
                    if (this.a.emit(list, aVar) == y5bVar) {
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

        public j(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends aoe0.b>> myhVar, v1b v1bVar) {
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

    public static final class k implements lyh<List<? extends aoe0.a>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$5", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return k.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$5$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    List<aoe0.a> list = ((dj) obj).b;
                    aVar.b = 1;
                    if (this.a.emit(list, aVar) == y5bVar) {
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

        public k(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends aoe0.a>> myhVar, v1b v1bVar) {
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

    public static final class l implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$6", f = "WithdrawBankV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return l.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$special$$inlined$map$6$2", f = "WithdrawBankV2ViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public l(vl50 vl50Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v22, types: [ljj0] */
    public mjj0(psm psmVar, mgb0 mgb0Var, xqj0 xqj0Var, cj7 cj7Var, vh7 vh7Var, uyx uyxVar, juh0 juh0Var, shj0 shj0Var, pi80 pi80Var, phj0 phj0Var, wl wlVar, sr10 sr10Var, uy0 uy0Var, d100 d100Var, lyz lyzVar, tt60 tt60Var, cj cjVar, xmu xmuVar) {
        String strValueOf;
        pu0.b bVar;
        sr10 sr10Var2;
        lyh gzhVar;
        super(uyxVar, juh0Var, uy0Var, sr10Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, shj0Var);
        psmVar.getClass();
        mgb0Var.getClass();
        wlVar.getClass();
        sr10Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        this.h0 = psmVar;
        this.i0 = mgb0Var;
        this.j0 = xqj0Var;
        this.k0 = cj7Var;
        this.l0 = vh7Var;
        this.m0 = pi80Var;
        this.n0 = sr10Var;
        this.o0 = d100Var;
        this.p0 = lyzVar;
        this.q0 = tt60Var;
        this.r0 = cjVar;
        this.s0 = xmuVar;
        c100 c100Var = c100.e;
        this.t0 = 1;
        y300.a aVar = new y300.a(psmVar.getCountryCode());
        this.u0 = aVar;
        wwd0 wwd0VarA = xwd0.a(tzs.a.a);
        pu0.b bVar2 = pu0.b.a;
        g gVar = new g(bm50.f(lyzVar.i0(bVar2)), this);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.TRUE);
        this.v0 = wwd0VarA2;
        h hVar = new h(wwd0VarA2, this);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.w0 = e1i.e(hVar, et7VarD, kwd0Var, 0);
        CountryCodeName countryCode = psmVar.getCountryCode();
        countryCode.getClass();
        int i2 = y300.a.C1320a.a[countryCode.ordinal()];
        if (i2 == 1) {
            strValueOf = "GTBank-gateway-GhIPSS";
        } else if (i2 != 3) {
            strValueOf = null;
        } else {
            c100 c100Var2 = c100.e;
            strValueOf = String.valueOf(26003);
        }
        wl50 wl50Var = new wl50(sr10Var.k(bVar2, strValueOf), new kjj0());
        et7 et7VarD2 = o8i0.d(this);
        lk50.b bVar3 = lk50.b.a;
        v340 v340VarE = e1i.e(wl50Var, et7VarD2, kwd0Var, bVar3);
        v340 v340VarE2 = e1i.e(new wl50(new n1i(sr10Var.X(bVar2), v340VarE, new e(3, null)), new m5u(1)), o8i0.d(this), kwd0Var, bVar3);
        wwd0 wwd0VarA3 = zjj0.a(null, false);
        this.x0 = wwd0VarA3;
        v340 v340VarE3 = e1i.e(new i(mgb0Var.getAccountInfoFlow()), o8i0.d(this), kwd0Var, null);
        this.y0 = v340VarE3;
        j jVar = new j(tt60Var.l);
        et7 et7VarD3 = o8i0.d(this);
        m2g m2gVar = m2g.a;
        lwd0 lwd0Var = q490.a.b;
        v340 v340VarE4 = e1i.e(jVar, et7VarD3, lwd0Var, m2gVar);
        this.z0 = e1i.e(new k(cjVar.l), o8i0.d(this), lwd0Var, m2gVar);
        ku90 ku90Var = new ku90();
        ku90<qij0> ku90Var2 = new ku90<>();
        this.A0 = ku90Var2;
        lyh<BigDecimal> lyhVarY1 = y1();
        g1i g1iVar = this.T;
        v340 v340Var = this.O;
        lyh<xhj0> lyhVarH1 = H1();
        v340 v340Var2 = this.Y;
        et7 et7VarD4 = o8i0.d(this);
        g1iVar.getClass();
        v340Var.getClass();
        lyhVarH1.getClass();
        v340Var2.getClass();
        tt60Var.a = gVar;
        tt60Var.b = (o82.a) lyhVarY1;
        tt60Var.c = g1iVar;
        tt60Var.d = v340Var;
        tt60Var.e = wwd0VarA3;
        tt60Var.f = lyhVarH1;
        tt60Var.g = v340Var2;
        tt60Var.h = v340VarE2;
        tt60Var.i = wwd0VarA;
        tt60Var.j = aVar;
        tt60Var.k = et7VarD4;
        tt60Var.t.invoke();
        v340 v340Var3 = this.Y;
        lyh<BigDecimal> lyhVarY2 = y1();
        g1i g1iVar2 = this.T;
        v340 v340Var4 = this.O;
        lyh<xhj0> lyhVarH2 = H1();
        et7 et7VarD5 = o8i0.d(this);
        g1iVar2.getClass();
        v340Var4.getClass();
        lyhVarH2.getClass();
        v340Var3.getClass();
        cjVar.a = gVar;
        cjVar.b = (o82.a) lyhVarY2;
        cjVar.c = g1iVar2;
        cjVar.d = v340Var4;
        cjVar.e = wwd0VarA3;
        cjVar.f = lyhVarH2;
        cjVar.g = v340Var3;
        cjVar.h = v340VarE;
        cjVar.i = v340VarE3;
        cjVar.j = aVar;
        cjVar.k = et7VarD5;
        cjVar.t.invoke();
        ku90<com.sporty.android.common.uievent.a> ku90Var3 = this.f;
        et7 et7VarD6 = o8i0.d(this);
        ku90Var3.getClass();
        xmuVar.b = v340VarE2;
        xmuVar.c = v340VarE4;
        xmuVar.d = wwd0VarA;
        xmuVar.e = ku90Var;
        xmuVar.f = ku90Var3;
        xmuVar.g = aVar;
        xmuVar.h = et7VarD6;
        xmuVar.m.invoke();
        kzh.d(new g1i(ku90Var2, new a(null)), o8i0.d(this));
        kzh.d(new g1i(ku90Var, new b(null)), o8i0.d(this));
        if (aVar.o()) {
            bVar = bVar2;
            sr10Var2 = sr10Var;
            gzhVar = bm50.a(uzh.b(new l(bm50.f(sr10Var2.b(bVar)))));
        } else {
            bVar = bVar2;
            sr10Var2 = sr10Var;
            gzhVar = new gzh(new lk50.c(Boolean.FALSE));
        }
        v340 v340VarE5 = e1i.e(new g1i(gzhVar, new f(null)), o8i0.d(this), lwd0Var, bVar3);
        this.C0 = v340VarE5;
        this.D0 = kotlin.collections.b.k(v340VarE, v340VarE2, this.P, sr10Var2.j0(bVar), v340VarE5, d100Var.a(bVar));
        this.F0 = e1i.e(r1i.a(wwd0VarA2, tt60Var.o, cjVar.q, new c(4, null)), o8i0.d(this), kwd0Var, null);
        this.G0 = new iaj() { // from class: ljj0
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String strA;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Integer num = (Integer) obj4;
                m8h0Var.getClass();
                mjj0 mjj0Var = this.a;
                ku90<spg0> ku90Var4 = mjj0Var.v;
                log0 log0Var = log0.b;
                psm psmVar2 = mjj0Var.h0;
                String strF = psmVar2.f();
                BigDecimal bigDecimal = mjj0Var.S.c;
                Object value = mjj0Var.f0.a.getValue();
                value.getClass();
                BigDecimal bigDecimal2 = (BigDecimal) value;
                v340 v340Var5 = mjj0Var.F0;
                jw1 jw1Var = (jw1) v340Var5.a.getValue();
                String str2 = jw1Var != null ? jw1Var.c : null;
                jw1 jw1Var2 = (jw1) v340Var5.a.getValue();
                String str3 = jw1Var2 != null ? jw1Var2.d : null;
                String strN1 = mjj0Var.N1();
                if (strN1 == null || (strA = fu5.a("\\d(?=\\d{4})", strN1, "*")) == null) {
                    strA = "--";
                }
                String str4 = mjj0Var.B0;
                if (str4 == null) {
                    Intrinsics.n("bankAccountName");
                    throw null;
                }
                String str5 = strA;
                String strA2 = fu5.a("(?<=\\d{4})\\d", str4, "*");
                vpg0.c(ku90Var4, new TxSuccessParams.Bank(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, str2, str3, str5, strA2 == null ? "--" : strA2, num, psmVar2.getCountryCode() != CountryCodeName.SOUTH_AFRICA));
                b.b(mjj0Var.f);
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.D0;
    }

    @Override // defpackage.k72
    public final y200 B1() {
        return this.u0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return kotlin.collections.b.k(ej5.c(o8i0.d(this), null, null, new ojj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new pjj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new sjj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new qjj0(this, null), 3));
    }

    @Override // defpackage.o82
    public final uwd0<Integer> G1() {
        return this.w0;
    }

    @Override // defpackage.o82
    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new tjj0(this, null), 3);
    }

    public final c9p L1() {
        return ej5.c(o8i0.d(this), null, null, new d(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public final WithdrawRequest M1() {
        Integer num;
        jw1 jw1Var = (jw1) this.F0.a.getValue();
        if (jw1Var == null) {
            return null;
        }
        int i2 = jw1Var.a;
        BigDecimal bigDecimalC = p54.c(this.S.c);
        int iIntValue = ((Number) this.w0.a.getValue()).intValue();
        if (P1()) {
            num = null;
        } else {
            aoe0.b bVar = ((su60) this.q0.l.getValue()).b;
            Object obj = bVar != null ? bVar.a : null;
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
        }
        String strN1 = N1();
        String strB = this.h0.B();
        BigDecimal bigDecimal = (BigDecimal) this.f0.a.getValue();
        return new WithdrawRequest(0, bigDecimalC, iIntValue, null, null, strB, bigDecimal != null ? p54.c(bigDecimal) : null, num, null, Integer.valueOf(i2), strN1, null, null, null, null, null, null, null, null, null, null, null, 4192536, null);
    }

    public final String N1() {
        jw1 jw1Var = (jw1) this.F0.a.getValue();
        if (jw1Var != null && jw1Var.f) {
            String str = (String) this.y0.a.getValue();
            if (str != null) {
                return str;
            }
            itf0.a.a("isEasyAccount but userPhoneNumber is null", new Object[0]);
            return null;
        }
        if (P1()) {
            return ((dj) this.r0.l.getValue()).d.a.b;
        }
        aoe0.b bVar = ((su60) this.q0.l.getValue()).b;
        if (bVar != null) {
            return bVar.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O1(v600 v600Var, x1b x1bVar) {
        njj0 njj0Var;
        if (x1bVar instanceof njj0) {
            njj0Var = (njj0) x1bVar;
            int i2 = njj0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                njj0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                njj0Var = new njj0(this, x1bVar);
            }
        } else {
            njj0Var = new njj0(this, x1bVar);
        }
        Object obj = njj0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = njj0Var.d;
        if (i3 == 0) {
            uj50.b(obj);
            if (!Intrinsics.g(v600Var, v600.a.a)) {
                if (v600Var instanceof v600.b) {
                    UiText uiText = ((v600.b) v600Var).a;
                    if (uiText == null) {
                        return Unit.a;
                    }
                    com.sporty.android.common.uievent.b.i(this.f, uiText, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    if (!(v600Var instanceof v600.c)) {
                        uhc.a();
                        return null;
                    }
                    jvd0 jvd0VarC = ej5.c(o8i0.d(this), null, null, new qjj0(this, null), 3);
                    njj0Var.a = (v600.c) v600Var;
                    njj0Var.d = 1;
                    if (jvd0VarC.join(njj0Var) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        v600Var = njj0Var.a;
        uj50.b(obj);
        UiText uiText2 = ((v600.c) v600Var).a;
        if (uiText2 == null) {
            return Unit.a;
        }
        com.sporty.android.common.uievent.b.i(this.f, uiText2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        return Unit.a;
    }

    public final boolean P1() {
        return ((Boolean) this.v0.getValue()).booleanValue();
    }

    public final void Q1(ijf0 ijf0Var) {
        if (jm2.b(ijf0Var)) {
            x1(ijf0Var.a.b);
        }
    }
}
