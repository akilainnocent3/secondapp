package com.cleveradssolutions.adapters.exchange.rendering.sdk;

import android.content.Context;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f42482b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a f42483a;

    public static d a() {
        return f42482b;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a b() {
        return this.f42483a;
    }

    public void c(Context context) {
        j.f42532b = context.getResources().getDisplayMetrics().density;
        if (this.f42483a == null) {
            this.f42483a = new com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.b(context);
        }
    }
}
