package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f44227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f44228b;

    public b(c cVar, JSONObject jSONObject) {
        this.f44228b = cVar;
        this.f44227a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        e eVar = this.f44228b.f44229a;
        JSONObject jSONObject = this.f44227a;
        eVar.getClass();
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                String strName = cVar.name();
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(strName);
                } catch (JSONException unused) {
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    g gVarA = g.a(jSONArray.optJSONObject(i10));
                    if (gVarA != null && gVarA.f44239a != 0) {
                        eVar.a(cVar, gVarA);
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("currentSession");
        if (jSONObjectOptJSONObject != null) {
            h hVar = new h();
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2 = jSONObjectOptJSONObject.getJSONArray("content");
            } catch (JSONException unused2) {
            }
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i11);
                } catch (JSONException unused3) {
                }
                com.fyber.inneractive.sdk.cache.session.enums.c cVarA = com.fyber.inneractive.sdk.cache.session.enums.c.a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                g gVarA2 = g.a(jSONObject2.optJSONObject("session_data"));
                if (gVarA2 != null) {
                    hVar.put(cVarA, gVarA2);
                }
            }
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar2 : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar2 != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (g) hVar.get(cVar2)) != null && gVar.f44239a != 0) {
                    eVar.a(cVar2, gVar);
                }
            }
        }
        this.f44228b.f44229a.getClass();
    }
}
