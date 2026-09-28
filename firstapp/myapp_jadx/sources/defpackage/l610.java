package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ll610;", "", "", "uid", "tradeId", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/pocket/common/BankTradeResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public interface l610 {
    @sbj("pocket/v1/statements/getByTradeId")
    Object a(@db30("uid") String str, @db30("tradeId") String str2, v1b<? super BaseResponse<BankTradeResponse>> v1bVar);
}
