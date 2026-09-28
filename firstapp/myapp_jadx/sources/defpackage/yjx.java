package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.jackpot.data.AdSpots;
import com.sportybet.plugin.jackpot.data.Ads;
import com.sportybet.plugin.jackpot.data.AdsData;
import com.sportybet.plugin.jackpot.widget.NavigationBarLoadingView;
import com.sportybet.plugin.jackpot.widget.a;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yjx implements gv5<BaseResponse<AdsData>> {
    public final /* synthetic */ NavigationBarLoadingView a;

    public yjx(NavigationBarLoadingView navigationBarLoadingView) {
        this.a = navigationBarLoadingView;
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<AdsData>> su5Var, bi50<BaseResponse<AdsData>> bi50Var) {
        BaseResponse<AdsData> baseResponse;
        List<AdSpots> list;
        Ads firstAd;
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData() || (list = baseResponse.data.adSpots) == null || list.size() <= 0) {
            return;
        }
        for (AdSpots adSpots : list) {
            if (adSpots != null && adSpots.ads != null && "orderBottom".equals(adSpots.spotId) && (firstAd = adSpots.getFirstAd()) != null) {
                int i = NavigationBarLoadingView.y;
                NavigationBarLoadingView navigationBarLoadingView = this.a;
                navigationBarLoadingView.getClass();
                sh8.a().c(firstAd.imgUrl, new a(navigationBarLoadingView, firstAd));
                return;
            }
        }
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<AdsData>> su5Var, Throwable th) {
    }
}
