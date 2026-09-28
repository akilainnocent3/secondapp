package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sportybet.android.globalpay.data.CPFValidateResult;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jf\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b2\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0012\b\u0001\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0012\b\u0001\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\f\u0010\rJ<\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tj\u0004\u0018\u0001`\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\tj\u0004\u0018\u0001`\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Ls1l;", "", "", "", "providerIds", "channelIds", "paymentTypes", "", "upperLevel", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/globalpay/data/KycLimitData;", "Lcom/sportybet/android/globalpay/network/KycLimitDataResult;", "d", "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", "uid", "currency", "isWithdraw", "Lcom/sportybet/android/globalpay/data/FullSummaryData;", "Lcom/sportybet/android/globalpay/network/FullSummaryResult;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/pocket/deposit/DepositHistoryStatusData;", "Lcom/sportybet/android/globalpay/network/FirstDepositState;", "a", "(Lv1b;)Ljava/lang/Object;", "cpf", "Lcom/sportybet/android/globalpay/data/CPFValidateResult;", "c", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public interface s1l {
    @sbj("pocket/v1/bankTrades/bankTrade/firstDepositState")
    @gil({"Content-Type: application/json"})
    Object a(v1b<? super BaseResponse<DepositHistoryStatusData>> v1bVar);

    @sbj("pocket/v1/trades/fullsummary")
    @gil({"Content-Type: application/json"})
    Object b(@db30("uid") String str, @db30("currency") String str2, @db30("isWithdraw") boolean z, v1b<? super BaseResponse<FullSummaryData>> v1bVar);

    @sbj("pocket/v1/paych/pix/validate/cpf")
    Object c(@db30("cpf") String str, v1b<? super BaseResponse<CPFValidateResult>> v1bVar);

    @sbj("patron/kyc/user/tier/paymentLimit")
    @gil({"Content-Type: application/json"})
    Object d(@db30("providerIds") String[] strArr, @db30("channelIds") String[] strArr2, @db30("paymentTypes") String[] strArr3, @db30("upperLevel") boolean z, v1b<? super BaseResponse<KycLimitData>> v1bVar);
}
