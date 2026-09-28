package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.wheelanddeal.model.WDAmountConfigModel;
import com.sportygames.wheelanddeal.model.WDAvailable;
import com.sportygames.wheelanddeal.model.WDBetResponseModel;
import com.sportygames.wheelanddeal.model.WDPayTableModel;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import com.sportygames.wheelanddeal.model.WDUserModel;

/* JADX INFO: loaded from: classes8.dex */
public interface kti0 {
    lyh<HTTPResponse<WDBetResponseModel>> a(oti0 oti0Var, int i, double d, long j, String str, Double d2);

    lyh<HTTPResponse<WDAvailable>> available();

    lyh<HTTPResponse<WDPayTableModel>> b();

    lyh c(Integer num);

    lyh<HTTPResponse<WDUserInfoModel>> d();

    lyh<HTTPResponse<WDUserModel>> e();

    or60 f();

    lyh<HTTPResponse<WDAmountConfigModel>> g();
}
