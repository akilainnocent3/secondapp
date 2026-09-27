package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60014a = "adunit_data";

    public JSONObject a(List<String> list) throws JSONException {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    public JSONObject a(Context context, String[] strArr) throws JSONException {
        return a(a(R6.b().b(context)), strArr);
    }

    public JSONObject a(List<String> list, Q6.a aVar) throws JSONException {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(Context context, List<String> list) throws JSONException {
        return a(a(R6.b().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(String[] strArr) throws JSONException {
        return a(a(R6.b().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    private JSONObject a(Context context, @oy.l Q6.a aVar) throws JSONException {
        String strName = aVar.name();
        JSONObject jSONObjectB = R6.b().b(context);
        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(f60014a);
        JSONObject jSONObjectA = a(jSONObjectB);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject(strName) != null) {
            JSONObject jSONObject = jSONObjectOptJSONObject.getJSONObject(strName);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectA.putOpt(next, jSONObject.opt(next));
            }
        }
        return jSONObjectA;
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove(f60014a);
        return jSONObject;
    }
}
