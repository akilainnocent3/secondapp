package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class B8 {
    public static C4608y8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C4608y8.a aVar = new C4608y8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    public static I5 a(JSONObject jSONObject) {
        return new I5.a(jSONObject.optString(G5.f59046r)).b().b(jSONObject.optBoolean("enabled")).a(new C4625z8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", "application/json"));
        arrayList.add(new Pair<>("charset", G5.N));
        return arrayList;
    }

    public static boolean a(Y4 y10) {
        if (y10 == null || y10.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(y10.g().get("inAppBidding"));
    }

    public static C4523t8.e a(Y4 y10, C4523t8.e eVar) {
        if (y10 == null || y10.g() == null || y10.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(y10.g().get("rewarded"))) {
            return C4523t8.e.RewardedVideo;
        }
        return C4523t8.e.Interstitial;
    }
}
