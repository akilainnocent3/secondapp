package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vmg0 implements otk0 {
    public static final /* synthetic */ vmg0 a = new vmg0();

    /* JADX WARN: Multi-variable type inference failed */
    public static final TradeAdditionalResult a(BaseResponse baseResponse) {
        baseResponse.getClass();
        String str = baseResponse.message;
        Integer numValueOf = Integer.valueOf(baseResponse.bizCode);
        BankTradeResponse bankTradeResponse = (BankTradeResponse) baseResponse.data;
        Integer numValueOf2 = bankTradeResponse != null ? Integer.valueOf(bankTradeResponse.status) : null;
        T t = baseResponse.data;
        BankTradeResponse bankTradeResponse2 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse3 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse4 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse5 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse6 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse7 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse8 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse9 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse10 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse11 = (BankTradeResponse) t;
        BankTradeResponse bankTradeResponse12 = (BankTradeResponse) t;
        return new TradeAdditionalResult(str, numValueOf, numValueOf2, bankTradeResponse2 != null ? bankTradeResponse2.tradeId : null, bankTradeResponse3 != null ? bankTradeResponse3.bankAccName : null, bankTradeResponse4 != null ? bankTradeResponse4.name : null, bankTradeResponse5 != null ? bankTradeResponse5.displayMsg : null, bankTradeResponse6 != null ? bankTradeResponse6.jumpUrl : null, bankTradeResponse7 != null ? bankTradeResponse7.embeddedFrame : null, bankTradeResponse8 != null ? bankTradeResponse8.counterIconUrl : null, bankTradeResponse9 != null ? bankTradeResponse9.counterAuthority : null, bankTradeResponse10 != null ? bankTradeResponse10.counterPart : null, bankTradeResponse11 != null ? bankTradeResponse11.htmlContent : null, bankTradeResponse12 != null ? Integer.valueOf(bankTradeResponse12.htmlContentReloadCount) : null);
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Boolean.valueOf(((tol0) rol0.b.a.a).zzb());
    }
}
