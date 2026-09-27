package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4360k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f62188a = c.f62195a;

    /* JADX INFO: renamed from: com.ironsource.k4$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4360k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final InterfaceC4184a7 f62189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        private final Uf f62190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        private final AtomicBoolean f62191d;

        /* JADX INFO: renamed from: com.ironsource.k4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0581a implements Uf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f62192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f62193b;

            public C0581a(d dVar, a aVar) {
                this.f62192a = dVar;
                this.f62193b = aVar;
            }

            @Override // com.ironsource.Uf.a
            public void a() {
                this.f62192a.a(new InterfaceC4256e7.a(new InterfaceC4202b7.a(this.f62193b.f62189b.b())));
                this.f62193b.f62191d.set(false);
            }
        }

        public a(@oy.l InterfaceC4184a7 config, @oy.l Uf timer) {
            kotlin.jvm.internal.m0.p(config, "config");
            kotlin.jvm.internal.m0.p(timer, "timer");
            this.f62189b = config;
            this.f62190c = timer;
            this.f62191d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4360k4
        public synchronized void a(@oy.l d callback) {
            kotlin.jvm.internal.m0.p(callback, "callback");
            if (this.f62191d.compareAndSet(false, true)) {
                this.f62190c.a(new C0581a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC4360k4
        public synchronized void a() {
            this.f62190c.cancel();
            this.f62191d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4360k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final b f62194b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4360k4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4360k4
        public void a(@oy.l d callback) {
            kotlin.jvm.internal.m0.p(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(@oy.l InterfaceC4256e7 interfaceC4256e7);
    }

    void a();

    void a(@oy.l d dVar);

    /* JADX INFO: renamed from: com.ironsource.k4$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f62195a = new c();

        private c() {
        }

        @oy.l
        @cs.o
        public final InterfaceC4360k4 a(@oy.l C4220c7 featureFlag) {
            kotlin.jvm.internal.m0.p(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.f62194b;
            }
            Z6 z10 = new Z6(featureFlag);
            Uf.b bVar = new Uf.b();
            bVar.b(z10.a());
            bVar.a(z10.a());
            return new a(z10, new Uf.d().a(bVar));
        }

        @oy.l
        public final InterfaceC4360k4 a() {
            return b.f62194b;
        }
    }
}
