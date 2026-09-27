package com.bytedance.sdk.component.adexpress.hww.sd;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f34410hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private tq f34411hv;
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private String f34412sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34413tq;
    private Map<String, hww> vgm = new ConcurrentHashMap();
    private List<C0319hww> vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.hww.sd.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0319hww {
        private String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private int f34414sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f34415tq;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0319hww)) {
                return super.equals(obj);
            }
            String str2 = this.hww;
            if (str2 != null) {
                C0319hww c0319hww = (C0319hww) obj;
                if (str2.equals(c0319hww.hww()) && (str = this.f34415tq) != null && str.equals(c0319hww.tq())) {
                    return true;
                }
            }
            return false;
        }

        public String hww() {
            return this.hww;
        }

        public int sd() {
            return this.f34414sd;
        }

        public String tq() {
            return this.f34415tq;
        }

        public void hww(String str) {
            this.hww = str;
        }

        public void tq(String str) {
            this.f34415tq = str;
        }

        public void hww(int i10) {
            this.f34414sd = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq {
        private String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private List<Pair<String, String>> f34416sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private String f34417tq;

        public String hww() {
            return this.hww;
        }

        public void tq(String str) {
            this.f34417tq = str;
        }

        public void hww(String str) {
            this.hww = str;
        }

        public List<Pair<String, String>> tq() {
            return this.f34416sd;
        }

        public void hww(List<Pair<String, String>> list) {
            this.f34416sd = list;
        }
    }

    public List<C0319hww> hu() {
        if (this.vy == null) {
            this.vy = new ArrayList();
        }
        return this.vy;
    }

    public tq hv() {
        return this.f34411hv;
    }

    public Map<String, hww> hww() {
        return this.vgm;
    }

    public String nod() {
        JSONObject jSONObjectRs;
        if (!ok() || (jSONObjectRs = rs()) == null) {
            return null;
        }
        return jSONObjectRs.toString();
    }

    public boolean ok() {
        return (TextUtils.isEmpty(vy()) || TextUtils.isEmpty(sd()) || TextUtils.isEmpty(tq())) ? false : true;
    }

    public JSONObject rs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", tq());
            jSONObject.putOpt("version", sd());
            jSONObject.putOpt("main", vy());
            if (!TextUtils.isEmpty(this.f34410hu)) {
                jSONObject.put("template_fetch_url", this.f34410hu);
            }
            JSONArray jSONArray = new JSONArray();
            if (hu() != null) {
                for (C0319hww c0319hww : hu()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0319hww.hww());
                    jSONObject2.putOpt("md5", c0319hww.tq());
                    jSONObject2.putOpt("level", Integer.valueOf(c0319hww.sd()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.vgm.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.vgm.keySet()) {
                    hww hwwVar = this.vgm.get(str);
                    if (hwwVar != null) {
                        jSONObject3.put(str, hwwVar.rs());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            tq tqVarHv = hv();
            if (tqVarHv != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", tqVarHv.hww);
                jSONObject4.put("md5", tqVarHv.f34417tq);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listTq = tqVarHv.tq();
                if (listTq != null) {
                    for (Pair<String, String> pair : listTq) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String sd() {
        return this.f34413tq;
    }

    public String tq() {
        return this.hww;
    }

    public String vgm() {
        return this.f34410hu;
    }

    public String vy() {
        return this.f34412sd;
    }

    public static hww hv(String str) {
        if (str == null) {
            return null;
        }
        try {
            return hww(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void sd(String str) {
        this.f34412sd = str;
    }

    public void tq(String str) {
        this.f34413tq = str;
    }

    public void vy(String str) {
        this.f34410hu = str;
    }

    public void hww(tq tqVar) {
        this.f34411hv = tqVar;
    }

    public void hww(List<C0319hww> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.vy = list;
    }

    public static hww hww(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        hww hwwVar = new hww();
        hwwVar.hww(jSONObject.optString("name"));
        hwwVar.tq(jSONObject.optString("version"));
        hwwVar.sd(jSONObject.optString("main"));
        hwwVar.vy(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0319hww c0319hww = new C0319hww();
                c0319hww.hww(jSONObjectOptJSONObject2.optString("url"));
                c0319hww.tq(jSONObjectOptJSONObject2.optString("md5"));
                c0319hww.hww(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0319hww);
            }
        }
        hwwVar.hww(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    hww hwwVarHww = hww(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (hwwVarHww != null) {
                        hwwVar.hww().put(next, hwwVarHww);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            tq tqVar = new tq();
            tqVar.hww(jSONObjectOptJSONObject.optString("url"));
            tqVar.tq(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                tqVar.hww(arrayList2);
            }
            hwwVar.hww(tqVar);
        }
        if (hwwVar.ok()) {
            return hwwVar;
        }
        return null;
    }
}
