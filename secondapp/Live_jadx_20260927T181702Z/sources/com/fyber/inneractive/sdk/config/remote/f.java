package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f44450a = null;

    public static f a(JSONObject jSONObject) {
        Track trackFromValue;
        f fVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track");
        if (jSONArrayOptJSONArray != null) {
            fVar = new f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString) && (trackFromValue = Track.fromValue(strOptString)) != null) {
                    linkedHashSet.add(trackFromValue);
                }
            }
            fVar.f44450a = linkedHashSet;
        }
        return fVar;
    }
}
