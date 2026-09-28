package com.appsflyer.internal;

import defpackage.dwa;
import defpackage.fd80;
import defpackage.l48;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1cSDK {
    private static final List<Object> AFAdRevenueData(JSONArray jSONArray) throws JSONException {
        IntRange intRangeN = kotlin.ranges.f.n(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(l48.r(intRangeN, 10));
        Iterator<Integer> it = intRangeN.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((zvo) it).nextInt());
            obj.getClass();
            arrayList.add(AFAdRevenueData(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getRevenue(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        dwa dwaVarB = fd80.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : dwaVarB) {
            Object obj2 = jSONObject.get((String) obj);
            obj2.getClass();
            linkedHashMap.put(obj, AFAdRevenueData(obj2));
        }
        return linkedHashMap;
    }

    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return AFAdRevenueData((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getRevenue((JSONObject) obj);
        }
        if (Intrinsics.g(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
