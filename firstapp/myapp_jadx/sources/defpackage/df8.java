package defpackage;

import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.pocket.deposit.PaymentNetworkData;
import com.sporty.android.core.model.pocket.deposit.PaymentNetworkItem;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.ugpay.model.BountyHintUiState;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldf8;", "Lj8i0;", "Lu290;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class df8 extends j8i0 implements u290 {
    public String A;
    public String B;
    public PaymentChannel C;
    public final ssw<o77> D;
    public final ssw E;
    public final ssw<vhg<t6e>> F;
    public final ssw G;
    public final ssw<cx> H;
    public final ssw I;
    public v8 J;
    public final ssw<String> K;
    public final ssw L;
    public BigDecimal M;
    public final ssw<Boolean> N;
    public final ssw O;
    public final ssw<List<ug30>> P;
    public final ssw Q;
    public final ssw<BountyHintUiState> R;
    public final ssw S;
    public final ku90<pdd0> T;
    public final ku90<pdd0> U;
    public final jlv<fsd> V;
    public final jlv W;
    public xrd X;
    public final v340 Y;
    public final ku90<com.sporty.android.common.uievent.a> Z;
    public final /* synthetic */ u290 a;
    public final ku90 a0;
    public final ha00 b;
    public final v340 b0;
    public final x8 c;
    public final yrd d;
    public final sr10 e;
    public final psm f;
    public final uyx i;
    public final eth0 v;
    public final c0e w;
    public BigDecimal y;
    public BigDecimal z;

    @c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$dropAlertDisplayStateFlow$1", f = "CommonMobileMoneyDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<o77, List<? extends PaymentNetworkData>, v1b<? super PaymentNetworkItem>, Object> {
        public /* synthetic */ List a;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(o77 o77Var, List<? extends PaymentNetworkData> list, v1b<? super PaymentNetworkItem> v1bVar) {
            a aVar = df8.this.new a(v1bVar);
            aVar.a = list;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            List list = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            PaymentChannel paymentChannel = df8.this.C;
            Object obj2 = null;
            if (paymentChannel != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((PaymentNetworkData) next).getPayChannelId() != paymentChannel.getPayChId());
                PaymentNetworkData paymentNetworkData = (PaymentNetworkData) next;
                if (paymentNetworkData != null) {
                    if (paymentNetworkData.getNetworks().size() == 1) {
                        return (PaymentNetworkItem) CollectionsKt.firstOrNull(paymentNetworkData.getNetworks());
                    }
                    for (Object obj3 : paymentNetworkData.getNetworks()) {
                        if (Intrinsics.g(((PaymentNetworkItem) obj3).getNetwork(), PaymentNetworkData.INSTANCE.getNetworkNameByChannelShowName(paymentChannel.getChannelShowName()))) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    return (PaymentNetworkItem) obj2;
                }
            }
            return null;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ af8 a;

        public b(af8 af8Var) {
            this.a = af8Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements lyh<uw> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ df8 b;

        /* JADX INFO: loaded from: classes6.dex */
        @c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$special$$inlined$map$1", f = "CommonMobileMoneyDepositViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: loaded from: classes6.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ df8 b;

            @c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$special$$inlined$map$1$2", f = "CommonMobileMoneyDepositViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, df8 df8Var) {
                this.a = myhVar;
                this.b = df8Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                CountryCodeName countryCode;
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
                    List list = (List) obj;
                    uw uwVar = new uw(list, !list.isEmpty() && ((countryCode = this.b.f.getCountryCode()) == CountryCodeName.TANZANIA || countryCode == CountryCodeName.ZAMBIA));
                    aVar.b = 1;
                    if (this.a.emit(uwVar, aVar) == y5bVar) {
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

        public c(lyh lyhVar, df8 df8Var) {
            this.a = lyhVar;
            this.b = df8Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uw> myhVar, v1b v1bVar) {
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
                    ib5.a(QQWMbKFOuTf.BscGbGMOIoCU);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public df8(ha00 ha00Var, x8 x8Var, yrd yrdVar, sr10 sr10Var, psm psmVar, uyx uyxVar, d100 d100Var, eth0 eth0Var, c0e c0eVar, u290 u290Var) {
        x8Var.getClass();
        yrdVar.getClass();
        sr10Var.getClass();
        psmVar.getClass();
        d100Var.getClass();
        c0eVar.getClass();
        u290Var.getClass();
        this.a = u290Var;
        this.b = ha00Var;
        this.c = x8Var;
        this.d = yrdVar;
        this.e = sr10Var;
        this.f = psmVar;
        this.i = uyxVar;
        this.v = eth0Var;
        this.w = c0eVar;
        ssw<o77> sswVar = new ssw<>();
        this.D = sswVar;
        this.E = sswVar;
        ssw<vhg<t6e>> sswVar2 = new ssw<>();
        this.F = sswVar2;
        this.G = sswVar2;
        ssw<cx> sswVar3 = new ssw<>(new cx());
        this.H = sswVar3;
        this.I = sswVar3;
        ssw<String> sswVar4 = new ssw<>();
        this.K = sswVar4;
        this.L = sswVar4;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.M = bigDecimal;
        ssw<Boolean> sswVar5 = new ssw<>();
        this.N = sswVar5;
        this.O = sswVar5;
        ssw<List<ug30>> sswVar6 = new ssw<>();
        this.P = sswVar6;
        this.Q = sswVar6;
        ssw<BountyHintUiState> sswVar7 = new ssw<>();
        this.R = sswVar7;
        this.S = sswVar7;
        ku90<pdd0> ku90Var = new ku90<>();
        this.T = ku90Var;
        this.U = ku90Var;
        jlv<fsd> jlvVar = new jlv<>();
        jlvVar.m(fsd.d);
        jlvVar.n(sswVar3, new b(new af8(0, this, jlvVar)));
        this.V = jlvVar;
        this.W = jlvVar;
        n1i n1iVar = new n1i(i2i.a(sswVar), bm50.f(sr10Var.l(pu0.b.a)), new a(null));
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.Y = e1i.e(n1iVar, et7VarD, kwd0Var, null);
        ku90<com.sporty.android.common.uievent.a> ku90Var2 = new ku90<>();
        this.Z = ku90Var2;
        this.a0 = ku90Var2;
        this.b0 = e1i.e(new f1i(new c(d100Var.Q(), this)), o8i0.d(this), kwd0Var, new uw(0));
    }

    @Override // defpackage.u290
    public final uwd0<String> x0() {
        return this.a.x0();
    }

    public final void x1(String str) {
        str.getClass();
        this.i.getClass();
        xyx xyxVarA = uyx.a(str);
        String str2 = xyxVarA.a;
        BigDecimal bigDecimal = xyxVarA.c;
        int iCompareTo = bigDecimal.compareTo(BigDecimal.ZERO);
        kcg fVar = kcg.a.b;
        if (iCompareTo != 0) {
            BigDecimal bigDecimal2 = this.z;
            if (bigDecimal2 == null) {
                Intrinsics.n("maxDepositAmount");
                throw null;
            }
            if (bigDecimal.compareTo(bigDecimal2) > 0) {
                String str3 = this.B;
                if (str3 == null) {
                    Intrinsics.n("displayMaxDepositAmount");
                    throw null;
                }
                fVar = new kcg.b(str3);
            } else {
                BigDecimal bigDecimal3 = this.y;
                if (bigDecimal3 == null) {
                    Intrinsics.n("minDepositAmount");
                    throw null;
                }
                if (bigDecimal.compareTo(bigDecimal3) < 0) {
                    String str4 = this.A;
                    if (str4 == null) {
                        Intrinsics.n("displayMinDepositAmount");
                        throw null;
                    }
                    fVar = new kcg.f(str4);
                }
            }
        }
        this.M = bigDecimal;
        this.H.m(new cx(str2, xyxVarA.b, fVar));
    }
}
