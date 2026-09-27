package com.cleveradssolutions.adapters.exchange.rendering.utils.url.action;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42567b = null;

    public e(int i10, com.cleveradssolutions.adapters.exchange.rendering.listeners.b bVar) {
        this.f42566a = i10;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean a(Uri uri) {
        this.f42567b = null;
        String scheme = uri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        String strC = com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.c(uri.toString());
        this.f42567b = strC;
        return strC != null;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public void b(Context context, com.cleveradssolutions.adapters.exchange.rendering.utils.url.a aVar, Uri uri) {
        com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.e(context, TextUtils.isEmpty(this.f42567b) ? uri.toString() : this.f42567b, this.f42566a, true, null);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d
    public boolean zz() {
        return true;
    }
}
