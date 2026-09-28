package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawViewModel$initPaymentLimits$1", f = "EFTWithdrawViewModel.kt", l = {164, 192, 195, 198, 206}, m = "invokeSuspend", v = 2)
public final class mif extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lk50.c a;
    public u1l b;
    public l9k0 c;
    public ga00 d;
    public FullSummaryData e;
    public KycLimitData f;
    public String i;
    public String v;
    public int w;
    public final /* synthetic */ sif y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mif(sif sifVar, v1b<? super mif> v1bVar) {
        super(2, v1bVar);
        this.y = sifVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mif(this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mif) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc A[PHI: r3 r6 r9
      0x00dc: PHI (r3v1 u1l) = (r3v0 u1l), (r3v14 u1l) binds: [B:30:0x00d9, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r6v17 lk50$c) = (r6v15 lk50$c), (r6v29 lk50$c) binds: [B:30:0x00d9, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v7 java.lang.Object) binds: [B:30:0x00d9, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5 A[PHI: r3 r6
      0x00f5: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v16 java.lang.Object) binds: [B:33:0x00f2, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r6v18 lk50$c) = (r6v17 lk50$c), (r6v30 lk50$c) binds: [B:33:0x00f2, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        Object objP;
        lk50.c cVar;
        Object userId;
        Object objP2;
        lk50.c cVar2;
        ga00 ga00Var;
        FullSummaryData fullSummaryData;
        KycLimitData kycLimitData;
        String strValueOf;
        String strValueOf2;
        Object userCertStatus;
        KycLimitData kycLimitData2;
        ga00 ga00Var2;
        FullSummaryData fullSummaryData2;
        l9k0 l9k0Var;
        BaseResponse baseResponse;
        BaseResponse baseResponse2;
        sif sifVar = this.y;
        mgb0 mgb0Var = sifVar.U0;
        u1l u1lVar = sifVar.V0;
        l9k0 l9k0Var2 = sifVar.j1;
        y5b y5bVar = y5b.a;
        int i = this.w;
        if (i == 0) {
            uj50.b(obj);
            lyh<lk50<AssetsInfo>> lyhVarH = sifVar.Q0.h(pu0.c.a);
            this.w = 1;
            objQ = bm50.q(lyhVarH, this);
            if (objQ != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
            objQ = obj;
        } else {
            if (i == 2) {
                uj50.b(obj);
                objP = obj;
                if (objP instanceof lk50.c) {
                    cVar = (lk50.c) objP;
                } else {
                    cVar = null;
                }
                this.a = cVar;
                this.b = u1lVar;
                this.w = 3;
                userId = mgb0Var.getUserId(this);
                if (userId != y5bVar) {
                    lyh<lk50<BaseResponse<FullSummaryData>>> lyhVarC = u1lVar.c((String) userId, sifVar.S0.f(), true);
                    this.a = cVar;
                    this.b = null;
                    this.w = 4;
                    objP2 = bm50.p(lyhVarC, this);
                    if (objP2 != y5bVar) {
                        if (objP2 instanceof lk50.c) {
                            cVar2 = (lk50.c) objP2;
                        } else {
                            cVar2 = null;
                        }
                        ga00Var = ga00.WITHDRAW;
                        if (cVar2 != null) {
                            fullSummaryData = null;
                        } else {
                            fullSummaryData = null;
                        }
                        if (cVar != null) {
                            kycLimitData = null;
                        } else {
                            kycLimitData = null;
                        }
                        strValueOf = String.valueOf(sifVar.h1);
                        strValueOf2 = String.valueOf(sifVar.i1.a);
                        this.a = null;
                        this.b = null;
                        this.c = l9k0Var2;
                        this.d = ga00Var;
                        this.e = fullSummaryData;
                        this.f = kycLimitData;
                        this.i = strValueOf;
                        this.v = strValueOf2;
                        this.w = 5;
                        userCertStatus = mgb0Var.getUserCertStatus(this);
                        if (userCertStatus != y5bVar) {
                            kycLimitData2 = kycLimitData;
                            ga00Var2 = ga00Var;
                            fullSummaryData2 = fullSummaryData;
                            l9k0Var = l9k0Var2;
                        }
                    }
                }
                return y5bVar;
            }
            if (i == 3) {
                u1lVar = this.b;
                cVar = this.a;
                uj50.b(obj);
                userId = obj;
                lyh<lk50<BaseResponse<FullSummaryData>>> lyhVarC2 = u1lVar.c((String) userId, sifVar.S0.f(), true);
                this.a = cVar;
                this.b = null;
                this.w = 4;
                objP2 = bm50.p(lyhVarC2, this);
                if (objP2 != y5bVar) {
                    if (objP2 instanceof lk50.c) {
                        cVar2 = (lk50.c) objP2;
                    } else {
                        cVar2 = null;
                    }
                    ga00Var = ga00.WITHDRAW;
                    if (cVar2 != null) {
                        fullSummaryData = null;
                    } else {
                        fullSummaryData = null;
                    }
                    if (cVar != null) {
                        kycLimitData = null;
                    } else {
                        kycLimitData = null;
                    }
                    strValueOf = String.valueOf(sifVar.h1);
                    strValueOf2 = String.valueOf(sifVar.i1.a);
                    this.a = null;
                    this.b = null;
                    this.c = l9k0Var2;
                    this.d = ga00Var;
                    this.e = fullSummaryData;
                    this.f = kycLimitData;
                    this.i = strValueOf;
                    this.v = strValueOf2;
                    this.w = 5;
                    userCertStatus = mgb0Var.getUserCertStatus(this);
                    if (userCertStatus != y5bVar) {
                        kycLimitData2 = kycLimitData;
                        ga00Var2 = ga00Var;
                        fullSummaryData2 = fullSummaryData;
                        l9k0Var = l9k0Var2;
                    }
                }
                return y5bVar;
            }
            if (i == 4) {
                lk50.c cVar3 = this.a;
                uj50.b(obj);
                cVar = cVar3;
                objP2 = obj;
                if (objP2 instanceof lk50.c) {
                    cVar2 = (lk50.c) objP2;
                } else {
                    cVar2 = null;
                }
                ga00Var = ga00.WITHDRAW;
                if (cVar2 != null || (baseResponse2 = (BaseResponse) cVar2.a) == null) {
                    fullSummaryData = null;
                } else {
                    fullSummaryData = (FullSummaryData) baseResponse2.data;
                }
                if (cVar != null || (baseResponse = (BaseResponse) cVar.a) == null) {
                    kycLimitData = null;
                } else {
                    kycLimitData = (KycLimitData) baseResponse.data;
                }
                strValueOf = String.valueOf(sifVar.h1);
                strValueOf2 = String.valueOf(sifVar.i1.a);
                this.a = null;
                this.b = null;
                this.c = l9k0Var2;
                this.d = ga00Var;
                this.e = fullSummaryData;
                this.f = kycLimitData;
                this.i = strValueOf;
                this.v = strValueOf2;
                this.w = 5;
                userCertStatus = mgb0Var.getUserCertStatus(this);
                if (userCertStatus != y5bVar) {
                    kycLimitData2 = kycLimitData;
                    ga00Var2 = ga00Var;
                    fullSummaryData2 = fullSummaryData;
                    l9k0Var = l9k0Var2;
                }
                return y5bVar;
            }
            if (i != 5) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = this.v;
            String str2 = this.i;
            KycLimitData kycLimitData3 = this.f;
            FullSummaryData fullSummaryData3 = this.e;
            ga00 ga00Var3 = this.d;
            l9k0 l9k0Var3 = this.c;
            uj50.b(obj);
            kycLimitData2 = kycLimitData3;
            l9k0Var = l9k0Var3;
            fullSummaryData2 = fullSummaryData3;
            ga00Var2 = ga00Var3;
            userCertStatus = obj;
            strValueOf2 = str;
            strValueOf = str2;
        }
        l9k0Var.a(ga00Var2, fullSummaryData2, kycLimitData2, strValueOf, strValueOf2, ((Number) userCertStatus).intValue());
        wwd0 wwd0Var = sifVar.e1;
        String strC = l9k0Var2.c();
        wwd0Var.getClass();
        wwd0Var.k(null, strC);
        return Unit.a;
        AssetsInfo assetsInfo = (AssetsInfo) objQ;
        if (assetsInfo != null) {
            l9k0Var2.f = assetsInfo.balance / 10000.0d;
        }
        sifVar.W0.b(o8i0.d(sifVar), new lif(sifVar, 0));
        String[] strArr = {String.valueOf(sifVar.i1.a)};
        String[] strArr2 = {String.valueOf(sifVar.h1)};
        ga00 ga00Var4 = ga00.DEPOSIT;
        lyh lyhVarA = u1lVar.a(strArr, strArr2, new String[]{String.valueOf(2)});
        this.w = 2;
        objP = bm50.p(lyhVarA, this);
        if (objP != y5bVar) {
            if (objP instanceof lk50.c) {
                cVar = (lk50.c) objP;
            } else {
                cVar = null;
            }
            this.a = cVar;
            this.b = u1lVar;
            this.w = 3;
            userId = mgb0Var.getUserId(this);
            if (userId != y5bVar) {
                lyh<lk50<BaseResponse<FullSummaryData>>> lyhVarC3 = u1lVar.c((String) userId, sifVar.S0.f(), true);
                this.a = cVar;
                this.b = null;
                this.w = 4;
                objP2 = bm50.p(lyhVarC3, this);
                if (objP2 != y5bVar) {
                    if (objP2 instanceof lk50.c) {
                        cVar2 = (lk50.c) objP2;
                    } else {
                        cVar2 = null;
                    }
                    ga00Var = ga00.WITHDRAW;
                    if (cVar2 != null) {
                        fullSummaryData = null;
                    } else {
                        fullSummaryData = null;
                    }
                    if (cVar != null) {
                        kycLimitData = null;
                    } else {
                        kycLimitData = null;
                    }
                    strValueOf = String.valueOf(sifVar.h1);
                    strValueOf2 = String.valueOf(sifVar.i1.a);
                    this.a = null;
                    this.b = null;
                    this.c = l9k0Var2;
                    this.d = ga00Var;
                    this.e = fullSummaryData;
                    this.f = kycLimitData;
                    this.i = strValueOf;
                    this.v = strValueOf2;
                    this.w = 5;
                    userCertStatus = mgb0Var.getUserCertStatus(this);
                    if (userCertStatus != y5bVar) {
                        kycLimitData2 = kycLimitData;
                        ga00Var2 = ga00Var;
                        fullSummaryData2 = fullSummaryData;
                        l9k0Var = l9k0Var2;
                        l9k0Var.a(ga00Var2, fullSummaryData2, kycLimitData2, strValueOf, strValueOf2, ((Number) userCertStatus).intValue());
                        wwd0 wwd0Var2 = sifVar.e1;
                        String strC2 = l9k0Var2.c();
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, strC2);
                        return Unit.a;
                    }
                }
            }
        }
        return y5bVar;
    }
}
