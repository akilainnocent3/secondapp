package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class su0 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x41 f155550a;

    public su0(x41 x41Var) {
        this.f155550a = x41Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        u41 u41VarA;
        if (!jSONObject.has("value")) {
            boolean z10 = ad1.f146762a;
            throw new z02("Native Ad json has not required attributes");
        }
        if (jSONObject.isNull("value")) {
            u41VarA = null;
        } else {
            x41 x41Var = this.f155550a;
            x41Var.getClass();
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                boolean z11 = ad1.f146762a;
                throw new z02("Native Ad json has not required attributes");
            }
            u41VarA = x41Var.f157675a.a(jSONObject.getJSONObject("value"));
        }
        return new qu0(u41VarA);
    }
}
