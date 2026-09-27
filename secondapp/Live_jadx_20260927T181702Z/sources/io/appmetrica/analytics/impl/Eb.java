package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Eb implements InterfaceC4954c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5058g0 f95767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final En f95768b = new En();

    public Eb(@oy.l InterfaceC5058g0 interfaceC5058g0) {
        this.f95767a = interfaceC5058g0;
    }

    public static final void a(Eb eb2, V v10) {
        eb2.f95767a.a(v10);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4954c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        En en2 = this.f95768b;
        Thread threadA = en2.f95798a.a();
        try {
            stackTraceElementArrB = en2.f95798a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        final V v10 = new V((C5509xn) en2.f95799b.apply(threadA, stackTraceElementArrB), en2.a(threadA, null), en2.f95800c.a());
        ((A9) C4959c4.l().f97038c.a()).f95546b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.bp
            @Override // java.lang.Runnable
            public final void run() {
                Eb.a(this.f97025b, v10);
            }
        });
    }
}
