package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44364c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44365d = new ArrayList();

    public static void a(b bVar, JSONObject jSONObject, boolean z10) {
        d cVar;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                switch (next) {
                    case "demand":
                        cVar = new c(jSONObject.getJSONArray(next), z10);
                        break;
                    case "pub_id":
                        cVar = new i(jSONObject.getJSONArray(next), z10);
                        break;
                    case "placement_type":
                        cVar = new h(jSONObject.getJSONArray(next), z10);
                        break;
                    case "os":
                        cVar = new f(z10, jSONObject.getString(next));
                        break;
                    case "sdk":
                        cVar = new j(z10, jSONObject.getString(next));
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.f44365d.add(cVar);
                } else {
                    IAlog.a("b: Unsupported filter type: " + next, new Object[0]);
                }
            }
        }
    }

    public final String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f44362a, this.f44364c, this.f44365d);
    }
}
