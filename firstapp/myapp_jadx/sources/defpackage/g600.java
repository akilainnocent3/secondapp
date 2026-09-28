package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;

/* JADX INFO: loaded from: classes5.dex */
@fae
public interface g600 {
    lyh<BaseResponse<BankTradeResponse>> a(String str);

    lyh<BaseResponse<WithDrawInfo>> b();

    lyh<BaseResponse<BankTradeData>> c(String str);

    lyh<BaseResponse<BankTradeResponse>> d(String str);
}
