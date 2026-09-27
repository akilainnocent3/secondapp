package com.cleveradssolutions.adapters.exchange.rendering.mraid.methods;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42385a = "zx";

    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            com.cleveradssolutions.adapters.exchange.b.a(f42385a, "playVideo(): Failed. Provided url is empty or null");
        } else {
            com.cleveradssolutions.adapters.exchange.rendering.sdk.d.a().b().h(str, context);
        }
    }
}
