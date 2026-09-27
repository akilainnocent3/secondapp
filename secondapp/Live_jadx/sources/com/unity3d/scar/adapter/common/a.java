package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76335a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f76336b;

    public synchronized void a() {
        this.f76335a++;
    }

    public synchronized void b() {
        this.f76335a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f76336b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.f76335a > 0 || (runnable = this.f76336b) == null) {
            return;
        }
        runnable.run();
    }
}
