package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
class i implements l, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f133978a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f133979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f133980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f133981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f133982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f133983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f133984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f133985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f133986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f133987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f133988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f133989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f133990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f133991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f133992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List<sg.bigo.ads.api.a.a> f133993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f133994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f133995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected m f133996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f133997t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f133998u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f133999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f134000w;

    @Override // sg.bigo.ads.api.a.l
    public String a() {
        return this.f133979b;
    }

    @Override // sg.bigo.ads.api.a.l
    public int b() {
        return this.f133980c;
    }

    @Override // sg.bigo.ads.api.a.l
    public int c() {
        return this.f133981d;
    }

    @Override // sg.bigo.ads.api.a.l
    public int d() {
        return this.f133982e;
    }

    @Override // sg.bigo.ads.api.a.l
    public int e() {
        return this.f133983f;
    }

    @Override // sg.bigo.ads.api.a.l
    public int f() {
        return this.f133984g;
    }

    @Override // sg.bigo.ads.api.a.l
    public int g() {
        return this.f133985h;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean h() {
        return this.f133986i;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean i() {
        return this.f133987j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean j() {
        return this.f133988k;
    }

    @Override // sg.bigo.ads.api.a.l
    public int k() {
        return this.f133989l;
    }

    @Override // sg.bigo.ads.api.a.l
    public String l() {
        return this.f133990m;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean m() {
        return this.f133991n;
    }

    @Override // sg.bigo.ads.api.a.l
    public String n() {
        return this.f133992o;
    }

    @Override // sg.bigo.ads.api.a.l
    public String o() {
        return this.f133994q;
    }

    @Override // sg.bigo.ads.api.a.l
    public String p() {
        return this.f133995r;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public m q() {
        if (this.f133996s == null) {
            this.f133996s = new j(new JSONObject());
        }
        return this.f133996s;
    }

    @Override // sg.bigo.ads.api.a.l
    public int r() {
        return this.f133997t;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean s() {
        return this.f133997t == 1;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean t() {
        return this.f133998u == 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<sg.bigo.ads.api.a.a> list = this.f133993p;
        if (list != null) {
            for (sg.bigo.ads.api.a.a aVar : list) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(aVar);
            }
        }
        return "{strategyId=" + this.f133979b + ", adType=" + this.f133980c + ", countdown=" + this.f133981d + ", reqTimeout=" + this.f133982e + ", mediaStrategy=" + this.f133983f + ", webViewEnforceDuration=" + this.f133984g + ", videoDirection=" + this.f133985h + ", videoReplay=" + this.f133986i + ", videoMute=" + this.f133987j + ", bannerAutoRefresh=" + this.f133988k + ", bannerRefreshInterval=" + this.f133989l + ", slotId='" + this.f133990m + "', state=" + this.f133991n + ", placementId='" + this.f133992o + "', express=[" + sb2.toString() + "], styleId=" + this.f133995r + ", playable=" + this.f133997t + ", isCompanionRenderSupport=" + this.f133998u + ", aucMode=" + this.f134000w + ", nativeAdClickConfig=" + this.f133978a + fw.b.f85383j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean u() {
        return this.f133999v;
    }

    @Override // sg.bigo.ads.api.a.l
    public int v() {
        return this.f134000w;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean w() {
        return this.f134000w == 3;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public k x() {
        return this.f133978a;
    }

    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f133979b);
        parcel.writeInt(this.f133980c);
        parcel.writeInt(this.f133981d);
        parcel.writeInt(this.f133982e);
        parcel.writeInt(this.f133983f);
        parcel.writeInt(this.f133984g);
        parcel.writeInt(this.f133985h);
        parcel.writeInt(this.f133986i ? 1 : 0);
        parcel.writeInt(this.f133987j ? 1 : 0);
        parcel.writeInt(this.f133988k ? 1 : 0);
        parcel.writeInt(this.f133989l);
        parcel.writeString(this.f133990m);
        parcel.writeInt(this.f133991n ? 1 : 0);
        parcel.writeString(this.f133992o);
        n.a(parcel, this.f133993p);
        parcel.writeInt(this.f133997t);
        parcel.writeString(this.f133995r);
        m mVar = this.f133996s;
        parcel.writeString(mVar == null ? null : mVar.toString());
        parcel.writeInt(this.f133999v ? 1 : 0);
        parcel.writeInt(this.f133998u);
        parcel.writeInt(this.f134000w);
        n.a(parcel, this.f133978a);
    }

    public void b(@NonNull Parcel parcel) {
        this.f133979b = parcel.readString();
        this.f133980c = parcel.readInt();
        this.f133981d = parcel.readInt();
        this.f133982e = parcel.readInt();
        this.f133983f = parcel.readInt();
        this.f133984g = parcel.readInt();
        this.f133985h = parcel.readInt();
        this.f133986i = parcel.readInt() != 0;
        this.f133987j = parcel.readInt() != 0;
        this.f133988k = parcel.readInt() != 0;
        this.f133989l = parcel.readInt();
        this.f133990m = parcel.readString();
        this.f133991n = parcel.readInt() != 0;
        this.f133992o = parcel.readString();
        this.f133993p = n.a(parcel, new sg.bigo.ads.common.f.a<sg.bigo.ads.api.a.a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        });
        this.f133997t = n.a(parcel, 0);
        this.f133995r = n.a(parcel, "");
        a(n.a(parcel, ""));
        this.f133999v = n.b(parcel, true);
        this.f133998u = n.a(parcel, 0);
        this.f134000w = n.a(parcel, 0);
        n.b(parcel, this.f133978a);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f133980c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.f133996s = new j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            sg.bigo.ads.common.t.a.a(0, "Slot", "parseData error, jsonObject is null.");
            return false;
        }
        this.f133981d = jSONObject.optInt("countdown", 5);
        this.f133980c = jSONObject.optInt("ad_type", -1);
        this.f133979b = jSONObject.optString("strategy_id", "");
        this.f133982e = jSONObject.optInt("req_once_load_timeout", 15);
        this.f133983f = jSONObject.optInt("media_strategy", 0);
        this.f133984g = jSONObject.optInt("webview_enforce_duration", 0) * 1000;
        this.f133985h = jSONObject.optInt("video_direction", 0);
        this.f133986i = sg.bigo.ads.api.core.a.d(this.f133980c) || jSONObject.optInt("video_replay", 1) == 1;
        this.f133987j = sg.bigo.ads.api.core.a.d(this.f133980c) || jSONObject.optInt("video_mute", 0) == 0;
        this.f133988k = jSONObject.optInt("banner_auto_refresh", 0) == 1;
        this.f133989l = jSONObject.optInt("banner_refresh_interval", 20);
        this.f133990m = jSONObject.optString("slot", "");
        this.f133991n = jSONObject.optInt("state", 1) == 1;
        this.f133992o = jSONObject.optString("placement_id", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("express_list");
        this.f133993p = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                a aVar = new a();
                if (jSONObjectOptJSONObject == null) {
                    sg.bigo.ads.common.t.a.a(0, "AdExpress", "parseData error, jsonObject is null.");
                } else {
                    aVar.f133906a = jSONObjectOptJSONObject.optLong("id", 0L);
                    aVar.f133907b = jSONObjectOptJSONObject.optString("name", "");
                    aVar.f133908c = jSONObjectOptJSONObject.optString("url", "");
                    aVar.f133909d = jSONObjectOptJSONObject.optString("md5", "");
                    aVar.f133910e = jSONObjectOptJSONObject.optString("style", "");
                    aVar.f133911f = jSONObjectOptJSONObject.optString("ad_types", "");
                    aVar.f133912g = jSONObjectOptJSONObject.optString(v1.l.a.f139880a, "");
                    if (aVar.f133906a != 0 && !TextUtils.isEmpty(aVar.f133907b) && !TextUtils.isEmpty(aVar.f133908c) && !TextUtils.isEmpty(aVar.f133909d) && !TextUtils.isEmpty(aVar.f133911f) && !TextUtils.isEmpty(aVar.f133912g)) {
                        this.f133993p.add(aVar);
                    }
                }
            }
        }
        this.f133994q = jSONObject.optString("abflags");
        this.f133997t = jSONObject.optInt("playable", 0);
        this.f133995r = jSONObject.optString("style_id");
        a(jSONObject.optString("interstitial_style_config"));
        this.f133999v = jSONObject.optInt("banner_multiple_click", 1) == 1;
        this.f133998u = jSONObject.optInt("companion_render", 0);
        this.f134000w = jSONObject.optInt("auc_mode", 0);
        g gVar = this.f133978a;
        gVar.f133973a = jSONObject.optInt("video_click_mode", 1) == 1;
        gVar.f133974b = jSONObject.optInt("native_ad_view_clickable", 0) == 1;
        gVar.f133975c = jSONObject.optInt("native_ad_click_type", 0);
        if (this.f133991n) {
            return (TextUtils.isEmpty(this.f133990m) || TextUtils.isEmpty(this.f133992o)) ? false : true;
        }
        return true;
    }
}
