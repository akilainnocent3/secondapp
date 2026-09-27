package com.chartboost.sdk.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40839c;

    public s1(String str, String str2, String str3) {
        this.f40837a = str;
        this.f40838b = str2;
        this.f40839c = str3;
    }

    public static Map a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            sb.a("deserializeAssets assetsJson is null", null);
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                map.put(next2, new s1(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return map;
    }

    public static Map b(JSONObject jSONObject, int i10) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("templates".equals(next)) {
                        map.putAll(a(jSONObject2, i10));
                    } else {
                        map.putAll(a(jSONObject2, next));
                    }
                }
            } catch (JSONException e10) {
                sb.b("v2PrefetchToAssets: " + e10, null);
                return map;
            }
        }
        return map;
    }

    public String toString() {
        return "Asset{directory='" + this.f40837a + "', filename='" + this.f40838b + "', url='" + this.f40839c + '\'' + fw.b.f85383j;
    }

    public File a(File file) {
        if (this.f40837a != null && this.f40838b != null) {
            String str = this.f40837a + to.c.userBaseDel + this.f40838b;
            try {
                return new File(file, str);
            } catch (Exception e10) {
                sb.a("Cannot create file for path: " + str + ". Error: " + e10, null);
            }
        } else {
            sb.a("Cannot create file. Directory or filename is null.", null);
        }
        return null;
    }

    public String a() {
        return this.f40839c;
    }

    public static Map a(JSONObject jSONObject, String str) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String string = jSONObject2.getString("name");
                map.put(string, new s1(str, string, jSONObject2.getString("value")));
            }
        }
        return map;
    }

    public static Map a(JSONObject jSONObject, int i10) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int iMin = Math.min(i10, jSONArrayOptJSONArray.length());
            for (int i11 = 0; i11 < iMin; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                Iterator it = a(jSONObject2 != null ? a(jSONObject2.getJSONArray("elements")) : null).entrySet().iterator();
                while (it.hasNext()) {
                    s1 s1Var = (s1) ((Map.Entry) it.next()).getValue();
                    map.put(s1Var.f40838b, s1Var);
                }
            }
        }
        return map;
    }

    public static JSONObject a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectA = y2.a(new y2.a[0]);
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strOptString = jSONObject.optString("name");
                String strOptString2 = jSONObject.optString("type");
                String strOptString3 = jSONObject.optString("value");
                String strOptString4 = jSONObject.optString("param");
                if (!"param".equals(strOptString2) && strOptString4.isEmpty()) {
                    JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(strOptString2);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = y2.a(new y2.a[0]);
                        jSONObjectA.put(strOptString2, jSONObjectOptJSONObject);
                    }
                    jSONObjectOptJSONObject.put("html".equals(strOptString2) ? "body" : strOptString, y2.a(y2.a("filename", strOptString), y2.a("url", strOptString3)));
                }
            }
        }
        return jSONObjectA;
    }
}
