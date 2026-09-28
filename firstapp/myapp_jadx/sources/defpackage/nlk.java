package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.GiftGrabGiftValue;
import com.sportybet.plugin.realsports.data.GiftGrabInfoResponse;
import com.sportybet.plugin.realsports.data.GiftGrabProgressData;
import com.sportybet.plugin.realsports.data.GiftGrabResult;
import com.sportybet.plugin.realsports.data.GiftGrabUserGrabAvailable;

/* JADX INFO: loaded from: classes4.dex */
public interface nlk {
    lyh<BaseResponse<GiftGrabGiftValue>> a(String str, String str2);

    lyh<BaseResponse<GiftGrabResult>> b(String str, String str2);

    lyh<BaseResponse<GiftGrabUserGrabAvailable>> c(String str, String str2);

    lyh<BaseResponse<GiftGrabInfoResponse>> d(String str, String str2);

    lyh<BaseResponse<GiftGrabProgressData>> e(String str, String str2);
}
