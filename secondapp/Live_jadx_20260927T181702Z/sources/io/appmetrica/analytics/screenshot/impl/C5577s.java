package io.appmetrica.analytics.screenshot.impl;

import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5577s extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5580v f99112a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5577s(C5580v c5580v) {
        super(0);
        this.f99112a = c5580v;
    }

    @Override // ds.a
    public final Object invoke() {
        ((C5582x) this.f99112a.f99116b).a("ContentObserverScreenshotCaptor");
        return w2.f79517a;
    }
}
