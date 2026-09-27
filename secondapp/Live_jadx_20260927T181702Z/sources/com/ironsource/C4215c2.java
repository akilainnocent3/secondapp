package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nAuctionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuctionProvider.kt\ncom/ironsource/environment/auction/AuctionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class C4215c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Q6.a f61155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final ArrayList<String> f61156b = new ArrayList<>(new C4179a2().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final S6 f61157c = new S6();

    public C4215c2(@oy.m Q6.a aVar) {
        this.f61155a = aVar;
    }

    @oy.l
    public final JSONObject a() {
        Q6.a aVar = this.f61155a;
        JSONObject jSONObjectA = aVar != null ? this.f61157c.a(this.f61156b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f61157c.a(this.f61156b);
            kotlin.jvm.internal.m0.o(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f59911u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f59911u, jSONObjectB);
        }
        return jSONObject;
    }
}
