package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4443od {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f63219b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f63220c = "placements";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f63221d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final JSONArray f63222a;

    /* JADX INFO: renamed from: com.ironsource.od$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public C4443od(@oy.l JSONObject configuration) {
        kotlin.jvm.internal.m0.p(configuration, "configuration");
        this.f63222a = configuration.optJSONArray(f63220c);
    }

    @oy.l
    public final <T> Map<String, T> a(@oy.l ds.l<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        kotlin.jvm.internal.m0.p(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f63222a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i10);
                String key = jsonObject.optString("placementName");
                kotlin.jvm.internal.m0.o(jsonObject, "jsonObject");
                T tInvoke = valueExtractor.invoke(jsonObject);
                kotlin.jvm.internal.m0.o(key, "key");
                linkedHashMap.put(key, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
