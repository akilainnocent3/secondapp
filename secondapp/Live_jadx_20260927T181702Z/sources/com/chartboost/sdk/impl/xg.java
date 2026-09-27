package com.chartboost.sdk.impl;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class xg implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f41558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile l7 f41559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f41560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41561d = new Object();

    public xg(Supplier supplier) {
        if (supplier == null) {
            throw new NullPointerException("Supplier must not be null");
        }
        this.f41558a = supplier;
    }

    @Override // com.chartboost.sdk.impl.q7
    public l7 a() {
        if (!this.f41560c) {
            synchronized (this.f41561d) {
                try {
                    if (!this.f41560c) {
                        try {
                            this.f41559b = (l7) this.f41558a.get();
                            if (this.f41559b == null) {
                                sb.b("EventTracker supplier returned null", null);
                            }
                            this.f41560c = true;
                        } catch (Exception e10) {
                            sb.b("Failed to obtain EventTracker from supplier", e10);
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f41559b;
    }
}
