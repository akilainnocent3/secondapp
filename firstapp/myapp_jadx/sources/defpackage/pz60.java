package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pz60 implements gv5<BaseResponse<RealSportsAdsData>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ oz60 b;

    public pz60(oz60 oz60Var, String str) {
        this.b = oz60Var;
        this.a = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<RealSportsAdsData>> su5Var, Throwable th) {
        this.b.o0(this.a, "", "", false);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<RealSportsAdsData>> su5Var, bi50<BaseResponse<RealSportsAdsData>> bi50Var) {
        BaseResponse<RealSportsAdsData> baseResponse;
        RealSportsAdsData realSportsAdsData;
        List<RealSportsAdSpots> adSpots;
        oz60 oz60Var = this.b;
        e activity = oz60Var.getActivity();
        if (activity == null || activity.isFinishing() || oz60Var.G.isCanceled() || !bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (realSportsAdsData = baseResponse.data) == null || (adSpots = realSportsAdsData.getAdSpots()) == null || adSpots.size() <= 0 || adSpots.get(0) == null) {
            return;
        }
        RealSportsAds firstAd = adSpots.get(0).getFirstAd();
        if (firstAd == null || TextUtils.isEmpty(firstAd.getLinkUrl()) || TextUtils.isEmpty(firstAd.getImgUrl())) {
            onFailure(su5Var, null);
        } else {
            oz60Var.o0(this.a, firstAd.getImgUrl(), firstAd.getLinkUrl(), true);
        }
    }
}
