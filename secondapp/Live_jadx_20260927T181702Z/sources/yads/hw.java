package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hw implements bj {
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws z02 {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new gw(fw.f149261c, null);
        }
        fw fwVar = fw.f149260b;
        String strOptString = jSONObject.optString("value");
        if (strOptString == null || strOptString.length() == 0 || kotlin.jvm.internal.m0.g(strOptString, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        return new gw(fwVar, strOptString);
    }
}
