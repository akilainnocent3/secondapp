package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.plugin.realsports.data.BoostInfo;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class qty implements gv5 {
    public final Object a;

    public qty(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        T t;
        oz60 oz60Var = (oz60) this.a;
        e activity = oz60Var.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Response response = bi50Var.a;
        T t2 = bi50Var.b;
        if (!response.getIsSuccessful() || t2 == 0) {
            return;
        }
        BaseResponse baseResponse = (BaseResponse) t2;
        if (!baseResponse.isSuccessful() || (t = baseResponse.data) == 0) {
            return;
        }
        BoostInfo boostInfo = (BoostInfo) t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= boostInfo.receivingStartTime || jCurrentTimeMillis >= boostInfo.receivingEndTime) {
            oz60Var.o0(boostInfo.periodId, "", "", false);
            return;
        }
        String str = boostInfo.periodId;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("spotId", "oddsBoostLink"));
            jSONObject.put("adSpots", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        su5<BaseResponse<RealSportsAdsData>> su5Var2 = oz60Var.G;
        if (su5Var2 != null) {
            su5Var2.cancel();
        }
        su5<BaseResponse<RealSportsAdsData>> su5VarA = oz60Var.e.a(jSONObject.toString());
        oz60Var.G = su5VarA;
        su5VarA.G(new pz60(oz60Var, str));
    }

    public qty(oz60 oz60Var) {
        this.a = oz60Var;
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
    }
}
