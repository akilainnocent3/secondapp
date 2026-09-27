package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.e7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4256e7 {

    /* JADX INFO: renamed from: com.ironsource.e7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4256e7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final InterfaceC4202b7 f61618a;

        public a(@oy.l InterfaceC4202b7 failure) {
            kotlin.jvm.internal.m0.p(failure, "failure");
            this.f61618a = failure;
        }

        @oy.l
        public final InterfaceC4202b7 a() {
            return this.f61618a;
        }

        @oy.l
        public final InterfaceC4202b7 b() {
            return this.f61618a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m0.g(this.f61618a, ((a) obj).f61618a);
        }

        public int hashCode() {
            return this.f61618a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Failure(failure=" + this.f61618a + gi.j.f86771d;
        }

        @oy.l
        public final a a(@oy.l InterfaceC4202b7 failure) {
            kotlin.jvm.internal.m0.p(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, InterfaceC4202b7 interfaceC4202b7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC4202b7 = aVar.f61618a;
            }
            return aVar.a(interfaceC4202b7);
        }

        @Override // com.ironsource.InterfaceC4256e7
        public void a(@oy.l InterfaceC4274f7 handler) {
            kotlin.jvm.internal.m0.p(handler, "handler");
            handler.a(this.f61618a);
        }
    }

    void a(@oy.l InterfaceC4274f7 interfaceC4274f7);
}
