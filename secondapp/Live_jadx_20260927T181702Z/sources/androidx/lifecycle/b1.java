package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final d0 f13296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Handler f13297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public a f13298c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final d0 f13299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final r.a f13300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13301d;

        public a(@oy.l d0 registry, @oy.l r.a event) {
            kotlin.jvm.internal.m0.p(registry, "registry");
            kotlin.jvm.internal.m0.p(event, "event");
            this.f13299b = registry;
            this.f13300c = event;
        }

        @oy.l
        public final r.a a() {
            return this.f13300c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13301d) {
                return;
            }
            this.f13299b.g(this.f13300c);
            this.f13301d = true;
        }
    }

    public b1(@oy.l b0 provider) {
        kotlin.jvm.internal.m0.p(provider, "provider");
        this.f13296a = new d0(provider);
        this.f13297b = new Handler();
    }

    @oy.l
    public r a() {
        return this.f13296a;
    }

    public void b() {
        f(r.a.ON_START);
    }

    public void c() {
        f(r.a.ON_CREATE);
    }

    public void d() {
        f(r.a.ON_STOP);
        f(r.a.ON_DESTROY);
    }

    public void e() {
        f(r.a.ON_START);
    }

    public final void f(r.a aVar) {
        a aVar2 = this.f13298c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f13296a, aVar);
        this.f13298c = aVar3;
        Handler handler = this.f13297b;
        kotlin.jvm.internal.m0.m(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
