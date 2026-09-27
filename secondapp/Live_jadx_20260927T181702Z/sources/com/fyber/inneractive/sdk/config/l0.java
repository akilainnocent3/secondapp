package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f44415a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnitDisplayType f44416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f44417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f44418d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, ToolBar.REFRESH, this.f44415a);
        c1.a(jSONObject, "unitDisplayType", this.f44416b);
        c1.a(jSONObject, "close", this.f44417c);
        c1.a(jSONObject, "hideDelay", this.f44418d);
        return jSONObject;
    }
}
