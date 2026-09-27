package com.bytedance.sdk.openadsdk.hnv.tq;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<C0377hww> f37325sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<C0377hww> f37326tq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.hnv.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0377hww {
        private String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private int f37327sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f37328tq;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0377hww)) {
                return super.equals(obj);
            }
            String str2 = this.hww;
            if (str2 != null) {
                C0377hww c0377hww = (C0377hww) obj;
                if (str2.equals(c0377hww.hww) && (str = this.f37328tq) != null && str.equals(c0377hww.f37328tq)) {
                    return true;
                }
            }
            return false;
        }

        public static C0377hww hww(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0377hww c0377hww = new C0377hww();
            c0377hww.hww = jSONObject.optString("url");
            c0377hww.f37328tq = jSONObject.optString("md5");
            c0377hww.f37327sd = jSONObject.optInt("type");
            return c0377hww;
        }

        public String hww() {
            return this.hww;
        }
    }

    public void hww(String str) {
        this.hww = str;
    }

    public List<C0377hww> sd() {
        return this.f37325sd;
    }

    public void tq(List<C0377hww> list) {
        this.f37325sd = list;
    }

    public void hww(List<C0377hww> list) {
        this.f37326tq = list;
    }

    public List<C0377hww> tq() {
        return this.f37326tq;
    }

    public static hww tq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            hww hwwVar = new hww();
            hwwVar.hww(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0377hww c0377hwwHww = C0377hww.hww(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0377hwwHww != null) {
                        if (c0377hwwHww.f37327sd != 1) {
                            if (c0377hwwHww.f37327sd == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0377hwwHww);
                            }
                        } else {
                            arrayList.add(c0377hwwHww);
                        }
                    }
                }
            }
            hwwVar.hww(arrayList);
            hwwVar.tq(arrayList2);
            return hwwVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String hww() {
        return this.hww;
    }
}
