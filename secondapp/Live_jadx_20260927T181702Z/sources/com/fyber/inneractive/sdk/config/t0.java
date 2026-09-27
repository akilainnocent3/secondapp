package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f44485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f44486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f44487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f44488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Orientation f44489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f44490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f44491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Skip f44492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TapAction f44493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f44494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f44495k;

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f44485a = bool;
        this.f44486b = 5000;
        this.f44487c = 0;
        this.f44488d = bool;
        this.f44490f = 0;
        this.f44491g = 2048;
        this.f44492h = Skip.fromValue(0);
        this.f44495k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f44485a);
        c1.a(jSONObject, "maxBitrate", this.f44486b);
        c1.a(jSONObject, "minBitrate", this.f44487c);
        c1.a(jSONObject, "muted", this.f44488d);
        c1.a(jSONObject, "orientation", this.f44489e);
        c1.a(jSONObject, "padding", this.f44490f);
        c1.a(jSONObject, "pivotBitrate", this.f44491g);
        c1.a(jSONObject, com.google.android.material.timepicker.h.f51923u, this.f44492h);
        c1.a(jSONObject, "tapAction", this.f44493i);
        c1.a(jSONObject, "unitDisplayType", this.f44494j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f44495k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
