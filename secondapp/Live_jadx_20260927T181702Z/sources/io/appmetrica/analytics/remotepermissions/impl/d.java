package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99003a = "permissions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99004b = "name";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99005c = "list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f99006d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(@l JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f99003a);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f99005c)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean(this.f99006d)) {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f99004b);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    @m
    public final a b(@l JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
