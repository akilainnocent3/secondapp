package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@fae
public final class k9e {
    public final sr10 a;
    public final c0e b;

    public k9e(sr10 sr10Var, c0e c0eVar) {
        sr10Var.getClass();
        c0eVar.getClass();
        this.a = sr10Var;
        this.b = c0eVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:66:0x0107, B:20:0x0045, B:27:0x0062, B:29:0x006a, B:31:0x0075, B:36:0x007f, B:38:0x0083, B:43:0x0094, B:45:0x009b, B:47:0x00ac, B:51:0x00be, B:53:0x00c4, B:57:0x00d6, B:59:0x00dc, B:61:0x00e3, B:44:0x0099, B:23:0x004c), top: B:70:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(DepositRequest depositRequest, Function2 function2, x1b x1bVar) {
        j9e j9eVar;
        Function2 function3;
        BaseResponse baseResponse;
        String str;
        int iIntValue;
        Integer num;
        Integer num2;
        BaseResponse baseResponse2;
        DepositRequest depositRequest2 = depositRequest;
        c0e c0eVar = this.b;
        if (x1bVar instanceof j9e) {
            j9eVar = (j9e) x1bVar;
            int i = j9eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9eVar.f = i - Integer.MIN_VALUE;
            } else {
                j9eVar = new j9e(this, x1bVar);
            }
        } else {
            j9eVar = new j9e(this, x1bVar);
        }
        Object objO = j9eVar.d;
        y5b y5bVar = y5b.a;
        int i2 = j9eVar.f;
        try {
            if (i2 == 0) {
                uj50.b(objO);
                sr10 sr10Var = this.a;
                j9eVar.a = depositRequest2;
                j9eVar.b = (tje0) function2;
                j9eVar.f = 1;
                objO = sr10Var.o(depositRequest2, j9eVar);
                if (objO != y5bVar) {
                    function3 = function2;
                }
                return y5bVar;
            }
            if (i2 == 1) {
                Function2 function4 = (Function2) j9eVar.b;
                depositRequest2 = j9eVar.a;
                uj50.b(objO);
                function3 = function4;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                baseResponse2 = j9eVar.c;
                uj50.b(objO);
            }
            baseResponse = baseResponse2;
            return y7e.b(baseResponse);
            baseResponse = (BaseResponse) objO;
            if (c0eVar.a()) {
                BigDecimal payAmount = depositRequest2.getPayAmount();
                T t = baseResponse.data;
                BankTradeResponse bankTradeResponse = (BankTradeResponse) t;
                if (bankTradeResponse == null || (str = bankTradeResponse.tradeId) == null) {
                    str = "";
                }
                String str2 = str;
                BankTradeResponse bankTradeResponse2 = (BankTradeResponse) t;
                if (bankTradeResponse2 != null) {
                    Integer num3 = new Integer(bankTradeResponse2.status);
                    if (num3.intValue() == 0) {
                        num3 = null;
                    }
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = baseResponse.bizCode;
                    }
                } else {
                    iIntValue = baseResponse.bizCode;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - c0eVar.a;
                c0eVar.a = 0L;
                BankTradeResponse bankTradeResponse3 = (BankTradeResponse) baseResponse.data;
                if (bankTradeResponse3 != null) {
                    Integer num4 = new Integer(bankTradeResponse3.payChId);
                    if (num4.intValue() != 0) {
                        num = num4;
                    } else {
                        num = null;
                    }
                } else {
                    num = null;
                }
                BankTradeResponse bankTradeResponse4 = (BankTradeResponse) baseResponse.data;
                if (bankTradeResponse4 != null) {
                    Integer num5 = new Integer(bankTradeResponse4.bankId);
                    if (num5.intValue() != 0) {
                        num2 = num5;
                    } else {
                        num2 = null;
                    }
                } else {
                    num2 = null;
                }
                BankTradeResponse bankTradeResponse5 = (BankTradeResponse) baseResponse.data;
                qnd qndVar = new qnd(null, str2, payAmount, new Integer(iIntValue), new Long(jCurrentTimeMillis), num, num2, bankTradeResponse5 != null ? bankTradeResponse5.mobileOperatorName : null, 15371);
                j9eVar.a = null;
                j9eVar.b = null;
                j9eVar.c = baseResponse;
                j9eVar.f = 2;
                if (function3.invoke(qndVar, j9eVar) != y5bVar) {
                    baseResponse2 = baseResponse;
                    baseResponse = baseResponse2;
                }
                return y5bVar;
            }
            return y7e.b(baseResponse);
        } catch (Throwable th) {
            itf0.a.e(th);
            return new x7e.d.t(null);
        }
    }
}
