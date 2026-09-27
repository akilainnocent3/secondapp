package androidx.transition;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface v0 {
    void a(@NonNull e2.e<v0> eVar);

    void b(@k.w(from = 0.0d, to = 1.0d) float f10);

    void c(@NonNull e2.e<v0> eVar);

    @k.e0(from = 0)
    long d();

    void e(@NonNull e2.e<v0> eVar);

    void f();

    @k.w(from = 0.0d, to = 1.0d)
    float getCurrentFraction();

    @k.e0(from = 0)
    long h();

    void i(@NonNull e2.e<v0> eVar);

    boolean isReady();

    void j(@k.e0(from = 0) long j10);

    void l(@NonNull Runnable runnable);
}
