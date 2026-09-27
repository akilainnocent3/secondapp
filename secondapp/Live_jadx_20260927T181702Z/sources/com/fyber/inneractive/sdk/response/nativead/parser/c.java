package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject != null) {
            hVar.f47761a = v.a(jSONObject, "url");
            hVar.f47763c = v.a(jSONObject, "fallback");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(fw.b.f85379f)) {
                        hVar.f47762b.add(strOptString);
                    }
                }
            }
        }
        return hVar;
    }
}
