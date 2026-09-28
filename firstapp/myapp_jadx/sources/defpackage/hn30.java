package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.refscall.data.dto.RCBetResponseDTO;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class hn30 implements gn30 {
    public final qr40 a;
    public final k5b b;

    public static final class a implements lyh<ql30> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ hn30 b;

        /* JADX INFO: renamed from: hn30$a$a, reason: collision with other inner class name */
        public static final class C0648a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hn30$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.domain.usecase.RCBetUseCaseImpl$invoke$$inlined$map$1$2", f = "RCBetUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
            public static final class C0649a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0649a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0648a.this.emit(null, this);
                }
            }

            public C0648a(myh myhVar, hn30 hn30Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0649a c0649a;
                BigDecimal bigDecimalValueOf;
                BigDecimal bigDecimalValueOf2;
                BigDecimal bigDecimalValueOf3;
                BigDecimal bigDecimalValueOf4;
                BigDecimal bigDecimalValueOf5;
                if (v1bVar instanceof C0649a) {
                    c0649a = (C0649a) v1bVar;
                    int i = c0649a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0649a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0649a = new C0649a(v1bVar);
                    }
                } else {
                    c0649a = new C0649a(v1bVar);
                }
                Object obj2 = c0649a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0649a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    RCBetResponseDTO rCBetResponseDTO = (RCBetResponseDTO) em50.b((HTTPResponse) obj);
                    tq30 tq30VarB = hn30.b(rCBetResponseDTO.getUserPick());
                    tq30 tq30VarB2 = hn30.b(rCBetResponseDTO.getHouseDraw());
                    String currency = rCBetResponseDTO.getCurrency();
                    Double stakeAmount = rCBetResponseDTO.getStakeAmount();
                    if (stakeAmount != null) {
                        bigDecimalValueOf = BigDecimal.valueOf(stakeAmount.doubleValue());
                        bigDecimalValueOf.getClass();
                        BigDecimal bigDecimal = skd0.b;
                    } else {
                        bigDecimalValueOf = skd0.b;
                    }
                    BigDecimal bigDecimal2 = bigDecimalValueOf;
                    Double payoutAmount = rCBetResponseDTO.getPayoutAmount();
                    if (payoutAmount != null) {
                        bigDecimalValueOf2 = BigDecimal.valueOf(payoutAmount.doubleValue());
                        bigDecimalValueOf2.getClass();
                    } else {
                        bigDecimalValueOf2 = skd0.b;
                    }
                    BigDecimal bigDecimal3 = bigDecimalValueOf2;
                    Double actualDebitedAmt = rCBetResponseDTO.getActualDebitedAmt();
                    if (actualDebitedAmt != null) {
                        bigDecimalValueOf3 = BigDecimal.valueOf(actualDebitedAmt.doubleValue());
                        bigDecimalValueOf3.getClass();
                    } else {
                        bigDecimalValueOf3 = skd0.b;
                    }
                    BigDecimal bigDecimal4 = bigDecimalValueOf3;
                    Double actualCreditedAmt = rCBetResponseDTO.getActualCreditedAmt();
                    if (actualCreditedAmt != null) {
                        bigDecimalValueOf4 = BigDecimal.valueOf(actualCreditedAmt.doubleValue());
                        bigDecimalValueOf4.getClass();
                    } else {
                        bigDecimalValueOf4 = skd0.b;
                    }
                    BigDecimal bigDecimal5 = bigDecimalValueOf4;
                    Double giftAmount = rCBetResponseDTO.getGiftAmount();
                    if (giftAmount != null) {
                        bigDecimalValueOf5 = BigDecimal.valueOf(giftAmount.doubleValue());
                        bigDecimalValueOf5.getClass();
                    } else {
                        bigDecimalValueOf5 = skd0.b;
                    }
                    BigDecimal bigDecimal6 = bigDecimalValueOf5;
                    lx30.INSTANCE.getClass();
                    p4 p4Var = lx30.b;
                    ql30 ql30Var = new ql30(tq30VarB, tq30VarB2, currency, bigDecimal3, bigDecimal2, bigDecimal4, bigDecimal5, bigDecimal6, p4Var.d(), p4Var.e());
                    c0649a.b = 1;
                    if (this.a.emit(ql30Var, c0649a) == y5bVar) {
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

        public a(lyh lyhVar, hn30 hn30Var) {
            this.a = lyhVar;
            this.b = hn30Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super ql30> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0648a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public hn30(qr40 qr40Var, k5b k5bVar) {
        qr40Var.getClass();
        k5bVar.getClass();
        this.a = qr40Var;
        this.b = k5bVar;
    }

    public static tq30 b(String str) {
        Object next;
        uag uagVar = tq30.i;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            next = bVarA.next();
            if (((tq30) next).a.equals(str)) {
                next.getClass();
                return (tq30) next;
            }
        }
        next = null;
        next.getClass();
        return (tq30) next;
    }

    @Override // defpackage.gn30
    public final lyh a(double d, tq30 tq30Var, String str, String str2) {
        str.getClass();
        tq30Var.getClass();
        return ozh.c(em50.a(new a(this.a.g(d, tq30Var, str, str2), this)), this.b);
    }
}
