package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGAvailableDTO;
import com.sportygames.goldmine.data.dto.TGBetAmountConfigDTO;
import com.sportygames.goldmine.data.dto.TGBetDTO;
import com.sportygames.goldmine.data.dto.TGGiftDTO;
import com.sportygames.goldmine.data.dto.TGPayTableDTO;
import com.sportygames.goldmine.data.dto.TGUserDTO;
import com.sportygames.goldmine.data.dto.TGUserInfoDTO;

/* JADX INFO: loaded from: classes7.dex */
public interface t4l {
    lyh<HTTPResponse<TGAvailableDTO>> a();

    lyh<HTTPResponse<TGGiftDTO>> b();

    lyh c(Integer num);

    lyh<HTTPResponse<TGUserInfoDTO>> d();

    lyh<HTTPResponse<TGUserDTO>> e();

    lyh<HTTPResponse<TGPayTableDTO>> f();

    lyh<HTTPResponse<TGBetAmountConfigDTO>> g();

    lyh<HTTPResponse<TGBetDTO>> h(int i, double d, long j, String str, Double d2);
}
