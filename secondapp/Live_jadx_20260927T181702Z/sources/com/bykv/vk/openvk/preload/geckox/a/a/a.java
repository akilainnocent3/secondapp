package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f31705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f31706c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0294a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f31708b = b.f31710a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f31709c;

        public final C0294a a() {
            this.f31707a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0294a a(b bVar) {
            if (bVar == null) {
                bVar = b.f31710a;
            }
            this.f31708b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0294a c0294a, byte b10) {
        this(c0294a);
    }

    public final b a() {
        return this.f31706c;
    }

    private a(C0294a c0294a) {
        this.f31704a = c0294a.f31707a;
        this.f31706c = c0294a.f31708b;
        this.f31705b = c0294a.f31709c;
    }
}
