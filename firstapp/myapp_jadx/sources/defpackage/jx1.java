package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.jackpot.data.AdSpots;
import com.sportybet.plugin.jackpot.data.Ads;
import com.sportybet.plugin.jackpot.data.AdsData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jx1 implements gv5 {
    public final Object a;

    public jx1(c34 c34Var) {
        c34Var.getClass();
        this.a = c34Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        BaseResponse baseResponse;
        List<AdSpots> list;
        Ads firstAd;
        mx1 mx1Var = (mx1) this.a;
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = (BaseResponse) bi50Var.b) == null || !baseResponse.hasData() || (list = ((AdsData) baseResponse.data).adSpots) == null || list.size() <= 0) {
            return;
        }
        for (AdSpots adSpots : list) {
            if (adSpots != null && adSpots.ads != null && "orderSuccess".equals(adSpots.spotId) && (firstAd = adSpots.getFirstAd()) != null) {
                sh8.a().c(firstAd.imgUrl, new lx1(mx1Var, firstAd));
                return;
            }
        }
    }

    public jx1(mx1 mx1Var) {
        this.a = mx1Var;
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
    }
}
