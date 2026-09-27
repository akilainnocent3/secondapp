package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Yc extends E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96836b;

    public Yc(@oy.l String str, @oy.l InterfaceC5457vl interfaceC5457vl) {
        super(interfaceC5457vl);
        this.f96836b = str;
    }

    @Override // io.appmetrica.analytics.impl.E2
    @oy.l
    public final String a(@oy.l String str) {
        return str + '-' + this.f96836b;
    }
}
