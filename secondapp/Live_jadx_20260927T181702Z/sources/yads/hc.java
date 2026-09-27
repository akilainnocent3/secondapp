package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hc extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f150055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(JSONObject jSONObject) {
        super(0);
        this.f150055b = jSONObject;
    }

    @Override // ds.a
    public final Object invoke() {
        return he1.a("skuId", this.f150055b);
    }
}
