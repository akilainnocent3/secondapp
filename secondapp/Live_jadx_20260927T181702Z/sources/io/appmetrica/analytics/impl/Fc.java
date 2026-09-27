package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Fc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5450ve f95821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f95822b;

    public Fc(@oy.l InterfaceC5450ve interfaceC5450ve, @oy.l ds.a<Integer> aVar) {
        this.f95821a = interfaceC5450ve;
        this.f95822b = aVar;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return ((C5425ue) this.f95821a).f98413b.get() >= ((long) ((Number) this.f95822b.invoke()).intValue());
    }
}
