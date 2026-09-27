package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5068ga implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5251ne f97415a;

    public C5068ga() {
        this(new Tl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5383sm fromModel(@NonNull C5216m4 c5216m4) {
        C5383sm c5383sm = new C5383sm();
        c5383sm.f98326b = c5216m4.f97868b;
        c5383sm.f98325a = c5216m4.f97867a;
        c5383sm.f98327c = c5216m4.f97869c;
        c5383sm.f98328d = c5216m4.f97870d;
        c5383sm.f98329e = c5216m4.f97871e;
        c5383sm.f98330f = this.f97415a.a(c5216m4.f97872f);
        return c5383sm;
    }

    public C5068ga(Tl tl2) {
        this.f97415a = tl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5216m4 toModel(@NonNull C5383sm c5383sm) {
        C5165k4 c5165k4 = new C5165k4();
        c5165k4.f97691d = c5383sm.f98328d;
        c5165k4.f97690c = c5383sm.f98327c;
        c5165k4.f97689b = c5383sm.f98326b;
        c5165k4.f97688a = c5383sm.f98325a;
        c5165k4.f97692e = c5383sm.f98329e;
        c5165k4.f97693f = this.f97415a.a(c5383sm.f98330f);
        return new C5216m4(c5165k4);
    }
}
