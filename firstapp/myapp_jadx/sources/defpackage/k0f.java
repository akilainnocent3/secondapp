package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.request.DoubleOrNothingCashoutRequest;
import com.sportybet.android.instantwin.newtork.model.request.DoubleOrNothingCreateAndSettleRequest;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCashoutResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCreateAndSettleResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lk0f;", "", "", "challengeId", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingInfo;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/request/DoubleOrNothingCreateAndSettleRequest;", "request", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCreateAndSettleResult;", "b", "(Lcom/sportybet/android/instantwin/newtork/model/request/DoubleOrNothingCreateAndSettleRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/request/DoubleOrNothingCashoutRequest;", "Lcom/sportybet/android/instantwin/newtork/model/response/doubleornothing/NetworkDoubleOrNothingCashoutResult;", "c", "(Lcom/sportybet/android/instantwin/newtork/model/request/DoubleOrNothingCashoutRequest;Lv1b;)Ljava/lang/Object;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface k0f {
    @sbj("instantwin/api/v1/iwqk/don/info")
    Object a(@db30("challengeId") String str, v1b<? super BaseResponse<NetworkDoubleOrNothingInfo>> v1bVar);

    @flz("instantwin/api/v1/iwqk/don/createAndSettle")
    Object b(@jh4 DoubleOrNothingCreateAndSettleRequest doubleOrNothingCreateAndSettleRequest, v1b<? super BaseResponse<NetworkDoubleOrNothingCreateAndSettleResult>> v1bVar);

    @flz("instantwin/api/v1/iwqk/don/cashout")
    Object c(@jh4 DoubleOrNothingCashoutRequest doubleOrNothingCashoutRequest, v1b<? super BaseResponse<NetworkDoubleOrNothingCashoutResult>> v1bVar);
}
