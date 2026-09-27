package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class Uc extends AbstractC4248e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f60191i = C4280fd.f61787a;

    public Uc(int i10) {
        this.f61593g = i10;
    }

    @Override // com.ironsource.AbstractC4248e
    public String a() {
        return C4280fd.f61787a;
    }

    @Override // com.ironsource.AbstractC4248e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4248e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f61592f = new JSONObject();
        } else {
            this.f61592f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }
}
