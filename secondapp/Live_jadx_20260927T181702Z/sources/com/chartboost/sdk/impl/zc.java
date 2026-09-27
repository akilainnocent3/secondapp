package com.chartboost.sdk.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum zc {
    OPEN("open"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    UNLOAD("unload");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41737b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ sr.a f41736h = sr.c.c(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41731c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final zc a(String stringValue) {
            kotlin.jvm.internal.m0.p(stringValue, "stringValue");
            zc zcVar = zc.OPEN;
            if (kotlin.jvm.internal.m0.g(stringValue, zcVar.b())) {
                return zcVar;
            }
            zc zcVar2 = zc.SET_ORIENTATION_PROPERTIES;
            if (kotlin.jvm.internal.m0.g(stringValue, zcVar2.b())) {
                return zcVar2;
            }
            zc zcVar3 = zc.UNLOAD;
            if (kotlin.jvm.internal.m0.g(stringValue, zcVar3.b())) {
                return zcVar3;
            }
            throw new IllegalArgumentException("Not a valid MraidJSToNativeCommand.");
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    zc(String str) {
        this.f41737b = str;
    }

    public final String b() {
        return this.f41737b;
    }
}
