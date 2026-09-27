package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j92 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq2 f150978a;

    public j92(lq2 lq2Var) {
        this.f150978a = lq2Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString("name");
        if (strOptString == null || strOptString.length() == 0 || kotlin.jvm.internal.m0.g(strOptString, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("value");
        if (strOptString2 == null || strOptString2.length() == 0 || kotlin.jvm.internal.m0.g(strOptString2, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        return kotlin.jvm.internal.m0.g("review_count", strOptString) ? this.f150978a.a(strOptString2) : strOptString2;
    }
}
