package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f151861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p13 f151862b;

    public /* synthetic */ l41() {
        this(new sa3(), new p13());
    }

    public final u41 a(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("w");
        int i11 = jSONObject.getInt("h");
        this.f151861a.getClass();
        String strA = sa3.a("url", jSONObject);
        o13 o13VarA = jSONObject.has("smartCenterSettings") ? this.f151862b.a(jSONObject.getJSONObject("smartCenterSettings")) : null;
        String strOptString = jSONObject.optString("sizeType");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("preload", true);
        String strOptString2 = jSONObject.optString("preview");
        return new u41(i10, i11, strA, strOptString, o13VarA, zOptBoolean, strOptString2.length() > 0 ? strOptString2 : null);
    }

    public l41(sa3 sa3Var, p13 p13Var) {
        this.f151861a = sa3Var;
        this.f151862b = p13Var;
    }
}
