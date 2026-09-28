package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i9e {
    public final sr10 a;
    public final c0e b;
    public final psm c;
    public final uqm d;

    public i9e(sr10 sr10Var, c0e c0eVar, psm psmVar, uqm uqmVar) {
        v4c v4cVar = v4c.a;
        sr10Var.getClass();
        c0eVar.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        this.a = sr10Var;
        this.b = c0eVar;
        this.c = psmVar;
        this.d = uqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:55:0x013c, B:20:0x0043, B:32:0x00cf, B:34:0x00d7, B:36:0x00e2, B:41:0x00ec, B:43:0x00f0, B:48:0x0101, B:50:0x0108, B:49:0x0106, B:23:0x004b, B:26:0x0072, B:28:0x007d), top: B:59:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(wvd wvdVar, Function2 function2, x1b x1bVar) {
        h9e h9eVar;
        Function2 function3;
        DepositRequest depositRequest;
        BaseResponse baseResponse;
        String str;
        int iIntValue;
        BaseResponse baseResponse2;
        c0e c0eVar = this.b;
        if (x1bVar instanceof h9e) {
            h9eVar = (h9e) x1bVar;
            int i = h9eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h9eVar.f = i - Integer.MIN_VALUE;
            } else {
                h9eVar = new h9e(this, x1bVar);
            }
        } else {
            h9eVar = new h9e(this, x1bVar);
        }
        Object objO = h9eVar.d;
        y5b y5bVar = y5b.a;
        int i2 = h9eVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    depositRequest = h9eVar.b;
                    Function2 function4 = (Function2) h9eVar.a;
                    uj50.b(objO);
                    function3 = function4;
                } else {
                    if (i2 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    baseResponse2 = h9eVar.c;
                    uj50.b(objO);
                }
                baseResponse = baseResponse2;
                return y7e.b(baseResponse);
            }
            uj50.b(objO);
            BigDecimal bigDecimal = new BigDecimal(v4c.a.c(wvdVar.d()) * 10000.0d);
            int iC = wvdVar.c();
            String phoneNumber = this.d.getPhoneNumber();
            boolean z = wvdVar instanceof wvd.d;
            psm psmVar = this.c;
            DepositRequest depositRequest2 = new DepositRequest(0, bigDecimal, iC, phoneNumber, z ? psmVar.getCountryCode().getCode() : null, psmVar.B(), null, null, null, null, null, null, null, null, null, null, null, null, null, wvdVar.a(), wvdVar.getUserId(), wvdVar.b(), wvdVar.e(), null, 8912832, null);
            sr10 sr10Var = this.a;
            h9eVar.a = (tje0) function2;
            h9eVar.b = depositRequest2;
            h9eVar.f = 1;
            objO = sr10Var.o(depositRequest2, h9eVar);
            if (objO != y5bVar) {
                function3 = function2;
                depositRequest = depositRequest2;
            }
            return y5bVar;
            baseResponse = (BaseResponse) objO;
            if (c0eVar.a()) {
                BigDecimal payAmount = depositRequest.getPayAmount();
                T t = baseResponse.data;
                BankTradeResponse bankTradeResponse = (BankTradeResponse) t;
                if (bankTradeResponse == null || (str = bankTradeResponse.tradeId) == null) {
                    str = "";
                }
                String str2 = str;
                BankTradeResponse bankTradeResponse2 = (BankTradeResponse) t;
                if (bankTradeResponse2 != null) {
                    Integer num = new Integer(bankTradeResponse2.status);
                    if (num.intValue() == 0) {
                        num = null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = baseResponse.bizCode;
                    }
                } else {
                    iIntValue = baseResponse.bizCode;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - c0eVar.a;
                c0eVar.a = 0L;
                qnd qndVar = new qnd(null, str2, payAmount, new Integer(iIntValue), new Long(jCurrentTimeMillis), null, null, null, 16267);
                h9eVar.a = null;
                h9eVar.b = null;
                h9eVar.c = baseResponse;
                h9eVar.f = 2;
                if (function3.invoke(qndVar, h9eVar) != y5bVar) {
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
