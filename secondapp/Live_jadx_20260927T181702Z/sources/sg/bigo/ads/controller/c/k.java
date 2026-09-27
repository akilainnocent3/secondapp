package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4235d4;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sw.t;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements sg.bigo.ads.api.core.b.InterfaceC1338b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f134064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f134065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f134066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f134067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f134068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f134069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f134070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f134071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f134072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f134073j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f134074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f134075l;

    public k(@NonNull JSONObject jSONObject) {
        this.f134064a = jSONObject.optString("land_url", "");
        this.f134065b = jSONObject.optString("deeplink_url", "");
        this.f134066c = jSONObject.optInt("web_ad_model", 0);
        this.f134068e = jSONObject.optString("return_tracker_url", "");
        this.f134069f = jSONObject.optInt("land_preload_type", 0);
        this.f134070g = jSONObject.optString("click_open_pkg", "");
        this.f134071h = jSONObject.optInt("probe_interval", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pixel");
        if (jSONObjectOptJSONObject != null) {
            this.f134072i = jSONObjectOptJSONObject.optString(t.f135772k, "");
            String strOptString = jSONObjectOptJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strOptString)) {
                b(strOptString);
            }
        } else {
            this.f134072i = "";
        }
        this.f134074k = jSONObject.optString("pre_landing_url", "");
        this.f134075l = jSONObject.optInt("pre_landing_scene", 0);
        this.f134067d = jSONObject.optJSONArray("webview_bundle");
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String a() {
        return this.f134064a;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String b() {
        return this.f134065b;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final int c() {
        return this.f134066c;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final JSONArray d() {
        return this.f134067d;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String e() {
        return this.f134068e;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final int f() {
        return this.f134069f;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String g() {
        return this.f134070g;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String h() {
        return this.f134072i;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final Map<String, String> i() {
        return this.f134073j;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final String j() {
        return this.f134074k;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final int k() {
        return this.f134075l;
    }

    private void b(String str) {
        this.f134073j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("&")) {
            if (str2.indexOf(C4235d4.j.f61456b) >= 0) {
                String strSubstring = str2.substring(0, str2.indexOf(C4235d4.j.f61456b));
                if (!TextUtils.isEmpty(strSubstring)) {
                    String str3 = this.f134073j.get(strSubstring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str3)) {
                        str2 = str3 + "&" + str2;
                    }
                    this.f134073j.put(strSubstring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1338b
    public final void a(@NonNull String str) {
        this.f134064a = str;
    }
}
