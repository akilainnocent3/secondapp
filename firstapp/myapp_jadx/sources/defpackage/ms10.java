package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.pocket.common.ClabeType;
import com.sporty.android.core.model.pocket.common.TradeAdditionalRequest;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountCreateDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountCreateRequest;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountCreateResult;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountDeleteResult;
import com.sporty.android.core.model.pocket.deposit.sportybank.DedicatedAccountRetryResult;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankAccountDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankAccountStatus;
import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import com.sporty.android.core.model.pocket.globalpay.pix.PixAuthorizedBanksResponse;
import com.sporty.android.core.model.pocket.globalpay.pix.PixPopularBanksResponse;
import com.sporty.android.core.model.pocket.withdraw.WithdrawNoticeData;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sporty.android.core.model.pocket.withdraw.partner.PartnerWithdrawRequest;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferRequest;
import com.sporty.android.core.model.realsports.TransactionStatus;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ms10 implements sr10, fjt {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final int T;
    public final HashMap<String, chj0> U;
    public final int V;
    public final HashMap<String, god> W;
    public final wwd0 X;
    public final wwd0 Y;
    public final pr10 a;
    public final uqm b;
    public final mgb0 c;
    public final psm d;
    public final wo5 e;
    public final JsonSerializeService f;
    public final b700 i;
    public final wsm v;
    public final k5b w;
    public final gzh y;
    public final wwd0 z;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getAllSportyBankList$1", f = "PocketRepositoryImpl.kt", l = {1023}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super List<? extends SportyBankDto>>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return ms10.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends SportyBankDto>> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pr10 pr10Var = ms10.this.a;
                this.a = 1;
                obj = pr10Var.S(this);
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
            return n52.b((BaseResponse) obj);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getWithdrawNotice$1", f = "PocketRepositoryImpl.kt", l = {184, 184}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<WithdrawNoticeData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ms10.this.new b(v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<WithdrawNoticeData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L42
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                ms10 r7 = defpackage.ms10.this
                pr10 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.L(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ms10.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ms10(pr10 pr10Var, uqm uqmVar, mgb0 mgb0Var, psm psmVar, rdt rdtVar, wo5 wo5Var, JsonSerializeService jsonSerializeService, b700 b700Var, wsm wsmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        pr10Var.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        psmVar.getClass();
        wo5Var.getClass();
        jsonSerializeService.getClass();
        b700Var.getClass();
        wsmVar.getClass();
        this.a = pr10Var;
        this.b = uqmVar;
        this.c = mgb0Var;
        this.d = psmVar;
        this.e = wo5Var;
        this.f = jsonSerializeService;
        this.i = b700Var;
        this.v = wsmVar;
        this.w = k5bVar;
        uqmVar.addLogoutEventListener(this);
        this.y = new gzh(t8h0.a.a(psmVar.getCountryCode()));
        lk50.b bVar = lk50.b.a;
        this.z = xwd0.a(bVar);
        this.A = xwd0.a(bVar);
        this.B = xwd0.a(bVar);
        this.C = xwd0.a(bVar);
        this.D = xwd0.a(bVar);
        this.E = xwd0.a(bVar);
        this.F = xwd0.a(bVar);
        this.G = xwd0.a(bVar);
        this.H = xwd0.a(bVar);
        this.I = xwd0.a(bVar);
        this.J = xwd0.a(bVar);
        this.K = xwd0.a(bVar);
        this.L = xwd0.a(bVar);
        this.M = xwd0.a(bVar);
        this.N = xwd0.a(bVar);
        this.O = xwd0.a(bVar);
        this.P = xwd0.a(bVar);
        this.Q = xwd0.a(bVar);
        this.R = xwd0.a(bVar);
        this.S = xwd0.a(bVar);
        this.T = 300000;
        this.U = new HashMap<>();
        this.V = 60000;
        this.W = new HashMap<>();
        this.X = xwd0.a(bVar);
        this.Y = xwd0.a(bVar);
    }

    @Override // defpackage.sr10
    public final Object A(String str, hj7 hj7Var) {
        return ctb.d(this.v, "PocketRepo", "checkTransactionStatusConfig", new ds10(this, str, null), hj7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr10
    public final Object B(x1b x1bVar) {
        it10 it10Var;
        if (x1bVar instanceof it10) {
            it10Var = (it10) x1bVar;
            int i = it10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                it10Var.c = i - Integer.MIN_VALUE;
            } else {
                it10Var = new it10(this, x1bVar);
            }
        } else {
            it10Var = new it10(this, x1bVar);
        }
        Object objS0 = it10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = it10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objS0);
                pr10 pr10Var = this.a;
                it10Var.c = 1;
                objS0 = pr10Var.s0(it10Var);
                if (objS0 == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objS0);
            }
            return ((PixPopularBanksResponse) n52.b((BaseResponse) objS0)).getListBank();
        } catch (Exception e) {
            ctb.a(this.v, "PocketRepo", "getPixPopularBanks", null, e);
            return m2g.a;
        }
    }

    @Override // defpackage.sr10
    public final Object C(int i, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, ag6 ag6Var) {
        return ctb.d(this.v, "PocketRepo", "card3DSAuthPayer", new vr10(this, i, bigDecimal, str, str2, str3, num, str4, null), ag6Var);
    }

    @Override // defpackage.sr10
    public final g1i D(int i, String str) {
        str.getClass();
        return ctb.c(ozh.c(new wl50(bm50.a(new or60(new au10(i, null, this, str))), new ur10()), this.w), "resolveBankAccountNameByBankId", this.v);
    }

    @Override // defpackage.sr10
    public final Object E(int i, x1b x1bVar) {
        return ctb.d(this.v, "PocketRepo", "deleteBankAsset", new gs10(this, i, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final lyh<lk50<List<SportyBankDto>>> F(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(su0.a(this.Q, pu0Var, new a(null)), this.w);
    }

    @Override // defpackage.sr10
    public final g1i G(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.M, pu0Var, new us10(this, null)), this.w), "getDepositCardSavedAssets", this.v);
    }

    @Override // defpackage.sr10
    public final Object H(j4k j4kVar) {
        return ctb.d(this.v, "PocketRepo", "getClabe", new qs10(this, null), j4kVar);
    }

    @Override // defpackage.sr10
    public final Object I(WithdrawRequest withdrawRequest, boolean z, x1b x1bVar) {
        return ctb.d(this.v, "PocketRepo", "withdraw", new gu10(this, withdrawRequest, z, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final Object J(int i, tje0 tje0Var, String str) {
        return ctb.d(this.v, "PocketRepo", "getTxDetails", new nt10(i, null, this, str), tje0Var);
    }

    @Override // defpackage.sr10
    public final lyh<BaseResponse<WithdrawNoticeData>> K() {
        return ozh.c(new or60(new b(null)), this.w);
    }

    @Override // defpackage.sr10
    public final g1i L(String str, String str2) {
        str.getClass();
        return ctb.c(ozh.c(new wl50(bm50.a(new or60(new zt10(this, str, str2, null))), new whx(1)), this.w), "resolveBankAccountName", this.v);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr10
    public final Object M(x1b x1bVar) {
        jt10 jt10Var;
        if (x1bVar instanceof jt10) {
            jt10Var = (jt10) x1bVar;
            int i = jt10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jt10Var.c = i - Integer.MIN_VALUE;
            } else {
                jt10Var = new jt10(this, x1bVar);
            }
        } else {
            jt10Var = new jt10(this, x1bVar);
        }
        Object objX = jt10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jt10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objX);
                pr10 pr10Var = this.a;
                jt10Var.c = 1;
                objX = pr10Var.X(jt10Var);
                if (objX == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objX);
            }
            return ((PixAuthorizedBanksResponse) n52.b((BaseResponse) objX)).getListBank();
        } catch (Exception e) {
            ctb.a(this.v, "PocketRepo", "getPixSupportedBanks", null, e);
            return m2g.a;
        }
    }

    @Override // defpackage.sr10
    public final Object N(String str, ztz ztzVar) {
        return this.a.e0(str, ztzVar);
    }

    @Override // defpackage.sr10
    public final Object O(j6k j6kVar) {
        return ej5.d(this.w, new xs10(this, null), j6kVar);
    }

    @Override // defpackage.sr10
    public final Object Q(String str, ClabeType clabeType, uwb uwbVar) {
        return ctb.d(this.v, "PocketRepo", "createClabeBankAccount", new es10(this, str, clabeType, null), uwbVar);
    }

    @Override // defpackage.sr10
    public final g1i R(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.K, pu0Var, new zs10(this, null)), this.w), "getDepositMomoSupportChannels", this.v);
    }

    @Override // defpackage.sr10
    public final Object S(int i, int i2, int i3, tje0 tje0Var) {
        return ctb.d(this.v, "PocketRepo", "setBankAssetAsDefault", new du10(this, i, i2, i3, null), tje0Var);
    }

    @Override // defpackage.sr10
    public final Object T(String str, vtz vtzVar) {
        return this.a.v(str, vtzVar);
    }

    @Override // defpackage.sr10
    public final Object U(fel felVar) {
        return ctb.d(this.v, "PocketRepo", "getFirstDepositSuccessData", new et10(this, null), felVar);
    }

    @Override // defpackage.sr10
    public final Object V(String str, w5h0 w5h0Var) {
        return ctb.d(this.v, "PocketRepo", "fixStatusUssd", new ls10(this, str, null), w5h0Var);
    }

    @Override // defpackage.sr10
    public final g1i W(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.J, pu0Var, new ys10(this, null)), this.w), "getDepositMomoSavedAssets", this.v);
    }

    @Override // defpackage.sr10
    public final g1i X(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.D, pu0Var, new pt10(this, null)), this.w), "getWithdrawBankSavedAssets", this.v);
    }

    @Override // defpackage.sr10
    public final Object Y(WithdrawRequest withdrawRequest, bj7 bj7Var) {
        return ctb.d(this.v, "PocketRepo", "checkIsAssetNameRisky", new bs10(this, withdrawRequest, null), bj7Var);
    }

    @Override // defpackage.sr10
    public final Object Z(PartnerWithdrawRequest partnerWithdrawRequest, rnj0 rnj0Var) {
        return ctb.d(this.v, "PocketRepo", "partnerWithdraw", new wt10(this, partnerWithdrawRequest, null), rnj0Var);
    }

    @Override // defpackage.sr10
    public final lyh<String> a(log0 log0Var) {
        log0Var.getClass();
        return (this.b.isLogin() && kotlin.collections.b.k(CountryCodeName.NIGERIA, CountryCodeName.GHANA).contains(this.d.getCountryCode())) ? this.i.a(log0Var) : new gzh(null);
    }

    @Override // defpackage.sr10
    public final g1i a0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.G, pu0Var, new bt10(this, null)), this.w), "getDepositSupportBanks", this.v);
    }

    @Override // defpackage.sr10
    public final g1i b(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.B, pu0Var, new dt10(this, null)), this.w), "getFirstDepositState", this.v);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr10
    public final Object b0(long j, x1b x1bVar) {
        hs10 hs10Var;
        Object bVar;
        if (x1bVar instanceof hs10) {
            hs10Var = (hs10) x1bVar;
            int i = hs10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hs10Var.c = i - Integer.MIN_VALUE;
            } else {
                hs10Var = new hs10(this, x1bVar);
            }
        } else {
            hs10Var = new hs10(this, x1bVar);
        }
        Object objQ = hs10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = hs10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                pr10 pr10Var = this.a;
                hs10Var.c = 1;
                objQ = pr10Var.Q(j, hs10Var);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            BaseResponse baseResponse = (BaseResponse) objQ;
            bVar = baseResponse.isSuccessful() ? DedicatedAccountDeleteResult.Success.INSTANCE : new DedicatedAccountDeleteResult.Failure(null, baseResponse.message, 1, null);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, "deleteDedicatedAccount went error", new Object[0]);
        }
        return zi50.a(bVar) == null ? bVar : DedicatedAccountDeleteResult.FetchFailure.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr10
    public final Object c(long j, x1b x1bVar) {
        cu10 cu10Var;
        Object bVar;
        if (x1bVar instanceof cu10) {
            cu10Var = (cu10) x1bVar;
            int i = cu10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cu10Var.c = i - Integer.MIN_VALUE;
            } else {
                cu10Var = new cu10(this, x1bVar);
            }
        } else {
            cu10Var = new cu10(this, x1bVar);
        }
        Object objI0 = cu10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = cu10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objI0);
                zi50.a aVar = zi50.b;
                pr10 pr10Var = this.a;
                cu10Var.c = 1;
                objI0 = pr10Var.i0(j, cu10Var);
                if (objI0 == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objI0);
            }
            BaseResponse baseResponse = (BaseResponse) objI0;
            int i3 = baseResponse.bizCode;
            if (i3 != 10000) {
                bVar = i3 != 76106 ? new DedicatedAccountRetryResult.Failed(baseResponse.message) : DedicatedAccountRetryResult.NeedBVN.INSTANCE;
            } else {
                bVar = DedicatedAccountRetryResult.Success.INSTANCE;
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, "retry SportyBank went error", new Object[0]);
        }
        return zi50.a(bVar) == null ? bVar : DedicatedAccountRetryResult.FetchFailed.INSTANCE;
    }

    @Override // defpackage.sr10
    public final e77 c0(pu0 pu0Var) {
        pu0Var.getClass();
        return r0i.e(this.y, bm50.f(u0(pu0Var)));
    }

    @Override // defpackage.sr10
    public final Object d(int i, h4k h4kVar) {
        return ctb.d(this.v, "PocketRepo", "getClabeBankAccounts", new rs10(this, i, null), h4kVar);
    }

    @Override // defpackage.sr10
    public final void d0(et7 et7Var) throws Exception {
        Object bVar;
        Object bVar2;
        Object bVar3;
        Object bVar4;
        zi50.b bVar5;
        Object bVar6;
        Object bVar7;
        Object bVar8;
        Object bVar9;
        zi50.b bVar10;
        x300 x300Var;
        x300 x300Var2;
        String strValueOf;
        Object obj = "10";
        if (this.b.isLogin()) {
            kzh.d(b(new pu0.a(0)), et7Var);
            j(et7Var);
            psm psmVar = this.d;
            CountryCodeName countryCode = psmVar.getCountryCode();
            try {
                zi50.a aVar = zi50.b;
                if (!psmVar.O()) {
                    countryCode.getClass();
                    int i = y300.a.C1320a.a[countryCode.ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodWithdraw.Bank");
                    }
                }
                bVar = Unit.a;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (!(bVar instanceof zi50.b)) {
                CountryCodeName countryCode2 = psmVar.getCountryCode();
                countryCode2.getClass();
                int i2 = y300.a.C1320a.a[countryCode2.ordinal()];
                if (i2 == 1) {
                    strValueOf = "GTBank-gateway-GhIPSS";
                } else if (i2 != 3) {
                    strValueOf = null;
                } else {
                    c100 c100Var = c100.e;
                    strValueOf = String.valueOf(26003);
                }
                kzh.d(k(new pu0.a(0), strValueOf), et7Var);
            }
            if (zi50.a(bVar) != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_WITHDRAW);
                aVar3.g(countryCode + " not support Withdraw Bank, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i3 = y300.b.a.a[countryCode.ordinal()];
                if (i3 == 1) {
                    bVar2 = obj;
                } else if (i3 == 2) {
                    bVar2 = "17";
                } else if (i3 == 3) {
                    bVar2 = "14";
                } else {
                    if (i3 != 4) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodWithdraw.Momo");
                    }
                    bVar2 = "3";
                }
            } catch (Throwable th2) {
                zi50.a aVar4 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (!(bVar2 instanceof zi50.b)) {
                countryCode.getClass();
                int i4 = y300.b.a.a[countryCode.ordinal()];
                if (i4 == 1) {
                    x300Var2 = x300.b;
                } else if (i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        throw new Exception(l4j0.a("`phoneChannelSource` undefine for ", countryCode, " in PayMethodWithdraw.Momo"));
                    }
                    x300Var2 = x300.b;
                } else {
                    x300Var2 = x300.a;
                }
                if (x300Var2 == x300.a) {
                    kzh.d(h(new pu0.a(0)), et7Var);
                } else {
                    itf0.a aVar5 = itf0.a;
                    aVar5.q(MyLog.TAG_WITHDRAW);
                    aVar5.g(countryCode + " no need to fetch Withdraw Momo saved assets, skip pre-fetch related APIs", new Object[0]);
                }
            }
            if (zi50.a(bVar2) != null) {
                itf0.a aVar6 = itf0.a;
                aVar6.q(MyLog.TAG_WITHDRAW);
                aVar6.g(countryCode + " not support Withdraw Momo, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i5 = a300.f.a.a[countryCode.ordinal()];
                if (i5 == 1) {
                    bVar3 = "9";
                } else if (i5 == 2) {
                    bVar3 = "18";
                } else if (i5 == 3) {
                    bVar3 = CashoutMetricsPayload.Metric.KeyValueMap.INACTIVE_OUTCOME;
                } else {
                    if (i5 != 4) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodDeposit.Momo");
                    }
                    bVar3 = "1";
                }
            } catch (Throwable th3) {
                zi50.a aVar7 = zi50.b;
                bVar3 = new zi50.b(th3);
            }
            if (!(bVar3 instanceof zi50.b)) {
                countryCode.getClass();
                int i6 = a300.f.a.a[countryCode.ordinal()];
                if (i6 == 1) {
                    x300Var = x300.b;
                } else if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        throw new Exception(l4j0.a("`phoneChannelSource` undefine for ", countryCode, " in PayMethodDeposit.Momo"));
                    }
                    x300Var = x300.b;
                } else {
                    x300Var = x300.a;
                }
                if (x300Var == x300.a) {
                    kzh.d(W(new pu0.a(0)), et7Var);
                } else {
                    itf0.a aVar8 = itf0.a;
                    aVar8.q(MyLog.TAG_DEPOSIT);
                    aVar8.g(countryCode + " no need to fetch Deposit Momo saved assets, skip pre-fetch related APIs", new Object[0]);
                }
            }
            if (zi50.a(bVar3) != null) {
                itf0.a aVar9 = itf0.a;
                aVar9.q(MyLog.TAG_DEPOSIT);
                aVar9.g(countryCode + " not support Deposit Momo, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i7 = y300.b.a.a[countryCode.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        obj = "17";
                    } else if (i7 == 3) {
                        obj = "14";
                    } else {
                        if (i7 != 4) {
                            throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodWithdraw.Momo");
                        }
                        obj = r6;
                    }
                }
                bVar4 = obj;
            } catch (Throwable th4) {
                zi50.a aVar10 = zi50.b;
                bVar4 = new zi50.b(th4);
            }
            if (!(bVar4 instanceof zi50.b)) {
                kzh.d(q0(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar4) != null) {
                itf0.a aVar11 = itf0.a;
                aVar11.q(MyLog.TAG_WITHDRAW);
                aVar11.g(countryCode + " not support Withdraw Momo, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i8 = a300.f.a.a[countryCode.ordinal()];
                if (i8 == 1) {
                    bVar5 = r10;
                } else if (i8 == 2) {
                    bVar5 = r11;
                } else if (i8 == 3) {
                    bVar5 = r12;
                } else {
                    if (i8 != 4) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodDeposit.Momo");
                    }
                    bVar5 = r13;
                }
            } catch (Throwable th5) {
                zi50.a aVar12 = zi50.b;
                bVar5 = new zi50.b(th5);
            }
            if (!(bVar5 instanceof zi50.b)) {
                kzh.d(R(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar5) != null) {
                itf0.a aVar13 = itf0.a;
                aVar13.q(MyLog.TAG_DEPOSIT);
                aVar13.g(countryCode + " not support Deposit Momo, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                if (a300.g.a.a[countryCode.ordinal()] != 1) {
                    throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodDeposit.OtherBanks");
                }
                bVar6 = "5";
            } catch (Throwable th6) {
                zi50.a aVar14 = zi50.b;
                bVar6 = new zi50.b(th6);
            }
            if (!(bVar6 instanceof zi50.b)) {
                kzh.d(a0(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar6) != null) {
                itf0.a aVar15 = itf0.a;
                aVar15.q(MyLog.TAG_DEPOSIT);
                aVar15.g(countryCode + " not support Deposit OtherBanks, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i9 = y300.a.C1320a.a[countryCode.ordinal()];
                if (i9 != 1) {
                    bVar7 = "6";
                    if (i9 != 2 && i9 != 3) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodWithdraw.Bank");
                    }
                } else {
                    bVar7 = "13";
                }
            } catch (Throwable th7) {
                zi50.a aVar16 = zi50.b;
                bVar7 = new zi50.b(th7);
            }
            if (!(bVar7 instanceof zi50.b)) {
                kzh.d(X(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar7) != null) {
                itf0.a aVar17 = itf0.a;
                aVar17.q(MyLog.TAG_WITHDRAW);
                aVar17.g(countryCode + " not support Withdraw Bank, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                if (y300.d.a.a[countryCode.ordinal()] != 1) {
                    throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodWithdraw.Transfer");
                }
                bVar8 = "-1";
            } catch (Throwable th8) {
                zi50.a aVar18 = zi50.b;
                bVar8 = new zi50.b(th8);
            }
            if (!(bVar8 instanceof zi50.b)) {
                kzh.d(l0(new pu0.a(0)), et7Var);
                kzh.d(u(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar8) != null) {
                itf0.a aVar19 = itf0.a;
                aVar19.q(MyLog.TAG_WITHDRAW);
                aVar19.g(countryCode + " not support Withdraw Transfer, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                int i10 = a300.b.a.a[countryCode.ordinal()];
                if (i10 == 1) {
                    bVar9 = "12";
                } else {
                    if (i10 != 2) {
                        throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodDeposit.Card");
                    }
                    bVar9 = "4";
                }
            } catch (Throwable th9) {
                zi50.a aVar20 = zi50.b;
                bVar9 = new zi50.b(th9);
            }
            if (!(bVar9 instanceof zi50.b)) {
                kzh.d(G(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar9) != null) {
                itf0.a aVar21 = itf0.a;
                aVar21.q(MyLog.TAG_DEPOSIT);
                aVar21.g(countryCode + " not support Deposit Card, skip pre-fetch related APIs", new Object[0]);
            }
            try {
                countryCode.getClass();
                if (a300.g.a.a[countryCode.ordinal()] != 1) {
                    throw new Exception("`boAlertContentMethodId` undefine for " + countryCode + " in PayMethodDeposit.OtherBanks");
                }
                bVar10 = r15;
            } catch (Throwable th10) {
                zi50.a aVar22 = zi50.b;
                bVar10 = new zi50.b(th10);
            }
            if (!(bVar10 instanceof zi50.b)) {
                kzh.d(r(new pu0.a(0)), et7Var);
            }
            if (zi50.a(bVar10) != null) {
                itf0.a aVar23 = itf0.a;
                aVar23.q(MyLog.TAG_DEPOSIT);
                aVar23.g(countryCode + " not support Deposit OtherBanks, skip pre-fetch related APIs", new Object[0]);
            }
        }
    }

    @Override // defpackage.sr10
    public final Object e(int i, String str, String str2, ag6 ag6Var) {
        return ctb.d(this.v, "PocketRepo", "card3DSCheckAuthPayerStatus", new wr10(this, i, str, str2, null), ag6Var);
    }

    @Override // defpackage.sr10
    public final g1i e0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.P, pu0Var, new kt10(this, null)), this.w), "getSportyBankAccounts", this.v);
    }

    @Override // defpackage.sr10
    public final Object f(ArrayList arrayList, cnu cnuVar) {
        return ctb.d(this.v, "PocketRepo", "setBankAssetIdOrder", new eu10(this, arrayList, null), cnuVar);
    }

    @Override // defpackage.sr10
    public final Object f0(String str, sak sakVar) {
        return ctb.d(this.v, "PocketRepo", "getPhoneChannel", new gt10(this, str, null), sakVar);
    }

    @Override // defpackage.sr10
    public final g1i g(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.L, pu0Var, new ss10(this, null)), this.w), "getDefaultChannel", this.v);
    }

    @Override // defpackage.sr10
    public final g1i g0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(new wl50(su0.a(this.S, pu0Var, new ft10(this, null)), new uhx(1)), this.w), "getOneTimeBankPageContent", this.v);
    }

    @Override // defpackage.sr10
    public final g1i h(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.H, pu0Var, new rt10(this, null)), this.w), "getWithdrawMomoSavedAssets", this.v);
    }

    @Override // defpackage.sr10
    public final g1i h0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.X, pu0Var, new ps10(this, null)), this.w), "getKeBountyAndTaxConfigs", this.v);
    }

    @Override // defpackage.sr10
    public final void i(et7 et7Var) {
        kzh.d(u0(new pu0.a(0)), et7Var);
    }

    @Override // defpackage.sr10
    public final Object i0(TransferRequest transferRequest, tpj0 tpj0Var) {
        return ctb.d(this.v, "PocketRepo", "resolveTransfer", new bu10(this, transferRequest, null), tpj0Var);
    }

    @Override // defpackage.sr10
    public final jvd0 j(et7 et7Var) {
        return ej5.c(et7Var, null, null, new js10(this, null), 3);
    }

    @Override // defpackage.sr10
    public final g1i j0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.C, pu0Var, new ut10(this, null)), this.w), "getWithdrawableBalanceInfo", this.v);
    }

    @Override // defpackage.sr10
    public final g1i k(pu0 pu0Var, String str) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.E, pu0Var, new tt10(this, str, null)), this.w), "getWithdrawSupportBanks", this.v);
    }

    @Override // defpackage.sr10
    public final Object k0(int i, pud.b.a aVar) {
        return ctb.d(this.v, "PocketRepo", "checkCardStatus", new as10(this, i, null), aVar);
    }

    @Override // defpackage.sr10
    public final g1i l(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.A, pu0Var, new ws10(this, null)), this.w), "getDepositDropAlertDisplay", this.v);
    }

    @Override // defpackage.sr10
    public final g1i l0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.N, pu0Var, new mt10(this, null)), this.w), "getTransferStatus", this.v);
    }

    @Override // defpackage.sr10
    public final Object m(String str, x1b x1bVar) {
        return ctb.d(this.v, "PocketRepo", "getBankTrade", new os10(this, str, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final g1i m0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.Y, pu0Var, new ct10(this, null)), this.w), "getFeeAndTaxConfigs", this.v);
    }

    @Override // defpackage.sr10
    public final Object n(fbk fbkVar) {
        return this.a.s(fbkVar);
    }

    @Override // defpackage.sr10
    public final lyh n0() {
        return ozh.c(new or60(new ht10(this, null)), this.w);
    }

    @Override // defpackage.sr10
    public final Object o(DepositRequest depositRequest, x1b x1bVar) {
        return ctb.d(this.v, "PocketRepo", AnalyticsEvent.DEPOSIT, new is10(this, depositRequest, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final Object o0(String str, tje0 tje0Var) {
        return ctb.d(this.v, "PocketRepo", "fixStatusPending", new ks10(this, str, null), tje0Var);
    }

    @Override // defpackage.fjt
    public final void p() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.g("PocketRepo: clearUserCachedData()", new Object[0]);
        try {
            wwd0 wwd0Var = this.B;
            lk50.b bVar = lk50.b.a;
            wwd0Var.setValue(bVar);
            this.C.setValue(bVar);
            this.D.setValue(bVar);
            this.H.setValue(bVar);
            this.N.setValue(bVar);
            this.O.setValue(bVar);
            this.M.setValue(bVar);
            this.J.setValue(bVar);
        } catch (Exception e) {
            itf0.a.b(e);
        }
    }

    @Override // defpackage.sr10
    public final Object p0(TradeAdditionalRequest tradeAdditionalRequest, x1b x1bVar) {
        return ctb.d(this.v, "PocketRepo", "postBankTradeAdditional", new xt10(this, tradeAdditionalRequest, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final Object q(int i, int i2, String str, iw1 iw1Var, ohj0 ohj0Var) {
        return ctb.d(this.v, "PocketRepo", "getWithdrawDropAlertConfig", new qt10(iw1Var, i2, str, this, i, null), ohj0Var);
    }

    @Override // defpackage.sr10
    public final g1i q0(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.I, pu0Var, new st10(this, null)), this.w), "getWithdrawMomoSupportChannels", this.v);
    }

    @Override // defpackage.sr10
    public final g1i r(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.F, pu0Var, new ts10(this, null)), this.w), "getDepositBankSavedAssets", this.v);
    }

    @Override // defpackage.sr10
    public final g1i r0(iw1 iw1Var, String str) {
        iw1Var.getClass();
        str.getClass();
        return ctb.c(ozh.c(bm50.a(new or60(new yr10(iw1Var, str, this, null))), this.w), "checkBankTradeOtp", this.v);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sr10
    public final Object s(DedicatedAccountCreateRequest dedicatedAccountCreateRequest, x1b x1bVar) {
        fs10 fs10Var;
        Object bVar;
        if (x1bVar instanceof fs10) {
            fs10Var = (fs10) x1bVar;
            int i = fs10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fs10Var.c = i - Integer.MIN_VALUE;
            } else {
                fs10Var = new fs10(this, x1bVar);
            }
        } else {
            fs10Var = new fs10(this, x1bVar);
        }
        Object objF = fs10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fs10Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objF);
                zi50.a aVar = zi50.b;
                String json = this.f.toJson(dedicatedAccountCreateRequest);
                pr10 pr10Var = this.a;
                json.getClass();
                fs10Var.c = 1;
                objF = pr10Var.F(json, fs10Var);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objF);
            }
            BaseResponse baseResponse = (BaseResponse) objF;
            int i3 = baseResponse.bizCode;
            if (i3 == 10000) {
                List<SportyBankAccountDto> results = ((DedicatedAccountCreateDto) baseResponse.data).getResults();
                if (results == null || !results.isEmpty()) {
                    Iterator<T> it = results.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((SportyBankAccountDto) it.next()).getStatus() == SportyBankAccountStatus.DENIED.getIntValue()) {
                                bVar = new DedicatedAccountCreateResult.PartialFailed(results);
                                break;
                            }
                        }
                    }
                }
                bVar = DedicatedAccountCreateResult.Success.INSTANCE;
                break;
            }
            bVar = i3 != 76106 ? new DedicatedAccountCreateResult.Failed(baseResponse.message) : new DedicatedAccountCreateResult.NeedBVN(baseResponse.message);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, "createNewSportyBank went error", new Object[0]);
        }
        return zi50.a(bVar) == null ? bVar : new DedicatedAccountCreateResult.Failed(null);
    }

    @Override // defpackage.sr10
    public final Object s0(int i, BigDecimal bigDecimal, String str, Integer num, String str2, String str3, ag6 ag6Var) {
        return ctb.d(this.v, "PocketRepo", "checkCardConstraints", new zr10(this, i, bigDecimal, str, num, str2, str3, null), ag6Var);
    }

    @Override // defpackage.sr10
    public final Object t(int i, int i2, String str, Long l, yi7 yi7Var) {
        return ctb.d(this.v, "PocketRepo", "checkLastTransactionConfig", new cs10(this, i, i2, str, l, null), yi7Var);
    }

    @Override // defpackage.sr10
    public final Object t0(int i, Integer num, String str, ag6 ag6Var) {
        return ctb.d(this.v, "PocketRepo", "card3DSInitiateAuth", new xr10(i, null, this, num, str), ag6Var);
    }

    @Override // defpackage.sr10
    public final g1i u(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(su0.a(this.O, pu0Var, new lt10(this, null)), this.w), "getTransferRecipients", this.v);
    }

    public final g1i u0(pu0 pu0Var) {
        lyh lyhVarC = ozh.c(su0.a(this.z, pu0Var, new ot10(this, null)), this.w);
        uqm uqmVar = this.b;
        String languageCode = uqmVar.getLanguageCode();
        wo5 wo5Var = this.e;
        return ctb.c(r1i.a(lyhVarC, wo5.b(wo5Var, "transaction_trade_code", languageCode, 2), wo5.b(wo5Var, "common_games", uqmVar.getLanguageCode(), 2), new yt10(this, null)), "remoteTxTypeUiTextMapsFlow", this.v);
    }

    @Override // defpackage.sr10
    public final g1i v(pu0 pu0Var) {
        pu0Var.getClass();
        return ctb.c(ozh.c(new wl50(su0.a(this.R, pu0Var, new at10(this, null)), new tr10()), this.w), "getDepositOneTimeBankList", this.v);
    }

    @Override // defpackage.sr10
    public final Object w(int i, String str, int i2, String str2, String str3, TransactionStatus transactionStatus, x1b x1bVar) {
        return ej5.d(this.w, new vt10(this, i, str, i2, str2, str3, transactionStatus, null), x1bVar);
    }

    @Override // defpackage.sr10
    public final Object x(int i, String str, Integer num, kyd kydVar) {
        return ctb.d(this.v, "PocketRepo", "getDepositDropAlertConfig", new vs10(i, null, this, num, str), kydVar);
    }

    @Override // defpackage.sr10
    public final Object z(TransferRequest transferRequest, bqj0 bqj0Var) {
        return ctb.d(this.v, "PocketRepo", "submitTransfer", new fu10(this, transferRequest, null), bqj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sr10
    public final Object P(String str, CountryCodeName countryCodeName, String str2, x1b x1bVar) {
        ns10 ns10Var;
        if (x1bVar instanceof ns10) {
            ns10Var = (ns10) x1bVar;
            int i = ns10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns10Var.c = i - Integer.MIN_VALUE;
            } else {
                ns10Var = new ns10(this, x1bVar);
            }
        } else {
            ns10Var = new ns10(this, x1bVar);
        }
        Object objR0 = ns10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ns10Var.c;
        if (i2 == 0) {
            uj50.b(objR0);
            String code = countryCodeName.getCode();
            ns10Var.c = 1;
            objR0 = this.a.r0(str, code, str2, ns10Var);
            if (objR0 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a(yFmFZvuWxAYfEj.ktiWRvanzAgj);
                return null;
            }
            uj50.b(objR0);
        }
        return n52.b((BaseResponse) objR0);
    }
}
