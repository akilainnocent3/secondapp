package com.cleveradssolutions.adapters.exchange.rendering.utils.url.action;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a implements d {
    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean a(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "http".equals(scheme) || "https".equals(scheme)) {
            return false;
        }
        return !"deeplink+".equals(scheme);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public void b(Context context, com.cleveradssolutions.adapters.exchange.rendering.utils.url.a aVar, Uri uri) {
        com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.b(context, uri.toString());
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean zz() {
        return true;
    }
}
