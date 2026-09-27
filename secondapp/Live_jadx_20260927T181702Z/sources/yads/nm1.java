package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub3 f153091a;

    public nm1(ub3 ub3Var) {
        this.f153091a = ub3Var;
    }

    public final Object a(JSONObject jSONObject) {
        String strA = this.f153091a.a("html", jSONObject);
        float f10 = (float) jSONObject.getDouble("aspectRatio");
        if (f10 == 0.0f) {
            f10 = 1.7777778f;
        }
        return new oj1(strA, f10);
    }
}
