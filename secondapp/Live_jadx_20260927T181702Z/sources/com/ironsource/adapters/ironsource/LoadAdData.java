package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nLoadAdData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadAdData.kt\ncom/ironsource/adapters/ironsource/LoadAdData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class LoadAdData {

    @l
    private final JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @m
    public final String adUnitId() {
        String it = this.localAdData.optString("adUnitId");
        m0.o(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(@m JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }
}
