package com.fyber.inneractive.sdk.cache.session;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f44233a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44235c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44236d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44234b = new a();

    public static JSONObject a(e eVar) {
        eVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", eVar.f44233a.a());
            for (Map.Entry entry : eVar.f44234b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                Iterator it = ((PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((g) it.next()).a(true, true));
                }
                jSONObject.put(cVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.c cVar, g gVar) {
        synchronized (this.f44236d) {
            try {
                k kVar = (k) this.f44234b.get(cVar);
                if (kVar != null) {
                    kVar.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
