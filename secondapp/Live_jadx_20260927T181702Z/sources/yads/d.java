package yads;

import com.ironsource.C4563ve;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C4563ve.f64327d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object objB;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                dr.i1.a aVar = dr.i1.f79460c;
                objB = dr.i1.b(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i10)))));
            } catch (Throwable th2) {
                dr.i1.a aVar2 = dr.i1.f79460c;
                objB = dr.i1.b(dr.j1.a(th2));
            }
            if (dr.i1.e(objB) != null) {
                Objects.toString(dr.v1.a(jSONArray.get(i10), kotlin.jvm.internal.r0.f102769a));
                boolean z10 = ad1.f146762a;
            }
        }
        return linkedHashSet;
    }
}
