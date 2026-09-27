package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5435v implements InterfaceC5460w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98424a;

    public C5435v(@oy.l Context context) {
        this.f98424a = context;
    }

    @oy.m
    public final String a() {
        C4959c4 c4959c4L = C4959c4.l();
        Context context = this.f98424a;
        N9 n10 = c4959c4L.f97055t;
        if (n10 == null) {
            synchronized (c4959c4L) {
                try {
                    n10 = c4959c4L.f97055t;
                    if (n10 == null) {
                        n10 = new N9(context);
                        c4959c4L.f97055t = n10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Bundle applicationMetaData = n10.f96211d.getApplicationMetaData(n10.f96208a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
