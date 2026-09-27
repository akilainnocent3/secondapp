package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir0 f149214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f149215b;

    public /* synthetic */ fr0() {
        this(new ir0(), new d());
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next));
            }
            dr.i1.b(dr.w2.f79517a);
            return map;
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            dr.i1.b(dr.j1.a(th2));
            return map;
        }
    }

    public fr0(ir0 ir0Var, d dVar) {
        this.f149214a = ir0Var;
        this.f149215b = dVar;
    }
}
