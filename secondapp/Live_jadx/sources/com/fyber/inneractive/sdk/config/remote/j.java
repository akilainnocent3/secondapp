package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f44465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f44466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f44467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Skip f44468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f44469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TapAction f44470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Orientation f44471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f44472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f44473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f44474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f44475k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f44466b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f44467c = numValueOf2;
        jVar.f44468d = Skip.fromValue(Integer.valueOf(jSONObject.optInt(com.google.android.material.timepicker.h.f51923u, Integer.MIN_VALUE)));
        jVar.f44469e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f44465a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f44471g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f44470f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f44472h = numValueOf3;
        jVar.f44473i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f44474j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i10, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f44475k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
