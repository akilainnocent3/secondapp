package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4295ga {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f61882b = "ga";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61883c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61884d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61885e = "back_button_state";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61886f = "search_keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f61887g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C4295ga f61888h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f61889a;

    private C4295ga(Context context) {
        this.f61889a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C4295ga a(Context context) {
        try {
            if (f61888h == null) {
                f61888h = new C4295ga(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61888h;
    }

    public static synchronized C4295ga e() {
        return f61888h;
    }

    public C4523t8.a b() {
        int i10 = Integer.parseInt(this.f61889a.getString(f61885e, "2"));
        if (i10 == 0) {
            return C4523t8.a.None;
        }
        if (i10 == 1) {
            return C4523t8.a.Device;
        }
        return i10 == 2 ? C4523t8.a.Controller : C4523t8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f61889a.edit();
        editorEdit.putString(f61885e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f61889a.getString(f61886f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C4299ge c4299ge = new C4299ge(string);
            if (c4299ge.a(C4235d4.i.R)) {
                try {
                    arrayList.addAll(c4299ge.a((JSONArray) c4299ge.b(C4235d4.i.R)));
                    return arrayList;
                } catch (JSONException e10) {
                    C4485r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f61889a.edit();
        editorEdit.putString(f61886f, str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f61889a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.f61889a.getString("version", Y1.f60333f);
    }

    public String a(String str) {
        String string = this.f61889a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(f61887g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f61889a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f61889a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f61889a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f61889a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f61889a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
