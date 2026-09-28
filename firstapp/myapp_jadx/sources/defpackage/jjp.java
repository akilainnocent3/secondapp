package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.AdSpots;
import com.sporty.android.core.model.ads.AdsData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jjp implements gv5<BaseResponse<AdsData>> {
    public final /* synthetic */ gjp a;

    public jjp(gjp gjpVar) {
        this.a = gjpVar;
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<AdsData>> su5Var, bi50<BaseResponse<AdsData>> bi50Var) {
        BaseResponse<AdsData> baseResponse;
        AdsData adsData;
        List<AdSpots> adSpots;
        gjp gjpVar = this.a;
        e activity = gjpVar.getActivity();
        if (activity == null || activity.isFinishing() || gjpVar.P.isCanceled() || gjpVar.isDetached() || !bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (adsData = baseResponse.data) == null || (adSpots = adsData.getAdSpots()) == null || adSpots.isEmpty()) {
            return;
        }
        AdSpots adSpots2 = adSpots.get(0);
        if (!"depositBanner".equals(adSpots2.getSpotId()) || adSpots2.getFirstAd() == null || TextUtils.isEmpty(adSpots2.getFirstAd().getText())) {
            gjpVar.Q.setVisibility(8);
        } else {
            gjpVar.Q.setText(adSpots2.getFirstAd().getText());
            gjpVar.Q.setVisibility(0);
        }
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<AdsData>> su5Var, Throwable th) {
    }
}
