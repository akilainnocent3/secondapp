package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4237d6 implements InterfaceC4402ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Qe f61527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f61528b;

    public C4237d6(@oy.l InterfaceC4437o7 applicationLifecycleService, @oy.l Qe task) {
        kotlin.jvm.internal.m0.p(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.m0.p(task, "task");
        this.f61527a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f61528b;
    }

    private final void f() {
        this.f61528b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void a() {
        this.f61527a.a(Long.valueOf(e()));
        this.f61527a.run();
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void d() {
    }
}
