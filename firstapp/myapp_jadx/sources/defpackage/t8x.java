package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.nightnday.data.dto.NNDBetResponseDTO;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class t8x implements s8x {
    public final ltx a;
    public final b5 b;
    public final k5b c;

    public static final class a implements lyh<a7x> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ t8x b;

        /* JADX INFO: renamed from: t8x$a$a, reason: collision with other inner class name */
        public static final class C1121a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: t8x$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDBetUseCaseImpl$bet$$inlined$map$1$2", f = "NNDBetUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
            public static final class C1122a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1122a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1121a.this.emit(null, this);
                }
            }

            public C1121a(myh myhVar, t8x t8xVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1122a c1122a;
                if (v1bVar instanceof C1122a) {
                    c1122a = (C1122a) v1bVar;
                    int i = c1122a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1122a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1122a = new C1122a(v1bVar);
                    }
                } else {
                    c1122a = new C1122a(v1bVar);
                }
                Object obj2 = c1122a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1122a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    NNDBetResponseDTO nNDBetResponseDTO = (NNDBetResponseDTO) em50.b((HTTPResponse) obj);
                    fbx fbxVarB = t8x.b(nNDBetResponseDTO.getUserPick());
                    fbx fbxVarB2 = t8x.b(nNDBetResponseDTO.getHouseDraw());
                    String currency = nNDBetResponseDTO.getCurrency();
                    Double stakeAmount = nNDBetResponseDTO.getStakeAmount();
                    double dDoubleValue = stakeAmount != null ? stakeAmount.doubleValue() : 0.0d;
                    Double payoutAmount = nNDBetResponseDTO.getPayoutAmount();
                    double dDoubleValue2 = payoutAmount != null ? payoutAmount.doubleValue() : 0.0d;
                    Double actualDebitedAmt = nNDBetResponseDTO.getActualDebitedAmt();
                    double dDoubleValue3 = actualDebitedAmt != null ? actualDebitedAmt.doubleValue() : 0.0d;
                    Double actualCreditedAmt = nNDBetResponseDTO.getActualCreditedAmt();
                    double dDoubleValue4 = actualCreditedAmt != null ? actualCreditedAmt.doubleValue() : 0.0d;
                    lx30.INSTANCE.getClass();
                    float fD = lx30.b.d();
                    Double giftAmount = nNDBetResponseDTO.getGiftAmount();
                    a7x a7xVar = new a7x(fbxVarB, fbxVarB2, currency, dDoubleValue2, dDoubleValue, dDoubleValue3, dDoubleValue4, fD, giftAmount != null ? giftAmount.doubleValue() : 0.0d);
                    c1122a.b = 1;
                    if (this.a.emit(a7xVar, c1122a) == y5bVar) {
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

        public a(lyh lyhVar, t8x t8xVar) {
            this.a = lyhVar;
            this.b = t8xVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super a7x> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C1121a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public t8x(ltx ltxVar, b5 b5Var, k5b k5bVar) {
        ltxVar.getClass();
        b5Var.getClass();
        k5bVar.getClass();
        this.a = ltxVar;
        this.b = b5Var;
        this.c = k5bVar;
    }

    public static fbx b(String str) {
        Object next;
        uag uagVar = fbx.i;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            next = bVarA.next();
            if (((fbx) next).a.equals(str)) {
                next.getClass();
                return (fbx) next;
            }
        }
        next = null;
        next.getClass();
        return (fbx) next;
    }

    @Override // defpackage.s8x
    public final lyh<mk50<a7x>> a(double d, fbx fbxVar, String str) {
        fbxVar.getClass();
        String countryCurrency = this.b.getCountryCurrency();
        if (countryCurrency == null) {
            countryCurrency = "";
        }
        return ozh.c(em50.a(new a(this.a.g(d, fbxVar, countryCurrency, str), this)), this.c);
    }
}
