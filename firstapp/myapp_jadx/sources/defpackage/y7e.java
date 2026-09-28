package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;

/* JADX INFO: loaded from: classes6.dex */
public final class y7e {
    public static final x7e a(BaseResponse<BankTradeData> baseResponse) {
        baseResponse.getClass();
        String str = baseResponse.message;
        Integer numValueOf = Integer.valueOf(baseResponse.bizCode);
        BankTradeData bankTradeData = baseResponse.data;
        Integer numValueOf2 = bankTradeData != null ? Integer.valueOf(bankTradeData.status) : null;
        BankTradeData bankTradeData2 = baseResponse.data;
        return x7e.a.a(null, str, numValueOf, numValueOf2, bankTradeData2 != null ? bankTradeData2.tradeId : null, bankTradeData2 != null ? bankTradeData2.jumpUrl : null, null, null, bankTradeData2 != null ? bankTradeData2.counterIconUrl : null, bankTradeData2 != null ? bankTradeData2.counterAuthority : null, bankTradeData2 != null ? bankTradeData2.counterPart : null, null, null, null, 14529);
    }

    public static final x7e b(BaseResponse<BankTradeResponse> baseResponse) {
        baseResponse.getClass();
        BankTradeResponse bankTradeResponse = baseResponse.data;
        String str = baseResponse.message;
        Integer numValueOf = Integer.valueOf(baseResponse.bizCode);
        BankTradeResponse bankTradeResponse2 = baseResponse.data;
        Integer numValueOf2 = bankTradeResponse2 != null ? Integer.valueOf(bankTradeResponse2.status) : null;
        BankTradeResponse bankTradeResponse3 = baseResponse.data;
        return x7e.a.a(bankTradeResponse, str, numValueOf, numValueOf2, bankTradeResponse3 != null ? bankTradeResponse3.tradeId : null, bankTradeResponse3 != null ? bankTradeResponse3.jumpUrl : null, bankTradeResponse3 != null ? bankTradeResponse3.embeddedFrame : null, bankTradeResponse3 != null ? bankTradeResponse3.displayMsg : null, bankTradeResponse3 != null ? bankTradeResponse3.counterIconUrl : null, bankTradeResponse3 != null ? bankTradeResponse3.counterAuthority : null, bankTradeResponse3 != null ? bankTradeResponse3.counterPart : null, null, null, bankTradeResponse3 != null ? bankTradeResponse3.initAmount : null, 6144);
    }

    public static final x7e c(TradeAdditionalResult tradeAdditionalResult) {
        tradeAdditionalResult.getClass();
        return x7e.a.a(null, tradeAdditionalResult.a, tradeAdditionalResult.b, tradeAdditionalResult.c, tradeAdditionalResult.d, tradeAdditionalResult.v, tradeAdditionalResult.w, tradeAdditionalResult.i, tradeAdditionalResult.y, tradeAdditionalResult.z, tradeAdditionalResult.A, tradeAdditionalResult.B, tradeAdditionalResult.C, null, 8193);
    }
}
