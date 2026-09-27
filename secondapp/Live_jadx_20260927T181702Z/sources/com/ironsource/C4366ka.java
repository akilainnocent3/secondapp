package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class C4366ka extends AbstractC4248e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f62218i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f62219j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f62220k = G5.Q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f62221l = "data";

    public C4366ka(int i10) {
        this.f61593g = i10;
    }

    @Override // com.ironsource.AbstractC4248e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC4248e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC4248e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f61592f = new JSONObject();
        } else {
            this.f61592f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObject2.put(G5.Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
