package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class he1 {
    public static final String a(String str, JSONObject jSONObject) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(jSONObject.getString(str));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
