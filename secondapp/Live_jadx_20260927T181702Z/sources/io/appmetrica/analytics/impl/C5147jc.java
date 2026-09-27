package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5147jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97627a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5005e f97628b;

    public C5147jc(InterfaceC5058g0 interfaceC5058g0) {
        this.f97628b = new C5005e(new Eb(interfaceC5058g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C5005e c5005e = this.f97628b;
        c5005e.f97225a.add(new InterfaceC4954c() { // from class: io.appmetrica.analytics.impl.kq
            @Override // io.appmetrica.analytics.impl.InterfaceC4954c
            public final void onAppNotResponding() {
                C5147jc.b(anrListener);
            }
        });
    }
}
