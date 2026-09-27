package vd;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.a f140919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f140920c;

    public h(JSONObject jSONObject, com.fyber.inneractive.sdk.response.a aVar, Map map) {
        try {
            this.f140918a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (JSONException e10) {
            IAlog.a("Failed extracting markup", e10, new Object[0]);
        }
        this.f140919b = aVar;
        this.f140920c = map;
    }
}
