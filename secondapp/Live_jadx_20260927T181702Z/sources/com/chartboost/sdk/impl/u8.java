package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f41091a;

    public u8(af afVar) {
        this.f41091a = afVar;
    }

    public DataUseConsent a(String str) {
        return (DataUseConsent) this.f41091a.a().get(str);
    }
}
