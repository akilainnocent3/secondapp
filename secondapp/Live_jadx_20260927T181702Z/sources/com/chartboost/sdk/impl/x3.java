package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class x3 {
    public JSONObject a(v3 v3Var) {
        return v3Var == null ? new JSONObject() : y2.a(y2.a("carrier-name", v3Var.d()), y2.a("mobile-country-code", v3Var.a()), y2.a("mobile-network-code", v3Var.b()), y2.a("iso-country-code", v3Var.c()), y2.a("phone-type", Integer.valueOf(v3Var.e())));
    }
}
