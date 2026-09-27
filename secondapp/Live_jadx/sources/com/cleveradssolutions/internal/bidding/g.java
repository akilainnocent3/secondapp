package com.cleveradssolutions.internal.bidding;

import org.json.JSONException;
import org.json.JSONStringer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static JSONStringer a(int i10, JSONStringer jSONStringer, JSONStringer jSONStringer2, String str) throws JSONException {
        jSONStringer.value(Integer.valueOf(i10));
        return jSONStringer2.key(str);
    }
}
