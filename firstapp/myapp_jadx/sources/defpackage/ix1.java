package defpackage;

import android.widget.ImageView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ix1 {
    public final ImageView a;
    public su5<BaseResponse<RealSportsAdsData>> b;
    public final mo0 c = l840.a();

    public ix1(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        su5<BaseResponse<RealSportsAdsData>> su5Var = this.b;
        if (su5Var != null) {
            su5Var.cancel();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("spotId", "orderSuccess"));
            jSONObject.put("adSpots", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        su5<BaseResponse<RealSportsAdsData>> su5VarA = this.c.a(jSONObject.toString());
        this.b = su5VarA;
        su5VarA.G(new a());
    }

    public class a implements gv5<BaseResponse<RealSportsAdsData>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<RealSportsAdsData>> su5Var, bi50<BaseResponse<RealSportsAdsData>> bi50Var) {
            BaseResponse<RealSportsAdsData> baseResponse;
            List<RealSportsAdSpots> adSpots;
            RealSportsAds firstAd;
            if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData() || (adSpots = baseResponse.data.getAdSpots()) == null || adSpots.size() <= 0) {
                return;
            }
            for (RealSportsAdSpots realSportsAdSpots : adSpots) {
                if (realSportsAdSpots != null && realSportsAdSpots.getAds() != null && "orderSuccess".equals(realSportsAdSpots.getSpotId()) && (firstAd = realSportsAdSpots.getFirstAd()) != null) {
                    sh8.a().c(firstAd.getImgUrl(), new kx1(ix1.this, firstAd));
                    return;
                }
            }
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<RealSportsAdsData>> su5Var, Throwable th) {
        }
    }
}
