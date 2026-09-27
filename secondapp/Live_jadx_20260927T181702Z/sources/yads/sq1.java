package yads;

import com.ironsource.Q6;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sq1 {
    public static JSONObject a(qq1 qq1Var, String str, MediatedBannerSize mediatedBannerSize) {
        String str2 = qq1Var.f154555b;
        Map map = qq1Var.f154561h;
        Map map2 = qq1Var.f154556c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Q6.G1, str2);
            if (map != null) {
                jSONObject.put("bidding_info", new JSONObject(map));
            }
            jSONObject.put("network_data", new JSONObject(map2));
            jSONObject.put("bidder_token", str);
            if (mediatedBannerSize != null) {
                jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
            }
            return jSONObject;
        } catch (JSONException unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }
}
