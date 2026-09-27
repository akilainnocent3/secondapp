package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f66777a = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f66778b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f66779c = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f66780d = new JSONArray();

    private a() {
        c();
    }

    public static a b() {
        if (f66778b == null) {
            synchronized (a.class) {
                try {
                    if (f66778b == null) {
                        f66778b = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f66778b;
    }

    private void c() {
        try {
            String str = (String) y0.a(c.n().d(), f66779c, f66780d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f66780d = new JSONArray(str);
        } catch (Exception e10) {
            q0.b(f66777a, e10.getMessage());
        }
    }

    private void d() {
        try {
            if (f66780d != null) {
                y0.b(c.n().d(), f66779c, f66780d.toString());
            }
        } catch (Exception e10) {
            q0.b(f66777a, e10.getMessage());
        }
    }

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f66780d == null) {
            f66780d = new JSONArray();
        }
        f66780d.put(jSONObjectA);
        d();
    }

    public void a(String str) {
        if (f66780d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f66780d.length(); i10++) {
                try {
                    JSONObject jSONObject = f66780d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    q0.b(f66777a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f66780d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f66780d != null) {
            for (int i10 = 0; i10 < f66780d.length(); i10++) {
                try {
                    JSONObject jSONObject = f66780d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    q0.b(f66777a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) {
        if (f66780d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f66780d.length(); i10++) {
                try {
                    JSONObject jSONObject = f66780d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    q0.b(f66777a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f66780d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
                jSONObject.put("fc_a", i10);
                jSONObject.put("fc_b", i11);
                jSONObject.put("ts", j10);
                jSONObject.put("impression_count", i12);
                jSONObject.put("click_count", i13);
                return jSONObject;
            } catch (Exception e10) {
                e = e10;
                q0.b(f66777a, e.getMessage());
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
            jSONObject = null;
        }
    }
}
