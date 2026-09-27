package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class U6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60188a = "adunit_data";

    public void a(String str, Object obj) {
        R6.b().b(str, obj);
    }

    public void a(Map<String, Object> map) {
        R6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        R6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        R6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        R6.b().c(context);
    }

    public void a(@oy.l String str, @oy.l Object obj, @oy.l Q6.a aVar) {
        try {
            String strName = aVar.name();
            R6 r6B = R6.b();
            JSONObject jSONObjectOptJSONObject = r6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f60188a);
            if (jSONObjectOptJSONObject == null) {
                r6B.b(f60188a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                r6B.b(f60188a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                r6B.b(f60188a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
        }
    }

    public void a(@oy.l String str, @oy.l Q6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            R6 r6B = R6.b();
            JSONObject jSONObjectOptJSONObject2 = r6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f60188a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            r6B.b(f60188a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
        }
    }
}
