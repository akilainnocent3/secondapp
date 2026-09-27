package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import jg.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static JSONArray a(Map map, boolean z10) {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : map.values()) {
                hVar.getClass();
                ArrayList<b> arrayList = new ArrayList(hVar.f44376c.values());
                HashMap map2 = hVar.f44377d;
                for (b bVar : arrayList) {
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar != null ? bVar.f44362a : null;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = (k) map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put("v", kVar.f44386b);
                        } else {
                            jSONObject.put("v", a0.f100098n);
                        }
                        if (z10) {
                            Iterator it = bVar.f44365d.iterator();
                            do {
                                if (!it.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = (d) it.next();
                            } while (!c.class.equals(dVar.getClass()));
                            if (dVar != null && ((c) dVar).f44367b) {
                                HashSet hashSet = ((c) dVar).f44366a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    jSONArray2.put((Long) it2.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f47836a <= 3) {
                e10.printStackTrace();
            }
            return null;
        }
    }
}
