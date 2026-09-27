package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4396m4 {

    /* JADX INFO: renamed from: com.ironsource.m4$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4396m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f62352a;

        public a(boolean z10) {
            this.f62352a = z10;
        }

        @Override // com.ironsource.InterfaceC4396m4
        public void a() {
            A8.a(C4281fe.f61814x, new C4557v8().a(G5.f59053y, Boolean.valueOf(this.f62352a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4396m4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f62353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f62354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        private final InterfaceC4519t4 f62355c;

        public b(boolean z10, long j10, @oy.l InterfaceC4519t4 currentTimeProvider) {
            kotlin.jvm.internal.m0.p(currentTimeProvider, "currentTimeProvider");
            this.f62353a = z10;
            this.f62354b = j10;
            this.f62355c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC4396m4
        public void a() {
            C4557v8 c4557v8A = new C4557v8().a(G5.f59053y, Boolean.valueOf(this.f62353a));
            if (this.f62354b > 0) {
                c4557v8A.a(G5.B, Long.valueOf(this.f62355c.a() - this.f62354b));
            }
            A8.a(C4281fe.f61813w, c4557v8A.a());
        }

        @oy.l
        public final InterfaceC4519t4 b() {
            return this.f62355c;
        }
    }

    void a();
}
