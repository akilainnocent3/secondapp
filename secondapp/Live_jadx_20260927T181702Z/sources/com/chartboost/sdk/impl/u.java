package com.chartboost.sdk.impl;

import com.ironsource.Ne;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface u {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static String a(u uVar, JSONObject receiver, String error, String response) {
            kotlin.jvm.internal.m0.p(receiver, "$receiver");
            kotlin.jvm.internal.m0.p(error, "error");
            kotlin.jvm.internal.m0.p(response, "response");
            try {
                receiver.put("error", error);
                receiver.put(Ne.f59595n, response);
            } catch (Exception e10) {
                sb.b("Cannot create error json for the event", e10);
            }
            String string = receiver.toString();
            kotlin.jvm.internal.m0.o(string, "toString(...)");
            return string;
        }
    }

    void a(pb pbVar, ds.l lVar);
}
