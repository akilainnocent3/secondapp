package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x41 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l41 f157675a;

    public /* synthetic */ x41() {
        this(new l41());
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = ad1.f146762a;
            throw new z02("Native Ad json has not required attributes");
        }
        return this.f157675a.a(jSONObject.getJSONObject("value"));
    }

    public x41(l41 l41Var) {
        this.f157675a = l41Var;
    }
}
