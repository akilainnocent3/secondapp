package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r6h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                facialRecognitionResult.getClass();
                ((Function1) obj2).invoke(facialRecognitionResult);
                return Unit.a;
            case 1:
                dfm dfmVar = (dfm) obj2;
                Boolean bool = (Boolean) obj;
                List<String> list = dfm.v2;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(new JSONObject().put("spotId", "mainBanner2"));
                    jSONArray.put(new JSONObject().put("spotId", "secondBanner2"));
                    if (dfmVar.g1) {
                        jSONArray.put(new JSONObject().put("spotId", "alertBanner"));
                    }
                    jSONArray.put(new JSONObject().put("spotId", "centerTab3"));
                    jSONArray.put(new JSONObject().put("spotId", "eventInner"));
                    jSONArray.put(new JSONObject().put("spotId", "popularList2"));
                    if (dfmVar.B0 && bool.booleanValue()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("spotId", "mainDepositPop");
                        jSONArray.put(jSONObject2);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("spotId", "mainGiftBox2");
                    jSONArray.put(jSONObject3);
                    jSONObject.put("adSpots", jSONArray);
                    break;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                su5<BaseResponse<RealSportsAdsData>> su5VarA = dfmVar.C.a(jSONObject.toString());
                dfmVar.y0 = su5VarA;
                su5VarA.G(new gfm(dfmVar));
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setBackgroundColor(0);
                webView.setLayerType(2, null);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadDataWithBaseURL(null, (String) obj2, "text/html", "UTF-8", null);
                return webView;
        }
    }
}
