package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface Uf {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f60200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f60201b;

        public final long a() {
            return this.f60201b;
        }

        public final long b() {
            return this.f60200a;
        }

        public final void a(long j10) {
            this.f60201b = j10;
        }

        public final void b(long j10) {
            this.f60200a = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @oy.l
        Uf a(@oy.l b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements c {
        @Override // com.ironsource.Uf.c
        @oy.l
        public Uf a(@oy.l b timerConfig) {
            kotlin.jvm.internal.m0.p(timerConfig, "timerConfig");
            return new e(new Wf(timerConfig.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e implements Uf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final Wf f60202a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a implements Wf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f60203a;

            public a(a aVar) {
                this.f60203a = aVar;
            }

            @Override // com.ironsource.Wf.a
            public void a() {
                this.f60203a.a();
            }
        }

        public e(@oy.l Wf timer) {
            kotlin.jvm.internal.m0.p(timer, "timer");
            this.f60202a = timer;
        }

        @Override // com.ironsource.Uf
        public void a(@oy.l a callback) {
            kotlin.jvm.internal.m0.p(callback, "callback");
            this.f60202a.a((Wf.a) new a(callback));
        }

        @Override // com.ironsource.Uf
        public void cancel() {
            this.f60202a.e();
        }
    }

    void a(@oy.l a aVar);

    void cancel();
}
