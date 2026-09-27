package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class in implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f150706a;

    public in(hn hnVar) {
        this.f150706a = hnVar;
    }

    @Override // yads.ub3
    public final String a(String str, JSONObject jSONObject) throws z02 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || kotlin.jvm.internal.m0.g(strOptString, fw.b.f85379f)) {
            throw new z02("Native Ad json has not required attributes");
        }
        this.f150706a.getClass();
        String strB = hn.b(strOptString);
        if (strB == null || strB.length() == 0) {
            throw new z02("Native Ad json has attribute with broken base64 encoding");
        }
        return strB;
    }
}
