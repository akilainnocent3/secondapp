package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ug2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f156418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l83 f156419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wq0 f156420c;

    public /* synthetic */ ug2(Context context, sa3 sa3Var) {
        this(sa3Var, new l83(), new xq0(context));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    public final sg2 a(JSONObject jSONObject) throws JSONException, z02 {
        Map map;
        Object objB;
        Object next;
        String strOptString;
        Object obj;
        JSONObject jSONObject2 = jSONObject.has("deeplinkLaunchParams") ? jSONObject.getJSONObject("deeplinkLaunchParams") : jSONObject;
        String strOptString2 = jSONObject2.optString("package");
        if (strOptString2 == null || strOptString2.length() == 0 || kotlin.jvm.internal.m0.g(strOptString2, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("extras");
        wq0 wq0Var = this.f156420c;
        wq0Var.getClass();
        if (jSONObjectOptJSONObject == null) {
            map = null;
        } else {
            Map mapG = fr.m1.g();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next2 = itKeys.next();
                if (!jSONObjectOptJSONObject.isNull(next2)) {
                    Object sq0Var = jSONObjectOptJSONObject.get(next2);
                    if (sq0Var instanceof JSONObject) {
                        uq0 uq0Var = wq0Var.f157477a;
                        JSONObject jSONObject3 = (JSONObject) sq0Var;
                        uq0Var.getClass();
                        String strOptString3 = jSONObject3.optString("type");
                        try {
                            obj = jSONObject3.get("value");
                        } catch (JSONException unused) {
                            obj = null;
                        }
                        if (kotlin.jvm.internal.m0.g(strOptString3, "parcelable") && kotlin.jvm.internal.m0.g(obj, fw.b.f85379f)) {
                            sq0Var = vq0.f157059a;
                        } else if (kotlin.jvm.internal.m0.g(strOptString3, "intent") && (obj instanceof JSONObject)) {
                            sq0Var = new sq0(uq0Var.f156547a, uq0Var.f156548b.a((JSONObject) obj), new tg2());
                        } else {
                            sq0Var = null;
                        }
                    }
                    if (sq0Var != null) {
                        mapG.put(next2, sq0Var);
                    }
                }
            }
            Map mapD = fr.m1.d(mapG);
            if (mapD.isEmpty()) {
                map = null;
            } else {
                map = mapD;
            }
        }
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(Integer.valueOf(jSONObject2.getInt("flags")));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        String strA = he1.a("launchMode", jSONObject2);
        bb0.f147129b.getClass();
        Iterator<E> it = bb0.f147133f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cv.k0.c2(((bb0) next).name(), strA, true));
        bb0 bb0Var = (bb0) next;
        if (bb0Var == null) {
            bb0Var = bb0.f147130c;
        }
        String strA2 = he1.a("className", jSONObject2);
        if (strA2 == null) {
            this.f156418a.getClass();
            strOptString = sa3.a("url", jSONObject);
        } else {
            strOptString = jSONObject.optString("url");
        }
        String str = strOptString;
        String strA3 = he1.a("deeplinkType", jSONObject);
        this.f156419b.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("trackingUrls");
        List listA = jSONArrayOptJSONArray == null ? null : l83.a(jSONArrayOptJSONArray);
        this.f156419b.getClass();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("fallbackTrackingUrls");
        return new sg2(strOptString2, str, map, num, bb0Var, listA, jSONArrayOptJSONArray2 != null ? l83.a(jSONArrayOptJSONArray2) : null, strA3, strA2);
    }

    public ug2(sa3 sa3Var, l83 l83Var, xq0 xq0Var) {
        this.f156418a = sa3Var;
        this.f156419b = l83Var;
        this.f156420c = xq0Var.a(this);
    }
}
