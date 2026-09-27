package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sg.bigo.ads.api.a.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.api.a.f[] f132790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.api.a.f f132791f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f132786a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f132787b = "en";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f132788c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f132789d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f132792g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f132793h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f132794i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f132795j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.b f132797l = new sg.bigo.ads.api.a.e.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.a f132798m = new sg.bigo.ads.api.a.e.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.c[] f132796k = new sg.bigo.ads.api.a.e.c[0];

    @Override // sg.bigo.ads.api.a.e
    public final String a() {
        return this.f132788c;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String b() {
        return this.f132789d;
    }

    @Override // sg.bigo.ads.api.a.e
    public final long c() {
        return this.f132786a;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int d() {
        return this.f132794i;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String e() {
        return this.f132787b;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int f() {
        return this.f132795j;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String g() {
        return this.f132793h;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String h() {
        return this.f132792g;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f[] i() {
        return this.f132790e;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f j() {
        sg.bigo.ads.api.a.f[] fVarArr = this.f132790e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f k() {
        return this.f132791f;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.b l() {
        return this.f132797l;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.c[] m() {
        return this.f132796k;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.a n() {
        return this.f132798m;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f132786a = jSONObject.optLong("form_id", 0L);
            this.f132788c = jSONObject.optString("title", "");
            this.f132787b = jSONObject.optString("ad_lang", "en");
            this.f132789d = jSONObject.optString("description", "");
            this.f132792g = jSONObject.optString("purpose", "");
            this.f132794i = jSONObject.optInt("color", 0);
            this.f132795j = jSONObject.optInt("form_style_id", 0);
            this.f132793h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject != null) {
                this.f132791f = new j(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new sg.bigo.ads.api.a.e.c(jSONObjectOptJSONObject2));
                    }
                }
                sg.bigo.ads.api.a.e.c[] cVarArr = new sg.bigo.ads.api.a.e.c[arrayList.size()];
                this.f132796k = cVarArr;
                this.f132796k = (sg.bigo.ads.api.a.e.c[]) arrayList.toArray(cVarArr);
            }
            sg.bigo.ads.api.a.e.b bVar = this.f132797l;
            String strOptString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    bVar.f132710a = jSONObject2.optString("name", "");
                    bVar.f132711b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            sg.bigo.ads.api.a.e.a aVar = this.f132798m;
            String strOptString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString2);
            aVar.f132706a = jSONObject3.optString("title", "");
            aVar.f132707b = jSONObject3.optString("description", "");
            aVar.f132708c = jSONObject3.optString(C4235d4.i.G0, "");
            aVar.f132709d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new j(jSONObjectOptJSONObject));
                }
            }
            j[] jVarArr = new j[arrayList.size()];
            this.f132790e = jVarArr;
            this.f132790e = (sg.bigo.ads.api.a.f[]) arrayList.toArray(jVarArr);
        }
    }
}
