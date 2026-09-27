package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39054a = new ArrayList();

    @Override // com.chartboost.sdk.impl.a
    public JSONObject a(JSONObject response) {
        kotlin.jvm.internal.m0.p(response, "response");
        Iterator it = this.f39054a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((a) it.next()).a(response);
        }
        return response;
    }
}
