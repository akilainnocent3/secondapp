package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.partnet.PartnerInfo;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lhtz;", "", "", "partnerCode", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/partnet/PartnerInfo;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface htz {
    @sbj("partner/account/id/byCode")
    Object a(@db30(EventKeys.ERROR_CODE) String str, v1b<? super BaseResponse<PartnerInfo>> v1bVar);
}
